package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqu implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public jqu(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    /* JADX WARN: Type inference failed for: r3v79, types: [java.lang.Object, owf] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                ExecutorService executorServiceBZ = ojl.bZ("mv-ctrl-exec");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 1:
                ExecutorService executorServiceBY = ojl.bY("mv-writer", 4);
                executorServiceBY.getClass();
                return executorServiceBY;
            case 2:
                ((hfg) this.a).a();
                iso.q();
                return false;
            case 3:
                hmx hmxVar = new hmx((hlg) this.a.a());
                hmxVar.a = 3;
                hmxVar.c(TimeUnit.MINUTES);
                hmxVar.b = 30;
                hmxVar.b();
                hmxVar.c = 4;
                return hmxVar.a();
            case 4:
                hmx hmxVar2 = new hmx((hlg) this.a.a());
                hmxVar2.c(TimeUnit.MINUTES);
                hmxVar2.b();
                hmxVar2.a = 3;
                hmxVar2.c = 4;
                return hmxVar2.a();
            case 5:
                return new obu(((pba) this.a).a());
            case 6:
                return new sfm((lav) this.a.a());
            case 7:
                return (mez) ((mes) this.a.a()).a();
            case 8:
                return (mfd) ((mes) this.a.a()).a();
            case 9:
                return (mfb) ((mes) this.a.a()).a();
            case 10:
                final owq owqVar = (owq) this.a.a();
                owqVar.getClass();
                return new sfm(new gwy() { // from class: jum
                    @Override // defpackage.gwy
                    public final void a(int i) {
                        owqVar.a(Integer.valueOf(i));
                    }
                });
            case 11:
                return new AmbientMode.AmbientController((kai) this.a.a());
            case 12:
                return new rnu((pgx) this.a.a());
            case 13:
                return new qfd((qin) this.a.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new kdu(this.a);
            case 15:
                return new pkc(((pab) this.a).a());
            case 16:
                return new nnw(((kiv) this.a).a().g());
            case 17:
                return new kfw(((hef) this.a).b().booleanValue());
            case 18:
                owf owfVarCm = qpt.cm(CaptureRequest.CONTROL_AE_REGIONS, ((kfq) this.a).a());
                owfVarCm.getClass();
                return owfVarCm;
            case 19:
                owf owfVarCm2 = qpt.cm(CaptureRequest.CONTROL_AE_LOCK, ((qrh) this.a.a()).d);
                owfVarCm2.getClass();
                return owfVarCm2;
            default:
                Object obj = ((mwq) this.a.a()).b;
                obj.getClass();
                return obj;
        }
    }
}
