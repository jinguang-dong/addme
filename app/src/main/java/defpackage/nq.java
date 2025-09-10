package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nq implements OnBackAnimationCallback {
    final /* synthetic */ uiq a;
    final /* synthetic */ uiq b;
    final /* synthetic */ uif c;
    final /* synthetic */ uif d;

    public nq(uiq uiqVar, uiq uiqVar2, uif uifVar, uif uifVar2) {
        this.a = uiqVar;
        this.b = uiqVar2;
        this.c = uifVar;
        this.d = uifVar2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.a(new na(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.a(new na(backEvent));
    }
}
