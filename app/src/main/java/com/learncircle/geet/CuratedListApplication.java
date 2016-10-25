package com.learncircle.geet;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.firebase.client.Firebase;
import com.learncircle.geet.util.Globals;

/**
 * Created by Geet on 07-10-2016.
 */

public class CuratedListApplication extends Application {

    private static Context sApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sApplicationContext = getApplicationContext();
        Firebase.setAndroidContext(this);
    }

    public static Context getAppContext() {
        return sApplicationContext;
    }

    public static SharedPreferences getAppSharedPrefs() {
        if (sApplicationContext == null) {
            return null;
        }
        return sApplicationContext.getSharedPreferences(Globals.SHARED_PREFS, MODE_PRIVATE);
    }
}
