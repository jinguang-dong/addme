package defpackage;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgp implements paq {
    private final /* synthetic */ int a;

    public /* synthetic */ fgp(int i) {
        this.a = i;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            case 7:
                int i = gwv.Y;
                break;
            case 19:
                ncp ncpVar = ShutterButton.a;
                break;
            default:
                sgv sgvVar = nph.a;
                break;
        }
    }
}
