package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FadingEdgeLayout extends FrameLayout {
    private static final int[] a = {0, 0, -16777216, -16777216, 0, 0};
    private static final float[] b = {0.0f, 0.15f, 0.3f, 0.75f, 0.93f, 1.0f};
    private boolean c;
    private Paint d;
    private Rect e;

    public FadingEdgeLayout(Context context) {
        super(context);
        this.c = true;
        a();
    }

    private final void a() {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final synchronized void dispatchDraw(Canvas canvas) {
        if (this.e == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        canvas.drawRect(this.e, this.d);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c) {
            this.c = false;
            this.e = new Rect(0, 0, getWidth(), getHeight());
            this.d.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), a, b, Shader.TileMode.CLAMP));
        }
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        a();
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        a();
    }
}
