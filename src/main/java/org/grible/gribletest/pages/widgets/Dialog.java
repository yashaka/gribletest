package org.grible.gribletest.pages.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 14:43
 */
public class Dialog {
    public static SelenideElement window(){ return $(".ui-dialog");}
    public static SelenideElement editBox(){ return window().find(".dialog-edit>input");}
    public static SelenideElement addButton(){ return window().find(byText("Add"));}
    public static SelenideElement cancelButton(){ return window().find(".btn-cancel");}
}
