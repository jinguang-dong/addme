package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.util.Pair;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klp implements tzt {
    private final /* synthetic */ int a;

    public klp(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                szh szhVar = new szh();
                fta.a(szhVar, "OneCameraStarted");
                return szhVar;
            case 1:
                szh szhVar2 = new szh();
                fta.a(szhVar2, "OneCameraFistFrameReceived");
                return szhVar2;
            case 2:
                return new ovx(90);
            case 3:
                return new ovx(tgi.a);
            case 4:
                return new ovx(new qrx(new Face[0], new ArrayList(), new Rect(), 0L));
            case 5:
                Float fValueOf = Float.valueOf(0.0f);
                return new ovx(new kmd(fValueOf, new Pair(fValueOf, fValueOf)));
            case 6:
                return true;
            case 7:
                return new ovx(qpt.cl());
            case 8:
                return new szh();
            case 9:
                sbp sbpVar = knm.a;
                return new ovx(hya.UNKNOWN);
            case 10:
                return new lfl(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
            case 11:
                iao iaoVar = iao.REGULAR;
                iaoVar.getClass();
                return iaoVar;
            case 12:
                return new ovx(rvk.a);
            case 13:
                return a.O();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new kuj();
            case 15:
                return new pek(1);
            case 16:
                return new ovx(lnm.CONTINUOUS_PICTURE);
            case 17:
                return new kwb();
            case 18:
                return sfc.a;
            case 19:
                return a.af();
            default:
                return new kzo();
        }
    }
}
