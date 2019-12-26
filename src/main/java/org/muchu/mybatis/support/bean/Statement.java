package org.muchu.mybatis.support.bean;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.GenericAttributeValue;

public interface Statement extends Id {

    @Attribute("parameterType")
    GenericAttributeValue<String> getParameterType();

    @Attribute("flushCache")
    GenericAttributeValue<String> getFlushCache();

    @Attribute("timeout")
    GenericAttributeValue<String> getTimeout();

    @Attribute("statementType")
    GenericAttributeValue<String> getStatementType();
}
