package org.grible.gribletest.core.helpers;

import com.codeborne.selenide.SelenideElement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ayia
 * Date: 01.03.14
 * Time: 08:27
 */
public class PageUtils {

    public static List<SelenideElement> getExpectedElements(Class<?> pageUtilsClass) throws InvocationTargetException, IllegalAccessException {
        List<SelenideElement> expectedElements = new ArrayList<SelenideElement>();
        Method[] allMethods = pageUtilsClass.getDeclaredMethods();
        for (Method m: allMethods){
            if(m.getReturnType() == SelenideElement.class && m.getParameterTypes().length == 0){
                expectedElements.add((SelenideElement) m.invoke(null));
            }
        }
        return expectedElements;
    }
}
