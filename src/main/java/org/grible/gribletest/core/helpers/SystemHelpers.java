package org.grible.gribletest.core.helpers;

/**
 * @author ykramarenko
 *         Date: 12/24/13
 *         Time: 12:30 PM
 */
public class SystemHelpers {

    public static void debugLog(String message){
        System.out.println(String.format("DEBUG INFO: %s: %s: ",
                System.currentTimeMillis(),
                message));
    }
}
