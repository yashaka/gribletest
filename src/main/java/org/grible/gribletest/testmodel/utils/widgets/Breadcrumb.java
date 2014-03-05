package org.grible.gribletest.testmodel.utils.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 4:25 PM
 */
public class Breadcrumb {

    public static SelenideElement container(){ return $("#breadcrumb");}

    public static SelenideElement homeLink(){ return container().find("#home");}
    public static SelenideElement productLink(){ return container().find("#product-name");}

    public static SelenideElement productLink(String name){
        return container().find(byText(name));
    }

    public static SelenideElement sectionLink(){ return container().find("#section-name");}

    public static SelenideElement sectionLink(String name){
        return container().find(byText(name));
    }
}
