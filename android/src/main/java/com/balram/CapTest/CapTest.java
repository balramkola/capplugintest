package com.balram.CapTest;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class CapTest extends Plugin {

    private static final String TAG = CapTest.class.getSimpleName();

    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");
        JSObject ret = new JSObject();
        ret.put("value", value);
        Log.d(TAG, "echo is working");
        Log.d(TAG, "echo value:" + value);
        call.success(ret);
    }

    @PluginMethod()
    public void add(PluginCall call) {
        String returnValue = "";
        try {
            int value1 = Integer.parseInt(call.getString("value1"));
            int value2 = Integer.parseInt(call.getString("value2"));
            Log.d(TAG, "value1 = " + value1 + " value2 = " + value2);
            returnValue = "" + (value1 + value2);
        } catch (NumberFormatException ne) {
            returnValue = "Invalid inputs";
        }
        JSObject ret = new JSObject();
        ret.put("result", returnValue);
        call.success(ret);
    }

    @PluginMethod()
    public void sub(PluginCall call) {
        String returnValue = "";
        try {
            int value1 = Integer.parseInt(call.getString("value1"));
            int value2 = Integer.parseInt(call.getString("value2"));
            returnValue = "" + (value1 - value2);
        } catch (NumberFormatException ne) {
            returnValue = "Invalid inputs";
        }
        JSObject ret = new JSObject();
        ret.put("result", returnValue);
        call.success(ret);
    }

    @PluginMethod()
    public void mul(PluginCall call) {
        String returnValue = "";
        try {
            int value1 = Integer.parseInt(call.getString("value1"));
            int value2 = Integer.parseInt(call.getString("value2"));
            returnValue = "" + (value1 * value2);
        } catch (NumberFormatException ne) {
            returnValue = "Invalid inputs";
        }
        JSObject ret = new JSObject();
        ret.put("result", returnValue);
        call.success(ret);
    }
}
