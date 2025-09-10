package defpackage;

import android.content.Context;
import androidx.wear.ambient.AmbientDelegate;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksl implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
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
        Object lbhVar;
        switch (this.g) {
            case 0:
                return new ksk((luj) this.a.a(), ((hoa) this.b).b(), ((ngx) this.c).a(), (hbj) this.d.a(), (jug) this.e.a(), (owf) this.f.a());
            case 1:
                return new ksj((hbj) this.f.a(), (luj) this.a.a(), (out) this.b.a(), (owq) this.d.a(), (owf) this.e.a(), ((mnl) this.c).a());
            case 2:
                hbj hbjVar = (hbj) this.c.a();
                luj lujVar = (luj) this.a.a();
                fuf fufVar = (fuf) this.f.a();
                tzx tzxVar = this.d;
                tzx tzxVar2 = this.b;
                tzj tzjVarB = tzs.b(this.e);
                rwc rwcVarB = ((gad) tzxVar2).b();
                kcv kcvVar = (kcv) tzxVar.a();
                sgv sgvVar = ktb.a;
                boolean zA = fufVar.a(nkw.TIME_LAPSE);
                ksh kshVarA = hbjVar.o(haf.c) ? ktb.a(zA, false, false) : ktb.b(zA, false, false);
                ktb.d(kshVarA, fufVar, tzjVarB, krs.FRONT_TIMELAPSE_MORE_LIGHT, lujVar.a(luf.H), true, rwcVarB, kcvVar);
                return kshVarA.a();
            case 3:
                return new kud(((imm) this.c).b(), (Executor) this.f.a(), (pbn) this.b.a(), ((jgo) this.e).a(), (fql) this.a.a(), (out) this.d.a());
            case 4:
                hbj hbjVar2 = (hbj) this.f.a();
                tzx tzxVar3 = this.e;
                tgq tgqVarA = ((tgr) this.d).a();
                pjo pjoVarA = ((kiv) tzxVar3).a();
                juy juyVar = (juy) this.c.a();
                return new kxv(hbjVar2, tgqVarA, pjoVarA, juyVar, (kvg) this.b.a());
            case 5:
                rwc rwcVar = (rwc) this.a.a();
                tzx tzxVar4 = this.f;
                tzx tzxVar5 = this.e;
                tzx tzxVar6 = this.c;
                tzx tzxVar7 = this.b;
                tzj tzjVarB2 = tzs.b(this.d);
                tzj tzjVarB3 = tzs.b(tzxVar7);
                tzj tzjVarB4 = tzs.b(tzxVar6);
                tzj tzjVarB5 = tzs.b(tzxVar5);
                rnt.M(((koh) tzxVar4).b().booleanValue(), "No usable raw FrameStream present.");
                if (rwcVar.h()) {
                    lbhVar = new lbh((pdv) rwcVar.c());
                } else if (((sbv) tzjVarB3.a()).isEmpty()) {
                    rnt.M(!((Map) tzjVarB2.a()).isEmpty(), "No physical FrameStream is present!");
                    lbhVar = ((Map) tzjVarB2.a()).size() == 1 ? new lbh((pdv) ((Map) tzjVarB2.a()).values().iterator().next()) : (lcu) tzjVarB4.a();
                } else {
                    lbhVar = (lcu) tzjVarB5.a();
                }
                lbhVar.getClass();
                return lbhVar;
            case 6:
                boolean zBooleanValue = ((Boolean) this.d.a()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.f.a()).booleanValue();
                tzx tzxVar8 = this.b;
                nkw nkwVarA = ((kid) this.e).a();
                rwr rwrVar = (rwr) tzxVar8.a();
                gzi gziVar = gzo.a;
                if (!zBooleanValue) {
                    nkwVarA.equals(nkw.PHOTO);
                    if (!nkwVarA.equals(nkw.COTTAGE) && ((!nkwVarA.equals(nkw.PORTRAIT) || !rwrVar.a) && (!nkwVarA.equals(nkw.SERENGETI) || !zBooleanValue2))) {
                        return 34;
                    }
                }
                return 35;
            case 7:
                tzx tzxVar9 = this.c;
                tzx tzxVar10 = this.e;
                Object objA = tzxVar9.a();
                pjo pjoVar = (pjo) tzxVar10.a();
                kfi kfiVar = (kfi) this.d.a();
                ldd lddVar = (ldd) this.f.a();
                kqp kqpVarA = ((kqr) this.b).a();
                Long l = (Long) this.a.a();
                l.longValue();
                pko pkoVar = kqpVarA.a;
                int i = kfiVar.a;
                lcc lccVar = new lcc();
                lccVar.a = pjoVar.j();
                lccVar.b = pkoVar;
                lccVar.c = i;
                lccVar.k = lddVar.b(lcz.YUV_REPROCESSING);
                lccVar.f = l;
                lcl.a(pjoVar, lccVar, 65536L);
                return lccVar.a();
            case 8:
                return new lea((iso) this.b.a(), (Executor) this.e.a(), (pbn) this.a.a(), (hbj) this.c.a(), (rwr) this.f.a(), this.d);
            case 9:
                pbn pbnVar = (pbn) this.b.a();
                tzx tzxVar11 = this.f;
                Context contextB = ((imm) this.e).b();
                hbj hbjVar3 = (hbj) tzxVar11.a();
                return new lge(pbnVar, contextB, hbjVar3.p(hak.l), hbjVar3.p(hak.m), hbjVar3.p(hak.n), hbjVar3.p(hak.o), hbjVar3.p(hak.p), this.c, this.a, (tgk) tzs.b(this.d).a());
            case 10:
                rwr rwrVar2 = (rwr) this.f.a();
                ovx ovxVar = (ovx) this.b.a();
                return rwrVar2.a ? new kue(new lse((fqg) this.e.a(), (mhq) this.d.a(), (out) this.c.a(), ((mia) this.a).b(), ovxVar, 1), 2) : hgd.a;
            case 11:
                tzx tzxVar12 = this.c;
                final owf owfVarB = ((ims) this.d).b();
                final owq owqVar = (owq) tzxVar12.a();
                final owq owqVar2 = (owq) this.f.a();
                final owf owfVar = (owf) this.a.a();
                final owq owqVar3 = (owq) this.b.a();
                final fdq fdqVarA = ((ixw) this.e).a();
                return new mcw() { // from class: lik
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdqVarA.j().d(owl.a(owfVarB, owqVar, owqVar2, owfVar).dK(new ksq(owqVar3, 15), sxo.a));
                    }
                };
            case 12:
                final hbj hbjVar4 = (hbj) this.f.a();
                final owq owqVar4 = (owq) this.a.a();
                final owf owfVar2 = (owf) this.b.a();
                final owf owfVar3 = (owf) this.d.a();
                final kzo kzoVar = (kzo) this.e.a();
                final pjp pjpVarA = ((pab) this.c).a();
                return new Supplier() { // from class: lqh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        pjp pjpVar = pjpVarA;
                        pjr pjrVarD = pjpVar.d(kzoVar.dL());
                        boolean z = false;
                        if (pjrVarD == null) {
                            return false;
                        }
                        hbj hbjVar5 = hbjVar4;
                        pka pkaVarL = pjpVar.a(pjrVarD).l();
                        pka pkaVar = pka.FRONT;
                        if (hbjVar5.p(gzo.aT) && ((Boolean) owqVar4.dL()).booleanValue() && (pkaVarL != pkaVar ? ((Boolean) owfVar2.dL()).booleanValue() : !((Boolean) owfVar3.dL()).booleanValue())) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                };
            case 13:
                out outVar = (out) this.b.a();
                hbj hbjVar5 = (hbj) this.c.a();
                owq owqVar5 = (owq) this.e.a();
                owf owfVar4 = (owf) this.f.a();
                owf owfVar5 = (owf) this.d.a();
                return new lqo(outVar, hbjVar5, owqVar5, owfVar4, owfVar5);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new lve(((imm) this.e).b(), (kgn) this.c.a(), (pkc) this.b.a(), (luw) this.a.a(), (hbj) this.f.a(), (fuf) this.d.a());
            case 15:
                final out outVar2 = (out) this.b.a();
                tzx tzxVar13 = this.c;
                tzx tzxVar14 = this.f;
                final tzj tzjVarB6 = tzs.b(this.a);
                final tzj tzjVarB7 = tzs.b(tzxVar14);
                final szh szhVar = (szh) tzxVar13.a();
                ((hfg) this.d).a();
                final fdq fdqVarA2 = ((ixw) this.e).a();
                iso.p();
                return new sfm(new mcw() { // from class: lxe
                    @Override // java.lang.Runnable
                    public final void run() {
                        szhVar.e((lyq) tzjVarB7.a());
                        tzj tzjVar = tzjVarB6;
                        our ourVarJ = fdqVarA2.j();
                        mns mnsVar = (mns) tzjVar.a();
                        mnsVar.getClass();
                        ourVarJ.d(new khc(ske.P(new lac(mnsVar, 8), outVar2), 9));
                    }
                });
            case 16:
                return new lza((out) this.f.a(), (mdy) this.a.a(), ((mmm) this.e).a(), (gox) this.c.a(), (mwq) this.d.a(), (oer) this.b.a());
            default:
                tzx tzxVar15 = this.d;
                tzx tzxVar16 = this.b;
                dx dxVarA = ((imq) this.e).a();
                rww rwwVarA = ((mxx) tzxVar16).a();
                ((imp) this.a).a();
                return new AmbientDelegate(dxVarA, rwwVarA);
        }
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr) {
        this.g = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.c = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.d = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.b = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.d = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.e = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
        this.e = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][][] cArr) {
        this.g = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.d = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][][] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][][] sArr) {
        this.g = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
    }

    public ksl(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][][] zArr) {
        this.g = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }
}
