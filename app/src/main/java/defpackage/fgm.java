package defpackage;

import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni.NativeFlareRemoval;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final /* synthetic */ int j;

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i) {
        this.j = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[] bArr) {
        this.j = i;
        this.d = tzxVar;
        this.i = tzxVar2;
        this.h = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.c = tzxVar8;
        this.a = tzxVar9;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, jhh] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        pae paeVar;
        switch (this.j) {
            case 0:
                rwc rwcVarB = ((fkh) this.b).b();
                kqp kqpVarA = ((kqr) this.d).a();
                our ourVar = (our) this.e.a();
                fgs fgsVarA = ((kib) this.g).a();
                owq owqVar = (owq) this.h.a();
                if (rwcVarB.h()) {
                    pae paeVarI = pae.i(kqpVarA.b);
                    pae paeVar2 = pae.b;
                    boolean zL = paeVar2.l(paeVarI);
                    pae paeVar3 = pae.a;
                    boolean zL2 = paeVar3.l(paeVarI);
                    if (zL) {
                        paeVar = paeVar2;
                        sfmVar = new sfm(new frf(new hym(ourVar, rwcVarB, this.c, paeVar, fgsVarA, owqVar, 1), mPfBwqXsnpXI.cMW, 0));
                    } else if (zL2) {
                        paeVar = paeVar3;
                        sfmVar = new sfm(new frf(new hym(ourVar, rwcVarB, this.c, paeVar, fgsVarA, owqVar, 1), mPfBwqXsnpXI.cMW, 0));
                    } else {
                        paeVar2 = pae.c;
                        paeVar = paeVar2;
                        sfmVar = new sfm(new frf(new hym(ourVar, rwcVarB, this.c, paeVar, fgsVarA, owqVar, 1), mPfBwqXsnpXI.cMW, 0));
                    }
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 1:
                final owf owfVar = (owf) this.d.a();
                final owf owfVar2 = (owf) this.i.a();
                final mye myeVar = (mye) this.h.a();
                final fft fftVar = (fft) this.b.a();
                final fgq fgqVar = (fgq) this.e.a();
                final owf owfVar3 = (owf) this.f.a();
                final owf owfVar4 = (owf) this.g.a();
                final owf owfVar5 = (owf) this.c.a();
                final fdq fdqVarA = ((ixw) this.a).a();
                return new mcw() { // from class: ffu
                    @Override // java.lang.Runnable
                    public final void run() {
                        fft fftVar2 = fftVar;
                        fftVar2.f(owfVar);
                        fftVar2.i(owfVar2);
                        fftVar2.l(owfVar3);
                        fftVar2.g(owfVar4);
                        fftVar2.k(owfVar5);
                        fgq fgqVar2 = fgqVar;
                        fgqVar2.f(myeVar);
                        fdqVarA.j().d(new ffx(fftVar2, fgqVar2, 1));
                    }
                };
            case 2:
                return new fks((owf) this.i.a(), (owf) this.a.a(), (owf) this.e.a(), (owf) this.f.a(), (imi) this.c.a(), (pfl) ((tzu) this.g).a, (syj) this.d.a(), (out) this.h.a(), (mbj) this.b.a());
            case 3:
                owf owfVar6 = (owf) this.b.a();
                tzx tzxVar = this.g;
                final fdq fdqVarA2 = ((ixw) this.a).a();
                owf owfVar7 = (owf) tzxVar.a();
                owq owqVar2 = (owq) this.c.a();
                tzx tzxVar2 = this.d;
                tzx tzxVar3 = this.h;
                final tzj tzjVarB = tzs.b(this.f);
                final tzj tzjVarB2 = tzs.b(tzxVar3);
                final out outVar = (out) tzxVar2.a();
                tzx tzxVar4 = this.e;
                final jgt jgtVarA = ((iyb) this.i).a();
                if (!((hbj) tzxVar4.a()).o(gyi.h)) {
                    return new gnc(1);
                }
                nkw nkwVar = nkw.COTTAGE;
                nkwVar.getClass();
                final owf owfVarA = owb.a(owl.c(owqVar2, owl.h(owfVar6, new fdz(nkwVar, 3)), owl.h(owfVar7, new fgb(6))));
                return new nkm() { // from class: fmi
                    @Override // defpackage.nkm
                    public final void a() {
                        outVar.execute(new cmc(jgtVarA, tzjVarB2, 4, null));
                        fdqVarA2.j().d(owfVarA.dK(new fnb(tzjVarB, 1), sxo.a));
                    }
                };
            case 4:
                tzx tzxVar5 = this.h;
                Handler handlerB = iso.b();
                fpw fpwVar = (fpw) tzxVar5.a();
                mwq mwqVar = (mwq) this.e.a();
                pjp pjpVarA = ((pab) this.g).a();
                pmg pmgVar = (pmg) this.d.a();
                cxb cxbVar = (cxb) this.b.a();
                Executor executor = (Executor) this.i.a();
                Semaphore semaphore = (Semaphore) this.f.a();
                szh szhVar = (szh) this.c.a();
                fdq fdqVarA3 = ((ixw) this.a).a();
                fpy fpyVar = new fpy(handlerB, fpwVar, mwqVar, pjpVarA, pmgVar, cxbVar.y(), executor, semaphore);
                fdqVarA3.j().d(fpwVar);
                szhVar.e(fpyVar);
                return fpyVar;
            case 5:
                return new fua((owf) this.b.a(), (owf) this.f.a(), (owf) this.i.a(), (owf) this.g.a(), (ibb) this.h.a(), (owf) this.e.a(), (fuf) this.c.a(), ((kid) this.d).a(), (ixm) this.a.a());
            case 6:
                tzx tzxVar6 = this.g;
                ngw ngwVarA = ((ngx) this.e).a();
                hbj hbjVar = (hbj) tzxVar6.a();
                out outVar2 = (out) this.h.a();
                tzx tzxVar7 = this.c;
                jgt jgtVarA2 = ((iyb) this.a).a();
                owf owfVar8 = (owf) tzxVar7.a();
                owf owfVar9 = (owf) this.d.a();
                owf owfVar10 = (owf) this.f.a();
                owf owfVar11 = (owf) this.i.a();
                ?? r12 = ngwVarA.f;
                fvu fvuVar = new fvu((BottomBar) r12, hbjVar, owfVar8, owfVar9, owfVar10, owfVar11, ((ixw) this.b).a().j());
                outVar2.c(new cmc(ngwVarA, fvuVar, 5));
                ins.g(outVar2, jgtVarA2, r12);
                return fvuVar;
            case 7:
                return new ggx((ggr) this.c.a(), (ggt) this.h.a(), (ovx) this.i.a(), (ggp) this.e.a(), (ggv) this.b.a(), (ggv) this.f.a(), (owq) this.d.a(), (owf) this.g.a(), (gnt) this.a.a());
            case 8:
                return new gln(((ixw) this.a).a(), (fvu) this.b.a(), (imi) this.g.a(), (itl) this.i.a(), (out) this.d.a(), (mzz) this.c.a(), (ndj) this.h.a(), (ocq) this.f.a(), (hbj) this.e.a());
            case 9:
                return new glu((pmv) this.d.a(), (luw) this.c.a(), (owf) this.f.a(), tzs.b(this.i), (owf) this.g.a(), (luw) this.h.a(), ((ims) this.b).b(), (owf) this.a.a(), (hbj) this.e.a());
            case 10:
                return new gmc((hbj) this.i.a(), (lti) this.e.a(), (owf) this.c.a(), (glu) this.g.a(), (imi) this.d.a(), (ocq) this.f.a(), (out) this.h.a(), ((imn) this.a).a(), (owf) this.b.a());
            case 11:
                return new gmn((gnt) this.b.a(), (owq) this.c.a(), ((Boolean) this.g.a()).booleanValue(), (gmm) this.i.a(), tzs.b(this.f), (luj) this.h.a(), (got) this.d.a(), (owf) this.a.a(), (hbj) this.e.a());
            case 12:
                pkc pkcVar = (pkc) this.a.a();
                out outVar3 = (out) this.f.a();
                gtm gtmVar = (gtm) this.g.a();
                qrh qrhVar = (qrh) this.b.a();
                gox goxVar = (gox) this.c.a();
                tzx tzxVar8 = this.i;
                cxb cxbVarA = ((goe) this.d).a();
                hhc hhcVar = (hhc) tzxVar8.a();
                tzx tzxVar9 = this.e;
                Intent intentA = ((imr) this.h).a();
                gnw gnwVar = (gnw) tzxVar9.a();
                gnt gntVar = new gnt(pkcVar, outVar3, gtmVar, qrhVar, goxVar, cxbVarA, hhcVar, intentA);
                gnwVar.b(gntVar);
                return gntVar;
            case 13:
                hbj hbjVar2 = (hbj) this.b.a();
                pbn pbnVar = (pbn) this.f.a();
                tzx tzxVar10 = this.i;
                return new hzo(this.d, hbjVar2, pbnVar, ((gad) this.h).b(), ((jaf) this.c).b(), (NativeFlareRemoval) tzxVar10.a(), (syu) this.a.a(), (Executor) this.g.a(), ((imm) this.e).b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar11 = this.g;
                pjp pjpVarA2 = ((pab) this.a).a();
                hzs hzsVar = (hzs) tzxVar11.a();
                ifo ifoVar = (ifo) this.b.a();
                tzx tzxVar12 = this.h;
                kqp kqpVarA2 = ((kqr) this.c).a();
                iso isoVar = (iso) tzxVar12.a();
                rwc rwcVar = (rwc) this.d.a();
                return new ifn(pjpVarA2, hzsVar, ifoVar, kqpVarA2, isoVar, rwcVar, (ibj) this.i.a());
            case 15:
                final imi imiVar = new imi((out) this.c.a(), ((ixu) this.a).a(), iso.b(), ((iyb) this.d).a(), (pnk) this.e.a(), (owf) this.f.a(), (owf) this.h.a());
                rww rwwVarA = ((mxx) this.i).a();
                hbj hbjVar3 = (hbj) this.g.a();
                imiVar.j = hbjVar3.p(gzo.bv);
                imiVar.e = new png() { // from class: imh
                    @Override // defpackage.png
                    public final void a(pao paoVar) {
                        imi imiVar2 = imiVar;
                        synchronized (imi.a) {
                            for (imj imjVar : (imj[]) imiVar2.d.toArray(new imj[0])) {
                                if (!imjVar.s() && !imjVar.equals(imiVar2.q)) {
                                    imiVar2.f(imjVar);
                                }
                            }
                            imj imjVar2 = imiVar2.q;
                            if (imjVar2 != null && !imjVar2.s()) {
                                imiVar2.f(imjVar2);
                            }
                        }
                    }
                };
                imiVar.r.b(imiVar.e);
                our ourVar2 = imiVar.s;
                ourVar2.d(new hye(imiVar, 5));
                out outVar4 = imiVar.b;
                outVar4.execute(new ild(imiVar, 2));
                imiVar.f = rwwVarA;
                outVar4.execute(new imf(imiVar, this.b, 2));
                if (hbjVar3.p(hba.u)) {
                    ourVar2.d(owl.a(imiVar.p, imiVar.o).dK(new ijl(imiVar, 2), outVar4));
                }
                return imiVar;
            case 16:
                return new jkj((qrh) this.a.a(), (jkh) this.b.a(), (out) this.i.a(), (owf) this.c.a(), (owq) this.g.a(), (owq) this.d.a(), (nas) this.h.a(), (mdy) this.f.a(), (mwq) this.e.a());
            default:
                iso isoVar2 = (iso) this.g.a();
                joc jocVar = (joc) this.f.a();
                jqb jqbVar = (jqb) this.h.a();
                jpa jpaVar = (jpa) this.d.a();
                jpb jpbVar = (jpb) this.c.a();
                rwc rwcVar2 = (rwc) this.a.a();
                tzx tzxVar13 = this.e;
                jpw jpwVarA = ((jpx) this.b).a();
                return new jpp(isoVar2, jocVar, jqbVar, jpaVar, jpbVar, rwcVar2, jpwVarA);
        }
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[] cArr) {
        this.j = i;
        this.i = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
        this.h = tzxVar8;
        this.b = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, float[] fArr) {
        this.j = i;
        this.e = tzxVar;
        this.g = tzxVar2;
        this.h = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
        this.f = tzxVar7;
        this.i = tzxVar8;
        this.b = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[] iArr) {
        this.j = i;
        this.h = tzxVar;
        this.e = tzxVar2;
        this.g = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.i = tzxVar6;
        this.f = tzxVar7;
        this.c = tzxVar8;
        this.a = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[] sArr) {
        this.j = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.g = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.h = tzxVar6;
        this.d = tzxVar7;
        this.i = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, boolean[] zArr) {
        this.j = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.i = tzxVar3;
        this.g = tzxVar4;
        this.h = tzxVar5;
        this.e = tzxVar6;
        this.c = tzxVar7;
        this.d = tzxVar8;
        this.a = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[][] bArr) {
        this.j = i;
        this.c = tzxVar;
        this.h = tzxVar2;
        this.i = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.f = tzxVar6;
        this.d = tzxVar7;
        this.g = tzxVar8;
        this.a = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[][] cArr) {
        this.j = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.g = tzxVar3;
        this.i = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
        this.h = tzxVar7;
        this.f = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, float[][] fArr) {
        this.j = i;
        this.a = tzxVar;
        this.f = tzxVar2;
        this.g = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
        this.i = tzxVar7;
        this.h = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[][] iArr) {
        this.j = i;
        this.i = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.g = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
        this.h = tzxVar7;
        this.a = tzxVar8;
        this.b = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[][] sArr) {
        this.j = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.i = tzxVar4;
        this.g = tzxVar5;
        this.h = tzxVar6;
        this.b = tzxVar7;
        this.a = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, boolean[][] zArr) {
        this.j = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.g = tzxVar3;
        this.i = tzxVar4;
        this.f = tzxVar5;
        this.h = tzxVar6;
        this.d = tzxVar7;
        this.a = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, byte[][][] bArr) {
        this.j = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.h = tzxVar4;
        this.c = tzxVar5;
        this.i = tzxVar6;
        this.a = tzxVar7;
        this.g = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, char[][][] cArr) {
        this.j = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.g = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
        this.h = tzxVar6;
        this.d = tzxVar7;
        this.f = tzxVar8;
        this.i = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, int[][][] iArr) {
        this.j = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.i = tzxVar3;
        this.c = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.h = tzxVar7;
        this.f = tzxVar8;
        this.e = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, short[][][] sArr) {
        this.j = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.f = tzxVar5;
        this.h = tzxVar6;
        this.b = tzxVar7;
        this.i = tzxVar8;
        this.g = tzxVar9;
    }

    public fgm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, int i, boolean[][][] zArr) {
        this.j = i;
        this.g = tzxVar;
        this.f = tzxVar2;
        this.h = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.a = tzxVar6;
        this.i = tzxVar7;
        this.b = tzxVar8;
        this.e = tzxVar9;
    }
}
