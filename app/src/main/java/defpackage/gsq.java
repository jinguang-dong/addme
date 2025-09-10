package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                return new khb((ScheduledExecutorService) this.a.a(), (Executor) this.b.a(), (gsz) this.c.a());
            case 1:
                tzx tzxVar = this.a;
                return new got(((gpz) this.b).a(), ((ngy) this.c).a(), (pbn) tzxVar.a());
            case 2:
                return new gtn((ktx) this.a.a(), ((ixw) this.c).a(), (owf) this.b.a());
            case 3:
                return new sfm(new frf(new gts((gub) this.b.a(), (got) this.a.a(), (our) this.c.a(), 0, null), "coach", 0));
            case 4:
                return new got((hpa) this.b.a(), (hpj) this.a.a(), (jrg) this.c.a());
            case 5:
                return new gum((gub) this.c.a(), (mdy) this.a.a(), (hbj) this.b.a());
            case 6:
                lsp lspVar = (lsp) this.a.a();
                fdq fdqVarA = ((ixw) this.c).a();
                hbw hbwVar = (hbw) this.b.a();
                lspVar.a(hbwVar);
                fdqVarA.j().d(new ffx(lspVar, hbwVar, 9, null));
                hbwVar.getClass();
                return hbwVar;
            case 7:
                tzx tzxVar2 = this.a;
                return new hcf(((imv) this.b).b(), ((mfx) this.c).a(), (hbj) tzxVar2.a());
            case 8:
                return new pmv(((imm) this.c).b(), (hcb) this.b.a(), (hcf) this.a.a());
            case 9:
                hbj hbjVar = (hbj) this.b.a();
                ((jgo) this.c).a();
                return new hcu(hbjVar);
            case 10:
                return new hdq((hbj) this.c.a(), (CameraActivityTiming) this.b.a(), (cxb) this.a.a());
            case 11:
                return new hdw((ScheduledExecutorService) this.a.a(), (cxb) this.b.a(), (hbj) this.c.a());
            case 12:
                return new frf(new fnf((hfn) this.b.a(), 19), "doverlay", 0);
            case 13:
                return new hfr((hfw) this.c.a(), ((pjq) this.b).a(), (Executor) this.a.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new hfx((hfr) this.c.a(), (szh) this.b.a(), (syu) this.a.a());
            case 15:
                hbj hbjVar2 = (hbj) this.a.a();
                tzx tzxVar3 = this.c;
                rwc rwcVarB = ((ixr) this.b).b();
                return new DynamicDepthUtils(hbjVar2.p(gzo.bb), rwcVarB);
            case 16:
                owq owqVar = (owq) this.c.a();
                tzx tzxVar4 = this.b;
                tzj tzjVarB = tzs.b(this.a);
                pbn pbnVar = (pbn) tzxVar4.a();
                if (!((Boolean) owqVar.dL()).booleanValue()) {
                    return new hgd(0);
                }
                Runnable runnableC = pbnVar.c("ddcWarmup", new hbv(tzjVarB, 4));
                runnableC.getClass();
                return new hed(runnableC, 2);
            case 17:
                boolean zBooleanValue = ((Boolean) this.c.a()).booleanValue();
                our ourVar = (our) this.a.a();
                if (!zBooleanValue) {
                    return new hjx();
                }
                hjg hjgVarA = ((hjh) this.b).a();
                ourVar.d(hjgVarA);
                return hjgVarA;
            case 18:
                boolean zBooleanValue2 = ((Boolean) this.c.a()).booleanValue();
                our ourVar2 = (our) this.a.a();
                if (!zBooleanValue2) {
                    return new hjx();
                }
                hjv hjvVarA = ((hjw) this.b).a();
                ourVar2.d(hjvVarA);
                return hjvVarA;
            case 19:
                tzx tzxVar5 = this.b;
                owf owfVarB = ((lxh) this.a).b();
                final boolean zBooleanValue3 = ((Boolean) tzxVar5.a()).booleanValue();
                hjy hjyVar = new hjy((Executor) this.c.a());
                hjyVar.h(owl.h(owfVarB, new rvu() { // from class: hka
                    @Override // defpackage.rvu
                    public final Object apply(Object obj) {
                        ltr ltrVar = (ltr) obj;
                        boolean z = false;
                        if (zBooleanValue3 && ltrVar != ltr.OFF) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }));
                return hjyVar;
            default:
                pfu pfuVar = (pfu) this.b.a();
                rwc rwcVar = (rwc) this.a.a();
                our ourVar3 = (our) this.c.a();
                if (!rwcVar.h()) {
                    return rvk.a;
                }
                pdn pdnVarC = pfuVar.c((pdv) rwcVar.c(), 2);
                ourVar3.d(pdnVarC);
                return rwc.j(pdnVarC);
        }
    }

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, float[] fArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public gsq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
