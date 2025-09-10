package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.ar.core.R;
import defpackage.ckl;
import defpackage.nvx;
import defpackage.nwb;
import defpackage.nwh;
import defpackage.nwj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearCircularButton extends nwb {
    private int s;
    private int t;

    public WearCircularButton(Context context) {
        this(context, null);
    }

    private static final int m(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i : size : Math.min(size, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.nwb
    public final void l(int i) {
        if (i != 0) {
            this.o.setImageResource(i);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.s);
        int iMin = Math.min(m(dimensionPixelSize, i), m(dimensionPixelSize, i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    public WearCircularButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wearCircularButtonStyle);
    }

    public WearCircularButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nwh nwhVar = nwh.STANDARD;
        this.s = nwhVar.e;
        this.t = nwhVar.f;
        this.l = g(nwj.l(context, R.attr.colorPrimary), nwj.l(context, R.attr.colorOnPrimary));
        LayoutInflater.from(getContext()).inflate(R.layout.wear_circular_button_layout, (ViewGroup) this, true);
        this.o = (ImageView) findViewById(R.id.icon);
        super.j(attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, nvx.c, i, R.style.WearCircularButtonDefault);
        try {
            nwh nwhVar2 = nwh.values()[Math.max(0, Math.min(nwh.values().length - 1, typedArrayObtainStyledAttributes.getInt(0, nwhVar.ordinal())))];
            int i2 = nwhVar2.e;
            int i3 = nwhVar2.f;
            this.s = i2;
            this.t = i3;
            int dimensionPixelSize = getResources().getDimensionPixelSize(this.t);
            ckl cklVar = (ckl) this.o.getLayoutParams();
            cklVar.width = dimensionPixelSize;
            cklVar.height = dimensionPixelSize;
            this.o.setLayoutParams(cklVar);
            requestLayout();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
