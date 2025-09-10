package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.transition.Fade;
import android.view.View;
import android.widget.PopupWindow;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfe implements AutoCloseable, imj {
    public final nfk a;
    private final int d;
    private final View e;
    private final boolean f;
    private final boolean g;
    private Date i;
    private final int k;
    private final nfi l;
    public List b = DesugarCollections.synchronizedList(new ArrayList());
    private final AtomicBoolean h = new AtomicBoolean(false);
    public Runnable c = new ndk(5);
    private boolean j = false;

    public nfe(nfi nfiVar, View view, int i, View view2, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        int i7;
        view.getClass();
        view2.getClass();
        Context context = view2.getContext();
        nfk nfkVar = new nfk(context);
        nfkVar.setWillNotDraw(false);
        nfkVar.setLayerType(1, nfkVar.b);
        nfkVar.setLayerType(1, nfkVar.c);
        nfkVar.setOnClickListener(new mlk(nfkVar, 14));
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(nfkVar.w, new Handler(context.getMainLooper()));
        nfkVar.v.add(new mzq(displayManager, nfkVar, 9));
        this.a = nfkVar;
        nfkVar.i = view;
        nfkVar.f = new PopupWindow(nfkVar);
        nfkVar.addView(view);
        if (z3) {
            i7 = i5;
        } else {
            if (l(i)) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i8 = view2.getResources().getDisplayMetrics().heightPixels;
                int iU = u(view2);
                int i9 = iArr[1];
                if ((i9 > (i8 - i9) - iU ? 1 : 2) != i) {
                    i7 = i5;
                    i = i == 1 ? 2 : 1;
                }
            } else {
                int iA = a(i, view2);
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr2);
                int i10 = view2.getResources().getDisplayMetrics().widthPixels;
                int iV = v(view2);
                int i11 = iArr2[0];
                if ((i11 <= (i10 - i11) - iV ? 6 : 5) != iA) {
                    i = i == 3 ? 4 : 3;
                }
            }
            i7 = i5;
        }
        this.d = i7;
        this.k = i6;
        this.e = view2;
        this.f = z;
        this.g = z2;
        this.l = nfiVar;
        nfkVar.k = view2;
        View view3 = nfkVar.k;
        if (view3 != null) {
            int[] iArr3 = nfkVar.a;
            view3.getLocationOnScreen(iArr3);
            int i12 = iArr3[0];
            nfkVar.l = new Rect(i12, iArr3[1], v(view3) + i12, iArr3[1] + u(view3));
        }
        nfkVar.j = i;
        nfkVar.m = i2;
        nfkVar.n = i3;
        nfkVar.o = i4;
        nfkVar.a();
    }

    static int a(int i, View view) {
        int[] iArr = con.a;
        int layoutDirection = view.getLayoutDirection();
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return layoutDirection == 1 ? 6 : 5;
        }
        if (i == 4) {
            return layoutDirection == 1 ? 5 : 6;
        }
        throw new IllegalArgumentException();
    }

    static boolean l(int i) {
        return i == 1 || i == 2;
    }

    private static int u(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredHeight();
    }

    private static int v(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return view.getMeasuredWidth();
    }

    @Override // defpackage.imj
    public final int b() {
        return this.d;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.TOOLTIP;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c.run();
        nfk nfkVar = this.a;
        nfkVar.b(false);
        nfkVar.close();
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.i;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // defpackage.imj
    public final void i() {
        this.a.b(true);
        if (this.h.get()) {
            this.l.a();
        }
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.i = date;
    }

    @Override // defpackage.imj
    public final void m() {
        Rect rect = new Rect();
        this.e.getGlobalVisibleRect(rect);
        nfk nfkVar = this.a;
        nfkVar.l = rect;
        nfkVar.setVisibility(0);
        PopupWindow popupWindow = nfkVar.f;
        View view = nfkVar.k;
        byte[] bArr = null;
        if (popupWindow != null && view != null) {
            popupWindow.setClippingEnabled(false);
            Fade fade = new Fade();
            fade.setDuration(nfkVar.s);
            fade.setInterpolator(new cvn());
            fade.setStartDelay(nfkVar.r);
            popupWindow.setEnterTransition(fade);
            popupWindow.setBackgroundDrawable(new BitmapDrawable(view.getResources(), ""));
            popupWindow.setOutsideTouchable(nfkVar.g);
            popupWindow.setTouchInterceptor(new fuo(nfkVar, 12, bArr));
            popupWindow.setOnDismissListener(new htm(nfkVar, 2));
            WeakReference weakReference = new WeakReference((Activity) view.getContext());
            view.post(new mzq(nfkVar, weakReference, 7));
            view.postDelayed(new mzq(nfkVar, weakReference, 8), nfkVar.r);
        }
        for (nfd nfdVar : this.b) {
            long j = nfdVar.c;
            if (j == 0) {
                nfdVar.b.execute(nfdVar.a);
            } else {
                nfkVar.postDelayed(new mzq(nfkVar, nfdVar, 3, bArr), j);
            }
        }
        this.h.set(true);
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean p() {
        return true;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return this.g;
    }

    @Override // defpackage.imj
    public final boolean r() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean s() {
        return !this.f;
    }

    @Override // defpackage.imj
    public final int t() {
        return this.k;
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.imj
    public final /* synthetic */ void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
    }
}
