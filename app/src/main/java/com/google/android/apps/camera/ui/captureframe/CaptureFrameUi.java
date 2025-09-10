package com.google.android.apps.camera.ui.captureframe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.ldn;
import defpackage.mnw;
import defpackage.sbp;
import j$.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CaptureFrameUi extends View {
    public final RectF a;
    public final Paint b;
    private final List c;
    private final float d;

    public CaptureFrameUi(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.a = new RectF();
        float dimension = getResources().getDimension(R.dimen.frame_corner_radius);
        this.d = getResources().getDimension(R.dimen.bound_margin);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.frame_line_width));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setBlendMode(BlendMode.DST_ATOP);
        this.c = sbp.o(new mnw(this, paint, 1, dimension), new mnw(this, paint, 2, dimension), new mnw(this, paint, 3, dimension), new mnw(this, paint, 4, dimension));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Collection.EL.stream(this.c).forEach(new ldn(this, canvas, 4, null));
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = i4;
        float f2 = this.d;
        this.a.set(i + f2, i2 + f2, i3 - f2, f - f2);
    }
}
