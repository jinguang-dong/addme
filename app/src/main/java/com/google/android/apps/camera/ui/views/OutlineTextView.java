package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.ir;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OutlineTextView extends ir {
    private final TextPaint a;
    private float b;
    private int c;

    public OutlineTextView(Context context) {
        super(context);
        this.a = new TextPaint();
        a();
    }

    private final void a() {
        Resources resources = getResources();
        this.b = resources.getDimension(R.dimen.outline_textview_stroke_width);
        this.c = resources.getColor(R.color.outline_textview_stroke_color, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        TextPaint textPaint = this.a;
        textPaint.set(paint);
        int currentTextColor = getCurrentTextColor();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.b);
        paint.setStrokeJoin(Paint.Join.ROUND);
        setTextColor(this.c);
        super.onDraw(canvas);
        setTextColor(currentTextColor);
        paint.set(textPaint);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new TextPaint();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new TextPaint();
    }
}
