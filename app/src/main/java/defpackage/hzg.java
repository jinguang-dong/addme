package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzg implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        int i = 1;
        switch (this.g) {
            case 0:
                tzx tzxVar = this.d;
                Context contextB = ((imm) this.c).b();
                pbn pbnVar = (pbn) tzxVar.a();
                hbj hbjVar = (hbj) this.e.a();
                syu syuVar = (syu) this.f.a();
                if (!hbjVar.p(gzs.aJ) || !hbjVar.p(gzs.aK)) {
                    return hgd.a;
                }
                String strF = hbjVar.f(gzs.aL);
                return rnt.V(strF) ? hgd.a : new kue(new hym(syuVar, pbnVar, this.a, this.b, contextB, strF, 0), 2);
            case 1:
                tzx tzxVar2 = this.d;
                Context contextB2 = ((imm) this.c).b();
                pbn pbnVar2 = (pbn) tzxVar2.a();
                hbj hbjVar2 = (hbj) this.e.a();
                syu syuVar2 = (syu) this.f.a();
                if (!hbjVar2.p(gzs.au)) {
                    return hgd.a;
                }
                String strF2 = hbjVar2.f(gzs.aw);
                if (rnt.V(strF2)) {
                    return hgd.a;
                }
                boolean zP = hbjVar2.p(gzs.aA);
                String strF3 = hbjVar2.f(gzs.ax);
                if (zP && rnt.V(strF3)) {
                    return hgd.a;
                }
                String str = true != zP ? "" : strF3;
                boolean zP2 = hbjVar2.p(gzs.av);
                String strF4 = hbjVar2.f(gzs.ay);
                if (zP2 && rnt.V(strF4)) {
                    return hgd.a;
                }
                return new kue(new ied(syuVar2, pbnVar2, this.a, this.b, contextB2, strF2, str, true != zP2 ? "" : strF4, 1), 2);
            case 2:
                hbj hbjVar3 = (hbj) this.a.a();
                nkw nkwVar = (nkw) this.c.a();
                sbv sbvVar = (sbv) this.e.a();
                boolean zBooleanValue = ((Boolean) this.b.a()).booleanValue();
                owf owfVar = (owf) this.d.a();
                owf owfVar2 = (owf) this.f.a();
                hwz hwzVarA = hwz.a(hbjVar3, nkwVar, true, false);
                hwz hwzVarA2 = hwz.a(hbjVar3, nkwVar, false, false);
                owf owfVarH = zBooleanValue ? owl.h(owfVar2, new irm(sbvVar, hwz.a(hbjVar3, nkwVar, false, true), hwzVarA2, i)) : owl.h(owb.a(owfVar), new iaz(hwzVarA, hwzVarA2, 0));
                owfVarH.getClass();
                return owfVarH;
            case 3:
                owf owfVar3 = (owf) this.c.a();
                owf owfVar4 = (owf) this.d.a();
                ibb ibbVar = (ibb) this.b.a();
                fuf fufVar = (fuf) this.a.a();
                owf owfVar5 = (owf) this.e.a();
                float f = fufVar.d;
                gzi gziVar = gzs.a;
                owf owfVarH2 = owl.h(owl.a(owfVar3, ibbVar.a(), owfVar4, owfVar5), new ihj(f, 1));
                owfVarH2.getClass();
                return owfVarH2;
            case 4:
                final fuf fufVar2 = (fuf) this.d.a();
                final nkw nkwVar2 = (nkw) this.b.a();
                final boolean zBooleanValue2 = ((Boolean) this.a.a()).booleanValue();
                final pjo pjoVar = (pjo) this.c.a();
                final sbv sbvVar2 = (sbv) this.e.a();
                owf owfVarH3 = owl.h((owf) this.f.a(), new rvu() { // from class: iay
                    @Override // defpackage.rvu
                    public final Object apply(Object obj) {
                        int iOrdinal;
                        String str2 = (String) obj;
                        pka pkaVarL = pjoVar.l();
                        str2.getClass();
                        lcy lcyVar = (lcy) sbvVar2.get(str2);
                        boolean z = false;
                        if (!zBooleanValue2 && lcyVar != null && fufVar2.c && nkwVar2 == nkw.PHOTO && pkaVarL == pka.BACK && ((iOrdinal = lcyVar.ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 5)) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                owfVarH3.getClass();
                return owfVarH3;
            case 5:
                return new idu((hbj) this.e.a(), ((kiu) this.c).a(), ((kid) this.f).a(), ((Boolean) this.a.a()).booleanValue(), (lkk) this.b.a(), this.d);
            case 6:
                return new ien((pfu) this.e.a(), (Map) this.b.a(), (owf) this.d.a(), (owf) this.f.a(), (our) this.a.a(), (Executor) this.c.a());
            case 7:
                Optional optional = (Optional) this.e.a();
                final fqg fqgVar = (fqg) this.f.a();
                final mhq mhqVar = (mhq) this.d.a();
                out outVar = (out) this.b.a();
                owq owqVar = (owq) this.c.a();
                mhp mhpVar = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.m).orElseThrow(), mhp.HEAT_MODERATE);
                mhs mhsVar = new mhs();
                mhsVar.d("Focus Stack");
                mhsVar.c(outVar);
                mhsVar.g(mhpVar);
                mhsVar.f(new hjp(owqVar, 11));
                mhsVar.e(new hjp(owqVar, 12));
                final mht mhtVarA = mhsVar.a();
                mcw mcwVar = (mcw) optional.map(new Function() { // from class: ife
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo30andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return new kue(new iff(fqgVar, mhqVar, mhtVarA, (idy) obj, 0), 2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(new hgd(2));
                mcwVar.getClass();
                return mcwVar;
            case 8:
                idt idtVar = (idt) this.f.a();
                rwc rwcVar = (rwc) this.d.a();
                ovx ovxVar = (ovx) this.e.a();
                our ourVar = (our) this.c.a();
                lat latVar = (lat) this.a.a();
                boolean zH = rwcVar.h();
                tzx tzxVar3 = this.b;
                if (zH) {
                    ldt ldtVar = new ldt((hzi) tzxVar3.a(), (kzi) rwcVar.c(), ovxVar, latVar);
                    ourVar.d(ldtVar);
                    sfmVar = new sfm(ldtVar);
                } else {
                    sfmVar = idtVar.a() ? new sfm((hzi) tzxVar3.a()) : sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 9:
                return new qyc(((kid) this.f).a(), ((Boolean) this.a.a()).booleanValue());
            default:
                return !((hbj) this.c.a()).p(gza.q) ? hgd.a : new kue(new eml((fqg) this.f.a(), (mhq) this.d.a(), (out) this.a.a(), ((mia) this.b).b(), (owq) this.e.a(), 4), 2);
        }
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
        this.d = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
        this.a = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.f = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
        this.a = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
        this.c = tzxVar6;
    }

    public hzg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.a = tzxVar6;
    }
}
