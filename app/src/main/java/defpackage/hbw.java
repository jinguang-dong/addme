package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hbw implements Iterable, lst {
    public static final sgv a = sgv.g("hbw");
    public final Context d;
    public final hcl e;
    public final Executor f;
    public final pbn g;
    public final boolean h;
    public final hcj i;
    public final hcj j;
    public final hcc m;
    public final hbx n;
    public final fdq o;
    public final lrp p;
    public final luj q;
    public final pmv r;
    public final cxb s;
    private final mof t;
    private final hbj u;
    public final hbz b = new hbz();
    public final syf c = new jjm(this, 1);
    public final Instant l = Instant.now();
    public final szh k = new szh();

    public hbw(Context context, fdq fdqVar, hcl hclVar, pmv pmvVar, cxb cxbVar, pbn pbnVar, hbj hbjVar, Executor executor, lrp lrpVar, boolean z, luj lujVar, hcc hccVar, hbx hbxVar, mof mofVar, ppj ppjVar) {
        this.d = context;
        this.o = fdqVar;
        this.e = hclVar;
        this.r = pmvVar;
        this.s = cxbVar;
        this.g = pbnVar;
        this.u = hbjVar;
        this.f = executor;
        this.p = lrpVar;
        this.h = z;
        this.q = lujVar;
        this.m = hccVar;
        this.n = hbxVar;
        this.t = mofVar;
        this.i = new hcj(ppjVar);
        this.j = new hcj(ppjVar);
    }

    private final fqb w(ltd ltdVar) {
        fqb fqbVarK = k(ltdVar);
        rnt.O(true, "Could not find %s in dataAdapter", ltdVar);
        return fqbVarK;
    }

    public final int a() {
        return o().a();
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r8v5, types: [sgt, shi] */
    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        fqb fqbVarW = w(ltdVar);
        if (fqbVarW == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) rwc.i(this.p.a(ltdVar)).b(new fhy(14)).e(false)).booleanValue();
        if (fqbVarW.d() == ltg.MARS_STORE) {
            j(ltdVar);
            fqc fqcVarA = fqbVarW.a();
            if (fqcVarA instanceof hce) {
                hcd hcdVar = new hcd((hce) fqcVarA);
                hcdVar.d(false);
                fqbVarW.e(hcdVar.a());
                return;
            }
            return;
        }
        if (!(fqbVarW instanceof hcn) && !zBooleanValue) {
            if (fqbVarW instanceof hck) {
                Uri uriC = fqbVarW.a().c();
                rnt.L(!uriC.equals(Uri.EMPTY));
                try {
                    t(fqbVarW, this.e.b(uriC, ltdVar, fqbVarW.d()));
                    return;
                } catch (rxd e) {
                    ((sgt) ((sgt) a.b().i(e)).M((char) 1121)).s("createPublished gets exception in transforming a cursor.");
                    return;
                }
            }
            return;
        }
        Uri uriC2 = fqbVarW.a().c();
        rnt.O(!uriC2.equals(Uri.EMPTY), "Could not find MediaStore URI for %s", ltdVar);
        try {
            pmv pmvVar = this.r;
            ltg ltgVarD = fqbVarW.d();
            Object obj = pmvVar.a;
            t(fqbVarW, new hcn((hcb) pmvVar.c, ((hcf) pmvVar.d).c(uriC2, ltdVar), ltgVarD));
        } catch (rxd e2) {
            ((sgt) ((sgt) a.b().i(e2)).M((char) 1132)).s("createPublished gets exception in transforming a cursor.");
        }
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        ltf ltfVar = lsyVar.c;
        ltf ltfVar2 = ltf.LONG_SHOT;
        if (ltfVar != ltfVar2 && ltfVar != ltf.VIDEO && ltfVar != ltf.TIMELAPSE && ltfVar != ltf.CINEMATIC && ltfVar != ltf.AMBER && ltfVar != ltf.AMETHYST) {
            v(this.e.a(ltdVar, lsyVar, ltgVar, true));
        } else if (ltfVar == ltfVar2 || !this.h || lsyVar.d) {
            pmv pmvVar = this.r;
            Object obj = pmvVar.b;
            Instant instantNow = Instant.now();
            hcd hcdVarL = hce.l();
            hcdVarL.c(instantNow);
            hcdVarL.e(instantNow);
            hcdVarL.d(true);
            hcdVarL.b(lsyVar.a);
            hcdVarL.i(lsyVar.b);
            hcdVarL.a = ltdVar;
            hce hceVarA = hcdVarL.a();
            Object obj2 = pmvVar.a;
            v(new hcn((hcb) pmvVar.c, hceVarA, ltgVar));
        }
        this.t.b(lsyVar.b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return o().iterator();
    }

    @Override // defpackage.lst
    public final void j(ltd ltdVar) {
        if (w(ltdVar) == null) {
            return;
        }
        this.b.a();
    }

    public final fqb k(ltd ltdVar) {
        fqb fqbVarD = this.i.d(ltdVar);
        return fqbVarD != null ? fqbVarD : this.j.d(ltdVar);
    }

    public final fqb l() {
        return o().b();
    }

    public final hcj m(fqb fqbVar) {
        return fqbVar.d() == ltg.MEDIA_STORE ? this.i : this.j;
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        fqb fqbVarK = k(ltdVar);
        lss lssVarA = this.p.a(ltdVar);
        if (lssVarA != null) {
            ((mdo) lssVarA.o()).h(2, SystemClock.elapsedRealtime());
        }
        if (fqbVarK != null) {
            r(fqbVarK);
        }
    }

    public final hcj o() {
        return ((Boolean) this.q.b(luf.aN)).booleanValue() ? this.j : this.i;
    }

    public final syu p() {
        syu syuVarP = ske.P(new fnf(this, 17), this.f);
        gzi gziVar = gzo.a;
        this.o.j().d(new ffy(syuVarP, 13));
        return syuVarP;
    }

    public final syu q() {
        syu syuVarP = p();
        ske.W(syuVarP, this.c, this.f);
        return syuVarP;
    }

    public final void r(fqb fqbVar) {
        m(fqbVar).k(fqbVar);
        this.b.a();
    }

    public final void s() {
        this.f.execute(new hbv(this, 0));
    }

    public final void t(fqb fqbVar, fqb fqbVar2) {
        m(fqbVar2).l(fqbVar2);
        fsu fsuVar = new fsu(this, fqbVar, 3);
        Executor executor = this.f;
        syu syuVarQ = ske.Q(fsuVar, executor);
        syuVarQ.c(new gto(this.b, 20), executor);
        this.o.j().d(new gge(syuVarQ, 13));
    }

    public final boolean u() {
        return a() == 0;
    }

    public final void v(fqb fqbVar) {
        m(fqbVar).l(fqbVar);
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        fqb fqbVarK = k(ltdVar);
        if (fqbVarK == null) {
            ((sgt) a.c().M(1123)).v(mPfBwqXsnpXI.CuFqBhZbsMs, ltdVar);
        } else {
            r(fqbVarK);
        }
    }
}
