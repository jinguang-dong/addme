package defpackage;

import android.app.Activity;
import android.content.IntentFilter;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.ImageFormat;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuu implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v80, types: [scn] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        pdv pdvVarG;
        switch (this.e) {
            case 0:
                gzi gziVar = gyv.a;
                return frh.a;
            case 1:
                our ourVar = (our) this.a.a();
                pfu pfuVar = (pfu) this.c.a();
                rwc rwcVarJ = (rwc) this.b.a();
                tzj tzjVarB = tzs.b(this.d);
                if (!rwcVarJ.h()) {
                    if (((rwc) tzjVarB.a()).h()) {
                        pdn pdnVarC = pfuVar.c(pfuVar.d((peo) ((rwc) tzjVarB.a()).c()), 3);
                        ourVar.d(pdnVarC);
                        rwcVarJ = rwc.j(pdnVarC);
                    } else {
                        rwcVarJ = rvk.a;
                    }
                }
                rwcVarJ.getClass();
                return rwcVarJ;
            case 2:
                return ((Integer) ((hbj) this.c.a()).a(gzs.c).orElse(0)).intValue() <= 0 ? new kus(0) : new qyj(((hkc) this.b).b(), (owf) this.a.a(), (ibb) this.d.a(), 1);
            case 3:
                tzx tzxVar = this.a;
                tzx tzxVar2 = this.b;
                tzx tzxVar3 = this.c;
                mwq mwqVarA = ((kvz) this.d).a();
                pjo pjoVarA = ((kiv) tzxVar3).a();
                nkw nkwVarA = ((kid) tzxVar2).a();
                Object sfmVar = (mwq.z() && ((hbj) tzxVar.a()).p(hae.j) && pjoVarA.l().equals(pka.BACK) && (nkwVarA.equals(nkw.PHOTO) || nkwVarA.equals(nkw.PORTRAIT))) ? new sfm(qpt.ck(new pej(nvl.d, true), new pej(nvl.b, Integer.valueOf(mwqVarA.y(pjoVarA))))) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 4:
                nms nmsVar = (nms) this.d.a();
                tzx tzxVar4 = this.c;
                owf owfVarB = ((hkc) this.b).b();
                return new kvg(nmsVar, owfVarB, (hbj) this.a.a());
            case 5:
                return new kwr((pfu) this.c.a(), (hbj) this.a.a(), (pbn) this.d.a(), (Executor) this.b.a());
            case 6:
                pfu pfuVar2 = (pfu) this.b.a();
                Map map = (Map) this.c.a();
                Map map2 = (Map) this.d.a();
                boolean zBooleanValue = ((hef) this.a).b().booleanValue();
                Map mapCd = qpt.cd(map, map2);
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        lcz lczVar = (lcz) entry.getKey();
                        pdv pdvVar = (pdv) entry.getValue();
                        if (lczVar.equals(lcz.RAW_WIDE_UPPER) || lczVar.equals(lcz.RAW_WIDE_RM_UPPER)) {
                            Set<peo> setD = pdvVar.d();
                            pjr pjrVar = (pjr) map2.get(lcz.RAW_TELE);
                            pjrVar.getClass();
                            HashSet hashSet = new HashSet();
                            for (peo peoVar : setD) {
                                if (!peoVar.d().a.equals(pjrVar.a)) {
                                    hashSet.add(peoVar);
                                }
                            }
                            pdvVarG = pfuVar2.g(hashSet, pdvVar.c());
                        } else {
                            pdvVarG = null;
                        }
                        if (pdvVarG != null) {
                            mapCd.put(String.valueOf(String.valueOf(map2.get(lczVar))).concat("_t"), pdvVarG);
                        }
                    }
                }
                return mapCd;
            case 7:
                return new myu(tzs.b(this.a), tzs.b(this.d), tzs.b(this.c), (rwc) this.b.a());
            case 8:
                return new laf(((pab) this.c).a(), ((kiv) this.b).a(), (nms) this.d.a(), (lae) this.a.a());
            case 9:
                return new lam((pfu) this.a.a(), (hbj) this.d.a(), ((kiv) this.b).a(), (jvb) this.c.a());
            case 10:
                return new frf(new hjq((owq) this.b.a(), ((koh) this.d).b().booleanValue(), (our) this.c.a(), this.a, 3), "hdrplus-availability", 0);
            case 11:
                return new lbb((nkw) this.b.a(), (hbj) this.a.a(), (nms) this.c.a(), ((Boolean) this.d.a()).booleanValue());
            case 12:
                hbj hbjVar = (hbj) this.b.a();
                final szh szhVar = (szh) this.c.a();
                final kuj kujVar = (kuj) this.a.a();
                final our ourVar2 = (our) this.d.a();
                final int iIntValue = ((Integer) hbjVar.a(gzo.b).get()).intValue();
                return new frf(new Runnable() { // from class: lbu
                    @Override // java.lang.Runnable
                    public final void run() {
                        our ourVar3 = ourVar2;
                        szh szhVar2 = szhVar;
                        gsn.Y(ourVar3, szhVar2);
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        kuj kujVar2 = kujVar;
                        kujVar2.o(new lbw(atomicInteger, iIntValue, szhVar2, kujVar2));
                    }
                }, "pckvfl", 0);
            case 13:
                owf owfVar = (owf) this.d.a();
                tzx tzxVar5 = this.b;
                pjo pjoVarA2 = ((kiv) this.c).a();
                owf owfVar2 = (owf) tzxVar5.a();
                our ourVar3 = (our) this.a.a();
                ovx ovxVar = new ovx(Float.valueOf(1.0f));
                ourVar3.d(owl.a(owl.h(owfVar, new lcb(pjoVarA2.d(), pjoVarA2.c(), 0)), owfVar2).dK(new ksq(ovxVar, 9), sxo.a));
                return ovxVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar6 = this.b;
                Object objA = this.c.a();
                pjo pjoVar = (pjo) tzxVar6.a();
                ldd lddVar = (ldd) this.a.a();
                int i = ((kfi) this.d.a()).b;
                pko pkoVarB = lbb.b(pjoVar, ImageFormat.DEPTH16);
                lcc lccVar = new lcc();
                lccVar.a = pjoVar.j();
                lccVar.b = pkoVarB;
                lccVar.c = i;
                lccVar.k = lddVar.b(lcz.DEPTH);
                lccVar.d = true;
                return lccVar.a();
            case 15:
                pmv pmvVar = (pmv) this.a.a();
                pka pkaVarL = ((kiu) this.b).a().l();
                Object sfmVar2 = (pkaVarL == pka.BACK && pmvVar.q()) ? new sfm((hzi) this.c.a()) : (pkaVarL == pka.FRONT && pmvVar.p()) ? new sfm((hzi) this.d.a()) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 16:
                hbj hbjVar2 = (hbj) this.b.a();
                luj lujVar = (luj) this.a.a();
                Object sfmVar3 = hbjVar2.p(hak.g) ? new sfm(new gtr((AmbientMode.AmbientController) this.d.a(), tzs.b(this.c), hbjVar2.p(hac.A) ? scn.H(nkw.PHOTO, nkw.NIGHT_SIGHT) : new sfm(nkw.PHOTO), lujVar.a(luf.u), 3)) : sfd.a;
                sfmVar3.getClass();
                return sfmVar3;
            case 17:
                tzx tzxVar7 = this.c;
                tzx tzxVar8 = this.d;
                Object objA2 = tzxVar7.a();
                lhe lheVar = (lhe) objA2;
                return ((lheVar.a || lheVar.c || lheVar.d) && !((Boolean) this.b.a()).booleanValue()) ? rwc.j((kye) this.a.a()) : rvk.a;
            case 18:
                tzx tzxVar9 = this.d;
                tzx tzxVar10 = this.c;
                fdq fdqVarA = ((ixw) this.b).a();
                Activity activityA = ((imn) tzxVar10).a();
                owq owqVar = (owq) tzxVar9.a();
                if (!((hbj) this.a.a()).p(gza.q)) {
                    return hgd.a;
                }
                lhg lhgVar = new lhg(owqVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                clu.d(activityA, lhgVar, intentFilter, 2);
                return new hrg(fdqVarA, activityA, lhgVar, 5, null);
            case 19:
                return new frf(new iff((our) this.b.a(), (owf) this.d.a(), (kuj) this.c.a(), pdr.a(((tzz) this.a).a()), 4), "proControlsDynamicFrameListener", 0);
            default:
                final owf owfVar3 = (owf) this.c.a();
                final owf owfVar4 = (owf) this.a.a();
                tzx tzxVar11 = this.d;
                final fdq fdqVarA2 = ((ixw) this.b).a();
                final lke lkeVarA = ((lkf) tzxVar11).a();
                return new mcw() { // from class: ljr
                    @Override // java.lang.Runnable
                    public final void run() {
                        lkz lkzVar = lkz.MANUAL;
                        lkzVar.getClass();
                        fdqVarA2.j().d(owb.a(owl.c(owfVar3, owl.h(owfVar4, new kou(lkzVar, 8)))).dK(lkeVarA, sxo.a));
                    }
                };
        }
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][] fArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][] iArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][] sArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][][] cArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][][] iArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }

    public kuu(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }
}
