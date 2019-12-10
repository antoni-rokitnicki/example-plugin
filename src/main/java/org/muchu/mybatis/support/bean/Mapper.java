package org.muchu.mybatis.support.bean;

import com.intellij.util.xml.*;

import java.util.List;

public interface Mapper extends DomElement {

    @Attribute("namespace")
    GenericAttributeValue<String> getNameSpace();

    @SubTagsList({"select", "insert", "update", "delete"})
    List<CommonAttribute> getCommonAttributes();

    List<Select> getSelects();

    List<Insert> getInserts();

    List<Update> getUpdates();

    List<Delete> getDeletes();

}