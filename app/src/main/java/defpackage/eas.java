package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eas extends eap {
    public final ConnectivityManager e;
    private final ear f;

    public eas(Context context, gga ggaVar) {
        super(context, ggaVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new ear(this);
    }

    @Override // defpackage.eap
    public final /* bridge */ /* synthetic */ Object b() {
        return eat.a(this.e);
    }

    @Override // defpackage.eap
    public final void d() {
        try {
            dwj.b();
            String str = eat.a;
            ConnectivityManager connectivityManager = this.e;
            ear earVar = this.f;
            earVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(earVar);
        } catch (IllegalArgumentException e) {
            dwj.b();
            Log.e(eat.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            dwj.b();
            Log.e(eat.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.eap
    public final void e() {
        try {
            dwj.b();
            String str = eat.a;
            ConnectivityManager connectivityManager = this.e;
            ear earVar = this.f;
            earVar.getClass();
            connectivityManager.unregisterNetworkCallback(earVar);
        } catch (IllegalArgumentException e) {
            dwj.b();
            Log.e(eat.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            dwj.b();
            Log.e(eat.a, "Received exception while unregistering network callback", e2);
        }
    }
}
