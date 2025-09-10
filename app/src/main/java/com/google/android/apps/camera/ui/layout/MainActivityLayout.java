package com.google.android.apps.camera.ui.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;
import defpackage.gza;
import defpackage.inl;
import defpackage.iyu;
import defpackage.jgt;
import defpackage.jhc;
import defpackage.jhh;
import defpackage.lqd;
import defpackage.mgr;
import defpackage.mub;
import defpackage.muj;
import defpackage.mxh;
import defpackage.mxj;
import defpackage.mxk;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.mxs;
import defpackage.mxt;
import defpackage.mxu;
import defpackage.myd;
import defpackage.nfl;
import defpackage.nkw;
import defpackage.nlj;
import defpackage.obu;
import defpackage.out;
import defpackage.ovx;
import defpackage.owf;
import defpackage.owq;
import defpackage.qpt;
import defpackage.rnt;
import defpackage.rvk;
import defpackage.rwc;
import defpackage.sbv;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.ujp;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainActivityLayout extends GcaLayout implements jhh, jhc {
    private static final sgv C = sgv.g("com.google.android.apps.camera.ui.layout.MainActivityLayout");
    public mgr A;
    public jgt B;
    private final Map D;
    private final Map E;
    private boolean F;
    private boolean G;
    private mxm H;
    public final Set o;
    public rwc p;
    public Size q;
    public AtomicReference r;
    public owq s;
    public owf t;
    public owq u;
    public sbv v;
    public owq w;
    public owq x;
    public owq y;
    public owq z;

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = ujp.ak();
        this.D = new LinkedHashMap();
        this.E = new LinkedHashMap();
        this.p = rvk.a;
        this.q = new Size(0, 0);
        ((mxh) ((inl) context).c(mxh.class)).c(this);
        this.B.k(this);
    }

    public static final mxm q(mxm mxmVar, mxj mxjVar, mxk mxkVar) {
        if (mxkVar != mxk.DEVICE) {
            int iOrdinal = mxjVar.ordinal();
            if (iOrdinal == 0) {
                int iOrdinal2 = mxkVar.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return mxm.REVERSE_LANDSCAPE;
                    }
                    if (iOrdinal2 == 2) {
                        return mxm.LANDSCAPE;
                    }
                    if (iOrdinal2 != 3) {
                        throw new IllegalArgumentException("Unexpected LayoutTransform: ".concat(String.valueOf(String.valueOf(mxkVar))));
                    }
                }
                return mxm.PORTRAIT;
            }
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unexpected CameraLayoutDecision: ".concat(String.valueOf(String.valueOf(mxjVar))));
                }
                return mxm.PORTRAIT;
            }
        }
        return mxmVar;
    }

    private final mxm r(Context context, Display display, mxj mxjVar, int i, int i2) {
        if (mxjVar.equals(mxj.SIMPLIFIED_LAYOUT)) {
            return mxm.PORTRAIT;
        }
        Activity activity = (Activity) context;
        WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        int iHeight = currentWindowMetrics.getBounds().height();
        int iWidth = currentWindowMetrics.getBounds().width();
        if (activity.isInMultiWindowMode()) {
            iHeight -= getRootWindowInsets().getInsets(WindowInsets.Type.statusBars()).top;
        }
        boolean z = true;
        if ((iHeight <= iWidth || i2 <= i) && (iHeight >= iWidth || i2 >= i)) {
            z = false;
        }
        mxm mxmVarI = nlj.i(display, context);
        if (this.H == null) {
            this.H = mxmVarI;
        }
        if (!z) {
            return this.H;
        }
        this.H = mxmVarI;
        return mxmVarI;
    }

    private final mxt s() {
        return this.r.get() == null ? mxt.a : ((mxu) this.r.get()).a;
    }

    private final boolean t(mxt mxtVar) {
        if (this.r.get() != null && ((mxu) this.r.get()).a.equals(mxtVar) && !this.G) {
            return false;
        }
        this.G = false;
        if (mxtVar.a()) {
            this.r.set(new mxu(mxtVar, this.r.get() != null ? ((mxu) this.r.get()).b : null));
            return true;
        }
        this.r.set(new mxu(mxtVar, this.r.get() != null ? ((mxu) this.r.get()).b : null));
        this.G = true;
        post(new mub(this, 12));
        return false;
    }

    private static final void u(mxj mxjVar, mxm mxmVar, mxl mxlVar, mxk mxkVar) {
        mxm mxmVarQ = q(mxmVar, mxjVar, mxkVar);
        mxlVar.eH(mxmVarQ);
        mxlVar.eR(mxjVar, mxmVarQ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            return super.dispatchApplyWindowInsets(windowInsets);
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        Trace.beginSection("MAL.dispatchConfigurationChanged");
        nfl.b(getContext());
        super.dispatchConfigurationChanged(configuration);
        nfl.c();
        Trace.endSection();
    }

    @Override // defpackage.jhc
    public final void ea() {
        requestLayout();
    }

    public final mxu g() {
        return (mxu) this.r.get();
    }

    public final void h(mxl mxlVar) {
        i(mxlVar, mxk.DEFAULT);
    }

    public final void i(mxl mxlVar, mxk mxkVar) {
        out.a();
        this.D.put(mxlVar, mxkVar);
        mxt mxtVarS = s();
        if (mxtVarS.equals(mxt.a)) {
            return;
        }
        u(mxtVarS.j, mxtVarS.h, mxlVar, mxkVar);
    }

    public final void j(View view, mxk mxkVar) {
        l(view, mxkVar);
        if (((Boolean) this.l.dL()).booleanValue()) {
            if (!this.F || view.getRotation() == 0.0f) {
                return;
            }
            qpt.aP(view, mxm.PORTRAIT);
            return;
        }
        mxt mxtVarS = s();
        mxm mxmVarQ = q(mxtVarS.h, mxtVarS.j, mxkVar);
        if (view.getRotation() != mxmVarQ.e) {
            qpt.aP(view, mxmVarQ);
        }
    }

    public final void k(View view) {
        l(view, mxk.DEFAULT);
    }

    public final void l(View view, mxk mxkVar) {
        out.a();
        this.E.put(view, mxkVar);
    }

    public final void m(int i, int i2, Integer num) {
        p(new Size(i, i2), num);
    }

    public final void n() {
        Size size = s().c;
        if (size == null) {
            o(null);
        } else {
            o(new Size(Math.max(size.getWidth(), size.getHeight()), Math.min(size.getWidth(), size.getHeight())));
        }
    }

    public final void o(Size size) {
        p(size, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        h((RotatingGcaLayout) findViewById(R.id.rotating_gca_layout));
        l(findViewById(R.id.zoom_slider_area), mxk.TO_LEFT);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zFm = false;
        for (qpt qptVar : this.o) {
            if (motionEvent.getActionMasked() == 0) {
                zFm |= qptVar.fm(new obu(motionEvent, getRootView(), (byte[]) null));
            }
        }
        return zFm || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.F) {
            this.F = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        nfl.c();
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        DisplayCutout cutout;
        Trace.beginSection("MAL.onMeasurePrologue");
        Context context = getContext();
        nfl.b(context);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        owf owfVar = this.m;
        boolean z = owfVar != null && ((Boolean) owfVar.dL()).booleanValue();
        boolean z2 = size < size2;
        float fFloatValue = ((Float) this.n.e(gza.u).orElse(Float.valueOf(0.5f))).floatValue();
        Size size3 = new Size((z && z2) ? (int) ((View.MeasureSpec.getSize(i) * fFloatValue) - getResources().getDimensionPixelSize(R.dimen.center_split_margin)) : View.MeasureSpec.getSize(i), (!z || z2) ? View.MeasureSpec.getSize(i2) : (int) ((View.MeasureSpec.getSize(i2) * fFloatValue) - getResources().getDimensionPixelSize(R.dimen.center_split_margin)));
        Size size4 = new Size(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.x.a(size4);
        this.y.a(size3);
        final mxj mxjVarBk = qpt.bk(getContext(), getDisplay(), this.n, (nkw) this.s.dL(), (muj) this.t.dL(), this.k, (Boolean) this.m.dL());
        final mxm mxmVarR = r(context, getDisplay(), mxjVarBk, size4.getWidth(), size4.getHeight());
        if (mxjVarBk.equals(mxj.JARVIS_LAYOUT) && !mxmVarR.equals(mxm.LANDSCAPE) && !mxmVarR.equals(mxm.REVERSE_LANDSCAPE)) {
            mxjVarBk = qpt.bi(getContext(), getDisplay(), this.k);
        }
        mxt mxtVarS = s();
        if (!mxtVarS.h.equals(mxmVarR) || !mxtVarS.j.equals(mxjVarBk)) {
            Display.Mode mode = getDisplay().getMode();
            mode.getPhysicalWidth();
            mode.getPhysicalHeight();
        }
        Size size5 = mxtVarS.d;
        Integer num = mxtVarS.f;
        if (Objects.equals(size5, size3) && this.q.getWidth() != 0 && this.q.getHeight() != 0) {
            size5 = this.q;
        }
        boolean z3 = mxjVarBk.equals(mxj.PHONE_LAYOUT) || mxjVarBk.equals(mxj.SIMPLIFIED_LAYOUT);
        if (((Boolean) this.l.dL()).booleanValue() != z3) {
            this.l.a(Boolean.valueOf(z3));
        }
        this.F = this.F || !mxtVarS.j.equals(mxjVarBk);
        this.A.d();
        mxs mxsVar = new mxs(mxtVarS);
        mxsVar.e(mxmVarR);
        mxsVar.a = size4;
        mxsVar.b = size3;
        mxsVar.d((nkw) this.s.dL());
        RectF rectF = new RectF();
        Display display = getDisplay();
        if (display != null && (cutout = display.getCutout()) != null) {
            rectF = nlj.g(cutout);
        }
        mxsVar.e = rectF;
        if (size5 != null) {
            size3 = size5;
        }
        mxsVar.c = size3;
        mxsVar.b(mxjVarBk);
        mxsVar.d = Integer.valueOf(num != null ? num.intValue() : 90);
        mxt mxtVarA = mxsVar.a();
        rnt.s(mxtVarA.a());
        if (t(mxtVarA)) {
            boolean zIsInMultiWindowMode = ((Activity) getContext()).isInMultiWindowMode();
            if (((Boolean) ((ovx) this.u).d).booleanValue() != zIsInMultiWindowMode) {
                this.u.a(Boolean.valueOf(zIsInMultiWindowMode));
            }
            mxt mxtVarS2 = s();
            mxm mxmVar = mxtVarS2.h;
            mxj mxjVar = mxtVarS2.j;
            mxmVar.name();
            if (!((Boolean) this.l.dL()).booleanValue()) {
                for (Map.Entry entry : this.E.entrySet()) {
                    View view = (View) entry.getKey();
                    mxm mxmVarQ = q(mxmVar, mxjVar, (mxk) entry.getValue());
                    if (view.getRotation() != mxmVarQ.e) {
                        qpt.aP(view, mxmVarQ);
                    }
                }
            } else if (this.F) {
                for (View view2 : this.E.keySet()) {
                    if (view2.getRotation() != 0.0f) {
                        qpt.aP(view2, mxm.PORTRAIT);
                    }
                }
            }
            mxmVarR.name();
            mxjVarBk.name();
            Map.EL.forEach(this.v, new BiConsumer() { // from class: mxg
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((owq) obj2).a(MainActivityLayout.q(mxmVarR, mxjVarBk, (mxk) obj));
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            this.w.a(mxjVarBk);
            for (Map.Entry entry2 : this.D.entrySet()) {
                u(mxjVarBk, mxmVarR, (mxl) entry2.getKey(), (mxk) entry2.getValue());
            }
        }
        Trace.endSection();
        super.onMeasure(i, i2);
        myd mydVar = ((mxu) this.j.get()).b;
        mydVar.getClass();
        this.z.a(mydVar.h(mxtVarA.b, mxtVarA.e));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Iterator it = this.o.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ((qpt) it.next()).fn(new obu(motionEvent, getRootView(), (byte[]) null));
            z = true;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final void p(Size size, Integer num) {
        if (getDisplay() == null) {
            ((sgt) C.c().M(5166)).s("Display is null; not setting preview size.");
            post(new lqd(this, size, num, 13, (int[]) null));
            return;
        }
        mxt mxtVarS = s();
        Size size2 = mxtVarS.b;
        mxm mxmVarR = size2 != null ? r(getContext(), getDisplay(), mxtVarS.j, size2.getWidth(), size2.getHeight()) : mxtVarS.h;
        mxs mxsVar = new mxs(mxtVarS);
        mxsVar.b(mxtVarS.j);
        mxsVar.e(mxmVarR);
        mxsVar.c = size;
        mxsVar.d = num == null ? mxtVarS.f : num;
        mxsVar.c();
        if (t(mxsVar.a())) {
            requestLayout();
            invalidate();
        }
        if (this.p.h()) {
            ViewfinderCover viewfinderCover = ((iyu) ((AmbientMode.AmbientController) this.p.c()).a).D;
            if (viewfinderCover.u) {
                return;
            }
            viewfinderCover.u = true;
            viewfinderCover.requestLayout();
        }
    }
}
