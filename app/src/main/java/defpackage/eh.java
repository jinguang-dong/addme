package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eh extends ej {
    public final PowerManager a;
    final /* synthetic */ eo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(eo eoVar, Context context) {
        super(eoVar);
        this.b = eoVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.ej
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.ej
    public final void b() throws PackageManager.NameNotFoundException {
        this.b.K();
    }
}
