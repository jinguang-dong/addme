package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rid extends rif {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public rid() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float a(View view) {
        throw null;
    }

    public final int al(View view) {
        if (this.d == 0) {
            return 0;
        }
        float fA = a(view);
        int i = this.d;
        return clc.D((int) (fA * i), 0, i);
    }

    public boolean an() {
        return false;
    }

    public int b(View view) {
        throw null;
    }

    public abstract View c(List list);

    @Override // defpackage.rif
    protected final void fu(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewC = c(coordinatorLayout.a(view));
        if (viewC == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        clf clfVar = (clf) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + clfVar.leftMargin, viewC.getBottom() + clfVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - clfVar.rightMargin, ((coordinatorLayout.getHeight() + viewC.getBottom()) - coordinatorLayout.getPaddingBottom()) - clfVar.bottomMargin);
        cpp cppVar = coordinatorLayout.e;
        if (cppVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += cppVar.b();
            rect.right -= cppVar.c();
        }
        Rect rect2 = this.b;
        int i2 = clfVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iAl = al(viewC);
        view.layout(rect2.left, rect2.top - iAl, rect2.right, rect2.bottom - iAl);
        this.c = rect2.top - viewC.getBottom();
    }

    public rid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
