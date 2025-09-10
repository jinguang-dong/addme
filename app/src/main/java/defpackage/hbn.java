package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbn implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;
    private final Object h;

    public hbn(qay qayVar, tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
        this.g = i;
        this.h = qayVar;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, syw] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        final int i = 1;
        final int i2 = 0;
        switch (this.g) {
            case 0:
                tzx tzxVar = this.f;
                tzx tzxVar2 = this.e;
                tzx tzxVar3 = this.d;
                tzx tzxVar4 = this.c;
                tzx tzxVar5 = this.b;
                return new ree(((hbr) this.h).a(), ((jdg) this.a).b(), ((hqj) tzxVar5).a(), ((hbm) tzxVar4).a(), ((hrc) tzxVar3).a(), ((hqk) tzxVar2).a(), (pbn) tzxVar.a());
            case 1:
                hbj hbjVar = (hbj) this.d.a();
                tzx tzxVar6 = this.f;
                tzx tzxVar7 = this.e;
                tzx tzxVar8 = this.b;
                Optional optionalB = ((fmp) this.c).a();
                Function functionB = ((fmy) tzxVar8).b();
                Function functionB2 = ((fmy) tzxVar7).b();
                sbv sbvVar = (sbv) tzxVar6.a();
                our ourVar = (our) this.a.a();
                ggg gggVar = (ggg) ((tzu) this.h).a;
                if (!hbjVar.o(gyi.h)) {
                    return new fre() { // from class: fmt
                        @Override // defpackage.fre
                        public final /* synthetic */ int a() {
                            return 0;
                        }

                        @Override // defpackage.fre
                        public final syu b() {
                            return i != 0 ? ske.M(true) : ske.M(true);
                        }

                        @Override // defpackage.fre
                        public final /* synthetic */ String c() {
                            return i != 0 ? gsn.Z(this) : gsn.Z(this);
                        }
                    };
                }
                if (optionalB.isEmpty()) {
                    ((sgt) fmv.b.c().M(277)).s("A missing dependency. Skipping cottage initialization.");
                    return new fre() { // from class: fmt
                        @Override // defpackage.fre
                        public final /* synthetic */ int a() {
                            return 0;
                        }

                        @Override // defpackage.fre
                        public final syu b() {
                            return i2 != 0 ? ske.M(true) : ske.M(true);
                        }

                        @Override // defpackage.fre
                        public final /* synthetic */ String c() {
                            return i2 != 0 ? gsn.Z(this) : gsn.Z(this);
                        }
                    };
                }
                Object obj = optionalB.get();
                foy foyVar = (foy) obj;
                Stream map = Collection.EL.stream(sbvVar.values()).map(new fmu(functionB2, foyVar, 0));
                int i3 = sbp.d;
                ree reeVar = (ree) gggVar.a;
                hbj hbjVar2 = (hbj) reeVar.c.a();
                hbp hbpVar = (hbp) reeVar.d.a();
                tzs.b(reeVar.b);
                pfu pfuVar = (pfu) reeVar.f.a();
                pdv pdvVar = (pdv) reeVar.a.a();
                return new gkh(ourVar, new fna(foyVar, hbjVar2, hbpVar, pfuVar, pdvVar), i);
            case 2:
                return new ija((pfw) this.h.a(), ((pba) this.c).a(), (pbn) this.e.a(), (ikm) this.b.a(), (ikp) this.a.a(), (out) this.d.a(), (ffq) this.f.a());
            case 3:
                hbj hbjVar3 = (hbj) this.c.a();
                tzx tzxVar9 = this.f;
                return new isy(hbjVar3, tzs.b(this.b), (iso) tzxVar9.a(), (Executor) this.h.a(), ((itf) this.d).a(), (pbn) this.e.a(), ((jln) this.a).a());
            case 4:
                tzx tzxVar10 = this.b;
                return new itb(((hxw) this.f).a(), (hyh) tzxVar10.a(), (iso) this.e.a(), (isy) this.h.a(), ((itc) this.a).a(), (hbj) this.d.a(), (Executor) this.c.a());
            case 5:
                Map map2 = (Map) this.d.a();
                tzx tzxVar11 = this.b;
                tzx tzxVar12 = this.e;
                tzx tzxVar13 = this.f;
                tzx tzxVar14 = this.a;
                tzj tzjVarB = tzs.b(this.h);
                tzj tzjVarB2 = tzs.b(tzxVar14);
                tzj tzjVarB3 = tzs.b(tzxVar13);
                tzj tzjVarB4 = tzs.b(tzxVar12);
                lkk lkkVar = (lkk) tzxVar11.a();
                hbj hbjVar4 = (hbj) this.c.a();
                if (!lkkVar.equals(lkk.AUTO) || !hbjVar4.p(gze.k) || map2.isEmpty()) {
                    return Optional.empty();
                }
                if (map2.size() == 1) {
                    return Optional.of(new lbh((pdv) Collection.EL.stream(map2.values()).findFirst().get()));
                }
                owf owfVar = (owf) tzjVarB.a();
                return Optional.of(qpt.cw(map2, owfVar, (pfl) tzjVarB3.a(), (our) tzjVarB4.a(), false));
            case 6:
                return new kco(((klj) this.c).a(), (szh) this.d.a(), (our) this.e.a(), (rwc) this.a.a(), (kow) this.h.a(), (owf) this.f.a(), (out) this.b.a());
            case 7:
                tzx tzxVar15 = this.c;
                Context contextB = ((jdg) this.a).b();
                Uri uri = (Uri) tzxVar15.a();
                qbq qbqVar = (qbq) this.f.a();
                tzx tzxVar16 = this.b;
                qaq qaqVarA = ((pzt) this.e).a();
                rwc rwcVar = (rwc) tzxVar16.a();
                reb rebVarA = rec.a();
                rebVarA.e(uri);
                rebVarA.d(pvj.a);
                rebVarA.f(false);
                qay qayVar = (qay) this.h;
                rebVarA.b(qsp.S(contextB, qayVar.a, qbqVar, qaqVarA, rwcVar));
                return ((ree) qayVar.b).a(rebVarA.a());
            case 8:
                tzx tzxVar17 = this.c;
                Context contextB2 = ((jdg) this.a).b();
                Uri uri2 = (Uri) tzxVar17.a();
                qbq qbqVar2 = (qbq) this.f.a();
                tzx tzxVar18 = this.b;
                qaq qaqVarA2 = ((pzt) this.e).a();
                rwc rwcVar2 = (rwc) tzxVar18.a();
                reb rebVarA2 = rec.a();
                rebVarA2.e(uri2);
                rebVarA2.d(pvt.a);
                rebVarA2.f(false);
                qay qayVar2 = (qay) this.h;
                rebVarA2.b(qsp.T(contextB2, qayVar2.a, qbqVar2, qaqVarA2, rwcVar2));
                return ((ree) qayVar2.b).a(rebVarA2.a());
            case 9:
                tzx tzxVar19 = this.c;
                Context contextB3 = ((jdg) this.a).b();
                Uri uri3 = (Uri) tzxVar19.a();
                qbq qbqVar3 = (qbq) this.f.a();
                tzx tzxVar20 = this.b;
                qaq qaqVarA3 = ((pzt) this.e).a();
                rwc rwcVar3 = (rwc) tzxVar20.a();
                reb rebVarA3 = rec.a();
                rebVarA3.e(uri3);
                rebVarA3.d(pvj.a);
                rebVarA3.f(false);
                qay qayVar3 = (qay) this.h;
                rebVarA3.b(qsp.S(contextB3, qayVar3.a, qbqVar3, qaqVarA3, rwcVar3));
                return ((ree) qayVar3.b).a(rebVarA3.a());
            default:
                tzx tzxVar21 = this.c;
                Context contextB4 = ((jdg) this.a).b();
                Uri uri4 = (Uri) tzxVar21.a();
                qbq qbqVar4 = (qbq) this.f.a();
                tzx tzxVar22 = this.b;
                qaq qaqVarA4 = ((pzt) this.e).a();
                rwc rwcVar4 = (rwc) tzxVar22.a();
                reb rebVarA4 = rec.a();
                rebVarA4.e(uri4);
                rebVarA4.d(pvt.a);
                rebVarA4.f(false);
                qay qayVar4 = (qay) this.h;
                rebVarA4.b(qsp.T(contextB4, qayVar4.a, qbqVar4, qaqVarA4, rwcVar4));
                return ((ree) qayVar4.b).a(rebVarA4.a());
        }
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i) {
        this.g = i;
        this.h = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
        this.f = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr) {
        this.g = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.h = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.a = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[] cArr) {
        this.g = i;
        this.h = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
        this.f = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[] fArr) {
        this.g = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.h = tzxVar5;
        this.f = tzxVar6;
        this.b = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.h = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
        this.c = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
        this.a = tzxVar7;
    }

    public hbn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[] zArr) {
        this.g = i;
        this.d = tzxVar;
        this.h = tzxVar2;
        this.a = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
        this.c = tzxVar7;
    }
}
