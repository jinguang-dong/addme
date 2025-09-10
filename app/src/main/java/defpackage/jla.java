package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jla extends byi {
    public mxm a;
    private final Drawable b;
    private final Rect c;
    private final Resources d;
    private final boolean e;

    public jla(Resources resources, mxm mxmVar, boolean z) {
        super((char[]) null);
        this.c = new Rect();
        this.a = mxmVar;
        this.d = resources;
        this.b = resources.getDrawable(R.drawable.manual_control_panel_divider, null);
        this.e = z;
    }

    @Override // defpackage.byi
    public final void bG(Rect rect, View view, RecyclerView recyclerView, ld ldVar) throws Resources.NotFoundException {
        int dimensionPixelSize;
        if (((jkx) recyclerView.l) == null) {
            super.bG(rect, view, recyclerView, ldVar);
            return;
        }
        int iC = recyclerView.c(view);
        if (iC == 0) {
            dimensionPixelSize = this.d.getDimensionPixelSize(R.dimen.item_divider_spacing);
            iC = 0;
        } else {
            dimensionPixelSize = 0;
        }
        if (this.a.d()) {
            if (true != this.e) {
                dimensionPixelSize = 0;
            }
            rect.set(0, 0, dimensionPixelSize, 0);
        } else {
            int dimensionPixelSize2 = this.d.getDimensionPixelSize(R.dimen.additional_rotated_end_spacing);
            int i = iC == 0 ? dimensionPixelSize2 : 0;
            if (iC == r0.a() - 1) {
                dimensionPixelSize += dimensionPixelSize2;
            }
            rect.set(i, 0, dimensionPixelSize, 0);
        }
    }

    @Override // defpackage.byi
    public final void bH(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.m == null) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        if (recyclerView.c(childAt) == 0) {
            canvas.save();
            Drawable drawable = this.b;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int dimensionPixelSize = this.a.d() ? this.d.getDimensionPixelSize(R.dimen.control_panel_divider_top_margin) : (recyclerView.getHeight() - intrinsicHeight) / 2;
            int i = intrinsicHeight + dimensionPixelSize;
            Rect rect = this.c;
            RecyclerView.I(childAt, rect);
            int iRound = ((rect.right + Math.round(childAt.getTranslationX())) - ((!this.a.d() || this.e) ? this.d.getDimensionPixelSize(R.dimen.item_divider_spacing) / 2 : 0)) + (intrinsicWidth / 2);
            drawable.setBounds(iRound - intrinsicWidth, dimensionPixelSize, iRound, i);
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}
