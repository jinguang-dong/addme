package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.TimingSession;
import defpackage.ojl;
import defpackage.poe;
import defpackage.sqm;
import defpackage.tpc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewfinderJankSession implements TimingSession {
    public final Object a = new Object();
    public final List b = new ArrayList(30);
    public final List c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private sqm h;
    private Runnable i;

    public static final sqm c(poe poeVar, double d, double d2) {
        tpc tpcVarM = sqm.a.m();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqm sqmVar = (sqm) tpcVarM.b;
        sqmVar.b |= 1;
        sqmVar.c = jElapsedRealtimeNanos;
        long jD = poeVar.d();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqm sqmVar2 = (sqm) tpcVarM.b;
        sqmVar2.b |= 4;
        sqmVar2.e = jD;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        Long l3 = (Long) poeVar.a(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            long jLongValue = l.longValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqm sqmVar3 = (sqm) tpcVarM.b;
            sqmVar3.b |= 2;
            sqmVar3.d = jLongValue;
        }
        if (l2 != null) {
            int iAX = ojl.aX(l2.longValue());
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqm sqmVar4 = (sqm) tpcVarM.b;
            sqmVar4.b |= 8;
            sqmVar4.f = iAX;
        }
        if (l3 != null) {
            int iAX2 = ojl.aX(l3.longValue());
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqm sqmVar5 = (sqm) tpcVarM.b;
            sqmVar5.b |= 16;
            sqmVar5.g = iAX2;
        }
        if (d > 0.0d) {
            int iAW = ojl.aW(d);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqm sqmVar6 = (sqm) tpcVarM.b;
            sqmVar6.b |= 64;
            sqmVar6.i = iAW;
        }
        if (d2 > 0.0d) {
            int iAW2 = ojl.aW(d2);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqm sqmVar7 = (sqm) tpcVarM.b;
            sqmVar7.b |= 32;
            sqmVar7.h = iAW2;
        }
        return (sqm) tpcVarM.l();
    }

    public final void a(sqm sqmVar) {
        if (this.h == null) {
            this.h = sqmVar;
        }
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    public final void b(Runnable runnable) {
        this.i = runnable;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    public int getDelay150PctCount() {
        return this.f;
    }

    public int getDelay500PctCount() {
        return this.g;
    }

    public int getDelay50PctCount() {
        return this.e;
    }
}
