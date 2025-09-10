package android.support.wearable.view;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.mo;
import defpackage.mq;
import defpackage.mr;
import defpackage.ms;
import defpackage.mx;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class CircledImageView extends View {
    final RectF a;
    public int b;
    private final Paint c;
    private final ms d;
    private ColorStateList e;
    private Drawable f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private Paint.Cap m;
    private float n;
    private float o;
    private boolean p;
    private final mx q;
    private float r;
    private float s;
    private Integer t;
    private Integer u;
    private final Drawable.Callback v;

    static {
        new ArgbEvaluator();
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    private final void d() {
        int colorForState = this.e.getColorForState(getDrawableState(), this.e.getDefaultColor());
        if (colorForState != this.b) {
            this.b = colorForState;
            invalidate();
        }
    }

    public final float a() {
        float fMax = this.g;
        if (fMax <= 0.0f && this.h > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.h;
        }
        return fMax - this.k;
    }

    public final float b() {
        float fMax = this.i;
        if (fMax <= 0.0f && this.j > 0.0f) {
            fMax = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.j;
        }
        return fMax - this.k;
    }

    public final void c() {
        mx mxVar = this.q;
        if (mxVar != null) {
            mxVar.a.cancel();
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        d();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float fB = this.p ? b() : a();
        getAlpha();
        RectF rectF = this.a;
        rectF.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        rectF.set(rectF.centerX() - fB, rectF.centerY() - fB, rectF.centerX() + fB, rectF.centerY() + fB);
        if (this.n > 0.0f) {
            Paint paint = this.c;
            paint.setColor(this.l);
            paint.setAlpha(Math.round(paint.getAlpha() * getAlpha()));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.n);
            paint.setStrokeCap(this.m);
            canvas2 = canvas;
            canvas2.drawArc(rectF, -90.0f, this.o * 360.0f, false, paint);
        } else {
            canvas2 = canvas;
        }
        Paint paint2 = this.c;
        paint2.setColor(this.b);
        paint2.setAlpha(Math.round(paint2.getAlpha() * getAlpha()));
        paint2.setStyle(Paint.Style.FILL);
        canvas2.drawCircle(rectF.centerX(), rectF.centerY(), fB, paint2);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.t;
            if (num != null) {
                this.f.setTint(num.intValue());
            }
            this.f.draw(canvas2);
        }
        super.onDraw(canvas2);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable = this.f;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = this.r;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            float f2 = intrinsicWidth;
            float f3 = intrinsicHeight;
            float fMin = Math.min(1.0f, Math.min(f2 != 0.0f ? (measuredWidth * f) / f2 : 1.0f, f3 != 0.0f ? (f * measuredHeight) / f3 : 1.0f));
            int iRound = Math.round(f2 * fMin);
            int iRound2 = Math.round(fMin * f3);
            int iRound3 = ((measuredWidth - iRound) / 2) + Math.round(this.s * iRound);
            int i5 = (measuredHeight - iRound2) / 2;
            this.f.setBounds(iRound3, i5, iRound + iRound3, iRound2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float fA = a() + this.n;
        ms msVar = this.d;
        float f = msVar.a;
        float f2 = msVar.b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float f3 = fA + (f * 0.0f);
        if (mode != 1073741824) {
            float f4 = f3 + f3;
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f4, size) : (int) f4;
        }
        if (mode2 != 1073741824) {
            float f5 = f3 + f3;
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f5, size2) : (int) f5;
        }
        Integer num = this.u;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                size = size2;
            } else if (iIntValue == 2) {
                size2 = size;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected final boolean onSetAlpha(int i) {
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        this.d.a(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        c();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        c();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i2 != getPaddingTop() || i3 != getPaddingRight() || i4 != getPaddingBottom()) {
            this.d.a(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z != this.p) {
            this.p = z;
            ms msVar = this.d;
            msVar.c = z ? b() : a();
            msVar.b();
            invalidate();
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Rect();
        this.o = 1.0f;
        this.p = false;
        this.r = 1.0f;
        this.s = 0.0f;
        mq mqVar = new mq(this);
        this.v = mqVar;
        int i2 = mr.a;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mo.c);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f = drawable;
        if (drawable != null && drawable.getConstantState() != null) {
            Drawable drawableNewDrawable = this.f.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f = drawableNewDrawable;
            this.f = drawableNewDrawable.mutate();
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(13);
        this.e = colorStateList;
        if (colorStateList == null) {
            this.e = ColorStateList.valueOf(R.color.darker_gray);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(15, 0.0f);
        this.g = dimension;
        this.i = typedArrayObtainStyledAttributes.getDimension(17, dimension);
        this.l = typedArrayObtainStyledAttributes.getColor(11, -16777216);
        this.m = Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(10, 0)];
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, 0.0f);
        this.n = dimension2;
        if (dimension2 > 0.0f) {
            this.k += dimension2 / 2.0f;
        }
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(14, 0.0f);
        if (dimension3 > 0.0f) {
            this.k += dimension3;
        }
        this.r = typedArrayObtainStyledAttributes.getFloat(20, 0.0f);
        this.s = typedArrayObtainStyledAttributes.getFloat(21, 0.0f);
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.t = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(22, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(28)) {
            this.u = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(28, 0));
        }
        float fraction = typedArrayObtainStyledAttributes.getFraction(16, 1, 1, 0.0f);
        this.h = fraction;
        this.j = typedArrayObtainStyledAttributes.getFraction(18, 1, 1, fraction);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(27, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.a = new RectF();
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        this.d = new ms(dimension4, a(), this.n);
        mx mxVar = new mx();
        this.q = mxVar;
        mxVar.setCallback(mqVar);
        setWillNotDraw(false);
        d();
    }
}
