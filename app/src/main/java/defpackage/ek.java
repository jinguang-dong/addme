package defpackage;

import android.content.IntentFilter;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ek extends ej {
    final /* synthetic */ eo a;
    public final tdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(eo eoVar, tdy tdyVar) {
        super(eoVar);
        this.a = eoVar;
        this.b = tdyVar;
    }

    @Override // defpackage.ej
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.ej
    public final void b() throws PackageManager.NameNotFoundException {
        this.a.K();
    }
}
