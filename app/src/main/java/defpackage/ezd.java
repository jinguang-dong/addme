package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezd extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ nyr a;

    public ezd(nyr nyrVar) {
        this.a = nyrVar;
    }

    private final void a(boolean z) {
        fax.h(new emz(this, z, 2, (byte[]) null));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
