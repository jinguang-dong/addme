package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrh {
    public final SensorManager a;
    public final Executor b;
    public final Sensor c;
    public boolean j;
    public final Object e = new Object();
    public final float[] f = new float[9];
    public final float[] g = new float[9];
    public final float[] h = new float[3];
    public final Set i = new HashSet();
    public int k = -1;
    public final lrg d = new lrg(this, 0);

    public lrh(SensorManager sensorManager, Executor executor) {
        this.a = sensorManager;
        this.b = executor;
        this.c = sensorManager.getDefaultSensor(11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[PHI: r2
      0x0039: PHI (r2v1 int) = (r2v0 int), (r2v4 int) binds: [B:5:0x000b, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lre r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.e
            monitor-enter(r0)
            java.util.Set r1 = r6.i     // Catch: java.lang.Throwable -> L4f
            boolean r7 = r1.remove(r7)     // Catch: java.lang.Throwable -> L4f
            r2 = -1
            r3 = 0
            if (r7 == 0) goto L39
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4f
            r4 = 1
            if (r7 == 0) goto L1c
            r6.j = r3     // Catch: java.lang.Throwable -> L4f
            r6.k = r2     // Catch: java.lang.Throwable -> L4f
            r5 = r4
            r4 = r3
            r3 = r5
            goto L3a
        L1c:
            j$.util.stream.Stream r7 = j$.util.Collection.EL.stream(r1)     // Catch: java.lang.Throwable -> L4f
            hkp r1 = new hkp     // Catch: java.lang.Throwable -> L4f
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            j$.util.stream.IntStream r7 = r7.mapToInt(r1)     // Catch: java.lang.Throwable -> L4f
            j$.util.OptionalInt r7 = r7.min()     // Catch: java.lang.Throwable -> L4f
            int r2 = r7.getAsInt()     // Catch: java.lang.Throwable -> L4f
            int r7 = r6.k     // Catch: java.lang.Throwable -> L4f
            if (r7 == r2) goto L39
            r6.k = r2     // Catch: java.lang.Throwable -> L4f
            goto L3a
        L39:
            r4 = r3
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L49
            java.util.concurrent.Executor r7 = r6.b
            lac r0 = new lac
            r1 = 6
            r0.<init>(r6, r1)
            r7.execute(r0)
            return
        L49:
            if (r4 == 0) goto L4e
            r6.b(r2)
        L4e:
            return
        L4f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrh.a(lre):void");
    }

    public final void b(int i) {
        this.b.execute(new mzp(this, i, 1));
    }
}
