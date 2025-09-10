package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, klf] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, klf] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kvy] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        Object sfmVar2;
        klf klfVar;
        owf owfVarH;
        int i = 0;
        switch (this.e) {
            case 0:
                return new jyb((imi) this.a.a(), ((imm) this.b).b(), (out) this.c.a(), (owq) this.d.a(), new Timer());
            case 1:
                return new hkk(((gad) this.b).b(), ((jrv) this.d).a(), (joc) this.c.a(), (iso) this.a.a());
            case 2:
                return new kcs(((imm) this.d).b(), ((gad) this.b).b(), (luj) this.a.a(), (luj) this.c.a());
            case 3:
                owq owqVar = (owq) this.b.a();
                owf owfVar = (owf) this.d.a();
                tzx tzxVar = this.c;
                pjp pjpVarA = ((pab) this.a).a();
                hbj hbjVar = (hbj) tzxVar.a();
                if (hbjVar.p(gze.e)) {
                    ksh kshVarCo = qpt.co(owfVar, pjpVarA, new own(owqVar, new jku(2), new jku(3)), new hsj(8), krs.AF_BACK);
                    kshVarCo.b(ksa.AF_ON, R.drawable.quantum_gm_ic_center_focus_strong_white_24, R.string.af_on_option_desc, R.string.af_on_acc_desc);
                    kshVarCo.b(ksa.AF_OFF_NEAR, R.drawable.quantum_gm_ic_people_white_24, R.string.af_off_near_desc, R.string.af_off_near_acc_desc);
                    kshVarCo.b(ksa.AF_OFF_FAR, R.drawable.quantum_gm_ic_landscape_white_24, R.string.af_off_far_desc, R.string.af_off_far_acc_desc);
                    if (hbjVar.p(gze.f)) {
                        kshVarCo.b(ksa.AF_OFF_INFINITY, R.drawable.quantum_gm_ic_landscape_white_24, R.string.af_off_infinity_desc, R.string.af_off_infinity_acc_desc);
                    }
                    sfmVar = new sfm(kshVarCo.a());
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 4:
                owq owqVar2 = (owq) this.b.a();
                owf owfVar2 = (owf) this.d.a();
                tzx tzxVar2 = this.c;
                pjp pjpVarA2 = ((pab) this.a).a();
                if (((hbj) tzxVar2.a()).p(gze.e)) {
                    ksh kshVarCo2 = qpt.co(owfVar2, pjpVarA2, new own(owqVar2, new jku(2), new jku(3)), new hsj(7), krs.AF_FRONT);
                    kshVarCo2.b(ksa.AF_ON, R.drawable.quantum_gm_ic_center_focus_strong_white_24, R.string.af_on_option_desc, R.string.af_on_acc_desc);
                    kshVarCo2.b(ksa.AF_OFF_NEAR, R.drawable.quantum_gm_ic_mood_white_24, R.string.af_off_near_desc, R.string.af_off_near_acc_desc);
                    kshVarCo2.b(ksa.AF_OFF_FAR, R.drawable.quantum_gm_ic_people_white_24, R.string.af_off_far_desc, R.string.af_off_far_acc_desc);
                    sfmVar2 = new sfm(kshVarCo2.a());
                } else {
                    sfmVar2 = sfd.a;
                }
                sfmVar2.getClass();
                return sfmVar2;
            case 5:
                return new kfd((pkc) this.a.a(), (pbn) this.c.a(), (hfy) this.d.a(), (hbj) this.b.a());
            case 6:
                tzx tzxVar3 = this.c;
                return new kgn(((ixw) this.d).a(), ((plt) this.b).b(), ((pab) this.a).a(), (Executor) tzxVar3.a());
            case 7:
                ExecutorService executorServiceBW = ojl.bW("ImageSaver");
                executorServiceBW.getClass();
                tzx tzxVar4 = this.a;
                lpr lprVarA = ((kjh) this.b).a();
                return new kju(executorServiceBW, (ocq) this.d.a(), lprVarA, (pbn) this.c.a());
            case 8:
                ovq ovqVar = (ovq) this.d.a();
                ExecutorService executorService = (ExecutorService) this.b.a();
                return new klt(this.a, ovqVar, Optional.of(executorService), (pbn) this.c.a());
            case 9:
                return kll.a((Executor) this.a.a(), (Executor) this.c.a(), this.d, this.b);
            case 10:
                fuf fufVar = (fuf) this.c.a();
                owf owfVarH2 = (owf) this.d.a();
                hyh hyhVar = (hyh) this.b.a();
                owf owfVar3 = (owf) this.a.a();
                if (fufVar.a) {
                    owfVarH2 = owl.h(owfVarH2, new hve(owfVar3, hyhVar, 6, null));
                }
                owfVarH2.getClass();
                return owfVarH2;
            case 11:
                let letVar = (let) this.c.a();
                kno knoVar = (kno) this.d.a();
                Executor executor = (Executor) this.b.a();
                our ourVar = (our) this.a.a();
                if (knoVar.a || knoVar.b) {
                    ourVar.d(owb.a(knoVar).dK(new gwm(letVar, 3), new szg(executor)));
                } else {
                    jho jhoVar = knoVar.c;
                }
                letVar.getClass();
                return letVar;
            case 12:
                tzx tzxVar5 = this.d;
                pbb pbbVarA = ((hco) this.a).a();
                owf owfVar4 = (owf) tzxVar5.a();
                tzx tzxVar6 = this.c;
                gga ggaVarA = ((kxi) this.b).a();
                ree reeVarA = ((kyi) tzxVar6).a();
                ArrayList arrayList = new ArrayList(3);
                CaptureRequest.Key key = nvi.i;
                if (key != null) {
                    arrayList.add(new pej(key, 1));
                }
                CaptureRequest.Key key2 = nvh.a;
                if (key2 != null) {
                    arrayList.add(new pej(key2, 1));
                }
                kyp kypVar = new kyp((pfu) ggaVarA.c, ggaVarA.d, ggaVarA.a, ggaVarA.b, qpt.cj(arrayList));
                kmz kmzVarB = reeVarA.b();
                return new kxz(pbbVarA, new kmo(owfVar4, kypVar, kmzVarB, kypVar, kmzVarB, kypVar, kmzVarB), 1);
            case 13:
                tzx tzxVar7 = this.c;
                nkw nkwVarA = ((kid) this.d).a();
                rwc rwcVar = (rwc) tzxVar7.a();
                if (nkwVarA == nkw.IMAGE_INTENT) {
                    tzx tzxVar8 = this.b;
                    a.I(rwcVar.h());
                    klfVar = (klf) tzxVar8.a();
                } else {
                    klfVar = (klf) this.a.a();
                }
                klfVar.getClass();
                return klfVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar9 = this.d;
                pbb pbbVarA2 = ((hco) this.a).a();
                owf owfVar5 = (owf) tzxVar9.a();
                mgi mgiVarA = ((kww) this.b).a();
                Object obj = mgiVarA.g;
                ?? r6 = mgiVarA.a;
                ?? r7 = mgiVarA.e;
                ?? r8 = mgiVarA.b;
                ?? r9 = mgiVarA.d;
                Object obj2 = mgiVarA.f;
                ree reeVarA2 = ((kyi) this.c).a();
                pem pemVarA = pen.a();
                pemVarA.c(1);
                pemVarA.b(4);
                pemVarA.e(4);
                pemVarA.d(true);
                pen penVarA = pemVarA.a();
                ?? r12 = mgiVarA.c;
                pfu pfuVar = (pfu) obj;
                kmv kmvVar = new kmv(new kwz(pfuVar, r6, r7, r8, 3, r9, (kuw) obj2, penVarA, r12), 3, false);
                Object obj3 = mgiVarA.i;
                pdn pdnVarC = pfuVar.c(r7, 3);
                kxg kxgVarM = ((uh) obj3).m(1000000000L, pdnVarC, new rwz(Integer.valueOf(pdnVarC.a())), 1);
                kwv kwvVar = new kwv(kmvVar, pdnVarC);
                CaptureRequest.Key key3 = nvh.a;
                kmv kmvVar2 = new kmv(new kyq(kxgVarM, kwvVar, key3 != null ? scn.J(new pej(CaptureRequest.EDGE_MODE, 1), new pej(CaptureRequest.NOISE_REDUCTION_MODE, 1), new pej(CaptureRequest.FLASH_MODE, 0), new pej(key3, 0)) : scn.I(new pej(CaptureRequest.EDGE_MODE, 1), new pej(CaptureRequest.NOISE_REDUCTION_MODE, 1), new pej(CaptureRequest.FLASH_MODE, 0)), r8, r6.a(), r12, (kwr) mgiVarA.h), 4, false);
                kmz kmzVarB2 = reeVarA2.b();
                return new kxz(pbbVarA2, new kmo(owfVar5, kmvVar2, kmzVarB2, kmvVar2, kmzVarB2, kmvVar2, kmzVarB2), 1);
            case 15:
                pfu pfuVar2 = (pfu) this.d.a();
                Map map = (Map) this.a.a();
                idt idtVar = (idt) this.b.a();
                EnumMap enumMap = new EnumMap(lcz.class);
                for (lcz lczVar : map.keySet()) {
                    enumMap.put((EnumMap) lczVar, (lcz) pfuVar2.a.a((peq) map.get(lczVar)));
                }
                if (idtVar.e()) {
                    lcz lczVar2 = lcz.RAW_WIDE;
                    if (enumMap.get(lczVar2) != null) {
                        lcz lczVar3 = lcz.RAW_WIDE_UPPER;
                        peo peoVar = (peo) enumMap.get(lczVar2);
                        peoVar.getClass();
                        enumMap.put((EnumMap) lczVar3, (lcz) peoVar);
                    }
                    lcz lczVar4 = lcz.RAW_WIDE_RM;
                    if (enumMap.get(lczVar4) != null) {
                        lcz lczVar5 = lcz.RAW_WIDE_RM_UPPER;
                        peo peoVar2 = (peo) enumMap.get(lczVar4);
                        peoVar2.getClass();
                        enumMap.put((EnumMap) lczVar5, (lcz) peoVar2);
                    }
                }
                return enumMap;
            case 16:
                pmv pmvVar = (pmv) this.b.a();
                myu myuVar = (myu) this.a.a();
                pfl pflVar = (pfl) this.d.a();
                kyk kykVarA = ((kyl) this.c).a();
                return pmvVar.u(myuVar.a(pflVar.l(kykVarA)), kykVarA);
            case 17:
                return ((pmv) this.b.a()).s(((myu) this.a.a()).a(((pfl) this.d.a()).l(((kyn) this.c).a())));
            case 18:
                hbj hbjVar2 = (hbj) this.d.a();
                tzx tzxVar10 = this.c;
                mwq mwqVarA = ((luo) this.a).a();
                luj lujVar = (luj) tzxVar10.a();
                kpb kpbVar = (kpb) this.b.a();
                kpa kpaVar = kov.a;
                if (!hbjVar2.p(hae.r)) {
                    return owp.a(Boolean.FALSE);
                }
                owq owqVarM = mwqVarA.m("pref_camera_raw_output_key", false);
                jjl jjlVar = new jjl(owqVarM, 18);
                sxo sxoVar = sxo.a;
                kpbVar.dK(jjlVar, sxoVar);
                owqVarM.dK(new jjl(kpbVar, 19), sxoVar);
                return hbjVar2.p(gzo.bn) ? new own(owqVarM, new kou(lujVar, 0), new jku(8)) : owqVarM;
            case 19:
                hbj hbjVar3 = (hbj) this.a.a();
                boolean zG = kqx.g(((kiv) this.d).a(), hbjVar3);
                tzx tzxVar11 = this.b;
                if (zG) {
                    tzx tzxVar12 = this.c;
                    owfVarH = owl.h((owf) tzxVar12.a(), new kqu(tzxVar12, tzxVar11, hbjVar3, i));
                } else {
                    owfVarH = owl.h((owf) tzxVar11.a(), new idb(12));
                }
                owfVarH.getClass();
                return owfVarH;
            default:
                tzx tzxVar13 = this.a;
                Context contextB = ((imm) this.d).b();
                owf owfVar6 = (owf) tzxVar13.a();
                return new kqy(contextB, this.c, owfVar6);
        }
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][][] fArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][][] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public jyc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][][] sArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }
}
