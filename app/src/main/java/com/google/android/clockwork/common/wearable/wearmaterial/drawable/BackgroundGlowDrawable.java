package com.google.android.clockwork.common.wearable.wearmaterial.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackgroundGlowDrawable extends Drawable {
    private Drawable gradient;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iMin = Math.min(getBounds().width(), getBounds().height());
        int iWidth = (getBounds().width() - iMin) / 2;
        int iHeight = (getBounds().height() - iMin) / 2;
        this.gradient.setBounds(iWidth, iHeight, iWidth + iMin, iMin + iHeight);
        this.gradient.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.gradient.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.gradient;
        return drawable != null ? drawable.getColorFilter() : super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.gradient.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        this.gradient = resources.getDrawable(R.drawable.wear_blurred_background_glow_gradient, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.gradient.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.gradient;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.gradient;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.gradient;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }
}
