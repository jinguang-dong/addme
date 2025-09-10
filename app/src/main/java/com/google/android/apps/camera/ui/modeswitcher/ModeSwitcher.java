package com.google.android.apps.camera.ui.modeswitcher;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import defpackage.a;
import defpackage.chp;
import defpackage.cmg;
import defpackage.ctj;
import defpackage.cto;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.jea;
import defpackage.kpl;
import defpackage.ktm;
import defpackage.mmr;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.mzp;
import defpackage.nab;
import defpackage.nae;
import defpackage.nag;
import defpackage.nah;
import defpackage.nai;
import defpackage.naj;
import defpackage.nkw;
import defpackage.ojl;
import defpackage.out;
import defpackage.ovx;
import defpackage.owq;
import defpackage.rnt;
import defpackage.rnu;
import defpackage.rwc;
import defpackage.ryq;
import defpackage.ryr;
import defpackage.sbp;
import defpackage.sel;
import defpackage.sex;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.ske;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ModeSwitcher extends HorizontalScrollView implements mxl {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher");
    public final nae b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public final owq f;
    public nkw g;
    public nkw h;
    private final Rect i;
    private final cto j;
    private mxj k;

    public ModeSwitcher(Context context) {
        this(context, null);
    }

    public static float a(float f, float f2, float f3) {
        rnt.J(f2 <= f3, "value=%s min=%s max=%s", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        return Math.max(f2, Math.min(f, f3));
    }

    public final nkw d() {
        int scrollX = getScrollX() + (getWidth() / 2);
        out.a();
        ryq ryqVar = this.b.b;
        if (ryqVar.isEmpty()) {
            return nkw.PHOTO;
        }
        return (nkw) ((Map.Entry) new ryr(new nab(scrollX, 0), sel.a).e(ryqVar.entrySet())).getKey();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        int iY;
        super.dispatchDraw(canvas);
        int scrollX = getScrollX();
        nae naeVar = this.b;
        if (naeVar.p == null || naeVar.getVisibility() != 0) {
            return;
        }
        nai naiVar = naeVar.p;
        float alpha = naeVar.getAlpha();
        canvas.getClass();
        if (naiVar.e != canvas.getWidth() || naiVar.f != canvas.getHeight()) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            naiVar.e = width;
            naiVar.f = height;
            float f = height;
            float f2 = naiVar.g;
            naiVar.i = (f - f2) / 2.0f;
            naiVar.j = (f + f2) / 2.0f;
            Paint.FontMetrics fontMetrics = naiVar.d.getFontMetrics();
            float f3 = fontMetrics.descent - fontMetrics.ascent;
            naiVar.k = ((f3 - fontMetrics.descent) + (height / 2)) - (f3 / 2.0f);
        }
        int size = naiVar.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (scrollX >= ((nah) naiVar.l.get(size)).b) {
                naiVar.m = (nah) naiVar.l.get(size);
                naiVar.n = (nah) ske.bE(naiVar.l, size + 1);
                break;
            }
        }
        nah nahVar = naiVar.m;
        if (nahVar == null) {
            return;
        }
        nah nahVar2 = naiVar.n;
        if (nahVar2 == null) {
            iY = nahVar.c;
        } else {
            int i = nahVar.b;
            iY = chp.y(nahVar.c, nahVar2.c, (scrollX - i) / (nahVar2.b - i));
        }
        float f4 = scrollX;
        int i2 = naiVar.e;
        float f5 = (i2 - iY) / 2.0f;
        Path path = new Path();
        float f6 = naiVar.i;
        float f7 = naiVar.j;
        float f8 = naiVar.g;
        float f9 = f4 + ((i2 + iY) / 2.0f);
        float f10 = f4 + f5;
        path.addRoundRect(f10, f6, f9, f7, f8, f8, Path.Direction.CW);
        int iSave = canvas.save();
        canvas.clipPath(path);
        float f11 = alpha * 255.0f;
        try {
            Paint paint = naiVar.c;
            int i3 = (int) f11;
            paint.setColor(cmg.e(naiVar.a, i3));
            Paint paint2 = naiVar.d;
            paint2.setColor(cmg.e(naiVar.b, i3));
            canvas.drawRect(f10, naiVar.i, f9, naiVar.j, paint);
            nah nahVar3 = naiVar.m;
            nahVar3.getClass();
            float fA = nahVar3.a();
            nahVar3.getClass();
            canvas.drawText(nahVar3.a, fA, naiVar.k, paint2);
            nah nahVar4 = naiVar.n;
            if (nahVar4 != null) {
                canvas.drawText(nahVar4.a, nahVar4.a(), naiVar.k, paint2);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void e(boolean z, boolean z2) {
        out.a();
        this.b.e(z, z2);
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        if (this.k != mxjVar) {
            this.k = mxjVar;
            setHorizontalFadingEdgeEnabled(mxjVar.a());
        }
    }

    public final void f(int i, boolean z) {
        int i2 = 2;
        int width = i - (getWidth() / 2);
        if (!z) {
            scrollTo(width, 0);
            post(new kpl(this, width, 3));
            return;
        }
        cto ctoVar = this.j;
        if (ctoVar != null) {
            ctoVar.m(width);
        } else {
            smoothScrollTo(width, 0);
            post(new mzp(this, width, i2));
        }
    }

    public final void g(nkw nkwVar, boolean z) {
        k(1, this.g, nkwVar, z);
    }

    public final void h(View view, nkw nkwVar) {
        view.setOnClickListener(new ktm(this, nkwVar, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:13:0x001a, B:11:0x0012, B:16:0x001e, B:18:0x0029, B:19:0x002c, B:17:0x0024), top: B:24:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0005, B:13:0x001a, B:11:0x0012, B:16:0x001e, B:18:0x0029, B:19:0x002c, B:17:0x0024), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.nkw r2, boolean r3) {
        /*
            r1 = this;
            nae r1 = r1.b
            monitor-enter(r1)
            if (r3 == 0) goto L10
            java.util.EnumSet r0 = r1.d     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L1a
            goto L10
        Le:
            r2 = move-exception
            goto L31
        L10:
            if (r3 != 0) goto L1c
            java.util.EnumSet r0 = r1.d     // Catch: java.lang.Throwable -> Le
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L1c
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            return
        L1c:
            if (r3 == 0) goto L24
            java.util.EnumSet r3 = r1.d     // Catch: java.lang.Throwable -> Le
            r3.add(r2)     // Catch: java.lang.Throwable -> Le
            goto L29
        L24:
            java.util.EnumSet r3 = r1.d     // Catch: java.lang.Throwable -> Le
            r3.remove(r2)     // Catch: java.lang.Throwable -> Le
        L29:
            r2 = 1
            r1.f = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            r1.requestLayout()
            return
        L31:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher.i(nkw, boolean):void");
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.e;
    }

    public final void j(int i, nkw nkwVar, nkw nkwVar2) {
        k(i, nkwVar, nkwVar2, true);
    }

    public final void k(int i, nkw nkwVar, nkw nkwVar2, boolean z) {
        boolean z2 = nkwVar2 != nkw.UNINITIALIZED;
        a.I(z2);
        nkwVar2.getClass();
        rnt.B(z2, "Cannot setActiveMode to UNINITIALIZED");
        rnt.M(this.d, "must call finalizeModeSetup before setActiveMode");
        out.a();
        Trace.beginSection("ModeSwitcher#setActiveModeAndNL");
        this.b.c(nkwVar2, z);
        this.g = nkwVar2;
        this.f.a(new naj(nkwVar, nkwVar2, i));
        Trace.endSection();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.e) {
            int i5 = sbp.d;
            setSystemGestureExclusionRects(sex.a);
        } else {
            Rect rect = this.i;
            rect.right = getWidth();
            rect.bottom = getHeight();
            setSystemGestureExclusionRects(sbp.l(rect));
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        out.a();
        if (this.d) {
            if (z && this.e) {
                ((sgt) a.c().M(5263)).s("ModeSwitcher WAS ALREADY ENABLED!");
            } else if (!z && !this.e) {
                ((sgt) a.c().M(5262)).s("ModeSwitcher WAS ALREADY DISABLED!");
            }
            this.b.setEnabled(z);
            this.e = z;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.b.setVisibility(i);
    }

    public ModeSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.horizontalScrollViewStyle);
    }

    public ModeSwitcher(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModeSwitcher(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new Rect();
        this.d = false;
        this.e = false;
        this.k = mxj.PHONE_LAYOUT;
        this.f = new ovx(null);
        this.g = nkw.PHOTO;
        this.h = nkw.UNINITIALIZED;
        out.a();
        nae naeVar = new nae(context);
        ojl.bl(naeVar);
        addView(naeVar);
        this.b = naeVar;
        naeVar.setOrientation(0);
        naeVar.q = rwc.j(new rnu(this, null));
        naeVar.setGravity(16);
        naeVar.setBackgroundColor(0);
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        nag nagVar = new nag(this);
        GestureDetector gestureDetector = new GestureDetector(context, nagVar);
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        setOnTouchListener(nagVar);
        setFadingEdgeLength(getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.modeswitcher_fading_edge_length));
        if (!(context instanceof fdi) || !((fdi) context).b().p(gzo.bw)) {
            this.j = null;
            return;
        }
        cto ctoVar = new cto(this, ctj.h);
        jea.s(ctoVar, mmr.b);
        this.j = ctoVar;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
