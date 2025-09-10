package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import defpackage.clc;
import defpackage.cmg;
import defpackage.nxu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PickerVignetteDrawable extends DrawableWrapper {
    private static final int DEFAULT_VIGNETTE_COLOR = -16777216;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private final Rect endGradientRect;
    private int endOfClearArea;
    private final int[] gradientColors;
    private final GradientDrawable gradientDrawable;
    private boolean isVertical;
    private final Rect startGradientRect;
    private int startOfClearArea;
    private int vignetteAlpha;
    private ColorStateList vignetteColor;

    public PickerVignetteDrawable() {
        super(null);
        int[] iArr = new int[2];
        this.gradientColors = iArr;
        this.startGradientRect = new Rect();
        this.endGradientRect = new Rect();
        this.startOfClearArea = -1;
        this.endOfClearArea = -1;
        this.isVertical = true;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        gradientDrawable.setColors(iArr);
        setDrawable(gradientDrawable);
    }

    public static PickerVignetteDrawable create(int i) {
        PickerVignetteDrawable pickerVignetteDrawable = new PickerVignetteDrawable();
        pickerVignetteDrawable.initialize(i);
        return pickerVignetteDrawable;
    }

    private void determineEndGradientColor() {
        this.gradientColors[1] = cmg.e(this.gradientColors[0], this.vignetteAlpha);
    }

    private void ensureClearArea(int i) {
        if (this.startOfClearArea < 0) {
            this.startOfClearArea = i;
        }
        if (this.endOfClearArea < 0) {
            this.endOfClearArea = i;
        }
    }

    private boolean handleColorChange(int[] iArr) {
        int colorForState = getVignetteColor().getColorForState(iArr, DEFAULT_VIGNETTE_COLOR);
        int[] iArr2 = this.gradientColors;
        int i = iArr2[0];
        if (i != 0 && i == colorForState) {
            return false;
        }
        iArr2[0] = colorForState;
        determineEndGradientColor();
        setColors();
        return true;
    }

    private void initialize(int i) {
        this.isVertical = i == 1;
        setVignetteColor(ColorStateList.valueOf(DEFAULT_VIGNETTE_COLOR));
    }

    private void setColors() {
        this.gradientDrawable.mutate();
        this.gradientDrawable.setColors(this.gradientColors);
    }

    private void updateGradientRectsForClearArea(Rect rect) {
        if (rect.isEmpty()) {
            return;
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (this.isVertical) {
            ensureClearArea((i2 + i4) / 2);
            this.startGradientRect.set(i, i2, i3, clc.D(this.startOfClearArea, i2, i4));
            this.endGradientRect.set(i, clc.D(this.endOfClearArea, i2, i4), i3, i4);
        } else {
            ensureClearArea((i + i3) / 2);
            this.startGradientRect.set(i, i2, clc.D(this.startOfClearArea, i, i3), i4);
            this.endGradientRect.set(clc.D(this.endOfClearArea, i, i3), i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.startGradientRect.isEmpty() && this.endGradientRect.isEmpty()) {
            return;
        }
        if (!this.startGradientRect.isEmpty()) {
            this.gradientDrawable.setOrientation(this.isVertical ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.LEFT_RIGHT);
            this.gradientDrawable.setBounds(this.startGradientRect);
            this.gradientDrawable.draw(canvas);
        }
        if (this.endGradientRect.isEmpty()) {
            return;
        }
        this.gradientDrawable.setOrientation(this.isVertical ? GradientDrawable.Orientation.BOTTOM_TOP : GradientDrawable.Orientation.RIGHT_LEFT);
        this.gradientDrawable.setBounds(this.endGradientRect);
        this.gradientDrawable.draw(canvas);
    }

    Rect getEndGradientRect() {
        return this.endGradientRect;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int getOrientation() {
        return this.isVertical ? 1 : 0;
    }

    Rect getStartGradientRect() {
        return this.startGradientRect;
    }

    public int getVignetteAlpha() {
        return this.vignetteAlpha;
    }

    public ColorStateList getVignetteColor() {
        if (this.vignetteColor == null) {
            this.vignetteColor = ColorStateList.valueOf(DEFAULT_VIGNETTE_COLOR);
        }
        return this.vignetteColor;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, nxu.b, 0, 0) : resources.obtainAttributes(attributeSet, nxu.b);
        this.isVertical = typedArrayObtainStyledAttributes.getInt(0, 1) == 1;
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            setVignetteColor(colorStateList);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (drawable == this.gradientDrawable || (callback = getCallback()) == null) {
            return;
        }
        callback.invalidateDrawable(drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return getVignetteColor().isStateful();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateGradientRectsForClearArea(rect);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr) || handleColorChange(iArr);
    }

    public void setClearArea(int i, int i2) {
        if (this.startOfClearArea == i && this.endOfClearArea == i2) {
            return;
        }
        this.startOfClearArea = i;
        this.endOfClearArea = i2;
        updateGradientRectsForClearArea(getBounds());
        invalidateSelf();
    }

    public void setVignetteAlpha(int i) {
        this.vignetteAlpha = i;
        if (this.gradientColors[0] != 0) {
            determineEndGradientColor();
        }
        setColors();
        invalidateSelf();
    }

    public void setVignetteColor(ColorStateList colorStateList) {
        this.vignetteColor = colorStateList;
        handleColorChange(getState());
        invalidateSelf();
    }
}
