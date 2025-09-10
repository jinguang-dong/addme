package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdy implements jhh {
    public final Activity a;
    public final feb b;
    public final fdu c;
    public final szh g;
    public final cxb j;
    private final out k;
    private final Executor l;
    private final boolean m;
    private final CameraActivityTiming n;
    public final AtomicInteger d = new AtomicInteger();
    public final DialogInterface.OnClickListener e = new fdv(this, 1);
    public final DialogInterface.OnClickListener f = new fdv(this, 0);
    public boolean h = false;
    public dv i = null;

    public fdy(Activity activity, feb febVar, jgt jgtVar, fdu fduVar, cxb cxbVar, out outVar, Executor executor, boolean z, szh szhVar, CameraActivityTiming cameraActivityTiming) {
        this.a = activity;
        this.b = febVar;
        this.c = fduVar;
        this.j = cxbVar;
        this.k = outVar;
        this.l = executor;
        this.m = z;
        this.g = szhVar;
        this.n = cameraActivityTiming;
        ins.g(outVar, jgtVar, this);
    }

    private final void e(int i, boolean z) {
        this.k.execute(new jfj(this, i, z, 1));
    }

    public final void a() {
        dv dvVar = this.i;
        if (dvVar == null || !dvVar.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            boolean r0 = defpackage.out.d()
            r1 = 1
            r0 = r0 ^ r1
            defpackage.rnt.L(r0)
            r0 = 0
            r9.h = r0
            r9.a()
            fdu r2 = r9.c
            sbp r3 = r2.d
            r4 = r3
            sex r4 = (defpackage.sex) r4
            int r4 = r4.c
            r5 = r0
        L19:
            if (r5 >= r4) goto L46
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r7 = r2.c
            boolean r8 = r7.containsKey(r6)
            if (r8 == 0) goto L38
            java.lang.Object r8 = r7.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.getClass()
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L43
        L38:
            boolean r8 = r2.a(r6)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.put(r6, r8)
        L43:
            int r5 = r5 + 1
            goto L19
        L46:
            boolean r5 = r2.b()
            if (r5 == 0) goto L5b
            boolean r5 = r9.d()
            if (r5 != 0) goto L53
            goto L5b
        L53:
            szh r9 = r9.g
            fsq r0 = defpackage.fsq.g
            r9.e(r0)
            return
        L5b:
            r9.h = r1
            com.google.android.apps.camera.stats.timing.CameraActivityTiming r5 = r9.n
            boolean r6 = r5.e()
            if (r6 != 0) goto L68
            r6 = 4
            r5.i = r6
        L68:
            boolean r5 = r9.m
            if (r5 == 0) goto L73
            r0 = 2132017614(0x7f1401ce, float:1.9673511E38)
            r9.e(r0, r1)
            return
        L73:
            java.util.concurrent.atomic.AtomicInteger r9 = r9.d
            int r1 = r9.get()
            if (r1 == 0) goto L7f
            r9.get()
            return
        L7f:
            r9.incrementAndGet()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L87:
            if (r0 >= r4) goto Lac
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r5 = r2.c
            boolean r6 = r5.containsKey(r1)
            if (r6 == 0) goto La6
            java.lang.Object r5 = r5.get(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto La9
        La6:
            r9.add(r1)
        La9:
            int r0 = r0 + 1
            goto L87
        Lac:
            out r0 = r2.b
            eao r1 = new eao
            r3 = 18
            r4 = 0
            r1.<init>(r2, r9, r3, r4)
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdy.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r6, java.lang.String[] r7, int[] r8) {
        /*
            r5 = this;
            r0 = 151398431(0x906281f, float:1.6148528E-33)
            if (r6 == r0) goto L6
            return
        L6:
            java.util.concurrent.atomic.AtomicInteger r6 = r5.d
            r6.decrementAndGet()
            int r0 = r7.length
            if (r0 == 0) goto L6e
            int r0 = r8.length
            if (r0 != 0) goto L12
            goto L6e
        L12:
            fdu r6 = r5.c
            r0 = 0
            r1 = r0
        L16:
            int r2 = r7.length
            if (r1 >= r2) goto L48
            java.util.Map r2 = r6.c
            r3 = r7[r1]
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L35
            r3 = r7[r1]
            java.lang.Object r3 = r2.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.getClass()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L35
            goto L45
        L35:
            r3 = r7[r1]
            r4 = r8[r1]
            if (r4 != 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = r0
        L3e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.put(r3, r4)
        L45:
            int r1 = r1 + 1
            goto L16
        L48:
            boolean r7 = r6.c()
            if (r7 != 0) goto L59
            luj r7 = r6.e
            lur r8 = defpackage.luf.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.d(r8, r1)
        L59:
            boolean r6 = r6.b()
            if (r6 == 0) goto L67
            szh r5 = r5.g
            fsq r6 = defpackage.fsq.g
            r5.e(r6)
            return
        L67:
            r6 = 2132017615(0x7f1401cf, float:1.9673513E38)
            r5.e(r6, r0)
            return
        L6e:
            boolean r7 = defpackage.out.d()
            if (r7 == 0) goto L84
            r6.get()
            java.util.concurrent.Executor r6 = r5.l
            dzd r7 = new dzd
            r8 = 19
            r7.<init>(r5, r8)
            r6.execute(r7)
            return
        L84:
            r6.get()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdy.c(int, java.lang.String[], int[]):void");
    }

    public final boolean d() {
        return this.m || this.c.c();
    }
}
