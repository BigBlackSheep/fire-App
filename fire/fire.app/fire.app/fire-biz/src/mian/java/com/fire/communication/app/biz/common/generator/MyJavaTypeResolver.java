package com.fire.communication.app.biz.common.generator;


import java.sql.Types;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {

    public MyJavaTypeResolver() {
        //把数据库的 NVARCHAR2 映射成 String
        typeMap.put(Types.OTHER, new JdbcTypeInformation("VARCHAR",
                new FullyQualifiedJavaType(String.class.getName())));
    }

    //scale表示数字小数点右边的位数
    //precision表示数字中的有效位
    /*rue：使用BigDecimal对应DECIMAL和 NUMERIC数据类型
      false：默认
      scale>0或length>18：使用BigDecimal
      scale=0且length[10,18]：使用Long
      scale=0且length[5,9]：使用Integer
      scale=0且length<5：使用Short*/
    @Override
    protected FullyQualifiedJavaType calculateBigDecimalReplacement(IntrospectedColumn column,
            FullyQualifiedJavaType defaultType) {
        FullyQualifiedJavaType answer;

        if (column.getScale() > 0 || column.getLength() > 18 || forceBigDecimals) {
            answer = defaultType;
        } else if (column.getLength() > 9) {
            answer = new FullyQualifiedJavaType(Long.class.getName());
        } else {
            answer = new FullyQualifiedJavaType(Integer.class.getName());
        }
        return answer;
    }
}
