package defpackage;

import android.net.http.UrlRequest;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbr implements UrlRequest.StatusListener {
    private final UrlRequest.StatusListener a;

    public vbr(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // android.net.http.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
