package com.google.android.libraries.mdi.download.foreground.dagger;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import defpackage.prh;
import defpackage.pvu;
import defpackage.qbu;
import defpackage.rnt;
import defpackage.tzl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ForegroundDownloadService extends tzl {
    public pvu a;

    private final void a(Notification notification, String str) {
        try {
            startForeground(1585575426, notification);
        } catch (ForegroundServiceStartNotAllowedException e) {
            qbu.e("%s: Failed to startForeground for Key %s with exception %s", "MDD Foreground Download Service", str, e);
            this.a.g(str);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.a.getClass();
        int i3 = qbu.a;
        String stringExtra = intent.getStringExtra("key");
        if (rnt.V(stringExtra)) {
            qbu.c("%s: KEY_EXTRA is null or empty!", SHXc.xNzWgFhxtUg);
            return 2;
        }
        if (intent.getBooleanExtra("stop-service", false)) {
            a(prh.r(this).a(), stringExtra);
            stopForeground(true);
            stopSelf(i2);
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            this.a.g(stringExtra);
        }
        a(prh.r(this).a(), stringExtra);
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        qbu.i(SHXc.Hfiab, "MDD Foreground Download Service", Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
