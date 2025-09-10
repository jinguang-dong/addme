package defpackage;

import android.view.Surface;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.f) {
            case 0:
                htw htwVar = (htw) this.a.a();
                htv htvVar = (htv) this.b.a();
                our ourVar = (our) this.c.a();
                pfu pfuVar = (pfu) this.d.a();
                hzs hzsVar = (hzs) this.e.a();
                htwVar.getClass();
                htvVar.getClass();
                ourVar.getClass();
                pfuVar.getClass();
                hzsVar.getClass();
                return new frf(new eml(ourVar, htvVar, htwVar, hzsVar, pfuVar, 3), "serengeti", 0);
            case 1:
                tzx tzxVar = this.b;
                tzx tzxVar2 = this.a;
                return new hkk((uem) this.c, (uem) this.e, (uem) this.d, (uem) tzxVar2, (uem) tzxVar);
            case 2:
                return new hkk(tzs.b(this.b), (lat) this.d.a(), (tgp) this.a.a(), ((tgr) this.e).a(), (pbn) this.c.a());
            case 3:
                pfu pfuVar2 = (pfu) this.d.a();
                Map map = (Map) this.c.a();
                Set setA = ((tzz) this.a).a();
                jho jhoVar = (jho) this.e.a();
                boolean zBooleanValue = ((Boolean) this.b.a()).booleanValue();
                if (!jhoVar.d || !zBooleanValue) {
                    return sfc.a;
                }
                EnumMap enumMap = new EnumMap(lcz.class);
                if (!(jea.f(lcz.RAW_ULTRAWIDE, enumMap, map, pfuVar2, setA) | jea.f(lcz.RAW_WIDE, enumMap, map, pfuVar2, setA) | jea.f(lcz.RAW_TELE, enumMap, map, pfuVar2, setA))) {
                    jea.g(lcz.a, sfd.a, enumMap, map, pfuVar2, setA);
                }
                return enumMap;
            case 4:
                pfu pfuVar3 = (pfu) this.d.a();
                Map map2 = (Map) this.c.a();
                Set setA2 = ((tzz) this.a).a();
                jho jhoVar2 = (jho) this.e.a();
                boolean zBooleanValue2 = ((Boolean) this.b.a()).booleanValue();
                if (!jhoVar2.d || !zBooleanValue2) {
                    return sfc.a;
                }
                EnumMap enumMap2 = new EnumMap(lcz.class);
                if (!jea.g(lcz.RAW_WIDE, new sfm(lcz.RAW_TELE), enumMap2, map2, pfuVar3, setA2)) {
                    jea.g(lcz.a, sfd.a, enumMap2, map2, pfuVar3, setA2);
                }
                return enumMap2;
            case 5:
                tzx tzxVar3 = this.b;
                tzx tzxVar4 = this.c;
                tzx tzxVar5 = this.d;
                return ((kyb) this.e).a().l(((kxt) this.a).a().a(((koc) tzxVar5).b(), new kwa((hbj) tzxVar3.a()), ((lfh) tzxVar4).a()));
            case 6:
                tzx tzxVar6 = this.b;
                tzx tzxVar7 = this.c;
                tzx tzxVar8 = this.d;
                return ((kyb) this.e).a().l(((kxt) this.a).a().a(((koc) tzxVar8).b(), new kwa((hbj) tzxVar6.a()), ((lfh) tzxVar7).a()));
            case 7:
                long jLongValue = ((lbn) this.d).a().longValue();
                int iIntValue = ((Integer) this.b.a()).intValue();
                pet petVar = (pet) this.e.a();
                ngn ngnVarA = ((gfz) this.c).a();
                gaw gawVarB = ((ggc) this.a).b();
                petVar.getClass();
                pep pepVarA = peq.a();
                pepVarA.r(petVar);
                pepVarA.b(gawVarB.b);
                pepVarA.n(gawVarB.f);
                pepVarA.f(true);
                pepVarA.e(jLongValue);
                if (gawVarB.H) {
                    long j = true != gawVarB.L ? 256L : 65795L;
                    pepVarA.i(iIntValue);
                    pepVarA.c(30);
                    pepVarA.s(j);
                    pepVarA.h(true);
                } else {
                    pepVarA.p(ngnVarA.a);
                }
                return pepVarA.a();
            case 8:
                long jLongValue2 = ((lbn) this.d).a().longValue();
                int iIntValue2 = ((Integer) this.a.a()).intValue();
                pet petVar2 = (pet) this.c.a();
                Surface surfaceA = ((gfw) this.b).a();
                gaw gawVarB2 = ((ggc) this.e).b();
                petVar2.getClass();
                pjr pjrVar = gawVarB2.b;
                pep pepVarA2 = peq.a();
                pepVarA2.b(pjrVar);
                pepVarA2.r(petVar2);
                pepVarA2.i(iIntValue2);
                pepVarA2.n(gawVarB2.d.c());
                pepVarA2.f(true);
                pepVarA2.e(jLongValue2);
                pepVarA2.c = 2;
                pepVarA2.p(surfaceA);
                return pepVarA2.a();
            case 9:
                return new miv((hbj) this.d.a(), (owq) this.b.a(), (mky) this.c.a(), (our) this.e.a(), (miq) this.a.a());
            case 10:
                return new pzx(((jdg) this.d).b(), (pwt) this.c.a(), (ren) this.b.a(), (Executor) this.e.a(), (puu) this.a.a());
            case 11:
                ((jdg) this.d).b();
                return new pzs((pwt) this.e.a(), (ren) this.b.a(), (Executor) this.a.a());
            default:
                return new pzx(((jdg) this.d).b(), (pwt) this.c.a(), (ren) this.b.a(), (Executor) this.e.a(), (puu) this.a.a());
        }
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[] iArr) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][] bArr) {
        this.f = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][] cArr) {
        this.f = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][] fArr) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][] sArr) {
        this.f = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public hsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
    }
}
