package com.google.android.apps.camera.jupiter.uranus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.fxu;
import defpackage.irk;
import defpackage.mxm;
import j$.lang.Iterable$EL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UranusAnimationView extends View {
    public irk a;
    public mxm b;
    public Rect c;

    public UranusAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = mxm.PORTRAIT;
        this.c = new Rect();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a == null) {
            return;
        }
        canvas.save();
        irk irkVar = this.a;
        Iterable$EL.forEach(irkVar.i, new fxu(irkVar, canvas, 13, null));
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.c;
        if (rect != null && layoutParams != null) {
            layoutParams.width = rect.width();
            layoutParams.height = this.c.height();
            setLayoutParams(layoutParams);
        }
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight() / 2.0f);
        if (this.b.d()) {
            setRotation(0.0f);
        } else if (this.b.equals(mxm.LANDSCAPE)) {
            setRotation(90.0f);
        } else if (this.b.equals(mxm.REVERSE_LANDSCAPE)) {
            setRotation(-90.0f);
        }
    }
}
