package com.example.conditionvariabledemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import java.util.Set;


public class PreferenceUtil {


    public static void put(String key, String value) {
        putString(key, value);
    }

    public static void put(Context context, String key, int value) {
        putInt(context,key, value);
    }

    public static void put(String key, boolean value) {
        putBoolean(key, value);
    }

    public static void put(Context context,String key, float value) {
        putFloat(context,key, value);
    }

    public static void put(Context context,String key, long value) {
        putLong(context,key, value);
    }

    public static void put(String key, Set<String> values) {
        putStringSet(key, values);
    }



    private static void putString(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                CVApp.getContextBase());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    private static void putInt(Context context,String key, int value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    private static void putBoolean(String key, boolean value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                CVApp.getContextBase());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    private static void putFloat(Context context,String key, float value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public static void putLong(Context context,String key, long value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    private static void putStringSet(String key, Set<String> values) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(CVApp.getContextBase());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet(key, values);
        editor.apply();
    }

    public static long getLong(Context context,String key, long defValue) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getLong(key, defValue);
    }

    public static int getInt(Context context,String key, int defValue) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(key, defValue);
    }

    public static float getFloat(String key, float defValue) {
        return PreferenceManager.getDefaultSharedPreferences(CVApp.getContextBase())
                .getFloat(key, defValue);
    }

    public static String getString(String key, String defValue) {
        return PreferenceManager.getDefaultSharedPreferences(CVApp.getContextBase())
                .getString(key, defValue);
    }

    public static boolean getBoolean(String key, boolean defValue){
        return PreferenceManager.getDefaultSharedPreferences(CVApp.getContextBase())
                .getBoolean(key,defValue);
    }

    public static Set<String> getStringSet(String key, Set<String> defValue){
        return PreferenceManager.getDefaultSharedPreferences(CVApp.getContextBase())
                .getStringSet(key,defValue);
    }

    public static void remove(String... keys) {
        if (keys != null) {
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(
                    CVApp.getContextBase());
            SharedPreferences.Editor editor = sharedPreferences.edit();
            for (String key : keys) {
                editor.remove(key);
            }
            editor.apply();
        }
    }
}
