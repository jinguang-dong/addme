package defpackage;

import android.os.SystemClock;
import androidx.wear.ambient.AmbientModeSupport;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hup {
    public boolean A;
    public boolean B;
    public Long C;
    public Long D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final htk I;
    public boolean J;
    public final hvg K;
    public final ktx L;
    public final hbj M;
    public final syj N;
    public AmbientModeSupport.AmbientController O;
    private final nnm P;
    private final iio Q;
    public final pql a;
    public final Executor b;
    public final uhf c;
    public final owf d;
    public final owf e;
    public final owf f;
    public final owf g;
    public our h;
    public final pnh i;
    public int j;
    public float k;
    public float l;
    public final AtomicBoolean m;
    public und n;
    public int o;
    public boolean p;
    public final hun q;
    public int r;
    public boolean s;
    public Long t;
    public Long u;
    public boolean v;
    public boolean w;
    public boolean x;
    public Long y;
    public double z;

    public hup(hvg hvgVar, pql pqlVar, hbj hbjVar, syj syjVar, Executor executor, uhf uhfVar, ktx ktxVar, nnm nnmVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, Optional optional) {
        hbjVar.getClass();
        syjVar.getClass();
        executor.getClass();
        uhfVar.getClass();
        ktxVar.getClass();
        nnmVar.getClass();
        owfVar.getClass();
        owfVar2.getClass();
        owfVar3.getClass();
        owfVar4.getClass();
        optional.getClass();
        this.K = hvgVar;
        this.a = pqlVar;
        this.M = hbjVar;
        this.N = syjVar;
        this.b = executor;
        this.c = uhfVar;
        this.L = ktxVar;
        this.P = nnmVar;
        this.d = owfVar;
        this.e = owfVar2;
        this.f = owfVar3;
        this.g = owfVar4;
        this.i = new pnh() { // from class: hum
            @Override // defpackage.pnh
            public final void a(int i) {
                this.a.o = i;
            }
        };
        gzg gzgVar = gyy.a;
        this.j = b();
        this.k = 360.0f / b();
        this.l = 60.0f;
        this.Q = new iio(null);
        this.m = new AtomicBoolean(false);
        this.q = new hun(((Number) ukc.h(hbjVar.a(gzp.g), 1)).intValue());
        this.v = true;
        this.w = true;
        this.E = ((Number) ukc.h(hbjVar.a(gzp.a), 400)).intValue();
        this.F = ((Number) ukc.h(hbjVar.a(gzp.e), 350)).intValue();
        this.G = ((Number) ukc.h(hbjVar.a(gzp.f), 1500)).intValue();
        this.H = ((Number) ukc.h(hbjVar.a(gzp.j), 5000)).intValue();
        this.I = (htk) ukc.i(optional);
    }

    public final double a() {
        return this.q.d.a;
    }

    public final int b() {
        return ((Number) ukc.h(this.M.a(gzp.c), 15)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.uhb r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.huo
            if (r0 == 0) goto L13
            r0 = r7
            huo r0 = (defpackage.huo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            huo r0 = new huo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.rnt.aN(r7)
            iio r7 = r6.Q
            r2 = 0
            r7.c = r2
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r7.b = r4
            r7.a = r4
            r6.h(r2)
            r0.c = r3
            r4 = 150(0x96, double:7.4E-322)
            java.lang.Object r7 = defpackage.ung.e(r4, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6.p = r3
            ufg r6 = defpackage.ufg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hup.c(uhb):java.lang.Object");
    }

    public final void d() {
        f(0.0d);
        this.B = false;
        this.C = null;
        this.A = false;
    }

    public final void e(boolean z, boolean z2) {
        boolean z3 = this.x;
        if (!z3 && z) {
            AmbientModeSupport.AmbientController ambientController = this.O;
            if (ambientController != null) {
                sgv sgvVar = hti.a;
                Object obj = ambientController.a;
                hti htiVar = (hti) obj;
                htiVar.T.h(hti.b);
                if (((Boolean) htiVar.G.dL()).booleanValue()) {
                    htiVar.L.a(htiVar.F);
                }
            }
            this.y = Long.valueOf(SystemClock.elapsedRealtime());
        } else if (z3 && !z) {
            d();
            AmbientModeSupport.AmbientController ambientController2 = this.O;
            if (ambientController2 != null) {
                ambientController2.c(z2);
            }
            this.y = null;
        }
        this.x = z;
    }

    public final void f(double d) {
        this.z = ukc.j(d, 0.0d, 1.0d);
    }

    public final void g() {
        AmbientModeSupport.AmbientController ambientController;
        und undVar = this.n;
        if (undVar != null) {
            ung.k(undVar, null);
        }
        this.n = null;
        this.m.set(false);
        this.u = Long.valueOf(SystemClock.elapsedRealtime());
        this.t = null;
        d();
        if (this.s && (ambientController = this.O) != null) {
            ambientController.c(false);
        }
        this.r = 0;
        this.J = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x011a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:8:0x0031, B:11:0x0042, B:19:0x0055, B:28:0x00a1, B:30:0x00b0, B:38:0x00d3, B:31:0x00b7, B:33:0x00c1, B:36:0x00cb, B:37:0x00cd, B:39:0x00e9, B:20:0x0062, B:21:0x0067, B:22:0x0068, B:23:0x0075, B:24:0x0082, B:10:0x0037), top: B:45:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0015, B:8:0x0031, B:11:0x0042, B:19:0x0055, B:28:0x00a1, B:30:0x00b0, B:38:0x00d3, B:31:0x00b7, B:33:0x00c1, B:36:0x00cb, B:37:0x00cd, B:39:0x00e9, B:20:0x0062, B:21:0x0067, B:22:0x0068, B:23:0x0075, B:24:0x0082, B:10:0x0037), top: B:45:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hup.h(boolean):void");
    }

    public final boolean i() {
        return this.m.get();
    }
}
