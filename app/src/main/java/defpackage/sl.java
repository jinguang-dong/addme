package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sl {
    public final Object a;
    public pk b;
    public tm c;
    public Map d;
    public final wr e;
    public final sp f;
    public final umr g;
    public us h;
    public final qrh i;
    public byi j;
    private final und k;
    private final pl l;
    private final wb m;
    private final ti n;
    private final py o;
    private final po p;
    private vi q;
    private uol r;
    private uol s;
    private uol t;
    private uol u;
    private final uh v;
    private final cey w;
    private final qrh x;
    private byi y;

    public sl(und undVar, qrh qrhVar, pl plVar, wb wbVar, wr wrVar, sp spVar, ti tiVar, cey ceyVar, uh uhVar, py pyVar, sx sxVar, byi byiVar, po poVar, qrh qrhVar2) {
        undVar.getClass();
        qrhVar.getClass();
        spVar.getClass();
        tiVar.getClass();
        uhVar.getClass();
        pyVar.getClass();
        sxVar.getClass();
        byiVar.getClass();
        this.k = undVar;
        this.x = qrhVar;
        this.l = plVar;
        this.m = wbVar;
        this.e = wrVar;
        this.f = spVar;
        this.n = tiVar;
        this.w = ceyVar;
        this.v = uhVar;
        this.o = pyVar;
        this.p = poVar;
        this.i = qrhVar2;
        this.a = new Object();
        this.j = pi.a;
        this.y = new wv(b());
        this.g = new umr();
        this.t = ukc.C(undVar, null, 0, new si(this, (uhb) null, 0), 3);
        this.u = ukc.C(undVar, null, 0, new si(this, (uhb) null, 2, (byte[]) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sk
            if (r0 == 0) goto L13
            r0 = r6
            sk r0 = (defpackage.sk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sk r0 = new sk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r6)
            goto L7e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.rnt.aN(r6)
            r5.toString()
            java.lang.Object r6 = r5.a
            monitor-enter(r6)
            byi r2 = r5.j     // Catch: java.lang.Throwable -> L83
            pd r4 = defpackage.pd.a     // Catch: java.lang.Throwable -> L83
            boolean r2 = defpackage.a.ao(r2, r4)     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L4b
            r5.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)
            return r5
        L4b:
            byi r2 = r5.j     // Catch: java.lang.Throwable -> L83
            pe r4 = defpackage.pe.a     // Catch: java.lang.Throwable -> L83
            boolean r2 = defpackage.a.ao(r2, r4)     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L72
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r1.<init>()     // Catch: java.lang.Throwable -> L83
            r1.append(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "#awaitClosed: Controller isn't closing!"
            r1.append(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L83
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L83
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)
            return r5
        L72:
            monitor-exit(r6)
            umr r5 = r5.g
            r0.c = r3
            java.lang.Object r5 = r5.z(r0)
            if (r5 != r1) goto L7e
            return r1
        L7e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L83:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.a(uhb):java.lang.Object");
    }

    public final String b() {
        return this.l.a;
    }

    public final void d() {
        if (f()) {
            toString();
            return;
        }
        byi byiVar = this.j;
        ph phVar = ph.a;
        if (a.ao(byiVar, phVar)) {
            Log.w("CXCP", a.bz(this, "Ignoring start(): ", " is already started"));
            return;
        }
        this.b = null;
        uh uhVar = this.v;
        pl plVar = this.l;
        wb wbVar = this.m;
        us usVarH = uhVar.h(plVar.a, plVar.m, wbVar, false, new np(this, 2));
        if (usVarH == null) {
            Log.e("CXCP", a.bz(this, "Failed to start ", ": Open request submission failed"));
            return;
        }
        if (this.h != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.c != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.h = usVarH;
        ti tiVar = this.n;
        cey ceyVar = this.w;
        py pyVar = this.o;
        qrh qrhVar = this.x;
        und undVar = this.k;
        tm tmVar = new tm(wbVar, tiVar, ceyVar, pyVar, (una) qrhVar.g, (una) qrhVar.f, undVar);
        this.c = tmVar;
        Map map = this.d;
        if (map != null) {
            tmVar.a(map);
        }
        this.j = phVar;
        toString();
        uol uolVar = this.s;
        if (uolVar != null) {
            uolVar.s(null);
        }
        this.s = ukc.C(undVar, null, 0, new si(this, (uhb) null, 3, (char[]) null), 3);
    }

    public final void e() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        byi byiVar = this.j;
        pk pkVar = this.b;
        byi byiVar2 = this.y;
        vi viVar = this.q;
        byiVar.getClass();
        byiVar2.getClass();
        boolean z = viVar != null && uz.a(jElapsedRealtimeNanos - viVar.a, 200000000L) <= 0;
        boolean z2 = byiVar2 instanceof wt;
        if (!a.ao(byiVar, pf.a) ? !(a.ao(byiVar, pg.a) && z2 && (pkVar == null || !a.p(pkVar.a, 9))) : !(z2 || z)) {
            uol uolVar = this.r;
            if (uolVar != null) {
                uolVar.s(null);
            }
            this.r = ukc.C(this.k, null, 0, new aie(this, (uhb) null, 1), 3);
            return;
        }
        toString();
        Objects.toString(this.j);
        Objects.toString(this.b);
        Objects.toString(this.y);
        Objects.toString(this.q);
        Objects.toString(vi.a(jElapsedRealtimeNanos));
    }

    public final boolean f() {
        return a.ao(this.j, pe.a) || a.ao(this.j, pd.a);
    }

    public final void g(tm tmVar, us usVar) {
        int i = 0;
        uol uolVarC = ukc.C(this.k, null, 0, new sw(tmVar, usVar, (uhb) null, 1), 3);
        if (a.ao(this.j, pe.a)) {
            uolVarC.o(new sh(this, i));
        }
    }

    public final void h(byi byiVar) {
        toString();
        Objects.toString(pp.a(b()));
        Objects.toString(byiVar);
        synchronized (this.a) {
            if (f()) {
                return;
            }
            if ((byiVar instanceof wt) || (byiVar instanceof wv)) {
                this.y = byiVar;
            } else if (byiVar instanceof wu) {
                this.q = new vi(SystemClock.elapsedRealtimeNanos());
            }
            e();
        }
    }

    public final String toString() {
        return "Camera2CameraController(" + this.p + ')';
    }

    public final void c() {
        synchronized (this.a) {
            if (f()) {
                return;
            }
            this.j = pe.a;
            toString();
            us usVar = this.h;
            tm tmVar = this.c;
            this.h = null;
            this.c = null;
            uol uolVar = this.r;
            if (uolVar != null) {
                uolVar.s(null);
            }
            uol uolVar2 = this.s;
            if (uolVar2 != null) {
                uolVar2.s(null);
            }
            this.s = null;
            uol uolVar3 = this.t;
            if (uolVar3 != null) {
                uolVar3.s(null);
            }
            this.t = null;
            uol uolVar4 = this.u;
            if (uolVar4 != null) {
                uolVar4.s(null);
            }
            this.u = null;
            this.f.close();
            g(tmVar, usVar);
            String strB = b();
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && a.ao(strB, KsvNaXS.jEXZavMnR)) {
                Objects.toString(pp.a(b()));
                toString();
                uh uhVar = this.v;
                String strB2 = b();
                uk ukVar = new uk(strB2);
                if (!((ut) uhVar.e).b(ukVar)) {
                    Log.e("CXCP", "Camera close by ID request failed for " + ((Object) pp.a(strB2)) + '!');
                    ukVar.b.O(ufg.a);
                }
            }
        }
    }
}
