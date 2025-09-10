package androidx.percentlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import defpackage.czv;
import defpackage.czw;
import defpackage.czx;
import defpackage.czy;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class PercentRelativeLayout extends RelativeLayout {
    private final czx a;

    public PercentRelativeLayout(Context context) {
        super(context);
        this.a = new czx(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final czy generateLayoutParams(AttributeSet attributeSet) {
        return new czy(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new czy();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        czv czvVarA;
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup viewGroup = this.a.a;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof czy) && (czvVarA = ((czy) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    czvVarA.b(marginLayoutParams);
                    czw czwVar = czvVarA.j;
                    marginLayoutParams.leftMargin = czwVar.leftMargin;
                    marginLayoutParams.topMargin = czwVar.topMargin;
                    marginLayoutParams.rightMargin = czwVar.rightMargin;
                    marginLayoutParams.bottomMargin = czwVar.bottomMargin;
                    marginLayoutParams.setMarginStart(czwVar.getMarginStart());
                    marginLayoutParams.setMarginEnd(czwVar.getMarginEnd());
                } else {
                    czvVarA.b(layoutParams);
                }
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        czv czvVarA;
        czv czvVarA2;
        ViewGroup viewGroup = this.a.a;
        int size = (View.MeasureSpec.getSize(i) - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
        int childCount = viewGroup.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof czy) && (czvVarA2 = ((czy) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    czvVarA2.a(marginLayoutParams, size, size2);
                    czw czwVar = czvVarA2.j;
                    czwVar.leftMargin = marginLayoutParams.leftMargin;
                    czwVar.topMargin = marginLayoutParams.topMargin;
                    czwVar.rightMargin = marginLayoutParams.rightMargin;
                    czwVar.bottomMargin = marginLayoutParams.bottomMargin;
                    czwVar.setMarginStart(marginLayoutParams.getMarginStart());
                    czwVar.setMarginEnd(marginLayoutParams.getMarginEnd());
                    float f = czvVarA2.c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(size * f);
                    }
                    float f2 = czvVarA2.d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f2);
                    }
                    float f3 = czvVarA2.e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(size * f3);
                    }
                    float f4 = czvVarA2.f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f4);
                    }
                    float f5 = czvVarA2.g;
                    if (f5 >= 0.0f) {
                        marginLayoutParams.setMarginStart(Math.round(size * f5));
                    } else {
                        z = false;
                    }
                    float f6 = czvVarA2.h;
                    if (f6 >= 0.0f) {
                        marginLayoutParams.setMarginEnd(Math.round(size * f6));
                    } else if (z) {
                    }
                    if (childAt != null) {
                        marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                    }
                } else {
                    czvVarA2.a(layoutParams, size, size2);
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        int childCount2 = viewGroup.getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = viewGroup.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof czy) && (czvVarA = ((czy) layoutParams2).a()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & (-16777216)) == 16777216 && czvVarA.a >= 0.0f && czvVarA.j.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && czvVarA.b >= 0.0f && czvVarA.j.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new czx(this);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new czx(this);
    }
}
