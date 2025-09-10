package com.google.android.apps.camera.pact;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import defpackage.cwk;
import defpackage.hag;
import defpackage.hbj;
import defpackage.ink;
import defpackage.ktz;
import defpackage.sfm;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.ujp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PactCameraServerHostService extends cwk {
    private static final sgv b = sgv.g(cdVQ.fWHoHuPpJjEcJ);
    public hbj a;

    public final void a() {
        if (this.a != null) {
            return;
        }
        ujp.c("gcaConfig");
    }

    @Override // defpackage.cwk, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        a();
        int i = hag.a;
        ((sgt) b.b().M(3455)).s("onBind: PactCameraServer disabled by flag");
        return null;
    }

    @Override // defpackage.cwk, android.app.Service
    public final void onCreate() {
        ktz ktzVar;
        ComponentCallbacks2 application = getApplication();
        ink inkVar = application instanceof ink ? (ink) application : null;
        if (inkVar != null && (ktzVar = (ktz) inkVar.d(ktz.class)) != null) {
            ktzVar.o(this);
        }
        super.onCreate();
        a();
        int i = hag.a;
        ((sgt) b.b().M(3456)).s("onCreate: PactCameraServer disabled by flag");
    }

    static {
        new sfm("com.google.android.apps.photos");
    }
}
