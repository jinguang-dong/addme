package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmp implements tzt {
    private final /* synthetic */ int a;

    public hmp(int i) {
        this.a = i;
    }

    public static hbc b() {
        hbc hbcVar = hbc.RELEASE;
        hbcVar.getClass();
        return hbcVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return hlg.b("feature.acmi.imu.sensor-accelerometer");
            case 1:
                return hlg.b(SHXc.FLwcKDF);
            case 2:
                return b();
            case 3:
                return ojl.cc("audio-frame-enc");
            case 4:
                ExecutorService executorServiceBZ = ojl.bZ("frame-store-resource-manager-exec");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 5:
                ExecutorService executorServiceBZ2 = ojl.bZ("meta-store-exec");
                executorServiceBZ2.getClass();
                return executorServiceBZ2;
            case 6:
                return new how();
            case 7:
                CaptureRequest.Key key = nvl.a;
                return key != null ? qpt.ci(key, true) : qpt.cl();
            case 8:
                return new hpv();
            case 9:
                return new ggg((byte[]) null, (byte[]) null, (byte[]) null);
            case 10:
                return new ezh((byte[]) null);
            case 11:
                return new hqc();
            case 12:
                ExecutorService executorServiceBZ3 = ojl.bZ("catcher-analysis");
                executorServiceBZ3.getClass();
                return executorServiceBZ3;
            case 13:
                ExecutorService executorServiceBZ4 = ojl.bZ("catcher-exec");
                executorServiceBZ4.getClass();
                return executorServiceBZ4;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new hrs();
            case 15:
                return a.O();
            case 16:
                return a.O();
            case 17:
                ExecutorService executorServiceBZ5 = ojl.bZ("catcher-active-status-callback");
                executorServiceBZ5.getClass();
                return executorServiceBZ5;
            case 18:
                return new hsb();
            case 19:
                return new ovx(huw.a);
            default:
                return new tdi();
        }
    }
}
