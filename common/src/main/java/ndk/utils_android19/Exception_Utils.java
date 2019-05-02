package ndk.utils_android19;

import java.util.Arrays;

//TODO : Change API

public class Exception_Utils extends ndk.utils_android16.Exception_Utils {

    public static String get_exception_details_api19(Exception e) {

        return "Exception Message : " + e.getLocalizedMessage()
                + "\n" + "Exception Code : " + e.hashCode()
                + "\n" + "Exception Class : " + e.getClass()
                + "\n" + "Exception Cause : " + e.getCause()
                + "\n" + "Exception StackTrace : " + Arrays.toString(e.getStackTrace())
                + "\n" + "Exception Suppressed : " + Arrays.toString(e.getSuppressed())
                + "\n" + "Exception : " + e.toString();

    }

}