package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.ar.core.R;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.HttpEngineNativeProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivy implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public ivy(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        boolean z = true;
        switch (this.b) {
            case 0:
                return new ivx((pbn) this.a.a(), jea.a());
            case 1:
                ivp ivpVar = new ivp(((imm) this.a).b());
                ivpVar.d();
                return ivpVar;
            case 2:
                return new ixs(this.a, 0);
            case 3:
                return new pfl(tzs.b(this.a));
            case 4:
                return new jco((lgh) this.a.a());
            case 5:
                pmv pmvVar = (pmv) this.a.a();
                pmvVar.getClass();
                return pmvVar;
            case 6:
                Context contextB = ((imm) this.a).b();
                nao naoVar = new nao();
                naoVar.e = contextB.getString(R.string.lobster_thermal_notification);
                naoVar.h = contextB;
                naoVar.j = 12;
                naoVar.a = false;
                return naoVar.a();
            case 7:
                owf owfVarA = owb.a((ovx) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 8:
                return Boolean.valueOf(((kig) this.a).a().e);
            case 9:
                Object sfmVar = ((Boolean) this.a.a()).booleanValue() ? new sfm(qpt.ci(CaptureRequest.SENSOR_PIXEL_MODE, 1)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 10:
                return new jip(((imm) this.a).b());
            case 11:
                owf owfVarH = owl.h((owq) this.a.a(), new hia(15));
                owfVarH.getClass();
                return owfVarH;
            case 12:
                Set setA = ((tzz) this.a).a();
                Object owiVar = setA.isEmpty() ? new owi(false) : owl.f(setA);
                owiVar.getClass();
                return owiVar;
            case 13:
                owf owfVarH2 = owl.h((owf) this.a.a(), new hia(17));
                owfVarH2.getClass();
                return owfVarH2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Context contextB2 = ((imm) this.a).b();
                HttpEngineNativeProvider httpEngineNativeProvider = new HttpEngineNativeProvider(contextB2);
                CronetEngine cronetEngineBuild = httpEngineNativeProvider.isEnabled() ? httpEngineNativeProvider.createBuilder().build() : new CronetEngine.Builder(contextB2).build();
                cronetEngineBuild.getClass();
                return cronetEngineBuild;
            case 15:
                return new jlp((qhz) this.a.a(), new out());
            case 16:
                return new pfl(((gad) this.a).b());
            case 17:
                rwc rwcVar = (rwc) this.a.a();
                Object sfmVar2 = !rwcVar.h() ? sfd.a : new sfm(new jqj((hgj) rwcVar.c(), 0));
                sfmVar2.getClass();
                return sfmVar2;
            case 18:
                hbj hbjVar = (hbj) ((hfg) this.a).a().a;
                if (!hbjVar.p(gzz.l) && !hbjVar.p(gzz.t)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                ExecutorService executorServiceBZ = ojl.bZ("mv-gyro-exec");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            default:
                return Boolean.valueOf(((hfg) this.a).a().m());
        }
    }
}
