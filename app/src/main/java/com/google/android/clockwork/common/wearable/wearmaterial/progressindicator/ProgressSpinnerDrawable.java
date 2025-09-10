package com.google.android.clockwork.common.wearable.wearmaterial.progressindicator;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import defpackage.clc;
import defpackage.nyb;
import defpackage.nyc;
import defpackage.nyd;
import defpackage.nye;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProgressSpinnerDrawable extends Drawable {
    private static final int DEFAULT_PROGRESS_COLOR = -1;
    private static final int DEFAULT_TRACK_COLOR = 452984831;
    private static final float DEFAULT_TRACK_WIDTH_DP = 3.0f;
    private static final float DEGREES_PER_RADIAN = 57.295776f;
    private static final int LEVEL_RANGE = 10000;
    private static final float MAX_DEGREES = 360.0f;
    private static final float START_OFFSET = 270.0f;
    private static final float TINY_SWEEP_ANGLE_SIZE = 0.01f;
    private static final int TRACK_ALPHA = 26;
    private float capRadiusInDegrees;
    private final Paint paintProgress;
    private final Paint paintTrack;
    private float rotation;
    private boolean showEmptySweepAngle;
    private float startAngle;
    private float sweepAngle;
    private ColorStateList trackColor;
    private float trackStartAngle;
    private float trackWidth;
    private final nye typedArrayHelper;
    private final nyc themeState = new nyc(this);
    private ColorStateList progressColor = ColorStateList.valueOf(-1);
    private int gravity = 17;
    private nyb direction = nyb.CLOCKWISE;
    private float trackEndAngle = MAX_DEGREES;
    private final Rect destSquare = new Rect();

    public ProgressSpinnerDrawable() {
        Paint paint = new Paint();
        this.paintProgress = paint;
        Paint paint2 = new Paint();
        this.paintTrack = paint2;
        this.typedArrayHelper = new nye(nyd.a);
        this.trackWidth = Resources.getSystem().getDisplayMetrics().density * DEFAULT_TRACK_WIDTH_DP;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.trackWidth);
        paint.setColor(this.progressColor.getDefaultColor());
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.trackWidth);
        paint2.setColor(this.progressColor.getDefaultColor());
    }

    private void applyGravity(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        Gravity.apply(this.gravity, iMin, iMin, rect, this.destSquare);
    }

    private float getArcRadius() {
        float fWidth = this.destSquare.width();
        float f = this.trackWidth;
        return Math.max(fWidth - f, f) / 2.0f;
    }

    private void obtainAttributes(TypedArray typedArray) {
        obtainThemedAttributes(typedArray);
        int[] iArr = nyd.a;
        setTrackWidth(typedArray.getDimension(11, this.paintTrack.getStrokeWidth()));
        setTrackStartAngle(typedArray.getFloat(10, this.trackStartAngle));
        setTrackEndAngle(typedArray.getFloat(9, this.trackEndAngle));
        setDirection(typedArray.getInt(3, this.direction.c) == 1 ? nyb.COUNTER_CLOCKWISE : nyb.CLOCKWISE);
        showEmptySweepAngle(typedArray.getBoolean(2, this.showEmptySweepAngle));
        setStartAngle(typedArray.getFloat(6, this.startAngle));
        setSweepAngle(typedArray.getFloat(7, this.sweepAngle));
        setLevel(typedArray.getInt(1, getLevel()));
        setRotation(typedArray.getFloat(5, this.rotation));
        setGravity(typedArray.getInt(0, this.gravity));
    }

    private void obtainThemedAttributes(TypedArray typedArray) {
        int[] iArr = nyd.a;
        if (nye.a(typedArray, 4)) {
            this.themeState.a = typedArray.getColorStateList(4);
        }
        if (nye.a(typedArray, 8)) {
            this.themeState.b = typedArray.getColorStateList(8);
        }
    }

    private void updateBounds(Rect rect) {
        applyGravity(rect);
        updateCapRadius();
        updateProgressPaint();
    }

    private void updateCapRadius() {
        this.capRadiusInDegrees = (this.trackWidth / getArcRadius()) * DEGREES_PER_RADIAN;
    }

    private boolean updateColors(int[] iArr) {
        int colorForState = this.progressColor.getColorForState(iArr, -1);
        boolean z = colorForState != this.paintProgress.getColor();
        if (z) {
            this.paintProgress.setColor(colorForState);
        }
        ColorStateList colorStateListWithAlpha = this.trackColor;
        if (colorStateListWithAlpha == null) {
            colorStateListWithAlpha = this.progressColor.withAlpha(TRACK_ALPHA);
        }
        int colorForState2 = colorStateListWithAlpha.getColorForState(iArr, DEFAULT_TRACK_COLOR);
        boolean z2 = colorForState2 != this.paintTrack.getColor();
        if (z2) {
            this.paintTrack.setColor(colorForState2);
        }
        return z || z2;
    }

    private void updateProgressPaint() {
        this.paintProgress.setStrokeWidth((this.showEmptySweepAngle ? 1.0f : Math.min(1.0f, ((this.sweepAngle * getArcRadius()) / DEGREES_PER_RADIAN) / this.trackWidth)) * this.trackWidth);
    }

    private void updateTrackCap() {
        this.paintTrack.setStrokeCap(getMaximumSweepAngle() == MAX_DEGREES ? Paint.Cap.BUTT : Paint.Cap.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(this.typedArrayHelper.b);
        obtainThemedAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.themeState.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.typedArrayHelper.c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        if (!isVisible() || this.destSquare.isEmpty()) {
            return;
        }
        float f4 = this.sweepAngle;
        float f5 = this.capRadiusInDegrees;
        float fMin = TINY_SWEEP_ANGLE_SIZE;
        if (f4 > f5 || !this.showEmptySweepAngle) {
            if (f4 == 0.0f) {
                fMin = 0.0f;
            } else if (f4 > f5) {
                float f6 = f4 - f5;
                fMin = f6 + ((this.sweepAngle - f6) * Math.min(f6 / (MAX_DEGREES - f5), 1.0f));
            }
            if (this.direction != nyb.CLOCKWISE) {
                f = (this.trackEndAngle - this.startAngle) - fMin;
                draw(canvas, f + START_OFFSET, fMin);
            } else {
                f2 = this.trackStartAngle;
                f3 = this.startAngle;
            }
        } else {
            f2 = this.trackStartAngle + this.startAngle;
            f3 = -0.005f;
        }
        f = f2 + f3;
        draw(canvas, f + START_OFFSET, fMin);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.paintProgress.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.paintProgress.getColorFilter();
    }

    public float getMaximumSweepAngle() {
        return Math.abs(this.trackEndAngle - this.trackStartAngle);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public Insets getOpticalInsets() {
        Rect rect = this.destSquare;
        Rect bounds = getBounds();
        return Insets.of(rect.left - bounds.left, this.destSquare.top - bounds.top, bounds.right - this.destSquare.right, bounds.bottom - this.destSquare.bottom);
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    public float getSweepAngle() {
        return this.sweepAngle;
    }

    public float getTrackStartAngle() {
        return this.trackStartAngle;
    }

    public float getTrackWidth() {
        return this.trackWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        nye nyeVar = this.typedArrayHelper;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, nyeVar.a, 0, 0) : resources.obtainAttributes(attributeSet, nyeVar.a);
        TypedValue typedValue = new TypedValue();
        for (int i = 0; i < 12; i++) {
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.getValue(i, typedValue);
                if (typedValue.type == 2) {
                    nyeVar.b[i] = typedValue.data;
                    nyeVar.c = true;
                }
            }
        }
        obtainAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        if (this.typedArrayHelper.c) {
            return;
        }
        this.themeState.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.progressColor.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.trackColor;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        updateBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        float fD = (clc.D(Math.abs(i), 0, LEVEL_RANGE) * getMaximumSweepAngle()) / 10000.0f;
        if (this.sweepAngle == fD) {
            return false;
        }
        this.sweepAngle = fD;
        if (!this.showEmptySweepAngle) {
            updateProgressPaint();
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return updateColors(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.paintTrack.getAlpha() != i) {
            this.paintProgress.setAlpha(i);
            this.paintTrack.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paintProgress.setColorFilter(colorFilter);
        this.paintTrack.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(nyb nybVar) {
        if (this.direction != nybVar) {
            this.direction = nybVar;
            invalidateSelf();
        }
    }

    public void setGravity(int i) {
        if (this.gravity != i) {
            this.gravity = i;
            updateBounds(getBounds());
            invalidateSelf();
        }
    }

    public void setProgressColor(ColorStateList colorStateList) {
        this.progressColor = colorStateList;
        if (updateColors(getState())) {
            invalidateSelf();
        }
    }

    public void setRotation(float f) {
        float f2 = this.rotation;
        float f3 = f % MAX_DEGREES;
        if (f2 != f3) {
            this.rotation = f3;
            invalidateSelf();
        }
    }

    public void setStartAngle(float f) {
        float maximumSweepAngle = f % getMaximumSweepAngle();
        if (this.startAngle != maximumSweepAngle) {
            this.startAngle = maximumSweepAngle;
            invalidateSelf();
        }
    }

    public void setSweepAngle(float f) {
        setLevel(Math.round((Math.min(Math.abs(f), getMaximumSweepAngle()) / getMaximumSweepAngle()) * 10000.0f));
    }

    public void setTrackColor(ColorStateList colorStateList) {
        this.trackColor = colorStateList;
        if (updateColors(getState())) {
            invalidateSelf();
        }
    }

    public void setTrackEndAngle(float f) {
        if (this.trackEndAngle != f) {
            this.trackEndAngle = f;
            updateTrackCap();
            invalidateSelf();
        }
    }

    public void setTrackStartAngle(float f) {
        if (this.trackStartAngle != f) {
            this.trackStartAngle = f;
            updateTrackCap();
            invalidateSelf();
        }
    }

    public void setTrackWidth(float f) {
        float fMax = Math.max(0.0f, f);
        if (this.trackWidth == fMax) {
            return;
        }
        this.trackWidth = fMax;
        this.paintTrack.setStrokeWidth(fMax);
        updateCapRadius();
        updateProgressPaint();
        invalidateSelf();
    }

    public void showEmptySweepAngle(boolean z) {
        if (this.showEmptySweepAngle != z) {
            this.showEmptySweepAngle = z;
            updateProgressPaint();
            invalidateSelf();
        }
    }

    private void draw(Canvas canvas, float f, float f2) {
        Rect rect = this.destSquare;
        int saveCount = canvas.getSaveCount();
        canvas.clipRect(rect);
        canvas.translate(this.destSquare.left, this.destSquare.top);
        float fWidth = this.destSquare.width() / 2.0f;
        canvas.rotate(this.rotation, fWidth, fWidth);
        float fCeil = (float) Math.ceil(this.paintTrack.getStrokeWidth() / 2.0f);
        float f3 = this.destSquare.right - fCeil;
        canvas.drawArc(fCeil, fCeil, f3, f3, this.trackStartAngle + START_OFFSET, getMaximumSweepAngle(), false, this.paintTrack);
        canvas.drawArc(fCeil, fCeil, f3, f3, f, f2, false, this.paintProgress);
        canvas.restoreToCount(saveCount);
    }
}
