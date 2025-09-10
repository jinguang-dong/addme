package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.ArraySet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.clockwork.common.wearable.wearmaterial.util.BlendContentDrawable;
import com.google.ar.core.R;
import defpackage.ipg;
import defpackage.ki;
import defpackage.kq;
import defpackage.ntd;
import defpackage.nwd;
import defpackage.nwj;
import defpackage.nxh;
import defpackage.nxj;
import defpackage.nxn;
import defpackage.nxp;
import defpackage.nxq;
import defpackage.nxt;
import defpackage.nxu;
import defpackage.nxv;
import defpackage.qaq;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CenteredRecyclerView extends RecyclerView {
    public final Set ae;
    public final Set af;
    public final nxt ag;
    public ViewTreeObserver.OnPreDrawListener ah;
    public boolean ai;
    public int aj;
    public nxj ak;
    public float al;
    public float am;
    public Animator an;
    private final Handler ao;
    private final Runnable ap;
    private final Animator aq;
    private final Animator ar;
    private int as;
    private boolean at;
    private BlendContentDrawable au;
    private final qaq av;

    public CenteredRecyclerView(Context context) {
        this(context, null, 0);
    }

    private static PickerVignetteDrawable aI(BlendContentDrawable blendContentDrawable) {
        Drawable drawable = blendContentDrawable.getDrawable();
        if (drawable instanceof PickerVignetteDrawable) {
            return (PickerVignetteDrawable) drawable;
        }
        return null;
    }

    public final int a(View view) {
        if (view == null) {
            return 0;
        }
        nxt nxtVar = this.ag;
        return (nxtVar.b(view) + ((int) (Math.round(Math.abs(r3)) * Math.signum(nxtVar.a(view))))) - nwj.b(nxtVar, this, true);
    }

    public final PickerVignetteDrawable aD() {
        BlendContentDrawable blendContentDrawable = this.au;
        if (blendContentDrawable == null) {
            return null;
        }
        return aI(blendContentDrawable);
    }

    public final void aE() {
        if (((nxp) this.l) != null) {
            throw null;
        }
    }

    public final /* synthetic */ void aF(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void aG(int i) {
        nxp nxpVar = (nxp) this.l;
        if (nxpVar != null && i >= 0 && nxpVar.a() > 0) {
            throw null;
        }
    }

    public final void aH() {
        if (((nxp) this.l) != null) {
            throw null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ab(ki kiVar) {
        nxp nxpVar = (nxp) this.l;
        if (kiVar == nxpVar) {
            return;
        }
        this.as = -1;
        this.ai = false;
        this.aj = 0;
        if (nxpVar != null) {
            throw null;
        }
        ViewTreeObserver viewTreeObserver = getRootView().getViewTreeObserver();
        viewTreeObserver.removeOnPreDrawListener(this.ah);
        viewTreeObserver.addOnPreDrawListener(this.ah);
        super.ab(kiVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void af(int i) {
        kq kqVar = this.m;
        if (kqVar == null) {
            return;
        }
        nxq nxqVar = new nxq(getContext(), this.al);
        nxqVar.b = i;
        kqVar.aZ(nxqVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean am(int i, int i2) {
        if (this.at) {
            return super.am(i, i2);
        }
        if (!this.av.y()) {
            return false;
        }
        int i3 = this.I;
        if (Math.abs(i) < i3 && Math.abs(i2) < i3) {
            return false;
        }
        int i4 = (i < 0 || i2 < 0) ? -1 : 1;
        aH();
        aG(i4 - 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        BlendContentDrawable blendContentDrawable = this.au;
        if (blendContentDrawable == null) {
            super.dispatchDraw(canvas);
        } else {
            blendContentDrawable.draw(canvas);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aE();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getRootView().getViewTreeObserver().removeOnPreDrawListener(this.ah);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BlendContentDrawable blendContentDrawable;
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.as == -1) {
            if (this.as == -1) {
                this.as = 0;
            }
            nxt nxtVar = this.ag;
            int iD = nxtVar.d(this);
            if (this.as != iD && getChildCount() > 0) {
                this.as = iD;
                boolean z2 = getChildCount() > 0 && nxtVar.h(this);
                this.ai = z2;
                this.aj = nwj.b(nxtVar, this, z2);
                Handler handler = this.ao;
                Runnable runnable = this.ap;
                handler.removeCallbacks(runnable);
                handler.postAtFrontOfQueue(runnable);
            }
            if (getChildCount() >= 2 && (blendContentDrawable = this.au) != null) {
                blendContentDrawable.setBounds(0, 0, getWidth(), getHeight());
                PickerVignetteDrawable pickerVignetteDrawableAI = aI(blendContentDrawable);
                if (pickerVignetteDrawableAI != null) {
                    int iD2 = nxtVar.d(this);
                    int iD3 = nxtVar.d(getChildAt(0));
                    pickerVignetteDrawableAI.setClearArea((iD2 - iD3) / 2, (iD2 + iD3) / 2);
                }
            }
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.au || super.verifyDrawable(drawable);
    }

    public CenteredRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CenteredRecyclerView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.ae = new ArraySet();
        this.af = new ArraySet();
        this.ap = new ntd(this, 7);
        int i2 = 3;
        this.ah = new nwd(this, i2);
        this.as = -1;
        this.ak = null;
        this.al = 1.0f;
        this.am = 1.0f;
        this.at = true;
        this.av = new qaq(context, (byte[]) null, (char[]) null);
        this.ao = new Handler();
        setClipToPadding(false);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.wear_vignette_expansion);
        this.aq = animatorLoadAnimator;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.wear_vignette_collapse);
        this.ar = animatorLoadAnimator2;
        ac(null);
        int i3 = kq.ax(context, attributeSet, i, 0).a;
        getContext();
        ad(new nxh(i3));
        this.ag = i3 == 0 ? new nxv(1) : new nxv(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nxu.a, i, 0);
        try {
            this.al = typedArrayObtainStyledAttributes.getFloat(2, this.al);
            this.am = typedArrayObtainStyledAttributes.getFloat(1, this.am);
            this.at = typedArrayObtainStyledAttributes.getBoolean(0, this.at);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
            if (drawable instanceof BlendContentDrawable) {
                BlendContentDrawable blendContentDrawable = (BlendContentDrawable) drawable;
                this.au = blendContentDrawable;
                blendContentDrawable.setContentProvider(new ipg(this, i2));
                this.au.setCallback(this);
                PickerVignetteDrawable pickerVignetteDrawableAI = aI(this.au);
                animatorLoadAnimator.setTarget(pickerVignetteDrawableAI);
                animatorLoadAnimator2.setTarget(pickerVignetteDrawableAI);
            }
            typedArrayObtainStyledAttributes.recycle();
            setOverScrollMode(2);
            aa(new nxn(this));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
