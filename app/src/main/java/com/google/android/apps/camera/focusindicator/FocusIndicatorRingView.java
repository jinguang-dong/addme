package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.hnn;
import defpackage.hno;
import defpackage.hnq;
import defpackage.hnr;
import defpackage.hns;
import defpackage.hnt;
import defpackage.mxm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FocusIndicatorRingView extends View {
    public final hnq a;
    public final hnn b;
    public final hns c;
    public final float d;
    public PointF e;
    public mxm f;
    public boolean g;
    private boolean h;

    public FocusIndicatorRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = mxm.PORTRAIT;
        this.a = new hnr();
        this.b = new hno();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.c = new hnt(shapeDrawable);
        this.d = context.getResources().getDimension(R.dimen.focus_indicator_ring_size) / 2.0f;
    }

    static int a(mxm mxmVar) {
        int iOrdinal = mxmVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 270;
        }
        if (iOrdinal == 3) {
            return 180;
        }
        throw new IllegalArgumentException();
    }

    public final void b(PointF pointF) {
        if (this.h) {
            return;
        }
        this.e = pointF;
        setX(pointF.x - (getWidth() / 2.0f));
        setY(pointF.y - (getHeight() / 2.0f));
    }

    public final void c() {
        this.h = true;
    }

    public final void d() {
        this.h = false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.b(canvas);
        this.c.a(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.i(i, i2);
        this.b.a(i, i2);
        this.c.b(i, i2);
    }

    FocusIndicatorRingView(Context context, hnq hnqVar, hnn hnnVar, hns hnsVar) {
        super(context);
        this.f = mxm.PORTRAIT;
        this.a = hnqVar;
        this.b = hnnVar;
        this.c = hnsVar;
        this.d = context.getResources().getDimension(R.dimen.focus_indicator_ring_size) / 2.0f;
    }
}
