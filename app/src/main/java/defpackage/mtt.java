package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mtt extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ mtv a;

    public mtt(mtv mtvVar) {
        this.a = mtvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        mtv mtvVar = this.a;
        if (jsv.E(mtvVar.a) != mtvVar.c) {
            mtvVar.b(false);
        }
    }
}
