package org.muchu.mybatis.support.model;

import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.NameValue;

public interface WithParameterMap extends DomElement {

    @NameValue
    @Attribute("parameterMap")
    GenericAttributeValue<String> getParameterMap();
}
