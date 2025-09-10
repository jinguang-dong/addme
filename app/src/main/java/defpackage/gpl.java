package defpackage;

import android.app.KeyguardManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpl extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ Runnable a;

    public gpl(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.a.run();
    }
}
