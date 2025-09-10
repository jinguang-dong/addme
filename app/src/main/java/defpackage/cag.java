package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cag implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ bao b;

    public cag(View view, bao baoVar) {
        this.a = view;
        this.b = baoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.v();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
