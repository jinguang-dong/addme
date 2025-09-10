package com.google.android.apps.camera.prewarm;

import android.content.Intent;
import android.os.SystemClock;
import android.service.media.CameraPrewarmService;
import defpackage.fqs;
import defpackage.ink;
import defpackage.leb;
import defpackage.lhn;
import defpackage.mdy;
import defpackage.mdz;
import defpackage.mwq;
import defpackage.pgc;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.swz;
import defpackage.sxo;
import defpackage.syu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NoOpPrewarmService extends CameraPrewarmService {
    private static final sgv d = sgv.g("com.google.android.apps.camera.prewarm.NoOpPrewarmService");
    public mdz a;
    public mdy b;
    public mwq c;

    @Override // android.app.Service
    public final void onCreate() {
        ((lhn) ((ink) getApplication()).d(lhn.class)).p(this);
        super.onCreate();
        this.a.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        syu syuVarI = ((fqs) getApplicationContext()).b().i(2);
        mdy mdyVar = this.b;
        mdyVar.n(swz.i(swz.i(syuVarI, new pgc(jElapsedRealtimeNanos, 1), sxo.a), new leb(15), mdyVar.o));
        if (this.c.E()) {
            return 1;
        }
        ((sgt) d.b().M(4160)).s("KeepAlive is off. Prewarm ran, but the service won't stick.");
        return 2;
    }

    @Override // android.service.media.CameraPrewarmService
    public final void onPrewarm() {
    }

    @Override // android.service.media.CameraPrewarmService
    public final void onCooldown(boolean z) {
    }
}
