package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbo implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;
    private final Object d;

    public lbo(qay qayVar, tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.d = qayVar;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public lbo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            return new lbj((pfu) this.a.a(), (pdv) this.b.a(), ((klj) this.d).a());
        }
        int i2 = 2;
        if (i == 1) {
            our ourVar = (our) this.a.a();
            pfu pfuVar = (pfu) this.d.a();
            peo peoVarB = ((lbe) this.b).b();
            ourVar.getClass();
            pfuVar.getClass();
            return new frf(new lbk(pfuVar, peoVarB, ourVar, i2), wzgaYJqO.EjjqDUQrfJMlEq, 0);
        }
        if (i == 2) {
            pit pitVar = (pit) this.b.a();
            ((hfg) this.d).a();
            hbj hbjVar = (hbj) this.a.a();
            iso.p();
            Object sfmVar = hbjVar.p(gyp.k) ? new sfm(new lxl(pitVar)) : sfd.a;
            sfmVar.getClass();
            return sfmVar;
        }
        if (i == 3) {
            ren renVar = (ren) this.d.a();
            return new qcd(renVar, (Executor) this.a.a(), rwk.a);
        }
        if (i != 4) {
            return new tdy((rqh) this.b.a(), (rqs) this.a.a(), ((jdg) this.d).b());
        }
        tzx tzxVar = this.b;
        Context contextB = ((jdg) this.a).b();
        rwc rwcVar = (rwc) tzxVar.a();
        Pattern pattern = rcl.a;
        rck rckVar = new rck(contextB);
        rckVar.d("mdd_pds_config");
        rckVar.e(qsp.al("LoggingState", rwcVar));
        Uri uriA = rckVar.a();
        reb rebVarA = rec.a();
        rebVarA.e(uriA);
        rebVarA.d(pvo.a);
        rebVarA.f(false);
        qay qayVar = (qay) this.d;
        ref refVarA = reh.a(contextB, qayVar.a);
        refVarA.c = qsp.A("gms_icing_mdd_network_usage_monitor", rwcVar);
        refVarA.b();
        refVarA.c(new qcc());
        rebVarA.b(refVarA.a());
        return ((ree) qayVar.b).a(rebVarA.a());
    }

    public lbo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.c = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
    }

    public lbo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
    }

    public lbo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[] iArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
    }

    public lbo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, short[] sArr) {
        this.c = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
