package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rib implements Runnable {
    final /* synthetic */ ric a;
    private final CoordinatorLayout b;
    private final View c;

    public rib(ric ricVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = ricVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ric ricVar;
        OverScroller overScroller;
        View view = this.c;
        if (view == null || (overScroller = (ricVar = this.a).c) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            ricVar.am(this.b, view);
        } else {
            ricVar.as(this.b, view, ricVar.c.getCurrY());
            view.postOnAnimation(this);
        }
    }
}
