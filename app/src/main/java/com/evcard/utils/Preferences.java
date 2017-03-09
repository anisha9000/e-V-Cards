package com.evcard.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

/**
 * Created by anisha on 3/8/17.
 */

public class Preferences {

    private static final String PREFS_NAME = "EVCARD";
    public static final String IS_LOGIN = "isLogin";

    public static String getStringPreference(Context parent, String key) {
        return getPreference(parent, key, "");
    }

    public static String getPreference(Context mContext, String key, String defValue) {
        if(mContext == null || key == null || key.isEmpty()) {
            return "";
        }
        SharedPreferences preferences = mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return preferences.getString(key, defValue);
    }

    public static int getIntPreference(Context mContext,String key) {
        if(mContext == null || key == null || key.isEmpty()) {
            return 0;
        }
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        final int preData = appData.getInt(key, 0);
        return preData;
    }

    public static byte getBytePreference(Context mContext,String key){
        if(mContext == null || key == null || key.isEmpty()) {
            return (byte)0;
        }
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        final int preData = appData.getInt(key, 0);
        return (byte) preData;
    }

    public static boolean getBooleanPreference(Context mContext,String key){
        if(mContext == null || key == null || key.isEmpty()) {
            return false;
        }
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        final boolean preData = appData.getBoolean(key, false);
        return preData;
    }

    public static void setStringPreference(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static void setBooleanPreference(Context mContext,String key, boolean value){
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = appData.edit();
        editor.putBoolean(key, value);
        editor.commit();

    }

    public static void setIntPreference(Context mContext,String key, int value){
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = appData.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void setBytePreference(Context mContext,String key, int value){
        final SharedPreferences appData = mContext.getSharedPreferences(
                PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = appData.edit();
        editor.putInt(key, value);
        editor.commit();

    }


    public static void deletePreferences(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        Map<String, ?> all = preferences.getAll();
        SharedPreferences.Editor editor = preferences.edit();
        for (String key : all.keySet()) {
            editor.remove(key);
        }
        editor.commit();
    }

}
