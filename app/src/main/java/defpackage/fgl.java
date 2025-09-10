package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgl implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final /* synthetic */ int i;

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i) {
        this.i = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        switch (this.i) {
            case 0:
                return new fgk((sbv) this.a.a(), (owf) this.b.a(), ((kzm) this.c).a(), ((kic) this.d).a(), (lat) this.e.a(), (Executor) this.f.a(), (fgn) this.g.a(), (rwc) this.h.a());
            case 1:
                tzx tzxVar = this.b;
                Context contextB = ((imm) this.f).b();
                fgn fgnVar = (fgn) tzxVar.a();
                fgq fgqVar = (fgq) this.g.a();
                owq owqVar = (owq) this.a.a();
                tzx tzxVar2 = this.h;
                return new fga(contextB, fgnVar, fgqVar, owqVar, (owf) tzxVar2.a(), (owf) this.d.a(), (owf) this.c.a());
            case 2:
                return new ghg((gdi) this.b.a(), (gav) this.g.a(), (ngk) this.h.a(), (gnt) this.f.a(), ((ghi) this.d).a(), (owf) this.e.a(), (owf) this.a.a(), (hbj) this.c.a());
            case 3:
                return new gip((fvu) this.b.a(), (ndj) this.e.a(), ((imo) this.h).a(), (mts) this.f.a(), (pfl) this.a.a(), (mzz) this.c.a(), ((gjz) this.d).a(), (mte) this.g.a());
            case 4:
                return new gjb((fvu) this.b.a(), (ndj) this.e.a(), (mts) this.f.a(), (mzz) this.a.a(), ((gjz) this.h).a(), ((gad) this.d).b(), (gnt) this.g.a(), (hbj) this.c.a());
            case 5:
                return new glt((imi) this.a.a(), ((imm) this.c).b(), (out) this.e.a(), new Timer(), (mni) this.g.a(), (gnt) this.f.a(), (owq) this.b.a(), (owf) this.h.a(), (owf) this.d.a());
            case 6:
                final owq owqVar2 = (owq) this.a.a();
                final owq owqVar3 = (owq) this.e.a();
                final owf owfVar = (owf) this.f.a();
                final owq owqVar4 = (owq) this.h.a();
                final owf owfVar2 = (owf) this.g.a();
                tzx tzxVar3 = this.d;
                final fdq fdqVarA = ((ixw) this.b).a();
                final out outVar = (out) tzxVar3.a();
                Object sfmVar2 = !((hbj) this.c.a()).p(gzo.by) ? sfd.a : new sfm(new mcw() { // from class: gnb
                    @Override // java.lang.Runnable
                    public final void run() {
                        fgb fgbVar = new fgb(16);
                        owf owfVar3 = owfVar2;
                        fgb fgbVar2 = new fgb(17);
                        owf owfVar4 = owfVar;
                        owf owfVarC = owl.c(owl.h(owfVar3, fgbVar), owl.h(owfVar4, fgbVar2));
                        owf owfVarC2 = owl.c(owl.h(owfVar3, new fgb(18)), owl.h(owfVar4, new fdz(owqVar4, 6)));
                        owq owqVar5 = owqVar2;
                        out outVar2 = outVar;
                        our ourVarJ = fdqVarA.j();
                        ourVarJ.d(owfVarC.dK(owqVar5, outVar2));
                        ourVarJ.d(owfVarC2.dK(owqVar3, outVar2));
                    }
                });
                sfmVar2.getClass();
                return sfmVar2;
            case 7:
                return new guk((gum) this.e.a(), ((imm) this.g).b(), (lqc) this.a.a(), ((jaf) this.b).b(), (mdy) this.h.a(), (ScheduledExecutorService) this.f.a(), (ocq) this.d.a(), (hbj) this.c.a());
            case 8:
                return new uh((owf) this.b.a(), (owf) this.c.a(), (owq) this.e.a(), (owq) this.g.a(), (hfy) this.f.a(), (owq) this.a.a(), (owf) this.d.a(), (jsv) this.h.a());
            case 9:
                tzx tzxVar4 = this.h;
                final fdq fdqVarA2 = ((ixw) this.c).a();
                final krj krjVar = (krj) tzxVar4.a();
                final out outVar2 = (out) this.d.a();
                hbj hbjVar = (hbj) this.g.a();
                final owf owfVar3 = (owf) this.f.a();
                final hjy hjyVar = (hjy) this.b.a();
                final boolean zBooleanValue = ((Boolean) this.e.a()).booleanValue();
                if (hbjVar.p(gza.t)) {
                    final tzx tzxVar5 = this.a;
                    sfmVar = new sfm(new mcw() { // from class: hji
                        @Override // java.lang.Runnable
                        public final void run() {
                            our ourVarJ = fdqVarA2.j();
                            jxn jxnVar = new jxn(krjVar, 1);
                            owf owfVar4 = owfVar3;
                            ourVarJ.d(owfVar4.dK(jxnVar, outVar2));
                            hjyVar.g(owfVar4);
                            if (zBooleanValue) {
                                ((hjy) tzxVar5.a()).g(owfVar4);
                            }
                        }
                    });
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 10:
                boolean zBooleanValue2 = ((Boolean) this.f.a()).booleanValue();
                tzx tzxVar6 = this.e;
                Object sfmVar3 = !zBooleanValue2 ? sfd.a : new sfm(new kzd((our) tzxVar6.a(), this.b, ((kij) this.h).a(), this.d, this.g, this.c, this.a, 1));
                sfmVar3.getClass();
                return sfmVar3;
            case 11:
                rwc rwcVar = (rwc) this.b.a();
                tzx tzxVar7 = this.e;
                mhp mhpVarB = ((mia) this.h).b();
                mhq mhqVar = (mhq) tzxVar7.a();
                ovx ovxVar = (ovx) this.d.a();
                lpo lpoVar = (lpo) this.a.a();
                return rwcVar.h() ? new kue(new ied(rwcVar, (fqg) this.g.a(), mhqVar, (out) this.f.a(), mhpVarB, ovxVar, (lpm) this.c.a(), lpoVar, 0), 2) : hgd.a;
            case 12:
                idt idtVar = (idt) this.g.a();
                Map map = (Map) this.e.a();
                owf owfVar4 = (owf) this.a.a();
                knd kndVar = (knd) this.d.a();
                owf owfVar5 = (owf) this.f.a();
                lat latVarA = ((kzj) this.b).a();
                hbj hbjVar2 = (hbj) this.c.a();
                if (idtVar.e()) {
                    lcz lczVar = lcz.RAW_WIDE_RM_UPPER;
                    if (map.containsKey(lczVar) && hbjVar2.p(gzc.T)) {
                        owf owfVarA = owb.a(owl.h(owl.a(owfVar4, kndVar.e, owfVar5, (owf) this.h.a()), new hia(6)));
                        pdv pdvVar = (pdv) map.get(lczVar);
                        pdvVar.getClass();
                        return rwc.j(latVarA.d(pdvVar, 3, owfVarA));
                    }
                }
                return rvk.a;
            default:
                tzx tzxVar8 = this.e;
                tzx tzxVar9 = this.a;
                tzx tzxVar10 = this.b;
                return new ijh(this.g, this.f, this.c, this.h, this.d, tzxVar10, tzxVar9, tzxVar8);
        }
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr) {
        this.i = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.g = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr) {
        this.i = i;
        this.b = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[] fArr) {
        this.i = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.g = tzxVar5;
        this.b = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[] iArr) {
        this.i = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.h = tzxVar5;
        this.d = tzxVar6;
        this.g = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[] sArr) {
        this.i = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
        this.d = tzxVar7;
        this.g = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[] zArr) {
        this.i = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.b = tzxVar6;
        this.h = tzxVar7;
        this.d = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[][] bArr) {
        this.i = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.h = tzxVar5;
        this.f = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[][] cArr) {
        this.i = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.a = tzxVar6;
        this.d = tzxVar7;
        this.h = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[][] fArr) {
        this.i = i;
        this.g = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.h = tzxVar6;
        this.b = tzxVar7;
        this.c = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[][] iArr) {
        this.i = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
        this.h = tzxVar6;
        this.g = tzxVar7;
        this.e = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[][] sArr) {
        this.i = i;
        this.c = tzxVar;
        this.h = tzxVar2;
        this.d = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.b = tzxVar;
        this.h = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
        this.f = tzxVar7;
        this.g = tzxVar8;
    }

    public fgl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[][][] bArr) {
        this.i = i;
        this.g = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.h = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.a = tzxVar7;
        this.e = tzxVar8;
    }
}
