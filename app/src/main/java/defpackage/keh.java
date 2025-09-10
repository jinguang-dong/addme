package defpackage;

import android.os.SystemClock;
import com.google.googlex.gcam.BurstSpec;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class keh implements kel {
    private long a = -1;
    private final hyh b;
    private final owf c;
    private final owf d;
    private final lpd e;
    private final hyd f;
    private final boolean g;
    private final laq h;
    private final pjo i;
    private final float j;
    private final float k;
    private final owf l;
    private final owf m;
    private final float n;
    private final owq o;
    private final owf p;
    private boolean q;
    private final luj r;

    public keh(hyh hyhVar, owf owfVar, owf owfVar2, hyd hydVar, lpd lpdVar, luj lujVar, hbj hbjVar, laq laqVar, pjo pjoVar, boolean z, owf owfVar3, owf owfVar4, owq owqVar, owf owfVar5) {
        this.b = hyhVar;
        this.r = lujVar;
        this.c = owfVar;
        this.d = owfVar2;
        this.e = lpdVar;
        this.f = hydVar;
        gzi gziVar = hac.a;
        boolean zP = hbjVar.p(hac.O);
        this.g = zP;
        this.h = laqVar;
        this.i = pjoVar;
        Optional optionalE = hbjVar.e(z ? hac.Q : hac.P);
        float fFloatValue = -5.5f;
        Float fValueOf = Float.valueOf(-5.5f);
        this.j = ((Float) optionalE.orElse(fValueOf)).floatValue();
        if (zP) {
            fFloatValue = ((Float) hbjVar.e(z ? hac.S : hac.R).orElse(fValueOf)).floatValue();
        }
        this.k = fFloatValue;
        this.l = owfVar3;
        this.m = owfVar4;
        this.n = ((Float) hbjVar.e(hal.o).get()).floatValue();
        this.o = owqVar;
        this.p = owfVar5;
    }

    private final synchronized void d(boolean z, boolean z2, pka pkaVar, boolean z3, boolean z4) {
        if (!this.q && this.f.f) {
            boolean z5 = true;
            boolean z6 = false;
            if (pkaVar.equals(pka.FRONT) || ((Integer) this.r.b(luf.aK)).equals(Integer.valueOf(qpt.bG(1))) || this.e.a) {
                z = false;
                z2 = false;
            }
            hyh hyhVar = this.b;
            boolean z7 = z && !z4;
            boolean z8 = !z4;
            hyhVar.b(z7);
            if (!z3) {
                hyhVar.a(false, false, false, z8);
                return;
            }
            boolean z9 = ((Float) this.d.dL()).floatValue() <= this.n && !(!this.g && (((Float) this.d.dL()).floatValue() > 1.0f ? 1 : (((Float) this.d.dL()).floatValue() == 1.0f ? 0 : -1)) < 0);
            this.o.a(Boolean.valueOf(z9));
            if (!z9) {
                this.a = SystemClock.elapsedRealtimeNanos();
                z2 = false;
                z6 = z;
                z = false;
            } else if (this.a <= -1 || TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.a) >= 3) {
                this.a = -1L;
            } else {
                z = false;
                z2 = false;
            }
            if (!((Boolean) this.l.dL()).booleanValue() && !((Boolean) this.m.dL()).booleanValue()) {
                z5 = z;
            }
            hyhVar.a(z5, z2, z6, z8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // defpackage.kel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r9, boolean r10, defpackage.pka r11, boolean r12) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.q     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2f
            owf r0 = r8.p     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.dL()     // Catch: java.lang.Throwable -> L32
            ick r0 = (defpackage.ick) r0     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L12
            goto L2f
        L12:
            boolean r0 = r8.b()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            if (r0 == 0) goto L24
            r0 = 1
            if (r9 == 0) goto L1f
            r3 = r0
            r4 = r1
            goto L26
        L1f:
            if (r10 == 0) goto L24
            r4 = r0
            r3 = r1
            goto L26
        L24:
            r3 = r1
            r4 = r3
        L26:
            r7 = 0
            r2 = r8
            r5 = r11
            r6 = r12
            r2.d(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return
        L2f:
            r2 = r8
            monitor-exit(r2)
            return
        L32:
            r0 = move-exception
            r2 = r8
        L34:
            r8 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r8
        L37:
            r0 = move-exception
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keh.a(boolean, boolean, pka, boolean):void");
    }

    @Override // defpackage.kel
    public final boolean b() {
        owf owfVar = this.c;
        return ((Float) owfVar.dL()).floatValue() != -999.0f && ((Float) owfVar.dL()).floatValue() < ((((Float) this.d.dL()).floatValue() > 1.0f ? 1 : (((Float) this.d.dL()).floatValue() == 1.0f ? 0 : -1)) < 0 ? this.k : this.j);
    }

    @Override // defpackage.kel
    public final void c(iby ibyVar, hxu hxuVar, BurstSpec burstSpec, int i, poe poeVar) {
        if (!hxuVar.n) {
            d(false, false, this.i.l(), false, true);
            return;
        }
        laq laqVar = this.h;
        pjo pjoVar = this.i;
        long jA = laqVar.a(pjoVar, burstSpec, rvk.a, i, 0, 0, false, poeVar);
        boolean zL = ibyVar.b().l();
        boolean z = false;
        if (jA > TimeUnit.SECONDS.toMillis(6L) && zL) {
            z = true;
        }
        d(z, false, pjoVar.l(), true, true);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.q = true;
        this.b.h();
    }
}
