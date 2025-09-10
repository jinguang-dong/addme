package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgv implements tzt {
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

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i) {
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
        switch (this.k) {
            case 0:
                tzx tzxVar = this.c;
                tzx tzxVar2 = this.b;
                return new fgu(((imm) this.a).b(), ((pab) tzxVar2).a(), (owf) tzxVar.a(), (luj) this.d.a(), (luj) this.e.a(), (owq) this.f.a(), (owq) this.g.a(), ((ffw) this.h).a(), (pmg) this.i.a(), (fhj) this.j.a());
            case 1:
                tzx tzxVar3 = this.c;
                Activity activityA = ((imn) this.a).a();
                feb febVar = (feb) tzxVar3.a();
                tzx tzxVar4 = this.i;
                jgt jgtVarA = ((iyb) this.f).a();
                fdu fduVar = (fdu) tzxVar4.a();
                tzx tzxVar5 = this.g;
                return new fdy(activityA, febVar, jgtVarA, fduVar, ((iya) this.j).a(), (out) tzxVar5.a(), ((fry) this.e).b(), ((Boolean) this.b.a()).booleanValue(), (szh) this.d.a(), (CameraActivityTiming) this.h.a());
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f.a();
                tzx tzxVar6 = this.g;
                owf owfVarB = ((hkc) this.a).b();
                ovx ovxVar = (ovx) tzxVar6.a();
                fut futVar = (fut) this.b.a();
                khb khbVar = (khb) this.h.a();
                iso isoVar = (iso) this.j.a();
                tzx tzxVar7 = this.d;
                return new mbj(sharedPreferences, owfVarB, ovxVar, futVar, khbVar, isoVar, ((fup) this.e).a(), (owq) tzxVar7.a(), ((ixw) this.c).a(), (mbj) this.i.a());
            case 3:
                tzx tzxVar8 = this.i;
                fdq fdqVarA = ((ixw) this.c).a();
                hbj hbjVar = (hbj) tzxVar8.a();
                fyw fywVar = (fyw) this.j.a();
                tzx tzxVar9 = this.a;
                tzx tzxVar10 = this.g;
                tzx tzxVar11 = this.f;
                return new fzb(fdqVarA, hbjVar, fywVar, ((gah) this.d).a(), ((lzr) this.b).b(), ((lzr) tzxVar11).b(), ((lzr) tzxVar10).b(), ((gad) tzxVar9).b(), new mcv(), (gav) this.h.a(), (pbn) this.e.a());
            case 4:
                tzx tzxVar12 = this.a;
                jgt jgtVarA2 = ((ixv) this.c).a();
                ngw ngwVar = (ngw) tzxVar12.a();
                gdi gdiVar = (gdi) this.h.a();
                pnq pnqVar = (pnq) this.i.a();
                tzx tzxVar13 = this.g;
                return new gbk(jgtVarA2, ngwVar, gdiVar, pnqVar, ((gbf) this.j).a(), (out) tzxVar13.a(), ((nmy) this.e).a(), (hbj) this.f.a(), (luj) this.d.a(), (owf) this.b.a());
            case 5:
                return new gmg((owq) this.g.a(), (gnt) this.a.a(), (hbj) this.i.a(), (owf) this.c.a(), ((gmw) this.f).a(), (owf) this.j.a(), (luw) this.e.a(), (glu) this.h.a(), (luj) this.b.a(), ((ggu) this.d).a());
            case 6:
                mni mniVar = (mni) this.c.a();
                tzx tzxVar14 = this.g;
                Context contextB = ((imm) this.a).b();
                owq owqVar = (owq) tzxVar14.a();
                mwq mwqVar = (mwq) this.h.a();
                tzx tzxVar15 = this.d;
                return new gmm(mniVar, contextB, owqVar, mwqVar, ((fry) this.j).b(), (ScheduledExecutorService) tzxVar15.a(), tzs.b(this.e), (got) this.f.a(), (hbj) this.i.a(), this.b);
            case 7:
                return new gtx(((jaf) this.c).b(), (gty) this.h.a(), (ktx) this.f.a(), (owq) this.b.a(), (ScheduledExecutorService) this.i.a(), (hbj) this.j.a(), (gue) this.g.a(), (gub) this.a.a(), (gun) this.d.a(), (mdy) this.e.a());
            case 8:
                Executor executor = (Executor) this.a.a();
                owq owqVar2 = (owq) this.h.a();
                owq owqVar3 = (owq) this.i.a();
                owq owqVar4 = (owq) this.f.a();
                owf owfVar = (owf) this.g.a();
                owq owqVar5 = (owq) this.b.a();
                owq owqVar6 = (owq) this.e.a();
                luj lujVar = (luj) this.d.a();
                fqg fqgVar = (fqg) this.c.a();
                hbj hbjVar2 = (hbj) this.j.a();
                hrv hrvVar = new hrv(executor, hbjVar2);
                hrvVar.h(owqVar3);
                hrvVar.e(owqVar2);
                hrvVar.j(owqVar4);
                hrvVar.k(owfVar);
                hrvVar.i(owqVar5);
                hrvVar.l(owqVar6);
                if (hbjVar2.p(gyo.g)) {
                    hrvVar.f(lujVar.a(luf.n));
                } else {
                    hrvVar.g(lujVar.a(luf.l));
                }
                fqgVar.b.d(hrvVar);
                return hrvVar;
            case 9:
                owq owqVar7 = (owq) this.f.a();
                jub jubVar = (jub) this.h.a();
                hvy hvyVar = (hvy) this.g.a();
                owq owqVar8 = (owq) this.i.a();
                mes mesVar = (mes) this.e.a();
                return new hwd(owqVar7, jubVar, hvyVar, owqVar8, mesVar, (out) this.d.a());
            case 10:
                return new ibb((iao) this.j.a(), (hyh) this.i.a(), (hyd) this.h.a(), (owf) this.f.a(), (fuf) this.g.a(), (nkw) this.a.a(), (owf) this.d.a(), (owf) this.e.a(), (owf) this.c.a(), ((Boolean) this.b.a()).booleanValue());
            default:
                return new ihs((hbj) this.i.a(), (mhq) this.f.a(), ((ihv) this.a).a(), (Optional) this.b.a(), (lcu) this.h.a(), (mdy) this.d.a(), (pbn) this.g.a(), ((Boolean) this.j.a()).booleanValue(), (nkw) this.c.a(), (ihw) this.e.a());
        }
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, byte[] bArr) {
        this.k = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.i = tzxVar4;
        this.j = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
        this.b = tzxVar8;
        this.d = tzxVar9;
        this.h = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, char[] cArr) {
        this.k = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.g = tzxVar3;
        this.b = tzxVar4;
        this.h = tzxVar5;
        this.j = tzxVar6;
        this.e = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
        this.i = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, float[] fArr) {
        this.k = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.g = tzxVar3;
        this.h = tzxVar4;
        this.j = tzxVar5;
        this.d = tzxVar6;
        this.e = tzxVar7;
        this.f = tzxVar8;
        this.i = tzxVar9;
        this.b = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, int[] iArr) {
        this.k = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.h = tzxVar3;
        this.i = tzxVar4;
        this.j = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
        this.f = tzxVar8;
        this.d = tzxVar9;
        this.b = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, short[] sArr) {
        this.k = i;
        this.c = tzxVar;
        this.i = tzxVar2;
        this.j = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.a = tzxVar8;
        this.h = tzxVar9;
        this.e = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, boolean[] zArr) {
        this.k = i;
        this.g = tzxVar;
        this.a = tzxVar2;
        this.i = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.j = tzxVar6;
        this.e = tzxVar7;
        this.h = tzxVar8;
        this.b = tzxVar9;
        this.d = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, byte[][] bArr) {
        this.k = i;
        this.c = tzxVar;
        this.h = tzxVar2;
        this.f = tzxVar3;
        this.b = tzxVar4;
        this.i = tzxVar5;
        this.j = tzxVar6;
        this.g = tzxVar7;
        this.a = tzxVar8;
        this.d = tzxVar9;
        this.e = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, char[][] cArr) {
        this.k = i;
        this.a = tzxVar;
        this.h = tzxVar2;
        this.i = tzxVar3;
        this.f = tzxVar4;
        this.g = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
        this.j = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, int[][] iArr) {
        this.k = i;
        this.j = tzxVar;
        this.i = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.g = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
        this.e = tzxVar8;
        this.c = tzxVar9;
        this.b = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, short[][] sArr) {
        this.k = i;
        this.f = tzxVar;
        this.h = tzxVar2;
        this.g = tzxVar3;
        this.i = tzxVar4;
        this.e = tzxVar5;
        this.b = tzxVar6;
        this.c = tzxVar7;
        this.a = tzxVar8;
        this.j = tzxVar9;
        this.d = tzxVar10;
    }

    public fgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, int i, boolean[][] zArr) {
        this.k = i;
        this.i = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.h = tzxVar5;
        this.d = tzxVar6;
        this.g = tzxVar7;
        this.j = tzxVar8;
        this.c = tzxVar9;
        this.e = tzxVar10;
    }
}
