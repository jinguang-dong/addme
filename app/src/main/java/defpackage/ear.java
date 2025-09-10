package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ear extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ eas a;

    public ear(eas easVar) {
        this.a = easVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        dwj.b();
        String str = eat.a;
        Objects.toString(networkCapabilities);
        networkCapabilities.toString();
        this.a.f(new dzr(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        dwj.b();
        String str = eat.a;
        eas easVar = this.a;
        easVar.f(eat.a(easVar.e));
    }
}
