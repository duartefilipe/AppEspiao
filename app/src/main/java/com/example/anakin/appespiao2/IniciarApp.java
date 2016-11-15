package com.example.anakin.appespiao2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by anakin on 15/11/16.
 */

public class IniciarApp extends BroadcastReceiver {

    @Override
    public void onReceive(Context ctx, Intent i) {

        // Exibe a Activity Principal após o boot
        // do Android
        Intent intent = new Intent(ctx, PrincipalActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intent);
    }
}