package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jec extends AsyncTask {
    final /* synthetic */ jeg a;

    public jec(jeg jegVar) {
        this.a = jegVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            jeg r8 = r7.a
            boolean r0 = r8.s
            r1 = 0
            if (r0 != 0) goto La
            goto L77
        La:
            jdn r0 = r8.c
            ena r0 = r0.b
            if (r0 == 0) goto L77
            android.os.Handler r2 = r8.H
            r0.q(r2, r1)
            r0.p(r2, r1)
            jfc r3 = r8.g
            float[] r3 = r3.f()
            r4 = 6
            r3 = r3[r4]
            float r3 = -r3
            double r3 = (double) r3
            double r3 = java.lang.Math.asin(r3)
            r5 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r3 = r3 * r5
            float r3 = (float) r3
            double r3 = (double) r3
            r8.i = r3
            int r5 = r8.n
            if (r5 != 0) goto L37
            r8.h = r3
        L37:
            double r5 = r8.h
            double r3 = r3 - r5
            double r3 = java.lang.Math.abs(r3)
            boolean r5 = r8.v
            if (r5 == 0) goto L74
            jdw r5 = defpackage.jdx.a
            double r3 = java.lang.Math.abs(r3)
            r5 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L4f
            goto L54
        L4f:
            boolean r3 = r8.G
            if (r3 != 0) goto L54
            goto L74
        L54:
            r3 = 0
            r8.j = r3
            r8.k = r3
            java.util.concurrent.Semaphore r4 = r8.l
            r4.drainPermits()
        L5e:
            r5 = 3
            if (r3 >= r5) goto L77
            boolean r5 = r8.j
            if (r5 != 0) goto L77
            jef r5 = new jef
            r6 = 1
            r5.<init>(r7, r0, r6)
            r0.j(r2, r5)
            r4.acquire()     // Catch: java.lang.InterruptedException -> L71
        L71:
            int r3 = r3 + 1
            goto L5e
        L74:
            r8.d(r0)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jec.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
