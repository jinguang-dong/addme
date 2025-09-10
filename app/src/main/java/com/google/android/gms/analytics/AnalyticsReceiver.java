package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import defpackage.nwj;
import defpackage.oar;
import defpackage.obc;
import defpackage.obm;
import defpackage.obr;
import defpackage.obu;
import defpackage.ojh;
import defpackage.olp;
import defpackage.ooc;
import defpackage.ood;
import defpackage.ooe;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private obr a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException {
        if (this.a == null) {
            this.a = new obr();
        }
        oar oarVarC = oar.c(context);
        obm obmVarD = oarVarC.d();
        if (intent == null) {
            obmVarD.t(HHdu.waalVhEzuksdY);
            return;
        }
        obc obcVar = oarVarC.c;
        String action = intent.getAction();
        obmVarD.r("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zD = obu.d(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction(nWEkBGOQPWQp.BFOCjWhSzsQlT);
            synchronized (obr.a) {
                context.startService(intent2);
                if (zD) {
                    try {
                        if (obr.b == null) {
                            obr.b = new ooe(context);
                            ooe ooeVar = obr.b;
                            synchronized (ooeVar.b) {
                                ooeVar.g = false;
                            }
                        }
                        ooe ooeVar2 = obr.b;
                        ooeVar2.m.incrementAndGet();
                        String str = ooeVar2.k;
                        nwj nwjVar = ooe.p;
                        long jMin = Math.min(1000L, Math.max(Math.min(Long.MAX_VALUE, ooe.a), 1L));
                        synchronized (ooeVar2.b) {
                            if (!ooeVar2.b()) {
                                nwj nwjVar2 = ooe.p;
                                nwj nwjVar3 = ooe.p;
                                ooeVar2.i = olp.a;
                                ooeVar2.c.acquire();
                                ojh ojhVar = ooeVar2.o;
                                SystemClock.elapsedRealtime();
                            }
                            ooeVar2.d++;
                            ooeVar2.h++;
                            ooeVar2.c();
                            Map map = ooeVar2.l;
                            ood oodVar = (ood) map.get(null);
                            if (oodVar == null) {
                                oodVar = new ood();
                                map.put(null, oodVar);
                            }
                            nwj nwjVar4 = ooe.p;
                            String str2 = ooeVar2.j;
                            oodVar.a++;
                            ojh ojhVar2 = ooeVar2.o;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                            if (j > ooeVar2.f) {
                                ooeVar2.f = j;
                                Future future = ooeVar2.e;
                                if (future != null) {
                                    future.cancel(false);
                                }
                                ooeVar2.e = ooeVar2.n.schedule(new ooc(ooeVar2, 0), jMin, TimeUnit.MILLISECONDS);
                            }
                        }
                    } catch (SecurityException unused) {
                        obmVarD.t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
