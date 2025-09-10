package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rlq implements OnBackAnimationCallback {
    final /* synthetic */ rlo a;
    final /* synthetic */ rlr b;

    public rlq(rlr rlrVar, rlo rloVar) {
        this.a = rloVar;
        this.b = rlrVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.al();
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.an();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.av(new na(backEvent));
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.at(new na(backEvent));
        }
    }
}
