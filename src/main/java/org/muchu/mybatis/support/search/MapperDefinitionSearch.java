package org.muchu.mybatis.support.search;

import com.intellij.openapi.application.QueryExecutorBase;
import com.intellij.psi.PsiElement;
import com.intellij.psi.xml.XmlElement;
import com.intellij.util.Processor;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;
import org.muchu.mybatis.support.util.XmlUtils;

/**
 * @author heber
 */
public class MapperDefinitionSearch extends QueryExecutorBase<XmlElement, PsiElement> {

    public MapperDefinitionSearch() {
        super(true);
    }

    @Override
    public void processQuery(@NotNull PsiElement queryParameters, @NotNull Processor<? super XmlElement> consumer) {
        DomElement element = XmlUtils.process(queryParameters);
        if (element != null) {
            consumer.process(element.getXmlElement());
        }
    }

}
