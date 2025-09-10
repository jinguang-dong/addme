package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhg extends BroadcastReceiver {
    final /* synthetic */ owq a;

    public lhg(owq owqVar) {
        this.a = owqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.a.a(Boolean.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false));
    }
}
