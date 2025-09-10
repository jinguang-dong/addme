package com.google.android.clockwork.common.wearable.wearmaterial.util;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import defpackage.cnh;
import defpackage.nyu;
import defpackage.nyx;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BlendContentDrawable extends DrawableWrapper {
    private nyu blendMode;
    private final Paint contentPaint;
    private cnh contentProvider;
    private final Paint drawablePaint;
    private final RectF tmpRectF;

    public BlendContentDrawable() {
        super(null);
        Paint paint = new Paint();
        this.contentPaint = paint;
        Paint paint2 = new Paint();
        this.drawablePaint = paint2;
        this.tmpRectF = new RectF();
        this.blendMode = nyu.NONE;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    }

    public static BlendContentDrawable create(Drawable drawable) {
        return create(drawable, nyu.NONE);
    }

    private void drawWithAlphaBlending(Canvas canvas, cnh cnhVar) {
        this.tmpRectF.set(getBounds());
        int iSaveLayer = canvas.saveLayer(this.tmpRectF, this.contentPaint);
        cnhVar.accept(canvas);
        int iSaveLayer2 = canvas.saveLayer(this.tmpRectF, this.drawablePaint);
        super.draw(canvas);
        canvas.restoreToCount(iSaveLayer2);
        canvas.restoreToCount(iSaveLayer);
    }

    private void initialize(Drawable drawable, nyu nyuVar) {
        setDrawable(drawable);
        setBlendMode(nyuVar);
    }

    private boolean useAlphaChannelBlending() {
        return this.blendMode != nyu.NONE;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        cnh cnhVar = this.contentProvider;
        if (cnhVar != null) {
            draw(canvas, cnhVar);
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
        if (useAlphaChannelBlending()) {
            return -3;
        }
        return super.getOpacity();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, nyx.a, 0, 0) : resources.obtainAttributes(attributeSet, nyx.a);
        setDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        int i = typedArrayObtainStyledAttributes.getInt(1, 0);
        setBlendMode(i != 1 ? i != 2 ? nyu.NONE : nyu.ALPHA : nyu.COLOR);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setBlendMode(nyu nyuVar) {
        this.blendMode = nyuVar;
        nyu nyuVar2 = nyu.NONE;
        this.drawablePaint.setXfermode(new PorterDuffXfermode(nyuVar.d));
    }

    public void setContentProvider(cnh cnhVar) {
        if (this.contentProvider == null) {
            this.contentProvider = cnhVar;
        }
    }

    public static BlendContentDrawable create(Drawable drawable, nyu nyuVar) {
        BlendContentDrawable blendContentDrawable = new BlendContentDrawable();
        blendContentDrawable.initialize(drawable, nyuVar);
        return blendContentDrawable;
    }

    private void draw(Canvas canvas, cnh cnhVar) {
        if (useAlphaChannelBlending()) {
            drawWithAlphaBlending(canvas, cnhVar);
        } else {
            cnhVar.accept(canvas);
            super.draw(canvas);
        }
    }
}
