package com.google.android.apps.camera.ui.gridlines;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.mum;
import defpackage.muo;
import defpackage.mup;
import defpackage.muq;
import defpackage.mur;
import defpackage.mus;
import defpackage.sbv;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLinesUi extends View {
    private static final mup c = new mum();
    private static final mup d = new muq(new float[]{0.0f, 1.0f}, false, true);
    private static final mup e = new muq(new float[]{0.33333334f, 0.6666666f}, false, false);
    private static final mup f = new muq(new float[]{0.25f, 0.5f, 0.75f}, true, false);
    private static final mup g = new muq(new float[]{0.38196602f, 0.618034f}, false, false);
    public final Map a;
    public final muo b;

    public GridLinesUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = sbv.q(mus.OFF, d, mus.THREE_BY_THREE, e, mus.FOUR_BY_FOUR, f, mus.GOLDEN_RATIO, g);
        Paint paint = new Paint();
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        paint.setColor(a(context.getResources()));
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.grid_line_width));
        paint2.setColor(a(context.getResources()));
        muo muoVar = new muo(this, paint, paint2);
        this.b = muoVar;
        muoVar.a(c);
    }

    private static int a(Resources resources) {
        return resources.getColor(R.color.grid_line, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        muo muoVar = this.b;
        if (muoVar.b.g) {
            return;
        }
        mur murVar = muoVar.d;
        RectF rectF = muoVar.a;
        murVar.b(canvas, rectF);
        muoVar.e.b(canvas, rectF);
        muoVar.g.b(canvas, rectF);
        muoVar.h.b(canvas, rectF);
        muoVar.f.b(canvas, rectF);
        muoVar.i.b(canvas, rectF);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        muo muoVar = this.b;
        muoVar.a.set(i, i2, i3, i4);
        muoVar.b();
        muoVar.c.invalidate();
    }
}
