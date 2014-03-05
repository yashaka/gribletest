package org.grible.gribletest.testmodel.utils.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: ArCher
 * Date: 29.11.13
 * Time: 17:19
 */
public class PopUp {
    public static SelenideElement container(){ return $(".contextMenu");}

    public static void delete(){
        container().find(".delete a").click();
    }
    public static void editItem(){
        container().find(".edit a").click();
    }
}
