package com.google.android.apps.camera.filmstrip.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FilmstripTransitionThumbnailView extends View {
    public final Object a;
    public Bitmap b;
    public Paint c;
    private boolean d;
    private float e;
    private float f;

    /* JADX WARN: Multi-variable type inference failed */
    public FilmstripTransitionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Object();
        this.d = false;
        this.e = -1.0f;
        this.f = 1.0f;
        if (context instanceof fdi) {
            this.d = ((fdi) context).b().p(gzo.bw);
        }
        float dimension = getResources().getDimension(R.dimen.freeway_bottom_bar_side_button_corner_radius) / getResources().getDimension(R.dimen.freeway_bottom_bar_side_button_side_length);
        this.f = dimension + dimension;
        setWillNotDraw(false);
    }

    public final Bitmap a() {
        Bitmap bitmap;
        synchronized (this.a) {
            bitmap = this.b;
        }
        return bitmap;
    }

    public final void b(float f) {
        this.e = f;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e < 0.0f) {
            return;
        }
        synchronized (this.a) {
            Paint paint = this.c;
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            if (this.d) {
                float f = this.e;
                float f2 = f * this.f;
                canvas.drawRoundRect(width - f, height - f, width + f, height + f, f2, f2, paint);
            } else {
                canvas.drawCircle(width, height, this.e, paint);
            }
        }
    }
}
