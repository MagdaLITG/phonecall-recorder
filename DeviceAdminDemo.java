package com.example.android.phonecallrecorder;

// ścieżka: C:\Users\Magda\AndroidStudioProjects\PhonecallRecorder\app\src\main\java\com\example\android\phonecallrecorder

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Magda on 2016-04-22.
 */

public class DeviceAdminDemo extends DeviceAdminReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    public void onEnabled(Context context, Intent intent) {
    };

    public void onDisabled(Context context, Intent intent) {
    };
}
