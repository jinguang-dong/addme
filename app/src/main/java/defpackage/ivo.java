package defpackage;

import android.graphics.Rect;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivo implements iwp {
    public static final sgv a = sgv.g("ivo");
    public final ivt c;
    public final tdi d;
    public final ovx e;
    public final pjp f;
    public final tbu g;
    public final iwg h;
    public final pbn i;
    public final rwc j;
    public final ivx k;
    public final tgp m;
    public iwt n;
    public final lge p;
    ivb q;
    public final hbj r;
    public final hbp s;
    private final paq u;
    private final Executor v;
    private final Executor w;
    private ouk x;
    private final gga y;
    public final Object b = new Object();
    public final Map l = new HashMap();
    public final LasagnaCallbacks o = new ivm(this);

    public ivo(Executor executor, ovx ovxVar, owf owfVar, ivx ivxVar, Executor executor2, tgp tgpVar, tdi tdiVar, gga ggaVar, hyd hydVar, hbj hbjVar, pjp pjpVar, iwg iwgVar, pbn pbnVar, rwc rwcVar, lge lgeVar, ivt ivtVar, fqg fqgVar, hbp hbpVar) {
        this.v = executor;
        this.e = ovxVar;
        this.k = ivxVar;
        this.w = executor2;
        this.m = tgpVar;
        this.d = tdiVar;
        this.y = ggaVar;
        this.r = hbjVar;
        this.f = pjpVar;
        this.h = iwgVar;
        this.i = pbnVar;
        this.j = rwcVar;
        this.p = lgeVar;
        this.c = ivtVar;
        this.s = hbpVar;
        this.u = new ivk(this, ivxVar, ovxVar, ivtVar, 0);
        this.g = hydVar.a() ? tbu.d : tbu.b;
        fqgVar.b.d(owfVar.dK(new ijl(this, 14), sxo.a));
    }

    public static final pas i(pas pasVar, pjo pjoVar) {
        Rect rectI = pjoVar.i();
        return new pas(Math.max(pasVar.a, rectI.width()), Math.max(pasVar.b, rectI.height()));
    }

    @Override // defpackage.iwp
    public final paq a() {
        hye hyeVar;
        synchronized (this.b) {
            ouk oukVar = this.x;
            paq paqVarA = oukVar == null ? null : oukVar.a();
            if (paqVarA == null) {
                this.k.f(new ivi(this, 0));
                ouk oukVar2 = new ouk(this.u);
                this.x = oukVar2;
                paqVarA = oukVar2.a();
            }
            paqVarA.getClass();
            hyeVar = new hye(paqVarA, 8);
        }
        return hyeVar;
    }

    @Override // defpackage.iwp
    public final void b(int i, Runnable runnable) {
        sgv sgvVar = a;
        ((sgt) sgvVar.c().M(2354)).t("Aborting shot %s", i);
        this.v.execute(new ivi(this, 2));
        ivz ivzVar = (ivz) this.l.get(Integer.valueOf(i));
        if (ivzVar != null) {
            ivzVar.c();
            ivzVar.e(true);
            ejt ejtVar = ivzVar.n;
            tpc tpcVar = (tpc) ejtVar.a;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            ssb ssbVar = (ssb) tpcVar.b;
            ssb ssbVar2 = ssb.a;
            ssbVar.b = 2 | ssbVar.b;
            ssbVar.d = false;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            ssb ssbVar3 = (ssb) tpcVar.b;
            ssbVar3.b |= 16384;
            ssbVar3.p = true;
            ((mdo) ivzVar.g.o()).z = ejtVar.q();
        } else {
            ((sgt) sgvVar.c().M(2355)).t("Couldn't find a session for shot %s", i);
        }
        this.k.a(i, true, runnable);
    }

    @Override // defpackage.iwp
    public final void c(poj pojVar, FrameMetadata frameMetadata) {
        if (pojVar == null) {
            ((sgt) a.c().M(2375)).s("Viewfinder image not found.");
        } else if (!((Boolean) this.e.d).booleanValue() || this.n.equals(iwt.ACTION)) {
            pojVar.close();
        } else {
            this.w.execute(new gdq((Object) this, (Object) pojVar, (Object) frameMetadata, 12, (byte[]) null));
        }
    }

    public final void d(int i) {
        ((sgt) a.c().M(2377)).t("Shot didn't start, removing %s.", i);
        this.e.a(true);
        this.l.remove(Integer.valueOf(i));
    }

    @Override // defpackage.iwp
    public final synchronized void g(ivb ivbVar) {
        if (this.q == ivbVar) {
            this.q = null;
        }
    }

    @Override // defpackage.iwp
    public final synchronized void h(ivb ivbVar) {
        this.q = ivbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uem] */
    @Override // defpackage.iwp
    public final paq j(gga ggaVar, final szh szhVar) {
        ivb ivbVar;
        int i = ggaVar.b.l().a;
        synchronized (this) {
            ivb ivbVar2 = this.q;
            if (ivbVar2 != null) {
                ivbVar2.b(i).c(new Runnable() { // from class: ivl
                    @Override // java.lang.Runnable
                    public final void run() {
                        szhVar.e(true);
                    }
                }, this.w);
                ivbVar = this.q;
            } else {
                ivbVar = null;
            }
        }
        synchronized (this.b) {
            ouk oukVar = this.x;
            final paq paqVarA = oukVar == null ? null : oukVar.a();
            if (paqVarA == null) {
                szhVar.e(false);
                return null;
            }
            Map map = this.l;
            Integer numValueOf = Integer.valueOf(i);
            gga ggaVar2 = this.y;
            ivt ivtVar = this.c;
            szh szhVar2 = new szh();
            tdi tdiVar = (tdi) ggaVar2.b.a();
            tdiVar.getClass();
            ivx ivxVar = (ivx) ggaVar2.d.a();
            ivxVar.getClass();
            Executor executor = (Executor) ggaVar2.a.a();
            executor.getClass();
            pbn pbnVar = (pbn) ggaVar2.c.a();
            pbnVar.getClass();
            ivtVar.getClass();
            map.put(numValueOf, new ivz(tdiVar, ivxVar, executor, pbnVar, ggaVar, ivtVar, ivbVar, szhVar2, szhVar));
            this.w.execute(new cmu(this, i, 17, null));
            return new paq() { // from class: ivj
                @Override // defpackage.paq, java.lang.AutoCloseable
                public final void close() {
                    paqVarA.close();
                    szhVar.e(true);
                }
            };
        }
    }

    @Override // defpackage.iwp
    public final void e(int i, long j) {
        ivz ivzVar = (ivz) this.l.get(Integer.valueOf(i));
        if (ivzVar == null) {
            ((sgt) a.c().M(2378)).t(CGlJpiVWrCQOq.hkEVfymnthayNn, i);
        } else {
            ivzVar.f.e(Long.valueOf(j));
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kmm] */
    @Override // defpackage.iwp
    public final syu f(iby ibyVar, iwt iwtVar, thv thvVar, Runnable runnable, Runnable runnable2, iwb iwbVar) {
        int i;
        iwtVar.name();
        synchronized (this.b) {
            ouk oukVar = this.x;
            if (oukVar != null) {
                synchronized (oukVar.d) {
                    i = oukVar.b;
                }
                if (i > 0) {
                    szh szhVar = new szh();
                    gga ggaVar = ibyVar.x;
                    ggaVar.c.a(t, 0.0f);
                    ?? r11 = ggaVar.b;
                    int i2 = r11.l().a;
                    ibyVar.a();
                    int iD = this.k.d(i2, "processZsl", new ivn(this, i2, ibyVar, iwtVar, szhVar, runnable, iwbVar, r11, thvVar, runnable2), runnable2);
                    if (iD != 1) {
                        ((sgt) a.c().M(2374)).s(qcjAcSmlN.UyYMdFNm);
                        runnable2.run();
                        Throwable iwrVar = new iwr(a.bv(i2, "Error enqueuing shot processing for "));
                        if (iD == 3) {
                            iwrVar = new hhq(iwrVar);
                        }
                        szhVar.a(iwrVar);
                    }
                    return szhVar;
                }
            }
            runnable2.run();
            return ske.L(new pco("CAM_MotionBlurController not initialized, but processShot was called."));
        }
    }
}
