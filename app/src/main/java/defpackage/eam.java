package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eam extends eap {
    private final BroadcastReceiver e;

    public eam(Context context, gga ggaVar) {
        super(context, ggaVar);
        this.e = new eal(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.eap
    public final void d() {
        dwj.b();
        int i = ean.a;
        getClass().getSimpleName();
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.eap
    public final void e() {
        dwj.b();
        int i = ean.a;
        getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}
