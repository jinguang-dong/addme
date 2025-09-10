package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdp implements tzt {
    private final /* synthetic */ int a;

    public kdp(int i) {
        this.a = i;
    }

    public static Executor b() {
        ExecutorService executorServiceBZ = ojl.bZ("DynamicSensorOrientationExecutor");
        executorServiceBZ.getClass();
        return executorServiceBZ;
    }

    public static ExecutorService c() {
        ExecutorService executorServiceBW = ojl.bW("CameraEx");
        executorServiceBW.getClass();
        return executorServiceBW;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return a.O();
            case 1:
                return a.O();
            case 2:
                return a.O();
            case 3:
                return new jsv();
            case 4:
                return new ovx(kfe.IDLE);
            case 5:
                throw null;
            case 6:
                return new qrh();
            case 7:
                return new mwq((byte[]) null, (byte[]) null, (byte[]) null);
            case 8:
                MeteringRectangle[] meteringRectangleArr = kgc.a;
                return new ovx(kgb.a);
            case 9:
                return new mwq((byte[]) null, (byte[]) null);
            case 10:
                return new kgg();
            case 11:
                return new qpt(bArr);
            case 12:
                return c();
            case 13:
                return new khl();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return qpt.ci(CaptureRequest.JPEG_QUALITY, (byte) 95);
            case 15:
                return qpt.ci(CaptureRequest.NOISE_REDUCTION_MODE, 1);
            case 16:
                return qpt.ci(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            case 17:
                return new kio();
            case 18:
                return new AtomicReference(kir.UNINITIALIZED);
            case 19:
                return new kkd();
            default:
                return new our();
        }
    }
}
