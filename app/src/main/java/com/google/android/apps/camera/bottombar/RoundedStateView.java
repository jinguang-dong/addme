package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.nlj;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class RoundedStateView extends ImageButton {
    private final Paint a;
    private final Paint b;
    private int c;
    private int d;
    private final float e;
    private final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
        setClickable(true);
        this.e = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(nlj.b(2.0f));
        paint.setColor(-1);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(Color.argb(81, 0, 0, 0));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (!this.f) {
            canvas.save();
            canvas.drawCircle(this.c, this.d, getResources().getDimension(R.dimen.bottom_border_ring_diameter), this.a);
            canvas.drawCircle(this.c, this.d, getResources().getDimension(R.dimen.bottom_inner_circle_diameter), this.b);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = (int) this.e;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.c = i / 2;
        this.d = i2 / 2;
        super.onSizeChanged(i, i2, i3, i4);
    }
}
