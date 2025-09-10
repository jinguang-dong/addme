package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dar extends byi {
    public Drawable a;
    public int b;
    public boolean c;
    final /* synthetic */ dav d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dar(dav davVar) {
        super((char[]) null);
        this.d = davVar;
        this.c = true;
    }

    private final boolean g(View view, RecyclerView recyclerView) {
        lg lgVarH = recyclerView.h(view);
        if (!(lgVarH instanceof dbh) || !((dbh) lgVarH).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        lg lgVarH2 = recyclerView.h(recyclerView.getChildAt(iIndexOfChild + 1));
        return (lgVarH2 instanceof dbh) && ((dbh) lgVarH2).u;
    }

    @Override // defpackage.byi
    public final void bG(Rect rect, View view, RecyclerView recyclerView, ld ldVar) {
        if (g(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.byi
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (g(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.a.setBounds(0, y, width, this.b + y);
                this.a.draw(canvas);
            }
        }
    }
}
