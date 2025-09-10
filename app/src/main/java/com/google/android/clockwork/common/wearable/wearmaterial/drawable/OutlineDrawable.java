package com.google.android.clockwork.common.wearable.wearmaterial.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.nwi;
import defpackage.nwj;
import defpackage.nwk;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OutlineDrawable extends Drawable {
    private int alpha;
    private final Paint backgroundPaint;
    private ColorFilter colorFilter;
    private nwi constantState;
    private boolean isMutated;
    private PorterDuffColorFilter tintColorFilter;

    public /* synthetic */ OutlineDrawable(nwi nwiVar, nwj nwjVar) {
        this(nwiVar);
    }

    private void initFromResources(Resources resources) {
        this.constantState.a = resources.getDimensionPixelSize(R.dimen.wear_button_outline_stroke_width);
        this.constantState.b = resources.getColor(R.color.wear_material_gray_900, null);
    }

    private void updateTintFilter() {
        nwi nwiVar = this.constantState;
        PorterDuff.Mode mode = nwiVar.e;
        ColorStateList colorStateList = nwiVar.d;
        if (colorStateList == null || mode == null) {
            this.tintColorFilter = null;
        } else {
            this.tintColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fMin;
        int iWidth = getBounds().width();
        float fHeight = getBounds().height();
        this.backgroundPaint.setColor(this.constantState.b);
        this.backgroundPaint.setAlpha(this.alpha);
        int i = this.constantState.a;
        this.backgroundPaint.setStrokeWidth(i + i);
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter == null) {
            colorFilter = this.tintColorFilter;
        }
        this.backgroundPaint.setColorFilter(colorFilter);
        int i2 = this.constantState.c;
        if (i2 == 0) {
            fMin = fHeight / 2.0f;
        } else {
            fMin = Math.min(i2, fHeight / 2.0f);
        }
        float f = fMin;
        canvas.save();
        canvas.drawRoundRect(0.0f, 0.0f, iWidth, fHeight, f, f, this.backgroundPaint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.constantState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        initFromResources(resources);
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, nwk.a);
        this.constantState.c = typedArrayObtainAttributes.getDimensionPixelSize(1, 0);
        nwi nwiVar = this.constantState;
        nwiVar.b = typedArrayObtainAttributes.getColor(0, nwiVar.b);
        typedArrayObtainAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.constantState.d;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.isMutated) {
            this.constantState = new nwi(this.constantState);
            this.isMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        nwi nwiVar = this.constantState;
        if (nwiVar.e == null || nwiVar.d == null) {
            return false;
        }
        updateTintFilter();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        invalidateSelf();
    }

    public void setCornerRadius(int i) {
        this.constantState.c = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.constantState.d = colorStateList;
        updateTintFilter();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.constantState.e = mode;
        updateTintFilter();
        invalidateSelf();
    }

    public OutlineDrawable() {
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.isMutated = false;
        this.alpha = 255;
        this.constantState = new nwi();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    private OutlineDrawable(nwi nwiVar) {
        this();
        this.constantState = nwiVar;
    }
}
