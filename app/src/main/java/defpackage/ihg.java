package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihg implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public ihg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                final szh szhVar = (szh) this.b.a();
                pbn pbnVar = (pbn) this.c.a();
                final tzx tzxVar = this.a;
                return new frf(pbnVar.c("HdrPlusImageCaptureAvailability", new Runnable() { // from class: ihe
                    @Override // java.lang.Runnable
                    public final void run() {
                        szhVar.e((owf) tzxVar.a());
                    }
                }), "hdrplusa", 0);
            case 1:
                idt idtVar = (idt) this.b.a();
                hbj hbjVar = (hbj) this.c.a();
                jwd jwdVar = (jwd) this.a.a();
                if (idtVar.b()) {
                    Optional optional = jwdVar.f;
                    if (optional.isPresent()) {
                        gzi gziVar = gzc.e;
                        if (hbjVar.a(gziVar).isPresent()) {
                            return qpt.ci((CaptureRequest.Key) optional.get(), hbjVar.a(gziVar).get());
                        }
                    }
                }
                return qpt.cl();
            case 2:
                tzx tzxVar2 = this.a;
                pjp pjpVarA = ((pab) this.b).a();
                return new jod(pjpVarA, ((fef) this.c).a());
            case 3:
                hbj hbjVar2 = (hbj) this.b.a();
                owf owfVar = (owf) this.c.a();
                ipn ipnVar = (ipn) this.a.a();
                if (!hbjVar2.p(gza.t)) {
                    return new owi(new iqk(false, false));
                }
                owfVar.getClass();
                ipnVar.getClass();
                owf owfVarH = owl.h(owl.a(owfVar, ipnVar), hth.b);
                owfVarH.getClass();
                return owfVarH;
            case 4:
                owf owfVar2 = (owf) this.c.a();
                owf owfVar3 = (owf) this.a.a();
                gzg gzgVar = gza.a;
                owfVar2.getClass();
                owfVar3.getClass();
                owf owfVarH2 = owl.h(owl.a(owfVar2, owfVar3), iop.a);
                owfVarH2.getClass();
                return owfVarH2;
            case 5:
                return new pez((imi) this.b.a(), (luj) this.a.a(), (luj) this.c.a());
            case 6:
                return new ipt((owf) this.a.a(), (qpt) this.c.a(), (owf) this.b.a());
            case 7:
                return new irv(((imm) this.a).b(), ((imz) this.b).a(), (imi) this.c.a());
            case 8:
                hbj hbjVar3 = (hbj) this.b.a();
                jea.b(hbjVar3);
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 9:
                return new iwg(((hfl) this.c).a(), (hxy) this.a.a(), this.b);
            case 10:
                return ((kgu) this.b.a()).a(((jcx) this.a).a(), ((fkh) this.c).b(), new qyc(true), nkw.PHOTO);
            case 11:
                return ((kgu) this.b.a()).a(((jcx) this.a).a(), ((fkh) this.c).b(), new qyc(false), nkw.IMAGE_INTENT);
            case 12:
                tzx tzxVar3 = this.c;
                tzx tzxVar4 = this.b;
                jih jihVarA = ((jii) this.a).a();
                ins.f((out) tzxVar3.a(), ((jgo) tzxVar4).a(), jihVarA);
                return jihVarA;
            case 13:
                return new jin(((imm) this.b).b(), (ScheduledExecutorService) this.a.a(), (pbn) this.c.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new jiv((mdy) this.c.a(), ((hco) this.a).a(), (ScheduledExecutorService) this.b.a());
            case 15:
                owf owfVar4 = (owf) this.c.a();
                owf owfVar5 = (owf) this.a.a();
                owf owfVar6 = (owf) this.b.a();
                owf owfVarH3 = owl.h(owl.a(owfVar4, owfVar5, owfVar6), new fdz(owfVar6, 19));
                owfVarH3.getClass();
                return owfVarH3;
            case 16:
                syw sywVar = (syw) this.b.a();
                tzx tzxVar5 = this.c;
                Context contextB = ((imm) this.a).b();
                qat qatVar = new qat((lat) tzxVar5.a(), sywVar);
                qdj qdjVar = new qdj();
                qdjVar.a = sywVar;
                qdjVar.d = qatVar;
                qdjVar.b = new kus(1);
                qdh qdhVar = new qdh();
                qdhVar.a = contextB;
                qdhVar.b = sywVar;
                qdhVar.f = "centaur";
                qdhVar.g = "default";
                qdhVar.i = qatVar;
                qdhVar.h = true;
                rvk rvkVar = rvk.a;
                qdl qdlVar = new qdl(2);
                rnt.B(true, "Exactly one of supplier and (package name, flag name) should be provided.");
                qdn qdnVar = new qdn(qdlVar, rvkVar);
                qdjVar.a.getClass();
                qdjVar.b.getClass();
                qdjVar.d.getClass();
                qdk qdkVar = new qdk(qdjVar);
                qdhVar.a.getClass();
                qdhVar.b.getClass();
                qdhVar.f.getClass();
                qdhVar.g.getClass();
                qdhVar.i.getClass();
                sbp sbpVarN = sbp.n(qdnVar, qdkVar, new qdi(qdhVar));
                sbpVarN.getClass();
                return sbpVarN;
            case 17:
                return new gpu(((ixw) this.b).a(), (pfl) this.a.a(), this.c, 2);
            case 18:
                return new owd((mgp) this.c.a(), (hbj) this.a.a(), (Executor) this.b.a());
            case 19:
                return new jnp((jmw) this.c.a(), (owq) this.a.a(), (hbj) this.b.a());
            default:
                Object obj = (((hfg) this.a).a().m() && ((kil) this.c).a().a) ? (rwc) this.b.a() : rvk.a;
                obj.getClass();
                return obj;
        }
    }

    public ihg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public ihg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public ihg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public ihg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }
}
