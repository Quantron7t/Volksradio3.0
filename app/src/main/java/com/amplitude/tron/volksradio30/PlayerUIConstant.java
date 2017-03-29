package com.amplitude.tron.volksradio30;

/**
 * Created by Tron on 1/27/2017.
 */

public class PlayerUIConstant {

    private static Boolean isUIPlayingState=false;
    private static Boolean isUIConnectedState=false;
    private static Boolean isUIBufferingState=false;
    private static Boolean isUIErrorState=false;
    private static Boolean hasFailedImageDownload=false;


    public static Boolean getHasFailedImageDownload() {
        return hasFailedImageDownload;
    }

    public static void setHasFailedImageDownload(Boolean hasFailedImageDownload) {
        PlayerUIConstant.hasFailedImageDownload = hasFailedImageDownload;
    }
    static Boolean getIsUIErrorState() {
        return isUIErrorState;
    }

    static void setIsUIErrorState(Boolean isUIErrorState) {
        PlayerUIConstant.isUIErrorState = isUIErrorState;
    }

    static Boolean getIsUIBufferingState() {
        return isUIBufferingState;
    }

    static void setIsUIBufferingState(Boolean isUIBufferingState) {
        PlayerUIConstant.isUIBufferingState = isUIBufferingState;
    }

    static Boolean getIsUIConnectedState() {
        return isUIConnectedState;
    }

    static void setIsUIConnectedState(Boolean isUIConnectedState) {
        PlayerUIConstant.isUIConnectedState = isUIConnectedState;
    }

    static Boolean getIsUIPlayingState() {
        return isUIPlayingState;
    }

    static void setIsUIPlayingState(Boolean isUIPlayingState) {
        PlayerUIConstant.isUIPlayingState = isUIPlayingState;
    }
}
