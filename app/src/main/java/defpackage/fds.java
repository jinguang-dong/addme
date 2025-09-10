package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fds implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public fds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                return ((nkv) this.b).a() == nkw.PHOTO ? new hgd(1) : new gpu((pbn) this.c.a(), "audioinit", new lck(this.a, 1), 4);
            case 1:
                return !((hbj) this.a.a()).p(gze.c) ? ((fcn) this.c).a() : ((fcg) this.b).a();
            case 2:
                out outVar = (out) this.c.a();
                tzx tzxVar = this.b;
                jgt jgtVarA = ((iyb) this.a).a();
                fdr fdrVar = (fdr) tzxVar.a();
                ins.g(outVar, jgtVarA, fdrVar);
                return new kue(new ea(fdrVar, 19, null), 2);
            case 3:
                return new fdu(((imn) this.a).a(), (luj) this.c.a(), (out) this.b.a(), hmp.b());
            case 4:
                out outVar2 = (out) this.c.a();
                jod jodVar = (jod) this.a.a();
                gzi gziVar = gyg.a;
                return new fey(outVar2, jodVar);
            case 5:
                fqg fqgVar = (fqg) this.b.a();
                gzi gziVar2 = gyg.a;
                Set setA = ((tzz) this.a).a();
                if (setA.isEmpty()) {
                    return new feo();
                }
                fen fenVar = new fen(setA, fqgVar.b);
                for (fev fevVar : fenVar.a) {
                    our ourVar = fenVar.b;
                    owf owfVarA = fevVar.b().a();
                    fem femVar = new fem(fenVar, 1);
                    sxo sxoVar = sxo.a;
                    ourVar.d(owl.i(owfVarA, femVar, sxoVar));
                    ourVar.d(owl.i(fevVar.b().b(), new fem(fenVar, 0), sxoVar));
                }
                return fenVar;
            case 6:
                Object obj = (ffd) this.b.a();
                gzi gziVar3 = gyg.a;
                if (!((Boolean) ((owq) this.a.a()).dL()).booleanValue()) {
                    obj = pdr.a;
                }
                obj.getClass();
                return obj;
            case 7:
                return new few((syu) this.b.a(), (khb) this.c.a(), this.a);
            case 8:
                tzx tzxVar2 = this.c;
                return new sfm(new gpu((Optional) this.b.a(), (nqm) tzxVar2.a(), ((ixw) this.a).a(), 1));
            case 9:
                Object sfmVar = ((fgn) this.b.a()).g() ? new sfm(new npo((npn) this.c.a(), owl.h((fft) this.a.a(), new fgb(0)), npm.BOBA)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 10:
                tzx tzxVar3 = this.c;
                Context contextB = ((imm) this.a).b();
                return new fgs(contextB, (fgn) this.b.a());
            case 11:
                fif fifVar = (fif) this.a.a();
                tzx tzxVar4 = this.c;
                ocq ocqVarA = ((ngy) this.b).a();
                hbj hbjVar = (hbj) tzxVar4.a();
                return (hbjVar.o(gyi.h) && hbjVar.o(gyi.l)) ? new hsk(ocqVarA, fifVar, 1) : nkm.r;
            case 12:
                return !((hbj) this.c.a()).o(gyi.h) ? nkm.r : new fwe(this.b, (muu) this.a.a(), 1);
            case 13:
                return !((hbj) this.a.a()).o(gyi.h) ? new fhm(0) : new ftb((owq) this.b.a(), ((nhc) this.c).a(), 1);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new fjc(((ngy) this.a).a(), (ktx) this.c.a(), (out) this.b.a());
            case 15:
                return new fjo(((imm) this.a).b(), (pbn) this.c.a(), (hbj) this.b.a());
            case 16:
                return new fke(((imm) this.a).b(), ((fmj) this.c).b(), (out) this.b.a());
            case 17:
                hbj hbjVar2 = (hbj) this.c.a();
                return new ggg(hbjVar2);
            case 18:
                fqg fqgVar2 = (fqg) this.b.a();
                owf owfVar = (owf) this.a.a();
                our ourVar2 = fqgVar2.b;
                fpo fpoVarA = ((fpp) this.c).a();
                ourVar2.d(owfVar.dK(new fpe(fpoVarA, 0), sxo.a));
                return fpoVarA;
            case 19:
                return new fsp((ScheduledExecutorService) this.a.a(), (szh) this.b.a(), ((ixw) this.c).a());
            default:
                out outVar3 = ((hbj) this.a.a()).o(gzo.bG) ? new out(new fst(out.a, (syu) this.b.a())) : (out) this.c.a();
                outVar3.getClass();
                return outVar3;
        }
    }

    public fds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public fds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public fds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public fds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }
}
