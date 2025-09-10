package defpackage;

import android.app.KeyguardManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lqa extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ KeyguardManager.KeyguardDismissCallback a;
    final /* synthetic */ lqc b;
    final /* synthetic */ int c;

    public lqa(lqc lqcVar, int i, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        this.c = i;
        this.a = keyguardDismissCallback;
        this.b = lqcVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        lqc lqcVar = this.b;
        lpz lpzVar = lqcVar.d;
        if (lpzVar != null) {
            lpzVar.o();
        }
        ((itl) lqcVar.b.a()).k(this.c);
        this.a.onDismissCancelled();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        lqc lqcVar = this.b;
        lpz lpzVar = lqcVar.d;
        if (lpzVar != null) {
            lpzVar.o();
        }
        ((itl) lqcVar.b.a()).k(this.c);
        this.a.onDismissError();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        lqc lqcVar = this.b;
        lpz lpzVar = lqcVar.d;
        if (lpzVar != null) {
            lpzVar.q();
        }
        ((itl) lqcVar.b.a()).k(this.c);
        this.a.onDismissSucceeded();
    }
}
