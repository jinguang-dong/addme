package defpackage;

import j$.util.Optional;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, uem] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        switch (this.d) {
            case 0:
                return kll.b((our) this.a.a(), (syu) this.b.a(), (rnn) this.c.a());
            case 1:
                return new klt(this.a, (ovq) this.c.a(), Optional.empty(), (pbn) this.b.a());
            case 2:
                return new kmu((kmz) this.c.a(), (owd) this.a.a(), (pbn) this.b.a(), 1);
            case 3:
                return new kmu((kmz) this.a.a(), (pau) this.c.a(), (pbn) this.b.a(), 0);
            case 4:
                return new knk(((hco) this.a).a(), ((kiu) this.b).a(), (kow) this.c.a());
            case 5:
                return ((pfu) this.c.a()).f((peo) this.b.a(), ((tzz) this.a).a());
            case 6:
                Object obj = (kwb) this.a.a();
                if (((kiu) this.c).a().l() == pka.FRONT) {
                    obj = (kvy) this.b.a();
                }
                obj.getClass();
                return obj;
            case 7:
                tzx tzxVar = this.b;
                tzx tzxVar2 = this.c;
                tzx tzxVar3 = this.a;
                tzj tzjVarB = tzs.b(tzxVar);
                tzj tzjVarB2 = tzs.b(tzxVar2);
                if (true != ((Boolean) tzxVar3.a()).booleanValue()) {
                    tzjVarB = tzjVarB2;
                }
                rwc rwcVar = (rwc) tzjVarB.a();
                rwcVar.getClass();
                return rwcVar;
            case 8:
                Map map = (Map) this.a.a();
                idt idtVar = (idt) this.c.a();
                EnumMap enumMap = new EnumMap(lcz.class);
                for (lcz lczVar : map.keySet()) {
                    peo peoVar = (peo) map.get(lczVar);
                    if (peoVar != null) {
                        pjr pjrVarD = peoVar.d();
                        if (idtVar.e()) {
                            if (lczVar == lcz.RAW_WIDE_UPPER) {
                                pjrVarD = pjr.b(gzc.a);
                            } else if (lczVar == lcz.RAW_WIDE_RM_UPPER) {
                                pjrVarD = pjr.b(gzc.b);
                            }
                        }
                        enumMap.put((EnumMap) lczVar, (lcz) pjrVarD);
                    }
                }
                return enumMap;
            case 9:
                Object objA = ((kiu) this.c).a().l() == pka.FRONT ? (kvy) this.a.a() : ((kwi) this.b).a();
                objA.getClass();
                return objA;
            case 10:
                tzx tzxVar4 = this.b;
                tzx tzxVar5 = this.a;
                tzj tzjVarB3 = tzs.b(tzxVar4);
                rwc rwcVar2 = (rwc) tzxVar5.a();
                kps kpsVar = (((Boolean) this.c.a()).booleanValue() && rwcVar2.h()) ? (kps) rwcVar2.c() : (kps) tzjVarB3.a();
                kpsVar.getClass();
                return kpsVar;
            case 11:
                our ourVar = (our) this.a.a();
                hzs hzsVar = (hzs) this.c.a();
                ibb ibbVar = (ibb) this.b.a();
                ibbVar.getClass();
                kpd kpdVar = new kpd(hzsVar, new fvq(ibbVar, 6));
                ourVar.d(kpdVar);
                return kpdVar;
            case 12:
                pjo pjoVarA = ((kiv) this.c).a();
                owf owiVar = (nvn.j == null || nvn.k == null || !pjoVarA.M() || !pjoVarA.D()) ? new owi(qpt.cl()) : owl.h((owf) this.a.a(), new kou(this.b, 2));
                owiVar.getClass();
                return owiVar;
            case 13:
                pjo pjoVarA2 = ((kiv) this.c).a();
                Optional optional = ((jwo) this.a.a()).a;
                owf owfVarH = optional.isPresent() ? owl.h((owf) this.b.a(), new hve(optional, pjoVarA2, 7, null)) : new owi(qpt.cl());
                owfVarH.getClass();
                return owfVarH;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new pnk(((imm) this.c).b(), (out) this.b.a(), ((pba) this.a).a());
            case 15:
                tzx tzxVar6 = this.a;
                jgt jgtVarA = ((iyb) this.c).a();
                out outVar = (out) tzxVar6.a();
                ktx ktxVarA = ((kty) this.b).a();
                ins.g(outVar, jgtVarA, ktxVarA);
                return ktxVarA;
            case 16:
                pdu pduVar = (pdu) this.a.a();
                pdt pdtVar = (pdt) this.c.a();
                Set set = (Set) this.b.a();
                pfu pfuVarA = pduVar.a(pdtVar);
                pfuVarA.n(set);
                pfuVarA.getClass();
                return pfuVarA;
            case 17:
                hbj hbjVar = (hbj) this.b.a();
                pnq pnqVar = (pnq) this.a.a();
                ixm ixmVar = (ixm) this.c.a();
                scl sclVar = new scl();
                if (hbjVar.o(gzo.am)) {
                    sclVar.d(2);
                }
                if (ixmVar.c()) {
                    sclVar.d(1);
                }
                if (pnqVar.i()) {
                    sclVar.d(0);
                }
                scn scnVarG = sclVar.g();
                scnVarG.getClass();
                return scnVarG;
            case 18:
                pfu pfuVar = (pfu) this.c.a();
                rwc rwcVarB = ((gad) this.a).b();
                if (rwcVarB.h()) {
                    tzx tzxVar7 = this.b;
                    cxb cxbVar = (cxb) rwcVarB.c();
                    hps hpsVar = (hps) tzxVar7.a();
                    pmv pmvVar = (pmv) cxbVar.a;
                    kgg kggVar = (kgg) pmvVar.b.a();
                    kggVar.getClass();
                    ggg gggVar = (ggg) pmvVar.a.a();
                    gggVar.getClass();
                    ((hfn) pmvVar.c.a()).getClass();
                    ((hbj) pmvVar.d.a()).getClass();
                    pfuVar.getClass();
                    hpsVar.getClass();
                    sfmVar = new sfm(new kuo(kggVar, gggVar, pfuVar, hpsVar));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 19:
                plc plcVar = (plc) this.a.a();
                hwv hwvVar = (hwv) this.b.a();
                qqq qqqVar = (qqq) this.c.a();
                int i = kur.a;
                return new hwt(plcVar, qqqVar, hwvVar, 1, 2, 2);
            default:
                return new frf(new gts(((gad) this.b).b(), (our) this.a.a(), (pfu) this.c.a(), 8), "mawb", 0);
        }
    }

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }

    public klq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }
}
