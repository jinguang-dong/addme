package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuw implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public iuw(bv bvVar, cn cnVar, int i) {
        this.c = i;
        this.b = bvVar;
        this.a = cnVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((efs) this.a).n();
                return;
            }
            cn cnVar = (cn) this.a;
            cnVar.d();
            dh.c((ViewGroup) cnVar.a.P.getParent(), ((bv) this.b).a).g();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i == 0) {
            ((efs) this.a).i();
            ((View) this.b).removeOnAttachStateChangeListener(this);
        } else if (i != 1) {
            ((efs) this.a).i();
            ((FrameLayout) this.b).removeOnAttachStateChangeListener(this);
        }
    }

    public iuw(efs efsVar, View view, int i) {
        this.c = i;
        this.a = efsVar;
        this.b = view;
    }
}
