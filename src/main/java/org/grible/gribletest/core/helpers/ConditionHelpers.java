package org.grible.gribletest.core.helpers;

import java.util.concurrent.locks.Condition;

/**
 * Created with IntelliJ IDEA.
 * User: ayia
 * Date: 01.03.14
 * Time: 10:12
 */
public class ConditionHelpers {

    public static Condition[] be(Condition... conditions){return conditions;}
    public static Condition be(Condition condition){return condition;}
}
