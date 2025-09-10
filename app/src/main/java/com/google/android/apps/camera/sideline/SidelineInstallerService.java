package com.google.android.apps.camera.sideline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.gox;
import defpackage.ink;
import defpackage.lwf;
import defpackage.lwg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SidelineInstallerService extends Service {
    public lwf a;
    public gox b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((lwg) ((ink) getApplicationContext()).d(lwg.class)).u(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.sideline.SidelineInstallerService.onStartCommand(android.content.Intent, int, int):int");
    }
}
