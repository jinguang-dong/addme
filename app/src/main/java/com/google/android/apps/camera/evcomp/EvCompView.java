package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.ar.core.R;
import defpackage.cmg;
import defpackage.fdi;
import defpackage.hhv;
import defpackage.hhw;
import defpackage.hhx;
import defpackage.hhy;
import defpackage.hhz;
import defpackage.luf;
import defpackage.luj;
import defpackage.mwq;
import defpackage.mxm;
import defpackage.ovx;
import defpackage.owq;
import defpackage.qpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EvCompView extends FrameLayout {
    public final ArrayList a;
    public final owq b;
    public CheckBox c;
    public ImageButton d;
    public EvCompSlider e;
    public EvCompSlider f;
    public hhx g;
    public hhx h;
    public mxm i;
    public float j;
    public float k;
    public luj l;
    public mwq m;
    private final AccessibilityManager n;
    private final AtomicBoolean o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private float t;

    /* JADX WARN: Multi-variable type inference failed */
    public EvCompView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.o = new AtomicBoolean(false);
        this.b = new ovx(hhv.SINGLE);
        this.i = mxm.PORTRAIT;
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
        this.r = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_width);
        this.p = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_icon_size);
        this.q = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_knob_size);
        this.s = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_touch_area_width);
        this.g = n(hhy.BRIGHTNESS, R.drawable.ic_evc_brightness_24px, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.brightness_knob_accessibility_description);
        this.h = n(hhy.SHADOW, R.drawable.ic_evc_shadow_24px, R.color.google_grey100, R.drawable.bg_evcomp_shadow_knob, R.string.shadow_knob_accessibility_description);
        if (context instanceof fdi) {
            this.l = ((fdi) context).a();
        }
    }

    public static String c(float f) {
        return String.format("%+.1f", Float.valueOf(f)).replaceFirst("^[-+](0(\\.0*)?)$", "$1");
    }

    private final float o(int i, hhx hhxVar) {
        return p(1.0f - (((i + (a() / 2.0f)) - (a() * 0.0f)) / ((hhxVar.e + 0.0f) * a())));
    }

    private static float p(float f) {
        return Math.round(f * 100.0f) / 100.0f;
    }

    private final int q(int i, float f) {
        float fA = a();
        float fA2 = a();
        float fA3 = a();
        float f2 = fA / 2.0f;
        int i2 = (int) ((fA2 * 0.0f) - f2);
        if (i < i2) {
            return i2;
        }
        int i3 = (int) ((f * fA3) - f2);
        return i > i3 ? i3 : i;
    }

    final int a() {
        return b() - this.p;
    }

    final int b() {
        int dimensionPixelSize;
        int measuredWidth;
        ovx ovxVar = (ovx) this.b;
        int iOrdinal = ((hhv) ovxVar.d).ordinal();
        int i = 0;
        int dimensionPixelSize2 = (iOrdinal == 0 || iOrdinal == 1) ? getResources().getDimensionPixelSize(R.dimen.evcomp_slider_height) : iOrdinal != 2 ? 0 : getResources().getDimensionPixelSize(R.dimen.evcomp_dual_slider_height);
        if (this.c != null) {
            if (((hhv) ovxVar.d).equals(hhv.DUAL_INDEPENDENT)) {
                int i2 = this.p;
                dimensionPixelSize = dimensionPixelSize2 + dimensionPixelSize2 + i2 + i2 + getResources().getDimensionPixelSize(R.dimen.evcomp_lock_button_slider_margin);
                measuredWidth = this.c.getMeasuredWidth();
            } else {
                dimensionPixelSize = this.p + dimensionPixelSize2 + getResources().getDimensionPixelSize(R.dimen.evcomp_lock_button_slider_margin);
                measuredWidth = this.c.getMeasuredWidth();
            }
            i = measuredWidth + dimensionPixelSize;
        }
        return ((float) i) >= ((float) getMeasuredHeight()) * 0.85f ? (int) (dimensionPixelSize2 * 0.8f) : dimensionPixelSize2;
    }

    public final void d(hhx hhxVar, float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hhxVar.getLayoutParams();
        layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_portrait_right_margin) - ((this.q - this.p) / 2);
        layoutParams.leftMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.gravity = 8388629;
        float f2 = hhxVar.e;
        if (f2 > 1.0f || f2 < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid min/max");
        }
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Fraction is not illegal: " + f);
        }
        layoutParams.topMargin = q((int) (((((f2 + 0.0f) * (1.0f - f)) + 0.0f) * a()) - (a() / 2.0f)), f2);
        float fAbs = Math.abs(f - hhxVar.d);
        hhxVar.a(f);
        if (fAbs > 0.01f) {
            hhxVar.setLayoutParams(layoutParams);
        }
    }

    public final void e(mxm mxmVar) {
        if (this.a.isEmpty()) {
            return;
        }
        qpt.aQ(this.c, mxmVar);
        qpt.aQ(this.d, mxmVar);
        qpt.aQ(this.g, mxmVar);
        qpt.aQ(this.h, mxmVar);
    }

    public final void f(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            d(this.g, f);
        } else {
            throw new IllegalArgumentException("Fraction is not illegal: " + f);
        }
    }

    public final void g(float f) {
        this.j = f;
        this.e.setContentDescription(((hhv) ((ovx) this.b).d).equals(hhv.SINGLE) ? getResources().getString(R.string.ev_announcement, String.valueOf(p(this.j))) : getResources().getString(R.string.brightness_ev_announcement, String.valueOf(p(this.j))));
    }

    public final void h(float f) {
        if (((hhv) ((ovx) this.b).d).equals(hhv.SINGLE)) {
            return;
        }
        if (f <= 1.0f && f >= 0.0f) {
            d(this.h, f);
        } else {
            throw new IllegalArgumentException("Fraction is not illegal: " + f);
        }
    }

    public final void i(float f) throws Resources.NotFoundException {
        this.k = f;
        this.f.setContentDescription(getResources().getString(R.string.shadow_ev_announcement, String.valueOf(p(this.k))));
    }

    public final void j() throws Resources.NotFoundException {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_portrait_right_margin);
        int i = this.p;
        int i2 = i / 2;
        layoutParams.rightMargin = (dimensionPixelSize + i2) - (this.c.getMeasuredWidth() / 2);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.evcomp_lock_button_slider_margin);
        int iOrdinal = ((hhv) ((ovx) this.b).d).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            layoutParams.bottomMargin = (b() / 2) + dimensionPixelSize2 + i2;
        } else if (iOrdinal == 2) {
            layoutParams.bottomMargin = b() + dimensionPixelSize2 + i;
        }
        this.c.setLayoutParams(layoutParams);
    }

    public final void k() throws Resources.NotFoundException {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        layoutParams.rightMargin = ((this.s - this.r) / 2) - (this.d.getMeasuredWidth() / 2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.evcomp_reset_button_slider_margin);
        int iOrdinal = ((hhv) ((ovx) this.b).d).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            layoutParams.bottomMargin = (b() / 2) + dimensionPixelSize + (this.p / 2);
        } else if (iOrdinal == 2) {
            layoutParams.bottomMargin = b() + dimensionPixelSize + this.p;
        }
        this.d.setLayoutParams(layoutParams);
    }

    public final void l() throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_portrait_right_margin);
        int i = this.p / 2;
        int i2 = dimensionPixelSize + i;
        int i3 = this.s;
        int i4 = this.n.isTouchExplorationEnabled() ? i3 + i3 : i3;
        int i5 = i2 - ((i3 - this.r) / 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, b());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, b());
        if (((hhv) ((ovx) this.b).d).equals(hhv.DUAL_INDEPENDENT)) {
            int iB = (b() / 2) + i;
            this.e.a(b(), cmg.e(getResources().getColor(R.color.google_grey200, null), 219), cmg.e(getResources().getColor(R.color.google_grey500, null), 219), getResources().getColor(R.color.evcomp_brightness_slider_stroke_color, null));
            this.f.a(b(), cmg.e(getResources().getColor(R.color.google_grey500, null), 219), cmg.e(getResources().getColor(R.color.google_grey900, null), 219), getResources().getColor(R.color.evcomp_shadows_slider_stroke_color, null));
            layoutParams.bottomMargin = iB;
            layoutParams.gravity = 8388629;
            layoutParams2.gravity = 8388629;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = iB;
            this.f.setLayoutParams(layoutParams2);
            this.f.requestLayout();
            this.f.invalidate();
        } else {
            this.e.a(b(), cmg.e(getResources().getColor(R.color.google_grey200, null), 219), cmg.e(getResources().getColor(R.color.google_grey900, null), 219), getResources().getColor(R.color.evcomp_shadows_slider_stroke_color, null));
            layoutParams.height = b();
            layoutParams.gravity = 8388629;
        }
        layoutParams.rightMargin = i5;
        this.e.setLayoutParams(layoutParams);
        this.e.requestLayout();
        this.e.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.View, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] m(android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.evcomp.EvCompView.m(android.view.View, android.view.MotionEvent):float[]");
    }

    public final hhx n(hhy hhyVar, int i, int i2, int i3, int i4) {
        hhx hhxVar = new hhx(getContext());
        hhxVar.setBackground(new InsetDrawable(hhxVar.getResources().getDrawable(i3, null), (hhxVar.c - hhxVar.b) / 2));
        hhxVar.setImageResource(i);
        hhxVar.setElevation(hhxVar.getResources().getDimensionPixelSize(R.dimen.evcomp_slider_knob_elevation));
        hhxVar.setScaleType(ImageView.ScaleType.CENTER);
        hhxVar.setTag(hhyVar);
        hhxVar.setFocusable(true);
        hhxVar.setContentDescription(hhxVar.getResources().getText(i4));
        hhxVar.setOnHoverListener(new hhw(hhxVar, 0));
        hhxVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        hhxVar.e = 1.0f;
        hhxVar.getDrawable().setTint(getResources().getColor(i2, null));
        return hhxVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (CheckBox) findViewById(R.id.lock_button);
        this.d = (ImageButton) findViewById(R.id.evcomp_reset_button);
        this.e = (EvCompSlider) findViewById(R.id.evcomp_brightness_slider);
        this.f = (EvCompSlider) findViewById(R.id.evcomp_shadow_slider);
        hhz hhzVar = new hhz(0);
        this.e.setOnTouchListener(hhzVar);
        this.f.setOnTouchListener(hhzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.view.accessibility.AccessibilityManager r2 = r0.n
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 == 0) goto L18
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.o
            boolean r3 = r2.get()
            if (r3 != 0) goto L25
            r1 = 1
            r2.set(r1)
            goto L28
        L18:
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.o
            boolean r3 = r2.get()
            if (r3 == 0) goto L25
            r1 = 0
            r2.set(r1)
            goto L28
        L25:
            if (r1 != 0) goto L28
            return
        L28:
            mxm r1 = r0.i
            r0.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.evcomp.EvCompView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (((Boolean) this.l.b(luf.aZ)).booleanValue()) {
            l();
            j();
            k();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhx) it.next()).setVisibility(i);
        }
    }
}
