package defpackage;

import android.hardware.camera2.CaptureRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kci implements tzt {
    private final /* synthetic */ int a;

    public kci(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return sfc.a;
            case 1:
                nkw nkwVar = nkw.TIME_LAPSE;
                nkwVar.getClass();
                return nkwVar;
            case 2:
                iao iaoVar = iao.NIGHT_SIGHT;
                iaoVar.getClass();
                return iaoVar;
            case 3:
                return a.af();
            case 4:
                return sfc.a;
            case 5:
                return new kdv();
            case 6:
                return new owi(1);
            case 7:
                return qpt.ch(new pej(CaptureRequest.CONTROL_MODE, 2));
            case 8:
                return qpt.ch(new pej(CaptureRequest.CONTROL_SCENE_MODE, 1));
            case 9:
                return qpt.ch(new pej(nvm.g, true));
            case 10:
                return a.af();
            case 11:
                return qpt.cl();
            case 12:
                return rvk.a;
            case 13:
                return new knt(0);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new owi(kiq.HDR_PLUS_ZSL);
            case 15:
                iao iaoVar2 = iao.MOTION_BLUR;
                iaoVar2.getClass();
                return iaoVar2;
            case 16:
                return rvk.a;
            case 17:
                iao iaoVar3 = iao.NIGHT_SIGHT;
                iaoVar3.getClass();
                return iaoVar3;
            case 18:
                iao iaoVar4 = iao.NIGHT_SIGHT;
                iaoVar4.getClass();
                return iaoVar4;
            case 19:
                int i = kok.a;
                return rvk.a;
            default:
                int i2 = kok.a;
                iao iaoVar5 = iao.REGULAR;
                iaoVar5.getClass();
                return iaoVar5;
        }
    }
}
