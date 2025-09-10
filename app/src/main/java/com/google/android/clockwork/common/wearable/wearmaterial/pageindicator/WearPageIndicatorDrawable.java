package com.google.android.clockwork.common.wearable.wearmaterial.pageindicator;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.cmg;
import defpackage.nwj;
import defpackage.nxc;
import defpackage.nxd;
import defpackage.nxe;
import defpackage.nxf;
import defpackage.nxg;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearPageIndicatorDrawable extends Drawable {
    private static final float MAX_PAGE_POS_TO_CENTER_DISTANCE = 0.5f;
    private static final int MAX_VISIBLE_INDICATORS = 6;
    private static final float OVERFLOW_FADEOUT_LENGTH = 6.0f;
    private static final float OVERFLOW_FADE_DISTANCE_TO_PAGE_POS = 1.0f;
    private nxg canvasTransformer;
    private int dotRadius;
    private final Paint indicatorPaint;
    private float selectedAlpha;
    private final nxc state;
    private float unselectedAlpha;

    public WearPageIndicatorDrawable() {
        Paint paint = new Paint();
        this.indicatorPaint = paint;
        this.state = new nxc();
        paint.setAntiAlias(true);
    }

    private float computeIndicatorDotRadius(int i) {
        nxc nxcVar = this.state;
        if (nxcVar.a) {
            return this.dotRadius;
        }
        float f = nxcVar.e;
        float f2 = i;
        float fAbs = Math.abs(f2 - nxcVar.f);
        float fAbs2 = Math.abs(f2 - f) - 1.0f;
        float f3 = fAbs - 3.0f;
        return this.dotRadius * nwj.n(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - (f3 + f3), 0.0f, OVERFLOW_FADE_DISTANCE_TO_PAGE_POS) * nwj.n(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - (fAbs2 / OVERFLOW_FADEOUT_LENGTH), 0.0f, OVERFLOW_FADE_DISTANCE_TO_PAGE_POS);
    }

    private boolean needsMirroring() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        nxc nxcVar;
        int i;
        float fN;
        if (this.canvasTransformer == null || (i = (nxcVar = this.state).b) <= 1) {
            return;
        }
        float fN2 = nwj.n(nxcVar.e, 0.0f, i - 1);
        nxcVar.e = fN2;
        if (nxcVar.a) {
            fN = (nxcVar.b - 1) / 2.0f;
            nxcVar.f = fN;
        } else {
            float fMin = nxcVar.f;
            float f = fMin - 0.5f;
            float f2 = fMin + MAX_PAGE_POS_TO_CENTER_DISTANCE;
            float f3 = nxcVar.i;
            if (fN2 < f) {
                fMin = fN2 + MAX_PAGE_POS_TO_CENTER_DISTANCE;
                nxcVar.f = fMin;
                nxcVar.l = 2;
            } else if (fN2 > f2) {
                fMin = fN2 - 0.5f;
                nxcVar.f = fMin;
                nxcVar.l = 1;
            } else if (fMin != f3) {
                int i2 = nxcVar.l;
                if (i2 == 1) {
                    fMin = Math.max(fN2 - 0.5f, nxcVar.j);
                    nxcVar.f = fMin;
                } else if (i2 == 2) {
                    fMin = Math.min(fN2 + MAX_PAGE_POS_TO_CENTER_DISTANCE, nxcVar.k);
                    nxcVar.f = fMin;
                }
            }
            fN = nwj.n(fMin, nxcVar.h, nxcVar.g);
            nxcVar.f = fN;
        }
        int iFloor = (int) Math.floor(fN);
        float f4 = nxcVar.f;
        float f5 = iFloor;
        float f6 = f4 - f5 > MAX_PAGE_POS_TO_CENTER_DISTANCE ? f5 + MAX_PAGE_POS_TO_CENTER_DISTANCE : f5 - 0.5f;
        nxcVar.j = f6;
        nxcVar.k = f6 + OVERFLOW_FADE_DISTANCE_TO_PAGE_POS;
        nxcVar.i = Math.abs(f4 - f6) < Math.abs(nxcVar.f - nxcVar.k) ? nxcVar.j : nxcVar.k;
        if (nxcVar.a) {
            nxcVar.c = 0;
            nxcVar.d = nxcVar.b - 1;
        } else {
            nxcVar.c = (int) nwj.n((float) Math.floor(nxcVar.f - 3.0f), 0.0f, nxcVar.b - 1);
            nxcVar.d = (int) nwj.n((float) StrictMath.ceil(nxcVar.f + 3.0f), 0.0f, nxcVar.b - 1);
        }
        nxc nxcVar2 = this.state;
        int i3 = nxcVar2.c;
        int i4 = nxcVar2.d;
        float f7 = nxcVar2.f;
        float f8 = needsMirroring() ? i4 - this.state.e : this.state.e;
        canvas.save();
        this.canvasTransformer.a(getBounds(), canvas, i3, f7);
        while (i3 <= i4) {
            float fMin2 = OVERFLOW_FADE_DISTANCE_TO_PAGE_POS - Math.min(OVERFLOW_FADE_DISTANCE_TO_PAGE_POS, Math.abs(f8 - i3));
            float f9 = this.unselectedAlpha;
            this.indicatorPaint.setColor(cmg.e(-1, (int) (f9 + ((this.selectedAlpha - f9) * fMin2))));
            canvas.drawCircle(0.0f, 0.0f, computeIndicatorDotRadius(i3), this.indicatorPaint);
            this.canvasTransformer.b(getBounds(), canvas);
            i3++;
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, nxd.a, 0, 0) : resources.obtainAttributes(attributeSet, nxd.a);
        this.dotRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.selectedAlpha = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.unselectedAlpha = typedArrayObtainStyledAttributes.getInteger(3, 0);
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (resources.getConfiguration().isScreenRound()) {
            this.canvasTransformer = new nxf(this.dotRadius, dimensionPixelSize);
        } else {
            this.canvasTransformer = new nxe(this.dotRadius, resources.getDimensionPixelOffset(R.dimen.wear_page_indicator_rectangular_dot_distance), dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return true;
    }

    public void setPageCount(int i) {
        nxc nxcVar = this.state;
        nxcVar.b = i;
        nxcVar.a = i <= 6;
        nxcVar.h = 2.5f;
        nxcVar.g = (i - 1) - 2.5f;
        invalidateSelf();
    }

    public void setPagePosition(float f) {
        this.state.e = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
