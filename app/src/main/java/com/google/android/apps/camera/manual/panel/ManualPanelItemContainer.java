package com.google.android.apps.camera.manual.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.mxm;
import defpackage.qpt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ManualPanelItemContainer extends LinearLayout {
    private mxm a;

    public ManualPanelItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = mxm.PORTRAIT;
    }

    public final void a(mxm mxmVar) {
        this.a = mxmVar;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mxm mxmVar = this.a;
            setRotation(qpt.aN(mxmVar));
            if (mxmVar.d()) {
                setTranslationY(0.0f);
            } else {
                setTranslationY((((View) getParent()).getHeight() / 2.0f) - (getWidth() / 2.0f));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 0));
        if (this.a.d()) {
            return;
        }
        setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
    }
}
