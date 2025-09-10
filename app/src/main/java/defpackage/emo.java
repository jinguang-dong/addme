package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emo implements Camera.PictureCallback {
    private final Handler a;

    private emo(Handler handler) {
        this.a = handler;
    }

    public static emo a(Handler handler, emy emyVar) {
        if (handler == null || emyVar == null) {
            return null;
        }
        return new emo(handler);
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.a.post(new fij(1));
    }
}
