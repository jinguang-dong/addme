package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class mu extends View {
    private static final double f = Math.sqrt(2.0d);
    public final ShapeDrawable a;
    public ColorStateList b;
    public Drawable c;
    public int d;
    public int e;
    private RippleDrawable g;
    private final Interpolator h;

    public mu(Context context) {
        super(context, null, 0, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.a = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable(shapeDrawable);
        setOutlineProvider(new mt(this));
        this.h = new AccelerateInterpolator(2.0f);
        this.e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, mo.d, 0, 0);
        boolean z = true;
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.b = typedArrayObtainStyledAttributes.getColorStateList(2);
                this.a.getPaint().setColor(this.b.getDefaultColor());
            } else if (index == 1) {
                this.c = typedArrayObtainStyledAttributes.getDrawable(1);
            } else if (index == 5) {
                b(typedArrayObtainStyledAttributes.getColor(5, -1));
            } else if (index == 7) {
                a(typedArrayObtainStyledAttributes.getDimension(7, 0.0f));
            } else if (index == 6) {
                this.e = typedArrayObtainStyledAttributes.getInt(6, this.e);
            } else if (index == 0) {
                z = typedArrayObtainStyledAttributes.getBoolean(0, z);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setClickable(z);
    }

    private static boolean c(Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }

    private final void d(Animator animator) {
        animator.setInterpolator(this.h);
    }

    public final void a(float f2) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = PRESSED_ENABLED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationZ", f2);
        d(objectAnimatorOfFloat);
        stateListAnimator.addState(iArr, objectAnimatorOfFloat);
        int[] iArr2 = ENABLED_FOCUSED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationZ", f2);
        d(objectAnimatorOfFloat2);
        stateListAnimator.addState(iArr2, objectAnimatorOfFloat2);
        int[] iArr3 = EMPTY_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "translationZ", getElevation());
        d(objectAnimatorOfFloat3);
        stateListAnimator.addState(iArr3, objectAnimatorOfFloat3);
        setStateListAnimator(stateListAnimator);
    }

    public final void b(int i) {
        RippleDrawable rippleDrawable = this.g;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
            return;
        }
        if (i == -1 || isInEditMode()) {
            this.g = null;
            super.setBackgroundDrawable(this.a);
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ShapeDrawable shapeDrawable = this.a;
        RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateListValueOf, shapeDrawable, shapeDrawable);
        this.g = rippleDrawable2;
        super.setBackgroundDrawable(rippleDrawable2);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        ShapeDrawable shapeDrawable = this.a;
        shapeDrawable.getPaint().setColor(this.b.getColorForState(getDrawableState(), this.b.getDefaultColor()));
        shapeDrawable.invalidateSelf();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = this.c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.c.getIntrinsicHeight();
            if (this.e != 0 && c(this.c)) {
                int i7 = (int) (((i3 - i) - intrinsicWidth) / 2.0f);
                int i8 = (int) (((i4 - i2) - intrinsicHeight) / 2.0f);
                this.c.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
                return;
            }
            int iFloor = (int) Math.floor((this.d / 2) * f);
            int i9 = (this.d - iFloor) / 2;
            if (!c(this.c)) {
                int i10 = iFloor + i9;
                this.c.setBounds(i9, i9, i10, i10);
                return;
            }
            if (intrinsicWidth == intrinsicHeight) {
                i5 = iFloor;
                i6 = i9;
            } else {
                float f2 = iFloor;
                float f3 = intrinsicWidth / intrinsicHeight;
                if (intrinsicWidth > intrinsicHeight) {
                    i5 = (int) (f2 / f3);
                    i6 = (int) ((iFloor - i5) / 2.0f);
                } else {
                    int i11 = (int) (f2 * f3);
                    int i12 = (int) ((iFloor - i11) / 2.0f);
                    iFloor = i11;
                    i5 = iFloor;
                    i6 = i9;
                    i9 = i12;
                }
            }
            this.c.setBounds(i9, i6, iFloor + i9, i5 + i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L1f
            if (r1 != r2) goto L1e
            int r6 = java.lang.Math.min(r6, r7)
            r5.d = r6
            goto L7e
        L1e:
            r0 = r2
        L1f:
            if (r0 != r2) goto L24
            r5.d = r6
            goto L7e
        L24:
            if (r1 != r2) goto L2a
            r5.d = r7
            r6 = r7
            goto L7e
        L2a:
            android.graphics.drawable.Drawable r2 = r5.c
            boolean r2 = c(r2)
            if (r2 == 0) goto L43
            android.graphics.drawable.Drawable r2 = r5.c
            int r2 = r2.getIntrinsicHeight()
            android.graphics.drawable.Drawable r3 = r5.c
            int r3 = r3.getIntrinsicWidth()
            int r2 = java.lang.Math.max(r2, r3)
            goto L58
        L43:
            android.content.res.Resources r2 = r5.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1
            r4 = 1111490560(0x42400000, float:48.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r4, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
        L58:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto L63
            if (r1 != r3) goto L5f
            goto L63
        L5f:
            r5.d = r2
            r6 = r2
            goto L7e
        L63:
            if (r0 == r3) goto L67
            r6 = r7
            goto L6e
        L67:
            if (r1 == r3) goto L6a
            goto L6e
        L6a:
            int r6 = java.lang.Math.min(r6, r7)
        L6e:
            double r0 = (double) r2
            double r2 = defpackage.mu.f
            double r0 = r0 / r2
            double r0 = java.lang.Math.floor(r0)
            int r7 = (int) r0
            int r7 = r7 + r7
            int r6 = java.lang.Math.min(r6, r7)
            r5.d = r6
        L7e:
            r5.setMeasuredDimension(r6, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!zOnTouchEvent || (motionEvent.getAction() & 255) != 0) {
            return zOnTouchEvent;
        }
        getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }
}
