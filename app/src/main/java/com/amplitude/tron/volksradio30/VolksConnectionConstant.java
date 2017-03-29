package com.amplitude.tron.volksradio30;

/**
 * Created by Tron on 1/28/2017.
 */

public class VolksConnectionConstant {

    private static Boolean isConnectionActive=true;

    static Boolean getIsConnectionActive() {
        return isConnectionActive;
    }

    static void setIsConnectionActive(Boolean isConnectionActive) {
        VolksConnectionConstant.isConnectionActive = isConnectionActive;
    }
}
