package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxv implements nxt {
    private final /* synthetic */ int a;

    public nxv(int i) {
        this.a = i;
    }

    @Override // defpackage.nxt
    public final float a(View view) {
        return this.a != 0 ? view.getTranslationX() : view.getTranslationY();
    }

    @Override // defpackage.nxt
    public final int b(View view) {
        return this.a != 0 ? (view.getLeft() + view.getRight()) / 2 : (view.getTop() + view.getBottom()) / 2;
    }

    @Override // defpackage.nxt
    public final int c(View view) {
        return this.a != 0 ? view.getPaddingLeft() : view.getPaddingTop();
    }

    @Override // defpackage.nxt
    public final int d(View view) {
        return this.a != 0 ? view.getWidth() : view.getHeight();
    }

    @Override // defpackage.nxt
    public final void e(RecyclerView recyclerView, int i) {
        if (this.a != 0) {
            recyclerView.N(i);
        } else {
            recyclerView.O(i);
        }
    }

    @Override // defpackage.nxt
    public final void f(View view, int i) {
        if (this.a != 0) {
            view.setPadding(i, view.getPaddingTop(), Math.max(0, Math.min((view.getWidth() - i) - 1, i)), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), Math.max(0, Math.min((view.getHeight() - i) - 1, i)));
        }
    }

    @Override // defpackage.nxt
    public final boolean g(View view) {
        if (this.a != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams != null && layoutParams.width == -1;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return layoutParams2 != null && layoutParams2.height == -1;
    }

    @Override // defpackage.nxt
    public final boolean h(RecyclerView recyclerView) {
        return this.a == 0 || recyclerView.computeHorizontalScrollRange() > (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
    }
}
