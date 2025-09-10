package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emq implements Camera.ShutterCallback {
    public static final /* synthetic */ int b = 0;
    public final AmbientMode.AmbientController a;
    private final Handler c;

    public emq(Handler handler, AmbientMode.AmbientController ambientController) {
        this.c = handler;
        this.a = ambientController;
    }

    @Override // android.hardware.Camera.ShutterCallback
    public final void onShutter() {
        this.c.post(new dzd(this, 5, null));
    }
}
