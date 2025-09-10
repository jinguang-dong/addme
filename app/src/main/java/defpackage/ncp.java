package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ncp extends Handler {
    private final WeakReference a;

    public ncp(ShutterButton shutterButton) {
        this.a = new WeakReference(shutterButton);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ShutterButton shutterButton = (ShutterButton) this.a.get();
        if (shutterButton == null) {
            return;
        }
        switch (message.what) {
            case 1000:
                ShutterButton.y = 3;
                removeMessages(1001);
                shutterButton.t(ShutterButton.y);
                return;
            case 1001:
                if (!hasMessages(1002)) {
                    ShutterButton.y = 4;
                    shutterButton.t(4);
                    return;
                } else {
                    removeMessages(1001);
                    ShutterButton.y = 4;
                    shutterButton.t(4);
                    return;
                }
            case 1002:
                ShutterButton.y = 5;
                removeMessages(1001);
                shutterButton.t(ShutterButton.y);
                return;
            default:
                throw new IllegalArgumentException("Not supported state msg: " + message.what);
        }
    }
}
