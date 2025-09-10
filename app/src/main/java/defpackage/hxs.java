package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxs {
    public final pbn b;
    public final pbc c;
    public final ibj d;
    public final hbj e;
    public final qyc f;
    public final cxb g;
    public final cxb h;
    public final cxb i;
    public final cxb j;
    public final cxb k;
    public final cxb l;
    public final ocq m;
    public final pfl n;
    private final hxb p;
    private final boolean q;
    private final nkw r;
    private final hzl s;
    private final iso t;
    private static final scn o = scn.I(idz.DEBLUR, idz.MULTI_RESOLUTION, idz.CENTAUR);
    public static final scn a = scn.I(idz.ZOOM, idz.FOCUS_STACK, idz.CENTAUR);

    public hxs(tzj tzjVar, tzj tzjVar2, tzj tzjVar3, tzj tzjVar4, tzj tzjVar5, pfl pflVar, ocq ocqVar, hbj hbjVar, pbc pbcVar, pbn pbnVar, iso isoVar, hzl hzlVar, cxb cxbVar, hxb hxbVar, boolean z, nkw nkwVar, ibj ibjVar, qyc qycVar) {
        this.g = new cxb(tzjVar);
        this.h = new cxb(tzjVar2);
        this.i = new cxb(tzjVar3);
        this.j = new cxb(tzjVar4);
        this.k = new cxb(tzjVar5);
        this.n = pflVar;
        this.m = ocqVar;
        this.e = hbjVar;
        this.c = pbcVar.a("GcaHdrShotCfgFctry");
        this.b = pbnVar;
        this.t = isoVar;
        this.s = hzlVar;
        this.l = cxbVar;
        this.p = hxbVar;
        this.q = z;
        this.r = nkwVar;
        this.d = ibjVar;
        this.f = qycVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kmm] */
    private static final void c(idz idzVar, gga ggaVar) {
        if (idzVar != idz.NONE) {
            ggaVar.c.a(ibo.b, 0.0f);
        }
    }

    public final void a(hxu hxuVar, icj icjVar) {
        rwc rwcVarB = this.s.b(hxuVar, rwc.j(icjVar), (iea) icjVar.h.orElse(iea.a));
        if (rwcVarB.h()) {
            throw new IllegalStateException("Postprocessing pipeline was given image but requested ".concat(rwcVarB.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kmm] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, lss] */
    public final void b(gga ggaVar, jod jodVar, hxu hxuVar, final int i, final boolean z, iea ieaVar) throws Throwable {
        syu syuVarK;
        hxu hxuVar2;
        final gga ggaVar2 = ggaVar;
        pbn pbnVar = this.b;
        pbnVar.f("primaryOutputFormat");
        rwc rwcVarB = this.s.b(hxuVar, rvk.a, ieaVar);
        if (!rwcVarB.h()) {
            throw new IllegalStateException("processOrRequestImage was given no image but still didn't request anything");
        }
        Object objC = rwcVarB.c();
        this.c.b("Selected primary format: ".concat(objC.toString()));
        pbnVar.h("updateProgress");
        ?? r0 = ggaVar2.c;
        r0.a(hzs.a, 0.0f);
        if (hxuVar.i && ((Integer) this.e.a(ham.a).get()).intValue() != 0 && !this.i.C()) {
            r0.a(ibo.a, 0.0f);
        }
        ?? r10 = ggaVar2.b;
        ltf ltfVarM = r10.m();
        ltf ltfVar = ltf.PORTRAIT;
        if (ltfVarM == ltfVar) {
            r0.a(ibk.a, 0.0f);
        }
        pbnVar.h("getAggregator");
        ibz ibzVarF = this.t.f(r10.l());
        final ici iciVarA = icj.a();
        iciVarA.d(hxuVar);
        iciVarA.l = jodVar;
        iciVarA.i(ggaVar2);
        cxb cxbVar = this.g;
        boolean z2 = false;
        if (cxbVar.C()) {
            pbnVar.h("moments#onMainShotStarted");
            if (r10.m() != ltf.SQUAD_BURST) {
                ((kca) cxbVar.B()).k(r10.l(), new kbz(hxuVar.a(), r10.m() == ltfVar));
            }
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        pbnVar.h("addProgressListener");
        iaj iajVar = new iaj() { // from class: hxj
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kmm] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, lss] */
            @Override // defpackage.iaj
            public final void a(float f) {
                pbn pbnVar2 = this.a.b;
                pbnVar2.f("ProgressCallback");
                gga ggaVar3 = ggaVar2;
                ggaVar3.c.a(hzs.a, f);
                if (atomicBoolean.compareAndSet(false, true)) {
                    ?? r4 = ggaVar3.b;
                    r4.X(r4.m() == ltf.NORMAL ? new nfp(R.string.photo_processing, new Object[0]) : new nfp(R.string.processing_hdr_plus, new Object[0]));
                }
                pbnVar2.g();
            }
        };
        if (ibzVarF.a == null) {
            ibzVarF.a = new scl();
        }
        ibzVarF.a.d(iajVar);
        hxb hxbVar = this.p;
        rwc rwcVarQ = r10.q();
        pbn pbnVar2 = hxbVar.c;
        pbnVar2.f("SKYA#ForgottenKey");
        if (hxbVar.d.p(gzs.at)) {
            ibzVarF.c = rwc.j(new oge(hxbVar, rwcVarQ, (short[]) null));
            pbnVar2.g();
        } else {
            pbnVar2.g();
        }
        pbnVar.h("addBaseFrameListener");
        ibzVarF.a(new iac() { // from class: hxk
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lss] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, lss] */
            @Override // defpackage.iac
            public final void f(iby ibyVar, int i2, long j, poe poeVar) {
                hxs hxsVar = this.a;
                hxsVar.b.f("ShotConfigFactory#BaseFrameCallback");
                hxsVar.l.F(j);
                gga ggaVar3 = ggaVar2;
                cxb cxbVar2 = hxsVar.h;
                if (cxbVar2.C()) {
                    ((kal) cxbVar2.B()).b(ggaVar3.b.l(), j);
                }
                ici iciVar = iciVarA;
                synchronized (iciVar) {
                    iciVar.e(poeVar);
                    iciVar.h(j);
                }
                if (!z) {
                    gzi gziVar = gzs.a;
                } else if (hxsVar.e.p(gzs.ai)) {
                    hxsVar.c.b("Quick Postview disabled, defaulting to YuvThumbnailProcessor");
                    hxsVar.b.g();
                    return;
                }
                rwc rwcVar = (rwc) hxsVar.n.a;
                rwc rwcVarI = !rwcVar.h() ? rvk.a : rwc.i(((joc) rwcVar.c()).d(j));
                if (rwcVarI.h()) {
                    int i3 = i;
                    hxsVar.c.b("Successfully acquired YUV baseFrameImage");
                    poj pojVar = (poj) rwcVarI.c();
                    int i4 = YuvUtilNative.a;
                    Bitmap bitmapA = YuvUtilNative.a(pojVar, plw.ROTATION_0);
                    ((poj) rwcVarI.c()).close();
                    ocq ocqVar = hxsVar.m;
                    bitmapA.getClass();
                    ?? r4 = ggaVar3.b;
                    r4.ae(ocqVar.ao(bitmapA, i3, r4.ah()), 0);
                }
                hxsVar.b.g();
            }
        });
        if (!this.q && z && this.e.p(gzs.ai)) {
            z2 = true;
        }
        nkw nkwVar = this.r;
        nkw nkwVar2 = nkw.SERENGETI;
        if (!nkwVar.equals(nkwVar2) && !z2) {
            pbnVar.h("addPostViewRgbListener");
            ibzVarF.c(new hxl(this, i, ggaVar2));
        }
        if (objC == hyc.YUV) {
            pbnVar.h("addYuvListener");
            hxm hxmVar = new hxm(this, iciVarA, hxuVar);
            if (ibzVarF.t == null) {
                ibzVarF.t = new scl();
            }
            ibzVarF.t.d(hxmVar);
        }
        cxb cxbVar2 = this.i;
        if (cxbVar2.C() && (cxbVar2.B() instanceof ibk)) {
            szh szhVar = new szh();
            pbnVar.h("addPdListener");
            hxq hxqVar = new hxq(this, szhVar);
            if (ibzVarF.r == null) {
                ibzVarF.r = new scl();
            }
            ibzVarF.r.d(hxqVar);
            syuVarK = szhVar;
        } else {
            syuVarK = ske.K();
        }
        iciVarA.e = syuVarK;
        if ((cxbVar2.C() && (cxbVar2.B() instanceof ibk) && this.e.p(hak.B)) || o.contains(ieaVar.a())) {
            pbnVar.h("addRawListener");
            c(ieaVar.a(), ggaVar2);
            ibzVarF.d(new hxn(this, ieaVar, ggaVar2));
        }
        if (objC != hyc.RGB || nkwVar == nkw.COTTAGE || nkwVar == nkwVar2) {
            hxuVar2 = hxuVar;
        } else {
            pbnVar.h("addRgbListener");
            c(ieaVar.a(), ggaVar2);
            hxuVar2 = hxuVar;
            hxo hxoVar = new hxo(this, ieaVar, iciVarA, ggaVar2, hxuVar2);
            ggaVar2 = ggaVar2;
            ibzVarF.e(hxoVar);
        }
        if (objC == hyc.RGB_HW) {
            pbnVar.h("addHwRgbListener");
            ibzVarF.b(new isw(this, iciVarA, hxuVar2, 1));
        }
        if (hxuVar2.h) {
            cxb cxbVar3 = this.j;
            if (cxbVar3.C() && ((kfl) ggaVar2.d).g) {
                pbnVar.h("addDngListener");
                rnt.L(cxbVar3.C());
                r10.ak();
                hxr hxrVar = new hxr(this, ggaVar2);
                if (ibzVarF.n == null) {
                    ibzVarF.n = new scl();
                }
                ibzVarF.n.d(hxrVar);
            }
        }
        pbnVar.h("addShotStatusListener");
        ibzVarF.f(new hxp(this, ggaVar2));
        pbnVar.g();
    }
}
