package android.support.v7.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.a;
import defpackage.byi;
import defpackage.byz;
import defpackage.cok;
import defpackage.col;
import defpackage.com;
import defpackage.con;
import defpackage.ctq;
import defpackage.cty;
import defpackage.fa;
import defpackage.fd;
import defpackage.in;
import defpackage.je;
import defpackage.lv;
import defpackage.lw;
import defpackage.pfl;
import defpackage.pmg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property m = new lv(Float.class);
    private static final int[] n = {R.attr.state_checked};
    private float A;
    private float B;
    private VelocityTracker C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final in Q;
    private final Rect R;
    private byz S;
    public Drawable a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public int i;
    public float j;
    public boolean k;
    ObjectAnimator l;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private CharSequence w;
    private boolean x;
    private int y;
    private int z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int i() {
        return (int) (((byi.bF(this) ? 1.0f - this.j : this.j) * j()) + 0.5f);
    }

    private final int j() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectA = drawable2 != null ? je.a(drawable2) : je.a;
        return ((((this.E - this.G) - rect.left) - rect.right) - rectA.left) - rectA.right;
    }

    private final Layout k(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.L, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.L)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence l(CharSequence charSequence) {
        Object obj = o().a;
        TransformationMethod transformationMethod = this.P;
        cty.e();
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    private final void m() {
        if (((cty) ((pfl) this.S.a).a).a.a) {
            ctq ctqVar = ctq.a;
        }
    }

    private final boolean n() {
        return this.j > 0.5f;
    }

    private final byz o() {
        if (this.S == null) {
            this.S = new byz((TextView) this);
        }
        return this.S;
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.o) {
                    this.a.setTintMode(this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.p) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.p) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        CharSequence string = this.v;
        if (string == null) {
            string = getResources().getString(com.google.ar.core.R.string.abc_capital_off);
        }
        int[] iArr = con.a;
        com.c(this, string);
    }

    public final void d() {
        CharSequence string = this.t;
        if (string == null) {
            string = getResources().getString(com.google.ar.core.R.string.abc_capital_on);
        }
        int[] iArr = con.a;
        com.c(this, string);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.H;
        int i4 = this.I;
        int i5 = this.J;
        int i6 = this.K;
        int i7 = i() + i3;
        Drawable drawable = this.a;
        Rect rectA = drawable != null ? je.a(drawable) : je.a;
        Rect rect = this.R;
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 += rect.left;
            if (rectA != null) {
                if (rectA.left > rect.left) {
                    i3 += rectA.left - rect.left;
                }
                i = rectA.top > rect.top ? (rectA.top - rect.top) + i4 : i4;
                if (rectA.right > rect.right) {
                    i5 -= rectA.right - rect.right;
                }
                if (rectA.bottom > rect.bottom) {
                    i2 = i6 - (rectA.bottom - rect.bottom);
                }
                this.e.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.e.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i8 = i7 - rect.left;
            int i9 = i7 + this.G + rect.right;
            this.a.setBounds(i8, i4, i9, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i8, i4, i9, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(Typeface typeface) {
        TextPaint textPaint = this.L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void f(CharSequence charSequence) {
        this.v = charSequence;
        this.w = l(charSequence);
        this.O = null;
        if (this.x) {
            m();
        }
    }

    public final void g(CharSequence charSequence) {
        this.t = charSequence;
        this.u = l(charSequence);
        this.N = null;
        if (this.x) {
            m();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!byi.bF(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (byi.bF(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        cok.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    public final void h(float f) {
        this.j = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.l.end();
        this.l = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.e;
        Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.I;
        int i2 = this.K;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectA = je.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectA.left;
                rect.right -= rectA.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = n() ? this.N : this.O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Rect rect = this.R;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectA = je.a(this.a);
            iMax = Math.max(0, rectA.left - rect.left);
            iMax2 = Math.max(0, rectA.right - rect.right);
        } else {
            iMax = 0;
        }
        if (byi.bF(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.E + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.E) + iMax + iMax2;
        }
        int gravity = getGravity() & ScriptIntrinsicBLAS.TRANSPOSE;
        if (gravity == 16) {
            int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
            i5 = this.F;
            paddingTop = (paddingTop2 / 2) - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.F;
                this.H = paddingLeft;
                this.I = paddingTop;
                this.K = height;
                this.J = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.F;
        }
        height = i5 + paddingTop;
        this.H = paddingLeft;
        this.I = paddingTop;
        this.K = height;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        int iMax;
        if (this.x) {
            if (this.N == null) {
                this.N = k(this.u);
            }
            if (this.O == null) {
                this.O = k(this.w);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.x) {
            int iMax2 = Math.max(this.N.getWidth(), this.O.getWidth());
            int i4 = this.q;
            i3 = iMax2 + i4 + i4;
        } else {
            i3 = 0;
        }
        this.G = Math.max(i3, intrinsicWidth);
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.e.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectA = je.a(drawable3);
            iMax3 = Math.max(iMax3, rectA.left);
            iMax4 = Math.max(iMax4, rectA.right);
        }
        if (this.k) {
            int i5 = this.i;
            int i6 = this.G;
            iMax = Math.max(i5, i6 + i6 + iMax3 + iMax4);
        } else {
            iMax = this.i;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.E = iMax;
        this.F = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        o();
        cty.e();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            d();
        } else {
            c();
        }
        float f = true != zIsChecked ? 0.0f : 1.0f;
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.l;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            h(f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) m, f);
        this.l = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.l.setAutoCancel(true);
        this.l.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        o();
        cty.e();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.e;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.ar.core.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.o = false;
        this.f = null;
        this.g = null;
        this.h = false;
        this.p = false;
        this.C = VelocityTracker.obtain();
        this.k = true;
        this.R = new Rect();
        lw.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = fa.v;
        pmg pmgVarJ = pmg.J(context, attributeSet, iArr, i, 0);
        Object obj = pmgVarJ.b;
        int[] iArr2 = con.a;
        col.b(this, context, iArr, attributeSet, (TypedArray) obj, i, 0);
        Drawable drawableZ = pmgVarJ.z(2);
        this.a = drawableZ;
        if (drawableZ != null) {
            drawableZ.setCallback(this);
        }
        Drawable drawableZ2 = pmgVarJ.z(11);
        this.e = drawableZ2;
        if (drawableZ2 != null) {
            drawableZ2.setCallback(this);
        }
        g(pmgVarJ.B(0));
        f(pmgVarJ.B(1));
        this.x = pmgVarJ.E(3, true);
        this.q = pmgVarJ.t(8, 0);
        this.i = pmgVarJ.t(5, 0);
        this.r = pmgVarJ.t(6, 0);
        this.s = pmgVarJ.E(4, false);
        ColorStateList colorStateListY = pmgVarJ.y(9);
        if (colorStateListY != null) {
            this.b = colorStateListY;
            this.d = true;
        }
        int iU = pmgVarJ.u(10, -1);
        Rect rect = je.a;
        PorterDuff.Mode modeN = a.n(iU, null);
        if (this.c != modeN) {
            this.c = modeN;
            this.o = true;
        }
        if (this.d || this.o) {
            a();
        }
        ColorStateList colorStateListY2 = pmgVarJ.y(12);
        if (colorStateListY2 != null) {
            this.f = colorStateListY2;
            this.h = true;
        }
        PorterDuff.Mode modeN2 = a.n(pmgVarJ.u(13, -1), null);
        if (this.g != modeN2) {
            this.g = modeN2;
            this.p = true;
        }
        if (this.h || this.p) {
            b();
        }
        int iX = pmgVarJ.x(7, 0);
        if (iX != 0) {
            pmg pmgVarH = pmg.H(context, iX, fa.w);
            ColorStateList colorStateListY3 = pmgVarH.y(3);
            if (colorStateListY3 != null) {
                this.M = colorStateListY3;
            } else {
                this.M = getTextColors();
            }
            int iT = pmgVarH.t(0, 0);
            if (iT != 0) {
                float f = iT;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iU2 = pmgVarH.u(1, -1);
            int iU3 = pmgVarH.u(2, -1);
            if (iU2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iU2 != 2) {
                typeface = iU2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (iU3 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(iU3);
                } else {
                    typefaceCreate = Typeface.create(typeface, iU3);
                }
                e(typefaceCreate);
                int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & iU3;
                textPaint.setFakeBoldText(1 == (i2 & 1));
                textPaint.setTextSkewX((2 & i2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                e(typeface);
            }
            if (pmgVarH.E(17, false)) {
                this.P = new fd(getContext());
            } else {
                this.P = null;
            }
            g(this.t);
            f(this.v);
            pmgVarH.D();
        }
        in inVar = new in(this);
        this.Q = inVar;
        inVar.c(attributeSet, i);
        pmgVarJ.D();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        o().G(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
