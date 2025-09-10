package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emc extends CameraCaptureSession.CaptureCallback implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ Handler a;
    public final /* synthetic */ emy b;
    public final /* synthetic */ elu c;
    public final /* synthetic */ AmbientMode.AmbientController d;

    public emc() {
        throw null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.d != null) {
            this.a.post(new dzd(this, 4, null));
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        try {
            if (this.b != null) {
                ByteBuffer buffer = imageAcquireNextImage.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                this.a.post(new eao((Object) this, (Object) bArr, 4, (byte[]) null));
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (imageAcquireNextImage != null) {
                    try {
                        imageAcquireNextImage.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public emc(elu eluVar, AmbientMode.AmbientController ambientController, Handler handler, emy emyVar) {
        this.c = eluVar;
        this.d = ambientController;
        this.a = handler;
        this.b = emyVar;
    }
}
