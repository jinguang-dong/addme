package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.camera2.CaptureRequest;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fmx implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public fmx(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v102, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v79, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v81, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v83, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, uem] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Integer num;
        Integer num2;
        switch (this.c) {
            case 0:
                pfu pfuVar = (pfu) this.a.a();
                return pfuVar.d(pfuVar.a.a((peq) this.b.a()));
            case 1:
                tzx tzxVar = this.a;
                gga ggaVarA = ((fic) this.b).a();
                kmz kmzVar = (kmz) tzxVar.a();
                owf owfVar = (owf) ggaVarA.b.a();
                owfVar.getClass();
                owf owfVar2 = (owf) ggaVarA.c.a();
                owfVar2.getClass();
                owf owfVar3 = (owf) ggaVarA.d.a();
                owfVar3.getClass();
                ?? A = ggaVarA.a.a();
                kmzVar.getClass();
                return new fib(owfVar, owfVar2, owfVar3, A, kmzVar);
            case 2:
                gaw gawVarB = ((ggc) this.b).b();
                jwm jwmVar = (jwm) this.a.a();
                jwmVar.getClass();
                ugl uglVar = new ugl((byte[]) null);
                if (gawVarB.L) {
                    CaptureRequest.Key key = jwmVar.a;
                    if (key != null) {
                        uglVar.add(new pej(key, (byte) 1));
                    }
                    CaptureRequest.Key key2 = jwmVar.b;
                    if (key2 != null) {
                        uglVar.add(new pej(key2, true));
                    }
                    CaptureRequest.Key key3 = jwmVar.c;
                    if (key3 != null && (num2 = jwmVar.d) != null) {
                        uglVar.add(new pej(key3, num2));
                    }
                    CaptureRequest.Key key4 = jwmVar.e;
                    if (key4 != null && (num = jwmVar.f) != null) {
                        uglVar.add(new pej(key4, num));
                    }
                    uglVar.add(new pej(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1));
                    uglVar.add(new pej(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1));
                }
                return qpt.cj(ske.bi(uglVar));
            case 3:
                return new gkh((our) this.b.a(), this.a, 0);
            case 4:
                try {
                    return kqp.a(((gkl) this.a).a(), ((ggc) this.b).b().d.c(), 35);
                } catch (kqo e) {
                    throw new RuntimeException(e);
                }
            case 5:
                return new gkh(((ggc) this.b).b(), this.a, 2);
            case 6:
                return ((hbj) this.a.a()).p(gyo.f) ? rwc.j(((hrk) this.b).a()) : rvk.a;
            case 7:
                hbj hbjVar = (hbj) this.b.a();
                hbjVar.getClass();
                return hbjVar.p(gzp.k) ? ske.aV(this.a.a()) : ufy.a;
            case 8:
                tzx tzxVar2 = this.a;
                pjo pjoVarA = ((kiv) this.b).a();
                jwj jwjVar = (jwj) tzxVar2.a();
                jwjVar.getClass();
                scn scnVarE = kzz.e(nkw.SERENGETI, pjoVarA, jwjVar);
                scnVarE.getClass();
                return ske.aV(qpt.cj(ske.bN(scnVarE)));
            case 9:
                pfu pfuVar2 = (pfu) this.b.a();
                rwc rwcVar = (rwc) this.a.a();
                pfuVar2.getClass();
                rwcVar.getClass();
                return pfuVar2.d((peo) rwcVar.c());
            case 10:
                return new iip(sbp.m((ile) this.b.a(), (ijj) this.a.a()));
            case 11:
                tzx tzxVar3 = this.a;
                Context contextB = ((imm) this.b).b();
                ikp ikpVar = (ikp) tzxVar3.a();
                SensorManager sensorManager = (SensorManager) contextB.getSystemService("sensor");
                rnt.x(sensorManager);
                return new ilf(sensorManager, ikpVar.b.g());
            case 12:
                Object sfmVar = ((hbj) this.b.a()).p(hab.d) ? new sfm((hzi) this.a.a()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 13:
                try {
                    return kqp.a((pjo) ((gnt) this.a.a()).d().c(), ((oxj) this.b.a()).c(), 35);
                } catch (kqo e2) {
                    throw new IllegalStateException("Unable to access OneCamera.", e2);
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                gaw gawVarB2 = ((ggc) this.b).b();
                ((hbj) this.a.a()).getClass();
                if (gawVarB2.F || gawVarB2.L) {
                    return qpt.ch(new pej(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 128));
                }
                gzg gzgVar = haq.a;
                return qpt.ch(new pej(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 1));
            case 15:
                mgi mgiVarA = ((ivh) this.a).a();
                kmz kmzVar2 = (kmz) this.b.a();
                let letVar = (let) mgiVarA.f.a();
                letVar.getClass();
                owf owfVar4 = (owf) mgiVarA.b.a();
                owfVar4.getClass();
                our ourVar = (our) mgiVarA.g.a();
                ourVar.getClass();
                Object obj = mgiVarA.e;
                ?? r5 = mgiVarA.c;
                Object obj2 = mgiVarA.a;
                ?? r7 = mgiVarA.i;
                rwc rwcVarB = ((jaf) obj).b();
                Object objA = r5.a();
                owf owfVarA = ((knz) obj2).a();
                owf owfVar5 = (owf) r7.a();
                owfVar5.getClass();
                ?? r9 = mgiVarA.d;
                ihr ihrVar = (ihr) mgiVarA.h.a();
                ihrVar.getClass();
                kmzVar2.getClass();
                return new ivg(letVar, owfVar4, ourVar, rwcVarB, (ivb) objA, owfVarA, owfVar5, r9, ihrVar, kmzVar2);
            case 16:
                Map map = (Map) this.b.a();
                Map map2 = (Map) this.a.a();
                int i = kok.a;
                sbr sbrVar = new sbr();
                lcz lczVar = lcz.RAW_ULTRAWIDE;
                pdv pdvVar = (pdv) map.get(lczVar);
                pdvVar.getClass();
                sbrVar.f(lczVar, pdvVar);
                lcz lczVar2 = lcz.RAW_WIDE;
                pdv pdvVar2 = (pdv) map.get(lczVar2);
                pdvVar2.getClass();
                sbrVar.f(lczVar2, pdvVar2);
                lcz lczVar3 = lcz.RAW_TELE;
                pdv pdvVar3 = (pdv) map.get(lczVar3);
                pdvVar3.getClass();
                sbrVar.f(lczVar3, pdvVar3);
                return qpt.cd(sbrVar.b(), map2);
            case 17:
                gzi gziVar = hae.a;
                gzi gziVar2 = hak.a;
                gzi gziVar3 = gzs.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 18:
                tzx tzxVar4 = this.b;
                obu obuVarA = ((kmt) this.a).a();
                kmz kmzVar3 = (kmz) tzxVar4.a();
                kqg kqgVar = (kqg) obuVarA.b.a();
                kqgVar.getClass();
                Object objA2 = obuVarA.a.a();
                kmzVar3.getClass();
                return new kms(kqgVar, (qqq) objA2, kmzVar3);
            case 19:
                return qpt.cd((sbv) this.b.a(), (Map) this.a.a());
            default:
                return new kph(((kpf) this.b).a(), (pbn) this.a.a());
        }
    }

    public fmx(tzx tzxVar, tzx tzxVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
