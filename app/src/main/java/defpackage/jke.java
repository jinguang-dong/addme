package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jke implements tzt {
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
    private final /* synthetic */ int k;

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i) {
        this.k = i;
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
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        pas pasVarA;
        switch (this.k) {
            case 0:
                return new jkd((qrh) this.a.a(), (jkh) this.b.a(), (lae) this.c.a(), (owq) this.d.a(), (out) this.e.a(), (owf) this.f.a(), (jjw) this.g.a(), ((ixw) this.h).a(), (mdy) this.i.a(), (mwq) this.j.a());
            case 1:
                tzx tzxVar = this.f;
                tzx tzxVar2 = this.c;
                tzx tzxVar3 = this.d;
                tzx tzxVar4 = this.e;
                tzx tzxVar5 = this.b;
                return new irt(this.a, this.h, this.j, this.i, this.g, tzxVar5, tzxVar4, tzxVar3, tzxVar2, tzxVar);
            case 2:
                return new jki((qrh) this.a.a(), (jkh) this.b.a(), (lae) this.c.a(), (owq) this.d.a(), (out) this.e.a(), (owf) this.f.a(), (jjw) this.g.a(), ((ixw) this.h).a(), (mdy) this.i.a(), (mwq) this.j.a());
            case 3:
                return new jkl((qrh) this.a.a(), (jkh) this.b.a(), (lae) this.c.a(), (owq) this.d.a(), (out) this.e.a(), (owf) this.f.a(), (jjw) this.g.a(), ((ixw) this.h).a(), (mdy) this.i.a(), (mwq) this.j.a());
            case 4:
                return new jkm((qqq) this.f.a(), (owf) this.b.a(), ((ixw) this.h).a(), (hbj) this.j.a(), (owq) this.g.a(), (out) this.e.a(), (mdy) this.i.a(), (owf) this.d.a(), (luj) this.c.a(), (mwq) this.a.a());
            case 5:
                return new jmp(((ixw) this.h).a(), ((ngx) this.a).a(), ((hoa) this.f).b(), (SharedPreferences) this.c.a(), (imi) this.e.a(), (ocq) this.i.a(), ((jsr) this.g).a(), (hbj) this.j.a(), (ScheduledExecutorService) this.b.a(), (Handler) this.d.a());
            case 6:
                tzs.b(this.g);
                ((lsh) this.c).a();
                return new jsv((char[]) null);
            case 7:
                our ourVar = (our) this.h.a();
                rwc rwcVar = (rwc) this.b.a();
                tzx tzxVar6 = this.c;
                tzx tzxVar7 = this.f;
                Object sfmVar = (((hfg) this.a).a().m() && ((kil) tzxVar7).a().a) ? new sfm(new jqk((pbn) this.i.a(), ourVar, this.j, this.d, this.g, (jqb) tzxVar6.a(), (Executor) this.e.a(), rwcVar, 0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 8:
                return new jug(((imn) this.a).a(), ((ixw) this.h).a(), (gnt) this.j.a(), (hbj) this.d.a(), (luj) this.i.a(), (owf) this.g.a(), (owf) this.c.a(), (kgn) this.b.a(), ((pab) this.e).a(), ((ims) this.f).b());
            case 9:
                return new jxt((iyu) this.h.a(), ((fwo) this.e).a(), ((hoa) this.f).b(), (fvu) this.b.a(), this.i, (ngw) this.j.a(), (Executor) this.d.a(), ((gfo) this.g).a(), (hem) this.c.a(), (juh) this.a.a());
            case 10:
                return new kbb((rwc) this.c.a(), (rwc) this.f.a(), (pfu) this.e.a(), ((kiu) this.a).a(), (lat) this.d.a(), (sbv) this.b.a(), (pgx) this.h.a(), (hbj) this.g.a(), (pbn) this.i.a(), (Executor) this.j.a());
            case 11:
                pfu pfuVar = (pfu) this.b.a();
                long jLongValue = ((ihq) this.d).a().longValue();
                rwc rwcVar2 = (rwc) this.g.a();
                Map map = (Map) this.j.a();
                hyd hydVar = (hyd) this.e.a();
                ihr ihrVar = (ihr) this.f.a();
                owf owfVar = (owf) this.h.a();
                int i = hydVar.a;
                if (rwcVar2.h()) {
                    return ((kxh) this.a).a().m(jLongValue, pfuVar.c((pdv) rwcVar2.c(), i), ihrVar, 2);
                }
                tzx tzxVar8 = this.c;
                tzx tzxVar9 = this.i;
                a.I(((Map) tzxVar8.a()).size() > 1);
                return ((kxc) tzxVar9).a().f(owfVar, map, jLongValue, i, ihrVar);
            case 12:
                tzx tzxVar10 = this.e;
                tzj tzjVarB = tzs.b(this.a);
                our ourVar2 = (our) tzxVar10.a();
                tzx tzxVar11 = this.b;
                kpk kpkVar = new kpk((pdn) tzjVarB.a(), ((kpo) this.d).a(), (kpd) tzs.b(this.f).a(), (khl) tzxVar11.a(), (ovx) this.i.a(), (lat) this.j.a(), (Executor) this.h.a(), ((tzz) this.g).a(), (pbn) this.c.a());
                synchronized (kpkVar.b) {
                    if (!kpkVar.i) {
                        kpkVar.k = true;
                        kpkVar.c();
                    }
                }
                ourVar2.d(kpkVar);
                return kpkVar;
            case 13:
                pjo pjoVarA = ((kiv) this.h).a();
                Set setA = ((tzz) this.g).a();
                Set setA2 = ((tzz) this.i).a();
                kuj kujVar = (kuj) this.e.a();
                pek pekVar = (pek) this.d.a();
                pek pekVar2 = (pek) this.b.a();
                hfs hfsVar = (hfs) this.a.a();
                rwc rwcVar3 = (rwc) this.c.a();
                scn scnVar = (scn) this.f.a();
                hbj hbjVar = (hbj) this.j.a();
                pds pdsVarA = pdt.a();
                pdsVarA.f(pjoVarA.j());
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    pdsVarA.d((peq) it.next());
                }
                if (!setA2.isEmpty()) {
                    pdsVarA.c(setA2);
                }
                pdsVarA.l(kujVar);
                pdsVarA.e(hfsVar);
                pdsVarA.k(pekVar);
                pdsVarA.j(pekVar2);
                pdsVarA.i(scnVar);
                if (hbjVar.p(gzo.aV) && rwcVar3.h()) {
                    pdsVarA.g(rwcVar3);
                }
                return pdsVarA.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar12 = this.j;
                tzx tzxVar13 = this.a;
                Object objA = tzxVar12.a();
                nkw nkwVarA = ((kid) tzxVar13).a();
                pjo pjoVar = (pjo) this.b.a();
                kqp kqpVarA = ((kqr) this.c).a();
                hbj hbjVar2 = (hbj) this.e.a();
                int iIntValue = ((Integer) this.h.a()).intValue();
                Long l = (Long) this.d.a();
                long jLongValue2 = l.longValue();
                ldd lddVar = (ldd) this.g.a();
                kfi kfiVar = (kfi) this.f.a();
                boolean zP = hbjVar2.p(gzs.aa);
                if (nkwVarA != nkw.PHOTO || zP) {
                    pasVarA = ((kij) this.i).a();
                } else {
                    pasVarA = pae.b.l(pae.i(kqpVarA.b)) ? hpi.b : hpi.a;
                }
                pko pkoVar = new pko(iIntValue, pasVarA);
                int i2 = ixg.a(nkwVarA) ? kfiVar.b : 50;
                lcc lccVar = new lcc();
                lccVar.a = pjoVar.j();
                lccVar.b = pkoVar;
                lccVar.c = i2;
                lccVar.e = true;
                lccVar.f = jLongValue2 != 0 ? l : null;
                lccVar.k = lddVar.b(lcz.YUV_ANALYSIS);
                return lccVar.a();
            case 15:
                return new ldu((lge) this.d.a(), (iso) this.h.a(), (DynamicDepthUtils) this.b.a(), (lat) this.e.a(), ((hxw) this.f).a(), (Executor) this.j.a(), ((kqr) this.g).a(), (pmv) this.a.a(), (pbn) this.i.a(), (iso) this.c.a());
            default:
                mck mckVar = (mck) this.f.a();
                boolean zBooleanValue = ((hef) this.j).b().booleanValue();
                lup lupVar = (lup) this.d.a();
                tzx tzxVar14 = this.g;
                Executor executorB = ((fry) this.e).b();
                luj lujVar = (luj) tzxVar14.a();
                luw luwVar = (luw) this.i.a();
                glu gluVar = (glu) this.a.a();
                tzx tzxVar15 = this.b;
                mwq mwqVarA = ((mcb) this.c).a();
                hbj hbjVar3 = (hbj) tzxVar15.a();
                return new mcn(hbjVar3, (owf) this.h.a(), mckVar, zBooleanValue, false, lupVar, ltv.a(((Integer) luf.X.d(hbjVar3)).intValue()), lujVar, luwVar, gluVar, executorB, mwqVarA, new ovx(false));
        }
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, byte[] bArr) {
        this.k = i;
        this.a = tzxVar;
        this.h = tzxVar2;
        this.j = tzxVar3;
        this.i = tzxVar4;
        this.g = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
        this.f = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, float[] fArr) {
        this.k = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.i = tzxVar6;
        this.f = tzxVar7;
        this.j = tzxVar8;
        this.d = tzxVar9;
        this.b = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, int[] iArr) {
        this.k = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.h = tzxVar3;
        this.j = tzxVar4;
        this.g = tzxVar5;
        this.e = tzxVar6;
        this.i = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
        this.a = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, boolean[] zArr) {
        this.k = i;
        this.h = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.i = tzxVar6;
        this.g = tzxVar7;
        this.j = tzxVar8;
        this.b = tzxVar9;
        this.d = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, byte[][] bArr) {
        this.k = i;
        this.j = tzxVar;
        this.h = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.c = tzxVar6;
        this.g = tzxVar7;
        this.d = tzxVar8;
        this.e = tzxVar9;
        this.i = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, char[][] cArr) {
        this.k = i;
        this.a = tzxVar;
        this.h = tzxVar2;
        this.j = tzxVar3;
        this.d = tzxVar4;
        this.i = tzxVar5;
        this.g = tzxVar6;
        this.c = tzxVar7;
        this.b = tzxVar8;
        this.e = tzxVar9;
        this.f = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, float[][] fArr) {
        this.k = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.i = tzxVar6;
        this.j = tzxVar7;
        this.h = tzxVar8;
        this.g = tzxVar9;
        this.c = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, int[][] iArr) {
        this.k = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.h = tzxVar7;
        this.g = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, short[][] sArr) {
        this.k = i;
        this.h = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.b = tzxVar4;
        this.i = tzxVar5;
        this.j = tzxVar6;
        this.d = tzxVar7;
        this.g = tzxVar8;
        this.c = tzxVar9;
        this.a = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, boolean[][] zArr) {
        this.k = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.i = tzxVar3;
        this.d = tzxVar4;
        this.g = tzxVar5;
        this.c = tzxVar6;
        this.j = tzxVar7;
        this.e = tzxVar8;
        this.f = tzxVar9;
        this.h = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, byte[][][] bArr) {
        this.k = i;
        this.h = tzxVar;
        this.g = tzxVar2;
        this.i = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
        this.f = tzxVar9;
        this.j = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, char[][][] cArr) {
        this.k = i;
        this.j = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.i = tzxVar6;
        this.h = tzxVar7;
        this.d = tzxVar8;
        this.g = tzxVar9;
        this.f = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, int[][][] iArr) {
        this.k = i;
        this.f = tzxVar;
        this.j = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.g = tzxVar5;
        this.i = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
        this.b = tzxVar9;
        this.h = tzxVar10;
    }

    public jke(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, short[][][] sArr) {
        this.k = i;
        this.d = tzxVar;
        this.h = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.f = tzxVar5;
        this.j = tzxVar6;
        this.g = tzxVar7;
        this.a = tzxVar8;
        this.i = tzxVar9;
        this.c = tzxVar10;
    }
}
