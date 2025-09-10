package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.mxm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EyesFocusIndicatorRectView extends View {
    public final RectF a;
    public final Drawable b;
    public final Drawable c;
    public mxm d;

    public EyesFocusIndicatorRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new RectF();
        this.d = mxm.PORTRAIT;
        this.b = context.getResources().getDrawable(R.drawable.ic_eyes_focus_rect_top_left_corner, null);
        this.c = context.getResources().getDrawable(R.drawable.ic_eyes_focus_rect_bottom_right_corner, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.draw(canvas);
        this.c.draw(canvas);
    }
}
