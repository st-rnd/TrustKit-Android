package com.datatheorem.android.trustkit.utils;

import android.util.Log;

import com.datatheorem.android.trustkit.BuildConfig;

public final class TrustKitLog {
    private static final String INFO_LABEL = " TRUSTKIT INFO : \n ";
    private static final String ERROR_LABEL = " TRUSTKIT ERROR : \n";
    private static final String WARNING_LABEL = " TRUSTKIT WARNING : \n";

    public static void e(String message) {
        if (BuildConfig.DEBUG) {
            System.out.print(ERROR_LABEL + message);
            Log.e("TrustKit",ERROR_LABEL + message);
        }
    }

    public static void i(String message) {
        if (BuildConfig.DEBUG) {
            System.out.print(INFO_LABEL + message);
            Log.i("TrustKit", INFO_LABEL + message);
        }
    }

    public static void w(String message) {

        System.out.print(WARNING_LABEL + message);
        Log.i("TrustKit", WARNING_LABEL + message);
    }
}
