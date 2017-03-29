package com.amplitude.tron.volksradio30;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Tron on 1/28/2017.
 */

public class VolksConnectionChecker extends AsyncTask<Context, Void, Boolean> {

    // Runs in UI before background thread is called
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // Do something like display a progress bar
    }

    // This is run in a background thread
    @Override
    protected Boolean doInBackground(Context... params) {
        // get the string from params, which is an array
        Context vContext = params[0];
        if (VolksNetworkChecker.isNetworkAvailable(vContext)) {
            try {
                HttpURLConnection urlConnection = (HttpURLConnection)
                        (new URL("http://clients3.google.com/generate_204")
                                .openConnection());
                urlConnection.setRequestProperty("User-Agent", "Android");
                urlConnection.setRequestProperty("Connection", "close");
                urlConnection.setConnectTimeout(5000);
                urlConnection.connect();
                return (urlConnection.getResponseCode() == 204 &&
                        urlConnection.getContentLength() == 0);
            } catch (IOException e) {
                return false;
            }
        } else {
            return false;
        }
    }

    // This runs in UI when background thread finishes
    @Override
    protected void onPostExecute(Boolean result) {
        if (!result)
        {
            //CHANGE THE UI OF NOTIFICATION TOO
            //CREATE A VARIABLE THAT MAIN UI CAN ACCESS
            VolksConnectionConstant.setIsConnectionActive(false);
        }
        else
        {
            VolksConnectionConstant.setIsConnectionActive(true);
        }
    }
}
