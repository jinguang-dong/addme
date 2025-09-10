package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import j$.util.Optional;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jba implements syf {
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jba(frd frdVar, String str, uem uemVar, int i) {
        this.d = i;
        this.c = str;
        this.b = uemVar;
        this.a = frdVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.d != 0) {
            return;
        }
        if (th instanceof CancellationException) {
            ((sgt) ((sgt) jbc.a.c().i(th)).M((char) 2570)).s("OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            ((sgt) ((sgt) jbc.a.c().i(th)).M((char) 2569)).s("OneCamera failed to open, closing lifetime.");
        }
        ((our) this.b).close();
        ((jbc) this.c).aF.g();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uem] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        if (this.d != 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.a;
                ((frd) obj2).a.execute(new gts((Object) this, this.c, (uem) this.b, 1));
                return;
            }
            return;
        }
        final kfg kfgVar = (kfg) obj;
        kfgVar.getClass();
        if (((fsc) this.a).a()) {
            return;
        }
        Object obj3 = this.c;
        final our ourVar = (our) this.b;
        ((jbc) obj3).d.e("onCameraStarted", new Runnable() { // from class: jaz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, owf] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, owf] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, syu] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, owf] */
            /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, owf] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Object obj4 = this.a.c;
                jbc jbcVar = (jbc) obj4;
                kfg kfgVar2 = jbcVar.C;
                kfg kfgVar3 = kfgVar;
                boolean z2 = kfgVar2 != null && kfgVar2 == kfgVar3;
                jbcVar.C = kfgVar3;
                jbcVar.B = null;
                if (z2) {
                    jbcVar.N.a(kfgVar3.i().d);
                    return;
                }
                our ourVar2 = ourVar;
                ?? r3 = kfgVar3.i().c;
                iyn iynVar = new iyn(obj4, 3);
                out outVar = jbcVar.c;
                ojl.ck(r3, iynVar, outVar);
                jbcVar.f();
                gnt gntVar = jbcVar.i;
                pka pkaVarA = gntVar.a();
                kfg kfgVar4 = jbcVar.C;
                kfgVar4.getClass();
                gny gnyVar = jbcVar.Y;
                pka pkaVarA2 = gntVar.a();
                img imgVar = new img(obj4, pkaVarA, 8);
                hbj hbjVar = (hbj) gnyVar.a.a();
                hbjVar.getClass();
                cxb cxbVarA = ((goe) gnyVar.b).a();
                gnt gntVar2 = (gnt) gnyVar.c.a();
                gntVar2.getClass();
                out outVar2 = (out) gnyVar.d.a();
                outVar2.getClass();
                pkc pkcVar = (pkc) gnyVar.e.a();
                pkcVar.getClass();
                hhc hhcVar = (hhc) gnyVar.f.a();
                hhcVar.getClass();
                hfy hfyVar = (hfy) gnyVar.g.a();
                hfyVar.getClass();
                gox goxVar = (gox) gnyVar.h.a();
                goxVar.getClass();
                pkaVarA2.getClass();
                ourVar2.d(kfgVar4.c(new gnx(hbjVar, cxbVarA, gntVar2, outVar2, pkcVar, hhcVar, hfyVar, goxVar, pkaVarA2, imgVar)));
                rwc rwcVar = jbcVar.q;
                if (rwcVar.h()) {
                    ((fty) rwcVar.c()).f(kfgVar3, ourVar2);
                }
                rwc rwcVar2 = jbcVar.p;
                if (rwcVar2.h()) {
                    ourVar2.d(((mhe) rwcVar2.c()).a(nkw.PHOTO));
                }
                rwc rwcVar3 = jbcVar.P;
                if (rwcVar3.h()) {
                    ourVar2.d(((fgx) rwcVar3.c()).a());
                }
                Optional optional = jbcVar.Q;
                if (optional.isPresent()) {
                    ourVar2.d(((nuk) optional.get()).a());
                }
                pka pkaVarL = jbcVar.aq.l();
                pka pkaVar = pka.BACK;
                if (pkaVarL == pkaVar && kox.a((String) ((ovx) jbcVar.av.a(luf.v)).d, kox.AUTO) == kox.ON) {
                    jbcVar.L.d(jbcVar.at.a(jbcVar.X));
                }
                qqq qqqVar = jbcVar.aF;
                jbcVar.aq.l();
                pka pkaVar2 = pka.FRONT;
                nkw nkwVar = nkw.UNINITIALIZED;
                qqqVar.h();
                uh uhVarI = kfgVar3.i();
                owf owfVarH = owl.h(owl.a(uhVarI.a, uhVarI.d, jbcVar.S), new fym(obj4, 17));
                if (!jbcVar.n.h()) {
                    z = false;
                } else if (jbcVar.aq.l() != pkaVar) {
                    gzg gzgVar = gze.a;
                    z = false;
                } else {
                    z = true;
                }
                ourVar2.d(jbcVar.V.a(kfgVar3, jbcVar.aq, kfgVar3.i().i, owl.g(kfgVar3.i().a, owfVarH, jbcVar.af), z, jbcVar.s.h(), 1));
                iyu iyuVar = jbcVar.an;
                iyuVar.K.g();
                jbcVar.l.m(true);
                ojl.cj(jbcVar.G, new jas(obj4, jbcVar.O, 0));
                jbcVar.N.a(kfgVar3.i().d);
                ourVar2.d(owfVarH.dK(new jaq(obj4, 0), outVar));
                rwc rwcVar4 = jbcVar.ag;
                if (rwcVar4.h()) {
                    ((hko) rwcVar4.c()).a(((Boolean) jbcVar.ah.dL()).booleanValue());
                }
                AccessibilityManager accessibilityManager = jbcVar.x;
                hjb hjbVar = jbcVar.w;
                kgw kgwVar = jbcVar.aq;
                ktx ktxVar = jbcVar.ak;
                jtd jtdVar = jbcVar.A;
                jtdVar.getClass();
                hgc hgcVar = iyuVar.K.B;
                hbj hbjVar2 = jbcVar.aA;
                gzi gziVar = gzo.a;
                gzi gziVar2 = hau.a;
                HotshotController hotshotController = jbcVar.y;
                jbcVar.D = new jtq(accessibilityManager, hjbVar, kgwVar, ktxVar, jtdVar, hgcVar, hbjVar2, hotshotController, rwcVar4);
                our ourVar3 = jbcVar.O;
                jtq jtqVar = jbcVar.D;
                kfg kfgVar5 = jbcVar.C;
                kfgVar5.getClass();
                ourVar3.d(jtqVar.a(kfgVar5.i().e, outVar));
                jtq jtqVar2 = jbcVar.D;
                jtd jtdVar2 = jbcVar.A;
                jtdVar2.getClass();
                jtqVar2.c(jtdVar2.d.b);
                jbcVar.E = iyuVar.K.i;
                jbcVar.E.b();
                if (hbjVar2.p(gzt.a)) {
                    jtd jtdVar3 = jbcVar.A;
                    jtdVar3.getClass();
                    hotshotController.l(jtdVar3.d.b);
                }
                jbcVar.c();
                ovx ovxVar = jbcVar.T;
                if (!((Boolean) ovxVar.d).booleanValue()) {
                    ovxVar.a(true);
                }
                jtq jtqVar3 = jbcVar.D;
                if (jtqVar3 != null) {
                    jtqVar3.b(jbcVar.aq.l() == pkaVar2);
                }
            }
        });
    }

    public jba(jbc jbcVar, fsc fscVar, our ourVar, int i) {
        this.d = i;
        this.a = fscVar;
        this.b = ourVar;
        this.c = jbcVar;
    }
}
