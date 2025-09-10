package com.google.android.apps.camera.keepalive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ink;
import defpackage.iso;
import defpackage.isp;
import defpackage.mwq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeepAliveBroadcastReceiver extends BroadcastReceiver {
    public iso a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((isp) ((ink) context.getApplicationContext()).d(isp.class)).e(this);
        if (this.a.a()) {
            intent.getAction();
            mwq.F(context);
        }
    }
}
