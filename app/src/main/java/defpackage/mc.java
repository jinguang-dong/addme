package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mc implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rlo] */
    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        int i = this.b;
        if (i == 0) {
            this.a.run();
            return;
        }
        ?? r2 = this.a;
        if (i != 1) {
            r2.an();
        } else {
            ((eo) r2).G();
        }
    }
}
