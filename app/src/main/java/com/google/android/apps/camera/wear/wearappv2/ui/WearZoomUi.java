package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearZoomUi extends ScrollView {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final float d;
    private final float e;
    private final float f;

    public WearZoomUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = 154.0f;
        Resources resources = context.getResources();
        this.d = resources.getDimension(R.dimen.wear_zoom_slider_margin_outer);
        this.e = resources.getDimension(R.dimen.wear_zoom_bar_slider_knob_size);
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setAlpha(143);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(resources.getDimension(R.dimen.wear_zoom_slider_width));
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setAntiAlias(true);
        try {
            paint3.setTypeface(Typeface.create("google-sans", 1));
        } catch (RuntimeException unused) {
            this.c.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        }
        this.c.setTextSize(resources.getDimension(R.dimen.wear_zoom_slider_knob_text_size));
    }

    public final float a() {
        return getWidth() / 2.0f;
    }

    public final float b() {
        return getHeight() / 2.0f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float fMin = Math.min(getWidth(), getHeight());
        float fA = a();
        float f = (fMin / 2.0f) - this.d;
        canvas.drawArc(fA - f, b() - f, a() + f, b() + f, 154.0f, 52.0f, false, this.a);
        double d = this.f;
        double d2 = f;
        float fCos = (float) ((Math.cos(Math.toRadians(d)) * d2) + a());
        float fSin = (float) ((Math.sin(Math.toRadians(d)) * d2) + b());
        canvas.drawCircle(fCos, fSin, this.e, this.b);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        canvas.rotate(180.0f, fCos, fSin);
        new Rect();
        throw null;
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        isPressed();
        super.setPressed(z);
    }
}
