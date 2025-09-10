package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.ar.core.R;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0001if extends jz implements ih {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ ii d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001if(ii iiVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = iiVar;
        this.c = new Rect();
        this.l = iiVar;
        y();
        this.m = new rbx(this, 1);
    }

    @Override // defpackage.ih
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.jz, defpackage.ih
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.ih
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.ih
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.ih
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        jh jhVar = this.e;
        jhVar.setChoiceMode(1);
        jhVar.setTextDirection(i);
        jhVar.setTextAlignment(i2);
        ii iiVar = this.d;
        int selectedItemPosition = iiVar.getSelectedItemPosition();
        jh jhVar2 = this.e;
        if (u() && jhVar2 != null) {
            jhVar2.a = false;
            jhVar2.setSelection(selectedItemPosition);
            if (jhVar2.getChoiceMode() != 0) {
                jhVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = iiVar.getViewTreeObserver()) == null) {
            return;
        }
        gr grVar = new gr(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(grVar);
        v(new ie(this, grVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    public final void n() {
        int i;
        Drawable drawableC = c();
        if (drawableC != null) {
            ii iiVar = this.d;
            Rect rect = iiVar.d;
            drawableC.getPadding(rect);
            i = byi.bF(iiVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = this.d.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        ii iiVar2 = this.d;
        int paddingLeft = iiVar2.getPaddingLeft();
        int paddingRight = iiVar2.getPaddingRight();
        int width = iiVar2.getWidth();
        int i2 = iiVar2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = iiVar2.a(this.b, c());
            int i4 = iiVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = iiVar2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = byi.bF(iiVar2) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
