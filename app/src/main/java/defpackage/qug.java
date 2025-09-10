package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qug implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ quh a;
    private final AtomicReference b;

    public qug(quh quhVar, View view) {
        this.a = quhVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler handlerA = rcc.a();
            quh quhVar = this.a;
            handlerA.postAtFrontOfQueue(new pgr(quhVar, 11));
            rcc.d(new pgr(quhVar, 12));
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }
}
