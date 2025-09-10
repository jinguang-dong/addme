package defpackage;

import android.content.Context;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyr implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final tzx m;
    private final /* synthetic */ int n;

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i) {
        this.n = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
        this.m = tzxVar13;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        Object sfmVar2;
        Object sfmVar3;
        switch (this.n) {
            case 0:
                tzx tzxVar = this.m;
                tzx tzxVar2 = this.l;
                tzx tzxVar3 = this.k;
                tzx tzxVar4 = this.j;
                tzx tzxVar5 = this.i;
                tzx tzxVar6 = this.h;
                tzx tzxVar7 = this.g;
                tzx tzxVar8 = this.f;
                tzx tzxVar9 = this.e;
                return new jdh(this.a, this.b, this.c, this.d, tzxVar9, tzxVar8, tzxVar7, tzxVar6, tzxVar5, tzxVar4, tzxVar3, tzxVar2, tzxVar);
            case 1:
                return new flu((krj) this.l.a(), (mzz) this.e.a(), (fvu) this.a.a(), (ktx) this.k.a(), (ndj) this.m.a(), (fjz) this.i.a(), (ovx) this.f.a(), (ovx) this.g.a(), (fif) this.j.a(), (ocq) this.h.a(), (fke) this.c.a(), (nca) this.d.a(), (owf) this.b.a());
            case 2:
                return new qwz(((ixw) this.i).a(), (out) this.f.a(), (owq) this.l.a(), (owf) this.e.a(), (owf) this.b.a(), (owf) this.d.a(), (owf) this.k.a(), (ovx) this.a.a(), (owf) this.h.a(), (owq) this.c.a(), (owf) this.m.a(), (owf) this.g.a(), (owf) this.j.a());
            case 3:
                tzx tzxVar10 = this.j;
                fdq fdqVarA = ((ixw) this.i).a();
                final owf owfVar = (owf) tzxVar10.a();
                final hbj hbjVar = (hbj) this.e.a();
                out outVar = (out) this.m.a();
                rwc rwcVar = (rwc) this.a.a();
                tzx tzxVar11 = this.h;
                tzx tzxVar12 = this.g;
                final hrj hrjVarA = ((hrk) this.b).a();
                final ocq ocqVarA = ((nmy) tzxVar12).a();
                final luj lujVar = (luj) tzxVar11.a();
                final luj lujVar2 = (luj) this.f.a();
                owf owfVar2 = (owf) this.c.a();
                tzx tzxVar13 = this.d;
                tzx tzxVar14 = this.k;
                hsh hshVarA = ((hsi) this.l).a();
                final tzj tzjVarB = tzs.b(tzxVar14);
                owf owfVar3 = (owf) tzxVar13.a();
                if (rwcVar.h()) {
                    fdqVarA.j().d(owl.h(owl.a(owfVar2, owfVar3), new fhy(15)).dK(new pau() { // from class: hrf
                        @Override // defpackage.pau
                        public final void a(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                hbj hbjVar2 = hbjVar;
                                if (hbjVar2.p(gzo.aO) || !((nkw) owfVar.dL()).equals(nkw.PHOTO) || ocqVarA.r() || ((HotshotController) tzjVarB.a()).t()) {
                                    return;
                                }
                                boolean zP = hbjVar2.p(gyo.g);
                                lus lusVar = zP ? luf.o : luf.m;
                                gzi gziVar = zP ? gyo.e : gyo.d;
                                luj lujVar3 = lujVar2;
                                int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
                                Integer num = (Integer) hbjVar2.a(gziVar).get();
                                int iIntValue2 = num.intValue();
                                if (iIntValue >= iIntValue2) {
                                    lujVar3.d(lusVar, num);
                                    return;
                                }
                                if (iIntValue == iIntValue2 - 1) {
                                    hrjVarA.a(true);
                                }
                                lujVar3.d(lusVar, Integer.valueOf(iIntValue + 1));
                            }
                        }
                    }, outVar));
                    sfmVar = new sfm(new hrg(outVar, rwcVar, hshVarA, 0));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 4:
                owq owqVar = (owq) this.k.a();
                hbj hbjVar2 = (hbj) this.b.a();
                tzx tzxVar15 = this.a;
                Object objA = this.h.a();
                hpa hpaVar = (hpa) this.m.a();
                owq owqVar2 = (owq) this.j.a();
                owq owqVar3 = (owq) this.f.a();
                Executor executor = (Executor) this.i.a();
                our ourVar = (our) this.d.a();
                hwf hwfVar = (hwf) objA;
                if (hbjVar2.p(gzq.d)) {
                    owqVar2.a(0);
                    sfmVar2 = new sfm(new frf(new igu(ourVar, hpaVar, hwfVar, executor, owqVar, owqVar3, hbjVar2, 1), "squad-startup", 0));
                } else {
                    sfmVar2 = sfd.a;
                }
                sfmVar2.getClass();
                return sfmVar2;
            case 5:
                owq owqVar4 = (owq) this.b.a();
                owq owqVar5 = (owq) this.h.a();
                owq owqVar6 = (owq) this.f.a();
                owq owqVar7 = (owq) this.g.a();
                ((jaf) this.k).b();
                return new hwf(owqVar4, owqVar5, owqVar6, owqVar7, (kan) this.d.a(), (hbj) this.a.a(), (sbv) this.c.a(), ((kiu) this.j).a(), (luj) this.m.a(), (ovx) this.l.a(), (owf) this.e.a(), (owf) this.i.a());
            case 6:
                jgt jgtVarA = ((iyb) this.j).a();
                Context contextB = ((imm) this.i).b();
                lvq lvqVarA = ((lvr) this.h).a();
                owq owqVar8 = (owq) this.k.a();
                owq owqVar9 = (owq) this.f.a();
                owq owqVar10 = (owq) this.g.a();
                owq owqVar11 = (owq) this.d.a();
                owq owqVar12 = (owq) this.l.a();
                owq owqVar13 = (owq) this.e.a();
                hbj hbjVar3 = (hbj) this.b.a();
                mdy mdyVar = (mdy) this.m.a();
                out outVar2 = (out) this.a.a();
                itl itlVar = new itl(lvqVarA, contextB, new saw(), owqVar8, owqVar9, owqVar10, owqVar11, owqVar12, owqVar13, hbjVar3, mdyVar, (Executor) this.c.a());
                ins.g(outVar2, jgtVarA, itlVar);
                return itlVar;
            case 7:
                final ocq ocqVar = (ocq) this.g.a();
                final boolean zBooleanValue = ((hef) this.d).b().booleanValue();
                final kgn kgnVar = (kgn) this.m.a();
                luj lujVar3 = (luj) this.h.a();
                hyh hyhVar = (hyh) this.a.a();
                final owq owqVar14 = (owq) this.j.a();
                final kpb kpbVar = (kpb) this.l.a();
                hie hieVar = (hie) this.c.a();
                tzx tzxVar16 = this.b;
                iso isoVarA = ((hfg) this.i).a();
                final hbj hbjVar4 = (hbj) tzxVar16.a();
                tzx tzxVar17 = this.e;
                tzj tzjVarB2 = tzs.b(this.f);
                final owf owfVar4 = (owf) tzxVar17.a();
                final owf owfVar5 = (owf) this.k.a();
                if (isoVarA.m()) {
                    lus lusVar = luf.aO;
                    owq owqVarA = lujVar3.a(lusVar);
                    Integer num = (Integer) lusVar.d(hbjVar4);
                    ksa ksaVar = ksa.MICROVIDEO_OFF;
                    ksa ksaVar2 = ksa.MICROVIDEO_ON;
                    ksa ksaVar3 = ksa.MICROVIDEO_AUTO;
                    final krp krpVar = new krp(owqVarA, num, 0, ksaVar, 2, ksaVar2, 1, ksaVar3);
                    final krs krsVar = krs.MICROVIDEO;
                    final gzg gzgVar = gzz.r;
                    final owf owfVar6 = hyhVar.b;
                    final owq owqVarA2 = lujVar3.a(luf.v);
                    final owq owqVarA3 = lujVar3.a(luf.x);
                    final owf owfVarA = owb.a(hieVar.d);
                    gzi gziVar = gzo.a;
                    final hzk hzkVar = new hzk(13);
                    Predicate predicate = new Predicate() { // from class: jqn
                        public final /* synthetic */ Predicate and(Predicate predicate2) {
                            return Predicate$CC.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo32negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate2) {
                            return Predicate$CC.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            boolean zS = ((krj) obj).s();
                            owf owfVar7 = owqVarA3;
                            if (!zS) {
                                owf owfVar8 = owqVarA2;
                                if (!((Boolean) owfVar5.dL()).booleanValue()) {
                                    owfVar7 = owfVar8;
                                }
                            }
                            return ((Objects.equals(((ovx) owfVar7).d, "on") && ((Boolean) owfVarA.dL()).booleanValue()) || Objects.equals(kpbVar.dL(), kpa.a) || ((Boolean) owqVar14.dL()).booleanValue() || ((Boolean) owfVar6.dL()).booleanValue() || ((Boolean) owfVar4.dL()).booleanValue()) ? false : true;
                        }
                    };
                    Consumer consumer = new Consumer() { // from class: jqo
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void d(Object obj) {
                            final krj krjVar = (krj) obj;
                            our ourVar2 = krjVar.L;
                            owq owqVar15 = krpVar;
                            final ksa ksaVar4 = (ksa) owqVar15.dL();
                            final krs krsVar2 = krsVar;
                            final ocq ocqVar2 = ocqVar;
                            final boolean z = zBooleanValue;
                            final hbj hbjVar5 = hbjVar4;
                            final gzg gzgVar2 = gzgVar;
                            final kgn kgnVar2 = kgnVar;
                            pau pauVar = new pau() { // from class: jqp
                                public final /* synthetic */ String c = "micro_tutorial_dismiss";

                                @Override // defpackage.pau
                                public final void a(Object obj2) {
                                    if (((ksa) obj2).equals(ksaVar4)) {
                                        return;
                                    }
                                    krj krjVar2 = krjVar;
                                    if (krjVar2.t()) {
                                        krs krsVar3 = krsVar2;
                                        if (krjVar2.A) {
                                            if (!krjVar2.t.C(krsVar3) && !krjVar2.u.C(krsVar3)) {
                                                return;
                                            }
                                        } else if (!krjVar2.t.C(krsVar3)) {
                                            return;
                                        }
                                        if (ocqVar2.ai(this.c) != 0 || z) {
                                            return;
                                        }
                                        hbj hbjVar6 = hbjVar5;
                                        if (hbjVar6.p(gzo.aO) || !hbjVar6.p(gzgVar2)) {
                                            return;
                                        }
                                        kgn kgnVar3 = kgnVar2;
                                        if (krsVar3 == krs.MICROVIDEO) {
                                            kgnVar3.b();
                                        } else {
                                            kgnVar3.b();
                                            ((ocq) kgnVar3.a).ak("motion_tutorial_dismiss");
                                        }
                                    }
                                }
                            };
                            sxo sxoVar = sxo.a;
                            ourVar2.d(owqVar15.dK(pauVar, sxoVar));
                            ourVar2.d(owl.a(owfVar6, owfVarA, owqVar14, owqVarA2, owqVarA3, kpbVar, owfVar4, owfVar5).dK(new fcd(hzkVar, krjVar, krsVar2, 5, (byte[]) null), sxoVar));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    ksh kshVarM = ksi.m();
                    kshVarM.n(krsVar);
                    kshVarM.a = krpVar;
                    kshVarM.b = hzkVar;
                    kshVarM.c = predicate;
                    kshVarM.e = consumer;
                    gzi gziVar2 = gzq.a;
                    sbp sbpVarN = sbp.n(Integer.valueOf(R.drawable.gs_block_vd_theme_24), Integer.valueOf(R.drawable.gs_photo_auto_merge_vd_theme_24), Integer.valueOf(R.drawable.gs_photo_merge_auto_vd_theme_24));
                    sbp sbpVarN2 = sbp.n(ksaVar, ksaVar3, ksaVar2);
                    sbp sbpVarN3 = sbp.n(Integer.valueOf(R.string.micro_off), Integer.valueOf(R.string.micro_auto), Integer.valueOf(R.string.micro_on));
                    sbp sbpVarN4 = sbp.n(Integer.valueOf(R.string.micro_off_desc), Integer.valueOf(R.string.micro_auto_desc), Integer.valueOf(R.string.micro_on_desc));
                    kshVarM.h(R.string.micro_option_desc);
                    kshVarM.c(R.string.micro_desc);
                    kshVarM.l(sbpVarN2);
                    kshVarM.i(sbpVarN3);
                    kshVarM.d(sbpVarN4);
                    kshVarM.f(sbpVarN);
                    kshVarM.a = krpVar;
                    kshVarM.h = new gmf(kgnVar, 3);
                    kshVarM.k((ksb) tzjVarB2.a());
                    kshVarM.f = new glv(krpVar, 2);
                    sfmVar3 = new sfm(kshVarM.a());
                } else {
                    sfmVar3 = sfd.a;
                }
                sfmVar3.getClass();
                return sfmVar3;
            case 8:
                ((hef) this.d).b().booleanValue();
                iso isoVarA2 = ((hfg) this.i).a();
                tzs.b(this.f);
                if (isoVarA2.m()) {
                    gzi gziVar3 = gzq.a;
                }
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            default:
                tzx tzxVar18 = this.e;
                tzx tzxVar19 = this.c;
                Context contextB2 = ((imm) this.b).b();
                pjo pjoVarA = ((kiv) tzxVar19).a();
                hbj hbjVar5 = (hbj) tzxVar18.a();
                Executor executor2 = (Executor) this.d.a();
                pbn pbnVar = (pbn) this.f.a();
                owq owqVar15 = (owq) this.l.a();
                our ourVar2 = (our) this.m.a();
                tzx tzxVar20 = this.g;
                tzx tzxVar21 = this.j;
                tzx tzxVar22 = this.i;
                tzx tzxVar23 = this.h;
                rwc rwcVarB = ((gad) this.k).b();
                rwc rwcVarB2 = ((gad) tzxVar23).b();
                rwc rwcVarB3 = ((jaf) tzxVar22).b();
                rwc rwcVarB4 = ((jaf) tzxVar21).b();
                rwc rwcVar2 = (rwc) tzxVar20.a();
                pbs pbsVar = new pbs(executor2, pbnVar, "SmartCaptureFQS");
                boolean zBooleanValue2 = ((Boolean) owqVar15.dL()).booleanValue();
                rwc rwcVarJ = hbjVar5.p(gzb.e) ? rwc.j((hps) this.a.a()) : rvk.a;
                gzg gzgVar2 = haa.w;
                if (!hbjVar5.p(gzgVar2)) {
                    rwcVarB = rvk.a;
                }
                if (!hbjVar5.p(gzgVar2)) {
                    rwcVarB3 = rvk.a;
                }
                lol lolVarB = lol.b(contextB2, hbjVar5, pjoVarA, pbsVar, pbnVar, zBooleanValue2, rwcVarJ, rwcVarB, rwcVarB2, rwcVarB3, rwcVarB4, rwcVar2);
                ourVar2.d(lolVarB);
                return lolVarB;
        }
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, byte[] bArr) {
        this.n = i;
        this.l = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.k = tzxVar4;
        this.m = tzxVar5;
        this.i = tzxVar6;
        this.f = tzxVar7;
        this.g = tzxVar8;
        this.j = tzxVar9;
        this.h = tzxVar10;
        this.c = tzxVar11;
        this.d = tzxVar12;
        this.b = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, char[] cArr) {
        this.n = i;
        this.i = tzxVar;
        this.f = tzxVar2;
        this.l = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.d = tzxVar6;
        this.k = tzxVar7;
        this.a = tzxVar8;
        this.h = tzxVar9;
        this.c = tzxVar10;
        this.m = tzxVar11;
        this.g = tzxVar12;
        this.j = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, float[] fArr) {
        this.n = i;
        this.j = tzxVar;
        this.i = tzxVar2;
        this.h = tzxVar3;
        this.k = tzxVar4;
        this.f = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
        this.l = tzxVar8;
        this.e = tzxVar9;
        this.b = tzxVar10;
        this.m = tzxVar11;
        this.a = tzxVar12;
        this.c = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, int[] iArr) {
        this.n = i;
        this.k = tzxVar;
        this.b = tzxVar2;
        this.h = tzxVar3;
        this.a = tzxVar4;
        this.m = tzxVar5;
        this.c = tzxVar6;
        this.j = tzxVar7;
        this.g = tzxVar8;
        this.f = tzxVar9;
        this.i = tzxVar10;
        this.l = tzxVar11;
        this.e = tzxVar12;
        this.d = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, short[] sArr) {
        this.n = i;
        this.i = tzxVar;
        this.j = tzxVar2;
        this.e = tzxVar3;
        this.m = tzxVar4;
        this.a = tzxVar5;
        this.b = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.f = tzxVar9;
        this.c = tzxVar10;
        this.l = tzxVar11;
        this.k = tzxVar12;
        this.d = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, boolean[] zArr) {
        this.n = i;
        this.b = tzxVar;
        this.h = tzxVar2;
        this.f = tzxVar3;
        this.g = tzxVar4;
        this.k = tzxVar5;
        this.d = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
        this.j = tzxVar9;
        this.m = tzxVar10;
        this.l = tzxVar11;
        this.e = tzxVar12;
        this.i = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, byte[][] bArr) {
        this.n = i;
        this.g = tzxVar;
        this.d = tzxVar2;
        this.m = tzxVar3;
        this.h = tzxVar4;
        this.a = tzxVar5;
        this.j = tzxVar6;
        this.l = tzxVar7;
        this.c = tzxVar8;
        this.i = tzxVar9;
        this.b = tzxVar10;
        this.f = tzxVar11;
        this.e = tzxVar12;
        this.k = tzxVar13;
    }

    public fyr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, int i, short[][] sArr) {
        this.n = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.l = tzxVar6;
        this.a = tzxVar7;
        this.m = tzxVar8;
        this.k = tzxVar9;
        this.h = tzxVar10;
        this.i = tzxVar11;
        this.j = tzxVar12;
        this.g = tzxVar13;
    }
}
