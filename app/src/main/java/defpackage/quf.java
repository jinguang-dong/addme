package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quf implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ quh a;
    private final AtomicReference c;

    public quf(quh quhVar, View view) {
        this.a = quhVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        byte[] bArr = null;
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler handlerA = rcc.a();
                quh quhVar = this.a;
                handlerA.postAtFrontOfQueue(new pgr(quhVar, 9));
                rcc.d(new pgr(quhVar, 10));
                rcc.d(new ovw(this, view, 14, bArr));
            } catch (RuntimeException unused) {
            }
        }
    }
}
