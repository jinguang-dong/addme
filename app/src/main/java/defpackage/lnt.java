package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnt {
    private final lol a;
    private final lon b;
    private final lnp c;
    private final rwc d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private List j = new ArrayList();
    private final mwq k;
    private final ggg l;
    private final ocq m;

    public lnt(lol lolVar, ggg gggVar, lon lonVar, mwq mwqVar, lnp lnpVar, ocq ocqVar, rwc rwcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, our ourVar) {
        this.a = lolVar;
        this.l = gggVar;
        this.b = lonVar;
        this.k = mwqVar;
        this.c = lnpVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.d = rwcVar;
        this.m = ocqVar;
        ourVar.d(lnpVar);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Iterable, java.lang.Object] */
    public final lnx a(poj pojVar, lnl lnlVar) {
        float f;
        float f2;
        float f3;
        rwc rwcVarA;
        lop lopVar;
        lop lopVar2;
        lop lopVar3;
        float f4;
        float f5;
        float f6;
        float f7;
        lop lopVar4;
        float f8;
        float f9;
        float f10;
        lnt lntVar;
        int i = lnlVar.l;
        char c = 2;
        float f11 = (i == 2 || i == 3) ? 1.0f : 0.0f;
        int i2 = lnlVar.k;
        char c2 = 4;
        float f12 = (i2 == 4 || i2 == 2) ? 1.0f : 0.0f;
        int i3 = lnlVar.m;
        float f13 = (i3 == 2 || i3 == 3) ? 1.0f : 0.0f;
        lno[] lnoVarArr = lnlVar.r;
        lnoVarArr.getClass();
        int length = lnoVarArr.length;
        float f14 = length;
        Rect rect = lnlVar.v;
        rect.getClass();
        lnoVarArr.getClass();
        if (length == 0) {
            f2 = 0.0f;
            f = 1.0f;
        } else {
            int i4 = 0;
            f = 1.0f;
            float fMin = 0.0f;
            while (i4 < length) {
                char c3 = c;
                lno lnoVar = lnoVarArr[i4];
                char c4 = c2;
                int iWidth = rect.width();
                int iHeight = rect.height();
                Rect rect2 = lnoVar.a;
                float f15 = iWidth;
                float f16 = f15 * 0.04f;
                float fD = 1.0f - lpa.d((-(rect2.left - (f15 * 0.15f))) / f16);
                float fD2 = 1.0f - lpa.d((rect2.right - (f15 * 0.85f)) / f16);
                float f17 = iHeight;
                float f18 = 0.04f * f17;
                fMin += Math.min(fD, Math.min(fD2, Math.min(1.0f - lpa.d((-(rect2.top - (0.15f * f17))) / f18), 1.0f - lpa.d((rect2.bottom - (f17 * 0.85f)) / f18)))) / lnoVarArr.length;
                i4++;
                c = c3;
                c2 = c4;
            }
            f2 = fMin;
        }
        float fS = this.l.s(lnlVar);
        float f19 = lnlVar.n == 0 ? f : 0.0f;
        lon lonVar = this.b;
        float f20 = (lonVar.a * 0.85f) + (lnlVar.q * 0.14999998f);
        lonVar.a = f20;
        double dPow = 1.0d / Math.pow(lnlVar.d / 1000000.0f, 6.0d);
        lnp lnpVar = this.c;
        float fA = lnpVar.a(pojVar, lnlVar);
        float fAr = this.m.ar(pojVar);
        boolean z = this.h;
        rwc rwcVarB = lnpVar.b();
        if (z) {
            f3 = f20;
            rwcVarA = this.a.a(pojVar, lnlVar, true);
        } else {
            f3 = f20;
            rwcVarA = rvk.a;
        }
        rwc rwcVar = rwcVarA;
        rwc rwcVarC = lpa.c(this.d, pojVar.d());
        float f21 = rwcVar.h() ? ((loi) rwcVar.c()).b : 0.0f;
        boolean z2 = lnlVar.t;
        boolean zC = lnpVar.c();
        if (this.i) {
            if (this.f && f14 == 0.0f) {
                lopVar2 = new lop(0.0f, 0.0f, 0.0f, 0.08713f, 0.0766f, 0.0f, 0.07812f, 0.31714f, 0.03985f);
                lopVar3 = lopVar2;
            } else {
                lopVar = new lop(0.0f, 0.0f, 0.03766f, 0.71723f, 0.10702f, 0.0f, 0.13809f, 0.0f, 0.0f);
                lopVar3 = lopVar;
            }
        } else if (this.g) {
            if (this.f && f14 == 0.0f) {
                lopVar2 = new lop(0.0f, 0.00479f, 0.0f, 0.05419f, 0.06547f, 0.0f, 0.02924f, 0.24129f, 0.02396f);
                lopVar3 = lopVar2;
            } else {
                lopVar = new lop(0.0f, 0.00368f, 0.01841f, 0.57261f, 0.32227f, 0.0f, 0.08302f, 0.0f, 0.0f);
                lopVar3 = lopVar;
            }
        } else if (this.f && f14 == 0.0f) {
            lopVar2 = new lop(1.6E-4f, 0.0f, 0.0f, 0.03037f, 0.00614f, 0.0f, 0.01661f, 0.08336f, 0.00359f);
            lopVar3 = lopVar2;
        } else {
            lopVar = new lop(0.0f, 0.0f, 0.04085f, 0.86336f, 0.0f, 0.00393f, 0.09186f, 0.0f, 0.0f);
            lopVar3 = lopVar;
        }
        float f22 = (((float) (1.0d - (2.0d / (dPow + 1.0d)))) * f3) + f;
        float f23 = lopVar3.a;
        float f24 = (f11 * f23) + 0.0f;
        float f25 = lopVar3.b;
        float f26 = f12 * f25;
        float f27 = f13 * 0.0f;
        float f28 = f14 * 0.0f;
        float f29 = lopVar3.c;
        float f30 = f2 * f29;
        float f31 = lopVar3.d;
        float f32 = f21 * f31;
        float f33 = lopVar3.e;
        float f34 = fS * f33;
        float f35 = lopVar3.f;
        float f36 = f19 * f35;
        float f37 = lopVar3.h;
        float f38 = fA * f37;
        float f39 = lopVar3.i;
        float f40 = fAr * f39;
        float f41 = f22 / 2.0f;
        if (this.e) {
            lop lopVar5 = lopVar3;
            ArrayList arrayList = new ArrayList();
            if (rwcVar.h()) {
                f10 = f29;
                loh[] lohVarArr = ((loi) rwcVar.c()).a;
                f8 = f25;
                f9 = f23;
                int i5 = 0;
                while (i5 < lohVarArr.length) {
                    loh lohVar = lohVarArr[i5];
                    int i6 = i5;
                    tpc tpcVarM = ttc.a.m();
                    float f42 = fA;
                    float f43 = fAr;
                    long j = lohVar.a;
                    loh[] lohVarArr2 = lohVarArr;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    ttc ttcVar = (ttc) tphVar;
                    ttcVar.b |= 1;
                    ttcVar.c = j;
                    float f44 = lohVar.c;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    ttc ttcVar2 = (ttc) tpcVarM.b;
                    ttcVar2.b |= 4;
                    ttcVar2.e = f44;
                    rwc rwcVar2 = lohVar.b;
                    if (rwcVar2.h()) {
                        long jLongValue = ((Long) rwcVar2.c()).longValue();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttc ttcVar3 = (ttc) tpcVarM.b;
                        ttcVar3.b |= 2;
                        ttcVar3.d = jLongValue;
                    }
                    rwc rwcVar3 = lohVar.k;
                    if (rwcVar3.h()) {
                        ?? C = rwcVar3.c();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttc ttcVar4 = (ttc) tpcVarM.b;
                        tpm tpmVar = ttcVar4.f;
                        if (!tpmVar.c()) {
                            ttcVar4.f = tph.s(tpmVar);
                        }
                        tnq.e(C, ttcVar4.f);
                    }
                    rwc rwcVar4 = lohVar.l;
                    if (rwcVar4.h()) {
                        ?? C2 = rwcVar4.c();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttc ttcVar5 = (ttc) tpcVarM.b;
                        tpm tpmVar2 = ttcVar5.g;
                        if (!tpmVar2.c()) {
                            ttcVar5.g = tph.s(tpmVar2);
                        }
                        tnq.e(C2, ttcVar5.g);
                    }
                    arrayList.add((ttc) tpcVarM.l());
                    i5 = i6 + 1;
                    fA = f42;
                    fAr = f43;
                    lohVarArr = lohVarArr2;
                }
            } else {
                f8 = f25;
                f9 = f23;
                f10 = f29;
            }
            float f45 = fA;
            float f46 = fAr;
            tpc tpcVarM2 = tsv.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            tsv tsvVar = (tsv) tphVar2;
            tsvVar.b |= 1;
            tsvVar.c = f11;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            tsv tsvVar2 = (tsv) tphVar3;
            tsvVar2.b |= 2;
            tsvVar2.d = f12;
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            tph tphVar4 = tpcVarM2.b;
            tsv tsvVar3 = (tsv) tphVar4;
            tsvVar3.b |= 4;
            tsvVar3.e = f13;
            if (!tphVar4.C()) {
                tpcVarM2.o();
            }
            tph tphVar5 = tpcVarM2.b;
            tsv tsvVar4 = (tsv) tphVar5;
            tsvVar4.b |= 8;
            tsvVar4.f = f14;
            if (!tphVar5.C()) {
                tpcVarM2.o();
            }
            tph tphVar6 = tpcVarM2.b;
            tsv tsvVar5 = (tsv) tphVar6;
            tsvVar5.b |= 16;
            tsvVar5.g = f2;
            if (!tphVar6.C()) {
                tpcVarM2.o();
            }
            tph tphVar7 = tpcVarM2.b;
            tsv tsvVar6 = (tsv) tphVar7;
            tsvVar6.b |= 32;
            tsvVar6.h = f21;
            if (!tphVar7.C()) {
                tpcVarM2.o();
            }
            tph tphVar8 = tpcVarM2.b;
            tsv tsvVar7 = (tsv) tphVar8;
            tsvVar7.b |= 64;
            tsvVar7.i = fS;
            if (!tphVar8.C()) {
                tpcVarM2.o();
            }
            tph tphVar9 = tpcVarM2.b;
            tsv tsvVar8 = (tsv) tphVar9;
            tsvVar8.b |= 128;
            tsvVar8.j = f19;
            if (!tphVar9.C()) {
                tpcVarM2.o();
            }
            tph tphVar10 = tpcVarM2.b;
            tsv tsvVar9 = (tsv) tphVar10;
            tsvVar9.b |= 256;
            tsvVar9.k = f41;
            if (!tphVar10.C()) {
                tpcVarM2.o();
            }
            tph tphVar11 = tpcVarM2.b;
            tsv tsvVar10 = (tsv) tphVar11;
            tsvVar10.b |= 512;
            f6 = f45;
            tsvVar10.l = f6;
            if (!tphVar11.C()) {
                tpcVarM2.o();
            }
            tsv tsvVar11 = (tsv) tpcVarM2.b;
            tsvVar11.b |= 1024;
            tsvVar11.m = f46;
            float f47 = rwcVar.h() ? ((loi) rwcVar.c()).c : 0.0f;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tsv tsvVar12 = (tsv) tpcVarM2.b;
            tsvVar12.b |= 2048;
            tsvVar12.p = f47;
            float f48 = rwcVar.h() ? ((loi) rwcVar.c()).d : 0.0f;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tsv tsvVar13 = (tsv) tpcVarM2.b;
            tsvVar13.b |= 4096;
            tsvVar13.q = f48;
            float f49 = rwcVar.h() ? ((loi) rwcVar.c()).e : 0.0f;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar12 = tpcVarM2.b;
            tsv tsvVar14 = (tsv) tphVar12;
            f7 = f46;
            tsvVar14.b |= 8192;
            tsvVar14.r = f49;
            if (!tphVar12.C()) {
                tpcVarM2.o();
            }
            tsv tsvVar15 = (tsv) tpcVarM2.b;
            tpw tpwVar = tsvVar15.n;
            if (!tpwVar.c()) {
                tsvVar15.n = tph.v(tpwVar);
            }
            tnq.e(arrayList, tsvVar15.n);
            if (rwcVarB.h()) {
                Object objC = rwcVarB.c();
                lntVar = this;
                if (lntVar.j.isEmpty()) {
                    lntVar.j = new ArrayList(Collections.nCopies(((float[]) objC).length, Float.valueOf(0.0f)));
                }
                int i7 = 0;
                while (true) {
                    float[] fArr = (float[]) objC;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    lntVar.j.set(i7, Float.valueOf(fArr[i7]));
                    i7++;
                }
                List list = lntVar.j;
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tsv tsvVar16 = (tsv) tpcVarM2.b;
                tpm tpmVar3 = tsvVar16.o;
                if (!tpmVar3.c()) {
                    tsvVar16.o = tph.s(tpmVar3);
                }
                tnq.e(list, tsvVar16.o);
            } else {
                lntVar = this;
            }
            tsv tsvVar17 = (tsv) tpcVarM2.l();
            tpc tpcVarM3 = tsw.a.m();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            tph tphVar13 = tpcVarM3.b;
            tsw tswVar = (tsw) tphVar13;
            tswVar.b |= 1;
            tswVar.c = f9;
            if (!tphVar13.C()) {
                tpcVarM3.o();
            }
            tph tphVar14 = tpcVarM3.b;
            tsw tswVar2 = (tsw) tphVar14;
            tswVar2.b |= 2;
            tswVar2.d = f8;
            if (!tphVar14.C()) {
                tpcVarM3.o();
            }
            tph tphVar15 = tpcVarM3.b;
            tsw tswVar3 = (tsw) tphVar15;
            tswVar3.b |= 4;
            tswVar3.e = 0.0f;
            if (!tphVar15.C()) {
                tpcVarM3.o();
            }
            tph tphVar16 = tpcVarM3.b;
            tsw tswVar4 = (tsw) tphVar16;
            tswVar4.b |= 8;
            tswVar4.f = 0.0f;
            if (!tphVar16.C()) {
                tpcVarM3.o();
            }
            tph tphVar17 = tpcVarM3.b;
            tsw tswVar5 = (tsw) tphVar17;
            tswVar5.b |= 16;
            tswVar5.g = f10;
            if (!tphVar17.C()) {
                tpcVarM3.o();
            }
            tph tphVar18 = tpcVarM3.b;
            tsw tswVar6 = (tsw) tphVar18;
            tswVar6.b |= 32;
            tswVar6.h = f31;
            if (!tphVar18.C()) {
                tpcVarM3.o();
            }
            tph tphVar19 = tpcVarM3.b;
            tsw tswVar7 = (tsw) tphVar19;
            tswVar7.b |= 64;
            tswVar7.i = f33;
            if (!tphVar19.C()) {
                tpcVarM3.o();
            }
            tph tphVar20 = tpcVarM3.b;
            tsw tswVar8 = (tsw) tphVar20;
            tswVar8.b |= 128;
            tswVar8.j = f35;
            lopVar4 = lopVar5;
            float f50 = lopVar4.g;
            if (!tphVar20.C()) {
                tpcVarM3.o();
            }
            tph tphVar21 = tpcVarM3.b;
            f4 = fS;
            tsw tswVar9 = (tsw) tphVar21;
            f5 = f19;
            tswVar9.b |= 256;
            tswVar9.k = f50;
            if (!tphVar21.C()) {
                tpcVarM3.o();
            }
            tph tphVar22 = tpcVarM3.b;
            tsw tswVar10 = (tsw) tphVar22;
            tswVar10.b |= 512;
            tswVar10.l = f37;
            if (!tphVar22.C()) {
                tpcVarM3.o();
            }
            tsw tswVar11 = (tsw) tpcVarM3.b;
            tswVar11.b |= 1024;
            tswVar11.m = f39;
            lntVar.k.r(pojVar.d(), tsvVar17, (tsw) tpcVarM3.l());
        } else {
            f4 = fS;
            f5 = f19;
            f6 = fA;
            f7 = fAr;
            lopVar4 = lopVar3;
        }
        return new lnx(pojVar.d(), f24 + f26 + f27 + f28 + f30 + f32 + f34 + f36 + (lopVar4.g * f41) + f38 + f40, f11, f12, f13, f14, f2, f21, f4, f5, f41, f7, f6, z2, zC, rwcVar, rwcVarC, rwcVarB);
    }
}
