package com.amplitude.tron.volksradio30;

/**
 * Created by Tron on 1/27/2017.
 */

public class VolksMediaConstant {

    private static Boolean isStreamPlaying=false;
    private static Boolean isStreamBuffering=false;
    private static Boolean isNewPush=false;

    static Boolean getIsNewPush() {
        return isNewPush;
    }

    static void setIsNewPush(Boolean isNewPush) {
        VolksMediaConstant.isNewPush = isNewPush;
    }

    static Boolean getIsStreamBuffering() {
        return isStreamBuffering;
    }

    static void setIsStreamBuffering(Boolean isStreamBuffering) {
        VolksMediaConstant.isStreamBuffering = isStreamBuffering;
    }

    static Boolean getIsStreamPlaying() {
        return isStreamPlaying;
    }

    static void setIsStreamPlaying(Boolean isStreamPlaying) {
        VolksMediaConstant.isStreamPlaying = isStreamPlaying;
    }
}
