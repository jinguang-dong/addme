package defpackage;

import android.opengl.GLES20;
import com.google.android.apps.camera.ui.views.ToggleUi;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndk implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ ndk(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = ndn.i;
                return;
            case 1:
                int i2 = ndn.i;
                return;
            case 2:
                int i3 = ndn.i;
                return;
            case 3:
                int i4 = ndn.i;
                return;
            case 4:
                int i5 = ndn.i;
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 19:
                return;
            case 7:
                sgv sgvVar = ToggleUi.a;
                return;
            case 8:
                sgv sgvVar2 = ToggleUi.a;
                return;
            case 18:
                GLES20.glFlush();
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }
}
