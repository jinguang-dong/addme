package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gpm extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Intent a;
    final /* synthetic */ qqq b;

    public gpm(qqq qqqVar, Intent intent) {
        this.a = intent;
        this.b = qqqVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        ((gsk) this.b.d).a.b(this.a);
    }
}
