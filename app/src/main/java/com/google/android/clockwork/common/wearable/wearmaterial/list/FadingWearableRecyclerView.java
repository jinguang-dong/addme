package com.google.android.clockwork.common.wearable.wearmaterial.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import defpackage.ki;
import defpackage.kq;
import defpackage.nhi;
import defpackage.nwd;
import defpackage.nwm;
import defpackage.nwn;
import defpackage.nwo;
import defpackage.nwp;
import defpackage.nwt;
import defpackage.nyf;
import defpackage.nyg;
import defpackage.nyh;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FadingWearableRecyclerView extends RecyclerView {
    private final ViewTreeObserver.OnPreDrawListener aA;
    nyh ae;
    nyg af;
    nyf ag;
    public nwt ah;
    public boolean ai;
    private final Context aj;
    private final int ak;
    private final int al;
    private boolean am;
    private int an;
    private long ao;
    private long ap;
    private Interpolator aq;
    private final Interpolator ar;
    private boolean as;
    private boolean at;
    private int au;
    private int av;
    private float aw;
    private float ax;
    private boolean ay;
    private int az;

    public FadingWearableRecyclerView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void T(int i, int i2) {
        int i3;
        this.ah.e();
        nyf nyfVar = this.ag;
        if (nyfVar != null && nyfVar.b && nyfVar.f && (!nyfVar.a || nyfVar.g)) {
            qaq qaqVar = nyfVar.j;
            boolean z = true;
            if (qaqVar.w(i, i2, true)) {
                i3 = 2;
            } else if (qaqVar.v(i, i2, true)) {
                i3 = 3;
            } else {
                z = false;
                i3 = 1;
            }
            if (z) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = nyfVar.h;
                if (j == 0 || jElapsedRealtime - j > 500 || nyfVar.i != i3) {
                    nyfVar.h = jElapsedRealtime;
                    nyfVar.i = i3;
                    nyfVar.a(20);
                }
            }
        }
        nyg nygVar = this.af;
        if (nygVar == null || !nygVar.e) {
            return;
        }
        RecyclerView recyclerView = nygVar.a;
        Runnable runnable = nygVar.c;
        recyclerView.removeCallbacks(runnable);
        recyclerView.postDelayed(runnable, 80L);
    }

    public final int a(int i) {
        if (getChildAt(i) == null) {
            return 0;
        }
        return getChildAt(i).getHeight();
    }

    public final void aD(int i, int i2) {
        int iMax;
        float f = this.aw;
        if (f == -2.1474836E9f) {
            boolean z = this.at;
            int i3 = true != z ? 0 : i;
            if (true == z) {
                i = i2;
            }
            iMax = Math.max((int) (((getHeight() * 0.5f) - (i * 0.5f)) - i3), 0);
        } else {
            iMax = Math.max((int) (this.al * f), 0);
        }
        float f2 = this.ax;
        int paddingBottom = f2 == -2.1474836E9f ? getPaddingBottom() : Math.max((int) (this.al * f2), 0);
        if (getPaddingTop() == iMax && getPaddingBottom() == paddingBottom) {
            return;
        }
        this.au = getPaddingTop();
        this.av = getPaddingBottom();
        setPadding(getPaddingLeft(), iMax, getPaddingRight(), paddingBottom);
        kq kqVar = this.m;
        if (kqVar != null) {
            View focusedChild = getFocusedChild();
            kqVar.U(focusedChild != null ? kq.bi(focusedChild) : 0);
        }
    }

    public final void aE() {
        ki kiVar = this.l;
        kiVar.getClass();
        kiVar.m(new nwo(this));
        if (getChildCount() <= 0 || !this.as) {
            return;
        }
        if (getChildCount() >= 2 || !this.at) {
            aD(a(0), a(1));
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeVerticalScrollExtent() {
        int iComputeVerticalScrollExtent = super.computeVerticalScrollExtent();
        this.az = iComputeVerticalScrollExtent;
        return iComputeVerticalScrollExtent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeVerticalScrollOffset() {
        int iComputeVerticalScrollOffset = super.computeVerticalScrollOffset();
        return iComputeVerticalScrollOffset > 0 ? (int) ((this.az * 0.0f) + iComputeVerticalScrollOffset) : iComputeVerticalScrollOffset;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.ah.e();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.am) {
            setTranslationY(this.an);
            ViewPropertyAnimator viewPropertyAnimatorWithLayer = animate().withLayer();
            viewPropertyAnimatorWithLayer.translationY(0.0f);
            viewPropertyAnimatorWithLayer.setUpdateListener(new nhi(this, 10));
            viewPropertyAnimatorWithLayer.setStartDelay(this.ao);
            viewPropertyAnimatorWithLayer.setDuration(this.ap);
            viewPropertyAnimatorWithLayer.setInterpolator(this.aq);
            viewPropertyAnimatorWithLayer.start();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(225L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setStartOffset(this.ao);
            alphaAnimation.setInterpolator(this.ar);
            startAnimation(alphaAnimation);
        }
        getViewTreeObserver().addOnPreDrawListener(this.aA);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.aA);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        InputDevice.MotionRange motionRange;
        super.onGenericMotionEvent(motionEvent);
        int i = this.ae.b;
        nyg nygVar = this.af;
        if (nygVar != null) {
            nygVar.e = nygVar.d && motionEvent.getAction() == 8 && (motionEvent.getSource() & 4194304) != 0;
        }
        nyf nyfVar = this.ag;
        if (nyfVar != null && nyfVar.a && motionEvent.getAction() == 8 && (motionEvent.getSource() & 4194304) != 0) {
            nyfVar.f = true;
            InputDevice device = motionEvent.getDevice();
            Float fValueOf = null;
            if (device != null && (motionRange = device.getMotionRange(26)) != null) {
                fValueOf = Float.valueOf(motionRange.getResolution());
            }
            if (fValueOf != null) {
                nyfVar.g = true;
                float axisValue = motionEvent.getAxisValue(26);
                qaq qaqVar = nyfVar.j;
                int iU = qaq.u(motionEvent);
                int iU2 = qaq.u(motionEvent);
                if (iU2 <= 0 ? iU2 >= 0 || !qaqVar.w(0, 0, false) : !qaqVar.v(0, 0, false)) {
                    if (iU != nyfVar.e) {
                        nyfVar.d = 0.0f;
                    }
                    nyfVar.e = iU;
                    float fFloatValue = nyfVar.d + ((axisValue * nyfVar.c) / fValueOf.floatValue());
                    nyfVar.d = fFloatValue;
                    if (Math.abs(fFloatValue) > 45.0f) {
                        nyfVar.d %= 45.0f;
                        nyfVar.a(18);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.ah.e();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        nyf nyfVar = this.ag;
        if (nyfVar != null) {
            nyfVar.f = false;
        }
        nyg nygVar = this.af;
        if (nygVar != null) {
            nygVar.a.removeCallbacks(nygVar.c);
            nygVar.e = false;
        }
        return zOnTouchEvent;
    }

    public FadingWearableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadingWearableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        int iMax;
        int iMax2;
        super(context, attributeSet, i);
        this.am = false;
        this.ao = 75L;
        this.ap = 225L;
        this.aq = new PathInterpolator(0.2f, 0.2f, 0.0f, 1.0f);
        this.ar = new PathInterpolator(0.33f, 0.0f, 0.67f, 0.2f);
        this.at = false;
        this.au = Integer.MIN_VALUE;
        this.av = Integer.MIN_VALUE;
        this.aw = -2.1474836E9f;
        this.ax = -2.1474836E9f;
        this.ay = false;
        this.aA = new nwd(this, 2);
        this.aj = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.ak = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.al = i2;
        this.an = i2;
        ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        this.ae = new nyh(context);
        this.ah = new nwt(this, new nwn(this));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, nwp.a, i, 0);
        try {
            this.am = typedArrayObtainStyledAttributes.getBoolean(6, false);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.as = z;
            if (z) {
                if (getChildCount() > 0) {
                    aE();
                } else {
                    this.ai = true;
                }
            } else {
                if (this.au != Integer.MIN_VALUE) {
                    setPadding(getPaddingLeft(), this.au, getPaddingRight(), this.av);
                }
                this.ai = false;
            }
            this.at = typedArrayObtainStyledAttributes.getBoolean(7, false);
            this.aw = Math.min(typedArrayObtainStyledAttributes.getFloat(10, -2.1474836E9f), 1.0f);
            this.ax = Math.min(typedArrayObtainStyledAttributes.getFloat(0, -2.1474836E9f), 1.0f);
            float fMin = Math.min(typedArrayObtainStyledAttributes.getFloat(9, -2.1474836E9f), 1.0f);
            float fMin2 = Math.min(typedArrayObtainStyledAttributes.getFloat(2, -2.1474836E9f), 1.0f);
            if (fMin == -2.1474836E9f) {
                iMax = getPaddingStart();
            } else {
                iMax = Math.max((int) Math.ceil(r6 * fMin), 0);
            }
            if (fMin2 == -2.1474836E9f) {
                iMax2 = getPaddingEnd();
            } else {
                iMax2 = Math.max((int) Math.ceil(r6 * fMin2), 0);
            }
            setPaddingRelative(iMax, getPaddingTop(), iMax2, getPaddingBottom());
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, this.ay);
            this.ay = z2;
            if (z2 && this.af == null) {
                this.af = new nyg(this);
            }
            nyg nygVar = this.af;
            if (nygVar != null) {
                nygVar.d = z2;
                nygVar.b.e(z2 ? nygVar.a : null);
            }
            int i3 = new int[]{1, 2}[typedArrayObtainStyledAttributes.getInteger(4, 1)];
            boolean z3 = i3 == 1;
            if (i3 != 1 && this.ag == null) {
                this.ag = new nyf(context, this);
            }
            nyf nyfVar = this.ag;
            if (nyfVar != null) {
                nyfVar.a = i3 == 2;
                nyfVar.b = !z3;
            }
            this.ae.a = typedArrayObtainStyledAttributes.getBoolean(5, true);
            typedArrayObtainStyledAttributes.recycle();
            nwm nwmVar = new nwm(this.ah);
            nwmVar.h = 450L;
            nwmVar.i = 450L;
            nwmVar.j = 450L;
            nwmVar.k = 450L;
            ac(nwmVar);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
