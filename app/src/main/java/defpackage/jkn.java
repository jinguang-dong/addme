package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkn extends byi {
    public jkn() {
        super((char[]) null);
    }

    @Override // defpackage.byi
    public final void bG(Rect rect, View view, RecyclerView recyclerView, ld ldVar) {
        int[] iArr = con.a;
        int layoutDirection = recyclerView.getLayoutDirection();
        int iC = recyclerView.c(view);
        int i = 0;
        boolean z = iC == ldVar.a() + (-1);
        if (z || iC == 0) {
            int width = (recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd();
            int width2 = view.getWidth();
            if (width2 == 0) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
                int paddingLeft = recyclerView.getPaddingLeft() + recyclerView.getPaddingRight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.getClass();
                int childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, paddingLeft, layoutParams.width);
                int paddingTop = recyclerView.getPaddingTop() + recyclerView.getPaddingBottom();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.getClass();
                view.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, paddingTop, layoutParams2.height));
                width2 = view.getMeasuredWidth();
            }
            int i2 = (width - width2) / 2;
            int i3 = true != z ? 0 : i2;
            if (iC == 0) {
                if (!z) {
                    i3 = 0;
                }
                i = i2;
            }
            rect.left = layoutDirection == 1 ? i3 : i;
            if (layoutDirection != 1) {
                i = i3;
            }
            rect.right = i;
        }
    }
}
