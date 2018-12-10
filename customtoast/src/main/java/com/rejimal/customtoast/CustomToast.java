package com.rejimal.customtoast;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {
    public void show(Context context, String message, int duration) {
        Toast.makeText(context, "" + message, duration).show();
    }
}
