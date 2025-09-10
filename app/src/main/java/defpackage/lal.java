package defpackage;

import android.hardware.camera2.CaptureRequest;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lal implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public lal(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.Object, owf] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        switch (this.c) {
            case 0:
                hbj hbjVar = (hbj) this.a.a();
                lam lamVar = (lam) this.b.a();
                hbjVar.getClass();
                lamVar.getClass();
                gzi gziVar = gyv.a;
                return new lam();
            case 1:
                owf owfVarH = owl.h((owf) this.a.a(), new kou((sbv) this.b.a(), 3));
                owfVarH.getClass();
                return owfVarH;
            case 2:
                tzx tzxVar = this.a;
                tzx tzxVar2 = this.b;
                tzj tzjVarB = tzs.b(tzxVar);
                Optional optional = (Optional) tzxVar2.a();
                lcu lcuVar = optional.isPresent() ? (lcu) optional.get() : (lcu) tzjVarB.a();
                lcuVar.getClass();
                return lcuVar;
            case 3:
                return ((rwc) this.b.a()).b(new kou((pfu) this.a.a(), 4));
            case 4:
                tzx tzxVar3 = this.a;
                lbq lbqVarA = ((lbx) this.b).a();
                ((our) tzxVar3.a()).d(lbqVarA);
                return lbqVarA;
            case 5:
                AtomicReference atomicReference = (AtomicReference) this.b.a();
                pjo pjoVar = (pjo) this.a.a();
                CaptureRequest.Key key = kgx.h;
                if (!kzz.j(key, pjoVar)) {
                    return qpt.cl();
                }
                kir kirVar = kir.LAUNCHED;
                return qpt.ci(key, Boolean.valueOf(!((kir) atomicReference.getAndSet(kirVar)).equals(kirVar)));
            case 6:
                return Boolean.valueOf(((Boolean) this.b.a()).booleanValue() && ((hbj) ((hfg) this.a).a().a).p(gzw.l));
            case 7:
                rwc rwcVar = (rwc) this.b.a();
                Set setA = ((tzz) this.a).a();
                sbr sbrVar = new sbr();
                if (rwcVar.h()) {
                    lcz lczVar = lcz.RAW_WIDE;
                    rwcVar.getClass();
                    sbrVar.f(lczVar, new lck(rwcVar, 0));
                }
                sbrVar.i(setA);
                return sbrVar.b();
            case 8:
                jwf jwfVar = (jwf) this.b.a();
                owf owfVar = (owf) this.a.a();
                Optional optional2 = jwfVar.a;
                Object sfmVar2 = optional2.isEmpty() ? sfd.a : new sfm(qpt.cm((CaptureRequest.Key) optional2.get(), owl.h(owl.a(owl.h(owfVar, new leb(3)), owl.h(owfVar, new leb(4))), new leb(5))));
                sfmVar2.getClass();
                return sfmVar2;
            case 9:
                fto ftoVar = (fto) this.b.a();
                rnn rnnVar = (rnn) this.a.a();
                ovc ovcVarA = ovd.a();
                ovcVarA.a = "FireflyProcMgr";
                ovcVarA.b(10);
                ovcVarA.c(1);
                ouy ouyVar = new ouy(ojl.bX(ovcVarA.a()));
                ftoVar.getClass();
                ouyVar.execute(new lac(ftoVar, 2));
                return rnnVar.b(ouyVar);
            case 10:
                hbj hbjVar2 = (hbj) this.a.a();
                owt owtVar = ((kqg) this.b.a()).a;
                Integer num = (Integer) hbjVar2.a(hak.a).get();
                num.intValue();
                owf owfVarD = owl.d(owtVar, num);
                owfVarD.getClass();
                return owfVarD;
            case 11:
                rwr rwrVar = (rwr) this.a.a();
                if (rwrVar.a) {
                    final tzx tzxVar4 = this.b;
                    sfmVar = new sfm(new npo(new npn() { // from class: lgs
                        @Override // defpackage.npn
                        public final npl a(npj npjVar) {
                            return ((lgy) tzxVar4).a();
                        }
                    }, rwrVar.c, npm.MILK));
                } else {
                    sfmVar = sfd.a;
                }
                sfmVar.getClass();
                return sfmVar;
            case 12:
                ((lhl) this.b).a();
                gzi gziVar2 = gym.a;
                return new lhf();
            case 13:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.a();
                pbn pbnVar = (pbn) this.b.a();
                qtj qtjVarA = qnk.a();
                qtjVarA.e = ske.B(new hff(scheduledExecutorService, pbnVar));
                return qtjVarA.b();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (!((hbj) this.a.a()).o(hal.a)) {
                    return nkm.r;
                }
                lif lifVar = (lif) this.b.a();
                lifVar.getClass();
                return new jjy(lifVar, 2);
            case 15:
                return ((hbj) this.b.a()).o(hal.a) ? new jjy(((ngy) this.a).a(), 3) : nkm.r;
            case 16:
                owf owfVarA = owb.a(owl.g((owf) this.a.a(), (owf) this.b.a()));
                owfVarA.getClass();
                return owfVarA;
            case 17:
                hbj hbjVar3 = (hbj) this.a.a();
                Object gncVar = (hbjVar3.o(hal.a) && hbjVar3.o(hal.d) && hbjVar3.o(hal.c)) ? (nkm) tzs.b(this.b).a() : new gnc(5);
                gncVar.getClass();
                return gncVar;
            case 18:
                return new lir((owq) this.a.a(), ((kij) this.b).a(), 0);
            case 19:
                Object sfmVar3 = !((hbj) this.b.a()).o(hal.b) ? sfd.a : new sfm(((liv) this.a).a());
                sfmVar3.getClass();
                return sfmVar3;
            default:
                return new mwq(((imm) this.a).b(), (imi) this.b.a());
        }
    }

    public lal(tzx tzxVar, tzx tzxVar2, int i, float[] fArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
