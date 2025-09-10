package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nmb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ nmc a;

    public nmb(nmc nmcVar) {
        this.a = nmcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        nmc nmcVar = this.a;
        nmcVar.d.f(nmcVar.c);
        ((nmm) nmcVar.b.a()).b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        nmc nmcVar = this.a;
        nmcVar.d.a(nmcVar.c);
    }
}
