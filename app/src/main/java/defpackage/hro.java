package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hro implements SensorEventListener, jhh {
    public final rwc a;
    public final gnt b;
    public final out d;
    public final owf e;
    public final owf f;
    public final owf g;
    public final owq h;
    public final SensorManager i;
    public hsh j;
    public final fdq m;
    public final krj n;
    public final luj o;
    public final hbj p;
    public final mdy q;
    private final rwc r;
    private final hrj s;
    public final List c = new ArrayList();
    public rwc k = rvk.a;
    public float l = 0.0f;

    public hro(fdq fdqVar, hrj hrjVar, hbj hbjVar, rwc rwcVar, gnt gntVar, owq owqVar, owq owqVar2, rwc rwcVar2, owf owfVar, owf owfVar2, mdy mdyVar, out outVar, krj krjVar, luj lujVar, SensorManager sensorManager) {
        this.m = fdqVar;
        this.e = owqVar;
        this.r = rwcVar2;
        this.s = hrjVar;
        this.a = rwcVar;
        this.b = gntVar;
        this.h = owqVar2;
        this.f = owfVar2;
        this.d = outVar;
        this.n = krjVar;
        this.p = hbjVar;
        this.g = owfVar;
        this.o = lujVar;
        this.i = sensorManager;
        this.q = mdyVar;
    }

    public final void a(hrp hrpVar) {
        List list = this.c;
        if (list.contains(hrpVar)) {
            return;
        }
        list.add(hrpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r5) {
        /*
            r4 = this;
            hsh r0 = r4.j
            int r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L5e
            r2 = 6
            if (r0 == r2) goto L2b
            hsh r0 = r4.j
            int r0 = r0.c()
            if (r0 == 0) goto L2a
            r2 = 2
            if (r0 != r2) goto L18
            goto L2b
        L18:
            hsh r0 = r4.j
            int r0 = r0.c()
            if (r0 == 0) goto L29
            r1 = 3
            if (r0 != r1) goto L30
            hsh r0 = r4.j
            r0.b()
            goto L30
        L29:
            throw r1
        L2a:
            throw r1
        L2b:
            hsh r0 = r4.j
            r0.a()
        L30:
            rwc r0 = r4.k
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.e(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r2 = (long) r5
            j$.time.Instant r5 = j$.time.Instant.now()
            j$.time.Instant r5 = r5.plusMillis(r2)
            long r2 = r5.toEpochMilli()
            long r0 = java.lang.Math.max(r0, r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            rwc r5 = defpackage.rwc.j(r5)
            r4.k = r5
            return
        L5e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hro.b(int):void");
    }

    public final void c(hrp hrpVar) {
        this.c.remove(hrpVar);
    }

    public final boolean d() {
        if (this.s.b()) {
            return false;
        }
        return ((hrv) ((rwg) this.r).a).dL().equals(hsa.ACTIVE);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.l = sensorEvent.values[0];
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
