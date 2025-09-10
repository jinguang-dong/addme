package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.ar.core.ArCoreApk;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdl implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public fdl(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new fdk(((tzz) this.a).a());
            case 1:
                owf owfVarCm = qpt.cm(CaptureRequest.CONTROL_AF_MODE, owl.h((ovx) this.a.a(), new iop(1)));
                owfVarCm.getClass();
                return owfVarCm;
            case 2:
                return new ffd((syu) this.a.a());
            case 3:
                return new ejt((hbj) this.a.a());
            case 4:
                return new ffv(((ffw) this.a).a());
            case 5:
                return new fgn((hbj) this.a.a());
            case 6:
                return new fgo((fga) this.a.a());
            case 7:
                return new fgr((fgu) this.a.a());
            case 8:
                return new fhj((mdy) this.a.a());
            case 9:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 10:
                owf owfVarA2 = owb.a(owl.h((owf) this.a.a(), new fhy(1)));
                owfVarA2.getClass();
                return owfVarA2;
            case 11:
                owf owfVarA3 = owb.a((owq) this.a.a());
                owfVarA3.getClass();
                return owfVarA3;
            case 12:
                owf owfVarA4 = owb.a(owl.h((owq) this.a.a(), new fgb(5)));
                owfVarA4.getClass();
                return owfVarA4;
            case 13:
                owf owfVarA5 = owb.a(owl.h((owq) this.a.a(), new fhy(3)));
                owfVarA5.getClass();
                return owfVarA5;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVarH = owl.h((owf) this.a.a(), new fhy(4));
                owfVarH.getClass();
                return owfVarH;
            case 15:
                return new fkm((fkw) ((tzu) this.a).a);
            case 16:
                owf owfVarA6 = owb.a((owq) this.a.a());
                owfVarA6.getClass();
                return owfVarA6;
            case 17:
                return new hbp((swb) this.a.a());
            case 18:
                hbp hbpVar = (hbp) this.a.a();
                sgv sgvVar = fml.a;
                return hbpVar.a;
            case 19:
                sgv sgvVar2 = fml.a;
                gzi gziVar = gyi.a;
                return new fok(ArCoreApk.getInstance());
            default:
                sgv sgvVar3 = fml.a;
                gzi gziVar2 = gyi.a;
                return new ezh((byte[]) null);
        }
    }
}
