package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbz implements qbq {
    public final puu a;
    public rwc b = rvk.a;
    private final Context c;
    private final String d;
    private final rwc e;
    private final qat f;
    private final qaq g;

    public qbz(Context context, qaq qaqVar, qat qatVar, puu puuVar, rwc rwcVar) {
        this.c = context;
        this.g = qaqVar;
        this.d = context.getPackageName();
        this.f = qatVar;
        this.a = puuVar;
        this.e = rwcVar;
    }

    private final syu t(int i, sxh sxhVar, int i2) {
        return qsz.n(this.f.a(i2, this.b), new qbx(this, sxhVar, i, i2, 0), sxo.a);
    }

    private final void u(int i, tpc tpcVar, long j) {
        tpc tpcVarM = svo.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        svo svoVar = (svo) tpcVarM.b;
        svoVar.b |= 1;
        svoVar.c = false;
        r(i, tpcVar, j, (svo) tpcVarM.l());
    }

    @Override // defpackage.qbq
    public final syu a(sxh sxhVar) {
        return t(1046, new gea(sxhVar, 10), this.a.i());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, qbv] */
    @Override // defpackage.qbq
    public final syu b(String str, rwc rwcVar, rwc rwcVar2) {
        syu syuVarM = ske.M(rvk.a);
        if (this.b.h()) {
            syuVarM = this.b.c().c(str);
        }
        qdp qdpVarE = qdp.e(syuVarM);
        irm irmVar = new irm(str, rwcVar2, rwcVar, 7);
        sxo sxoVar = sxo.a;
        return qsz.m(qdpVarE.f(irmVar, sxoVar), new pzu(this, 14), sxoVar);
    }

    @Override // defpackage.qbq
    public final syu c(sxh sxhVar) {
        return t(1058, new gea(sxhVar, 11), this.a.m());
    }

    @Override // defpackage.qbq
    public final syu d(sxh sxhVar) {
        return t(1057, new gea(sxhVar, 12), this.a.o());
    }

    @Override // defpackage.qbq
    public final void e(suy suyVar) {
        long j = this.a.j();
        if (qbu.a(j)) {
            tpc tpcVarM = sux.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sux suxVar = (sux) tpcVarM.b;
            suyVar.getClass();
            suxVar.q = suyVar;
            suxVar.d |= 4;
            u(1075, tpcVarM, j);
        }
    }

    @Override // defpackage.qbq
    public final void f(suv suvVar, sva svaVar) {
        tpc tpcVarM = sux.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sux suxVar = (sux) tphVar;
        svaVar.getClass();
        suxVar.r = svaVar;
        suxVar.d |= 8;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sux suxVar2 = (sux) tpcVarM.b;
        suvVar.getClass();
        suxVar2.e = suvVar;
        suxVar2.b |= 256;
        s(1082, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void g(sve sveVar) {
        tpc tpcVarM = sux.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sux suxVar = (sux) tpcVarM.b;
        sveVar.getClass();
        suxVar.s = sveVar;
        suxVar.d |= 256;
        s(1110, tpcVarM, this.a.e());
    }

    @Override // defpackage.qbq
    public final void h(suv suvVar) {
        tpc tpcVarM = sux.a.m();
        tpc tpcVarM2 = svi.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        svi sviVar = (svi) tpcVarM2.b;
        suvVar.getClass();
        sviVar.c = suvVar;
        sviVar.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sux suxVar = (sux) tpcVarM.b;
        svi sviVar2 = (svi) tpcVarM2.l();
        sviVar2.getClass();
        suxVar.p = sviVar2;
        suxVar.d |= 1;
        s(1071, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void i(suv suvVar, int i) {
        tpc tpcVarM = svj.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        svj svjVar = (svj) tpcVarM.b;
        svjVar.b |= 1;
        svjVar.c = i;
        svj svjVar2 = (svj) tpcVarM.l();
        tpc tpcVarM2 = sux.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sux suxVar = (sux) tphVar;
        svjVar2.getClass();
        suxVar.u = svjVar2;
        suxVar.d |= 2048;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sux suxVar2 = (sux) tpcVarM2.b;
        suvVar.getClass();
        suxVar2.e = suvVar;
        suxVar2.b |= 256;
        s(1117, tpcVarM2, this.a.k());
    }

    @Override // defpackage.qbq
    public final void j(suv suvVar, svn svnVar) {
        tpc tpcVarM = sux.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sux suxVar = (sux) tphVar;
        svnVar.getClass();
        suxVar.t = svnVar;
        suxVar.d |= 512;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sux suxVar2 = (sux) tpcVarM.b;
        suvVar.getClass();
        suxVar2.e = suvVar;
        suxVar2.b |= 256;
        s(1018, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void k(int i, int i2) {
        u(i, sux.a.m(), i2);
    }

    @Override // defpackage.qbq
    public final void l(int i) {
        s(i, sux.a.m(), this.a.k());
    }

    @Override // defpackage.qbq
    public final void m(int i, String str, int i2, long j, String str2) {
        tpc tpcVarM = suv.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str.getClass();
        suvVar.b |= 1;
        suvVar.c = str;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        suvVar2.b |= 2;
        suvVar2.d = i2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar3 = (suv) tphVar3;
        suvVar3.b |= 64;
        suvVar3.i = j;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        suv suvVar4 = (suv) tpcVarM.b;
        str2.getClass();
        suvVar4.b |= 128;
        suvVar4.j = str2;
        suv suvVar5 = (suv) tpcVarM.l();
        tpc tpcVarM2 = sux.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sux suxVar = (sux) tpcVarM2.b;
        suvVar5.getClass();
        suxVar.e = suvVar5;
        suxVar.b |= 256;
        s(i, tpcVarM2, this.a.k());
    }

    @Override // defpackage.qbq
    public final void n(int i, int i2) {
        tpc tpcVarM = sux.a.m();
        tpc tpcVarM2 = svc.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        svc svcVar = (svc) tphVar;
        svcVar.b |= 2;
        svcVar.d = i2;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        svc svcVar2 = (svc) tpcVarM2.b;
        svcVar2.c = a.au(i);
        svcVar2.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sux suxVar = (sux) tpcVarM.b;
        svc svcVar3 = (svc) tpcVarM2.l();
        svcVar3.getClass();
        suxVar.k = svcVar3;
        suxVar.c |= 32768;
        s(1053, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void o(suv suvVar, int i, long j, long j2, String str, int i2) {
        tpc tpcVarM = sux.a.m();
        tpc tpcVarM2 = svf.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        svf svfVar = (svf) tphVar;
        suvVar.getClass();
        svfVar.c = suvVar;
        svfVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        svf svfVar2 = (svf) tphVar2;
        svfVar2.d = a.at(i);
        svfVar2.b |= 2;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        tph tphVar3 = tpcVarM2.b;
        svf svfVar3 = (svf) tphVar3;
        svfVar3.b |= 4;
        svfVar3.e = j;
        if (!tphVar3.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        svf svfVar4 = (svf) tphVar4;
        svfVar4.b |= 8;
        svfVar4.f = j2;
        if (!tphVar4.C()) {
            tpcVarM2.o();
        }
        tph tphVar5 = tpcVarM2.b;
        svf svfVar5 = (svf) tphVar5;
        str.getClass();
        svfVar5.b |= 16;
        svfVar5.g = str;
        if (!tphVar5.C()) {
            tpcVarM2.o();
        }
        svf svfVar6 = (svf) tpcVarM2.b;
        svfVar6.b |= 32;
        svfVar6.h = i2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sux suxVar = (sux) tpcVarM.b;
        svf svfVar7 = (svf) tpcVarM2.l();
        svfVar7.getClass();
        suxVar.n = svfVar7;
        suxVar.c |= 4194304;
        s(1068, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void p(suv suvVar, int i) {
        tpc tpcVarM = sux.a.m();
        tpc tpcVarM2 = svl.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        svl svlVar = (svl) tpcVarM2.b;
        svlVar.c = a.at(i);
        svlVar.b |= 1;
        svl svlVar2 = (svl) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sux suxVar = (sux) tphVar;
        svlVar2.getClass();
        suxVar.v = svlVar2;
        suxVar.d |= 16384;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sux suxVar2 = (sux) tpcVarM.b;
        suvVar.getClass();
        suxVar2.e = suvVar;
        suxVar2.b |= 256;
        s(1119, tpcVarM, this.a.k());
    }

    @Override // defpackage.qbq
    public final void q(int i, suv suvVar, int i2) {
        tpc tpcVarM = sux.a.m();
        tpc tpcVarM2 = svb.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        svb svbVar = (svb) tpcVarM2.b;
        svbVar.c = rkf.t(i);
        svbVar.b |= 1;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        svb svbVar2 = (svb) tphVar;
        suvVar.getClass();
        svbVar2.d = suvVar;
        svbVar2.b |= 2;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        svb svbVar3 = (svb) tpcVarM2.b;
        svbVar3.e = a.au(i2);
        svbVar3.b |= 4;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        svb svbVar4 = (svb) tpcVarM2.b;
        svbVar4.b |= 8;
        svbVar4.f = 0;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sux suxVar = (sux) tpcVarM.b;
        svb svbVar5 = (svb) tpcVarM2.l();
        svbVar5.getClass();
        suxVar.o = svbVar5;
        suxVar.c |= Integer.MIN_VALUE;
        s(1070, tpcVarM, this.a.k());
    }

    public final void r(int i, tpc tpcVar, long j, svo svoVar) {
        tpc tpcVarM = suu.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        String str = this.d;
        tph tphVar = tpcVarM.b;
        suu suuVar = (suu) tphVar;
        str.getClass();
        suuVar.b |= 2;
        suuVar.d = str;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        suu suuVar2 = (suu) tpcVarM.b;
        suuVar2.b |= 1;
        suuVar2.c = 722788935;
        rwc rwcVar = this.e;
        if (rwcVar.h()) {
            String str2 = (String) rwcVar.c();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            suu suuVar3 = (suu) tpcVarM.b;
            suuVar3.b |= 4;
            suuVar3.e = str2;
        }
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sux suxVar = (sux) tpcVar.b;
        sux suxVar2 = sux.a;
        suxVar.b |= ImageMetadata.LENS_APERTURE;
        suxVar.f = j;
        tpc tpcVarM2 = suw.a.m();
        StatFs statFs = new StatFs(this.c.getFilesDir().getAbsolutePath());
        boolean z = ((double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) < Math.min(5.24288E8d, ((double) (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()))) * 0.05d);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        suw suwVar = (suw) tpcVarM2.b;
        suwVar.b = 1 | suwVar.b;
        suwVar.c = z;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sux suxVar3 = (sux) tpcVar.b;
        suw suwVar2 = (suw) tpcVarM2.l();
        suwVar2.getClass();
        suxVar3.i = suwVar2;
        suxVar3.c |= 128;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sux suxVar4 = (sux) tpcVar.b;
        suu suuVar4 = (suu) tpcVarM.l();
        suuVar4.getClass();
        suxVar4.m = suuVar4;
        suxVar4.c |= ImageMetadata.LENS_APERTURE;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sux suxVar5 = (sux) tpcVar.b;
        svoVar.getClass();
        suxVar5.g = svoVar;
        suxVar5.b |= ImageMetadata.SHADING_MODE;
        oca ocaVarE = ((occ) this.g.a).e(tpcVar.l());
        ocaVarE.d(i - 2);
        ocaVarE.b();
    }

    public final void s(int i, tpc tpcVar, long j) {
        qsz.o(this.f.a(j, this.b), new qby(this, i, tpcVar, j), sxo.a);
    }
}
