package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emp implements Camera.PreviewCallback {
    public final AmbientMode.AmbientController a;
    private final Handler b;

    private emp(Handler handler, AmbientMode.AmbientController ambientController) {
        this.b = handler;
        this.a = ambientController;
    }

    public static emp a(Handler handler, AmbientMode.AmbientController ambientController) {
        if (handler == null || ambientController == null) {
            return null;
        }
        return new emp(handler, ambientController);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.b.post(new eao((Object) this, (Object) bArr, 8, (byte[]) null));
    }
}
