package defpackage;

import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrh implements tzt {
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
    private final /* synthetic */ int m;

    public mrh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i) {
        this.m = i;
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
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        if (this.m == 0) {
            return new mrg((owq) this.a.a(), (fvu) this.b.a(), (ndj) this.c.a(), (mts) this.d.a(), (mzz) this.e.a(), (krj) this.f.a(), (mwq) this.g.a(), (owq) this.h.a(), (mmk) this.i.a(), (pez) this.j.a(), (hyh) this.k.a(), (hbj) this.l.a());
        }
        final hbj hbjVar = (hbj) this.i.a();
        luj lujVar = (luj) this.f.a();
        tzx tzxVar = this.d;
        tzx tzxVar2 = this.b;
        tzj tzjVarB = tzs.b(this.l);
        final tzj tzjVarB2 = tzs.b(tzxVar2);
        final hyh hyhVar = (hyh) tzxVar.a();
        final owf owfVar = (owf) this.c.a();
        final owq owqVar = (owq) this.e.a();
        final owf owfVar2 = (owf) this.a.a();
        final owf owfVar3 = (owf) this.h.a();
        final owf owfVar4 = (owf) this.k.a();
        final owf owfVar5 = (owf) this.j.a();
        owf owfVar6 = (owf) this.g.a();
        if (hbjVar.p(gzy.j) && hbjVar.p(gzy.o)) {
            lus lusVar = luf.aF;
            owq owqVarA = lujVar.a(lusVar);
            Integer num = (Integer) lusVar.d(hbjVar);
            Integer numValueOf = Integer.valueOf(mhh.OFF.d);
            ksa ksaVar = ksa.TAXI_OFF;
            Integer numValueOf2 = Integer.valueOf(mhh.AUTO.d);
            ksa ksaVar2 = ksa.TAXI_AUTO;
            Integer numValueOf3 = Integer.valueOf(mhh.ON.d);
            ksa ksaVar3 = ksa.TAXI_ON;
            krp krpVar = new krp(owqVarA, num, numValueOf, ksaVar, numValueOf2, ksaVar2, numValueOf3, ksaVar3);
            final boolean zP = hbjVar.p(gzy.k);
            final Predicate predicate = new Predicate() { // from class: mgu
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
                    krj krjVar = (krj) obj;
                    nkw nkwVarD = krjVar.d();
                    gho ghoVar = (gho) owqVar.dL();
                    if (krjVar.s() || hbjVar.p(gzy.l)) {
                        return false;
                    }
                    if (nkwVarD.equals(nkw.PHOTO) || ixg.a(nkwVarD) || nkwVarD.equals(nkw.NIGHT_SIGHT)) {
                        return true;
                    }
                    if (zP && nkwVarD.equals(nkw.VIDEO)) {
                        return ghoVar.equals(gho.DEFAULT) || ghoVar.equals(gho.OFF);
                    }
                    return false;
                }
            };
            Predicate predicate2 = new Predicate() { // from class: mgv
                public final /* synthetic */ Predicate and(Predicate predicate3) {
                    return Predicate$CC.$default$and(this, predicate3);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo32negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate3) {
                    return Predicate$CC.$default$or(this, predicate3);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    krj krjVar = (krj) obj;
                    owf owfVar7 = owfVar;
                    if (((Float) owfVar7.dL()).floatValue() >= gzy.a.floatValue()) {
                        if (((Float) owfVar7.dL()).floatValue() <= ((Float) owfVar3.dL()).floatValue() && !((Boolean) ((ovx) ((FocusIndicatorView) tzjVarB2.a()).j).d).booleanValue()) {
                            hyh hyhVar2 = hyhVar;
                            if (!((Boolean) hyhVar2.b.dL()).booleanValue() && !((Boolean) owfVar2.dL()).booleanValue() && !((Boolean) owfVar4.dL()).booleanValue() && !((Boolean) hyhVar2.e().dL()).booleanValue()) {
                                return (krjVar.d().equals(nkw.VIDEO) && ((Boolean) owfVar5.dL()).booleanValue()) ? false : true;
                            }
                        }
                    }
                    return false;
                }
            };
            Consumer consumer = new Consumer() { // from class: mgw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void d(Object obj) {
                    krj krjVar = (krj) obj;
                    our ourVar = krjVar.L;
                    hyh hyhVar2 = hyhVar;
                    owf owfVarA = owl.a(owfVar, ((FocusIndicatorView) tzjVarB2.a()).j, hyhVar2.b, owfVar4, owfVar3, owfVar2, hyhVar2.e());
                    ktd ktdVar = new ktd(predicate, krjVar, 11);
                    sxo sxoVar = sxo.a;
                    ourVar.d(owfVarA.dK(ktdVar, sxoVar));
                    ourVar.d(owqVar.dK(new lld(krjVar, 14), sxoVar));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            ksh kshVarM = ksi.m();
            kshVarM.n(krs.TAXI);
            kshVarM.h(R.string.taxi_menu_item_label);
            kshVarM.c(R.string.taxi_menu_item_desc);
            kshVarM.m(ksaVar, ksaVar2, ksaVar3);
            kshVarM.j(Integer.valueOf(R.string.taxi_menu_item_off), Integer.valueOf(R.string.taxi_menu_item_auto), Integer.valueOf(R.string.taxi_menu_item_on));
            kshVarM.e(Integer.valueOf(R.string.taxi_menu_item_off_desc), Integer.valueOf(R.string.taxi_menu_item_auto_desc), Integer.valueOf(R.string.taxi_menu_item_on_desc));
            kshVarM.g(Integer.valueOf(R.drawable.ic_macro_focus_off), Integer.valueOf(R.drawable.ic_macro_focus_auto), Integer.valueOf(R.drawable.ic_macro_focus_on));
            kshVarM.a = krpVar;
            kshVarM.b = predicate;
            kshVarM.c = predicate2;
            kshVarM.e = consumer;
            if (hbjVar.p(gzo.bJ)) {
                kshVarM.g = ((nkw) owfVar6.dL()).equals(nkw.VIDEO) ? rbb.l : rbb.f;
            } else {
                kshVarM.h = new kdj(tzjVarB, 5);
            }
            sfmVar = new sfm(kshVarM.a());
        } else {
            sfmVar = sfd.a;
        }
        sfmVar.getClass();
        return sfmVar;
    }

    public mrh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, int i, byte[] bArr) {
        this.m = i;
        this.i = tzxVar;
        this.f = tzxVar2;
        this.l = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
        this.h = tzxVar9;
        this.k = tzxVar10;
        this.j = tzxVar11;
        this.g = tzxVar12;
    }
}
