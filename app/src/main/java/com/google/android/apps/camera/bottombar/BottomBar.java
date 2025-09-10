package com.google.android.apps.camera.bottombar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.jupiter.JupiterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.ar.core.R;
import defpackage.ckl;
import defpackage.cku;
import defpackage.fdi;
import defpackage.fvk;
import defpackage.fvo;
import defpackage.fwc;
import defpackage.fwd;
import defpackage.gzo;
import defpackage.jgd;
import defpackage.jhg;
import defpackage.jhh;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;
import defpackage.ndy;
import defpackage.nnu;
import defpackage.ocq;
import defpackage.ojl;
import defpackage.out;
import defpackage.qpt;
import defpackage.rvk;
import defpackage.rwc;
import defpackage.rww;
import defpackage.sbp;
import defpackage.sbr;
import defpackage.sbv;
import defpackage.scn;
import defpackage.sex;
import defpackage.sfc;
import defpackage.sgj;
import j$.lang.Iterable$EL;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomBar extends ConstraintLayout implements mxl, jhh, jhg {
    private static final scn v = scn.H(fvo.CENTER_LEFT, fvo.LEFT);
    private static final scn w = scn.H(fvo.CENTER_RIGHT, fvo.RIGHT);
    private static final scn x = scn.H(fvo.LEFT, fvo.RIGHT);
    private final Set A;
    private final FrameLayout B;
    private final EnumMap C;
    private final ShutterButtonProgressOverlay D;
    private final ZoomLockView E;
    private PauseResumeButton F;
    private SnapshotButton G;
    private ImageButton H;
    private ImageButton I;
    private ImageButton J;
    private ImageButton K;
    private ImageButton L;
    private final ViewStub M;
    private final ViewStub N;
    private final ViewStub O;
    private final ViewStub P;
    private final ViewStub Q;
    private final ViewStub R;
    private final ViewStub S;
    private final int T;
    private Drawable U;
    private float V;
    private mxj W;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    public final EnumMap i;
    public final EnumMap j;
    public final EnumMap k;
    public final EnumMap l;
    public final EnumMap m;
    public final ShutterButton n;
    public final ThumbnailView o;
    public final CameraSwitchButton p;
    public final boolean q;
    public mxm r;
    public boolean s;
    public rww t;
    public rww u;
    private final EnumMap y;
    private final EnumMap z;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new EnumMap(fvo.class);
        this.y = new EnumMap(fvo.class);
        this.z = new EnumMap(fvo.class);
        this.A = new HashSet();
        fvo fvoVar = fvo.LEFT;
        rvk rvkVar = rvk.a;
        fvo fvoVar2 = fvo.CENTER_LEFT;
        fvo fvoVar3 = fvo.CENTER_RIGHT;
        fvo fvoVar4 = fvo.RIGHT;
        this.j = new EnumMap(sbv.q(fvoVar, rvkVar, fvoVar2, rvkVar, fvoVar3, rvkVar, fvoVar4, rvkVar));
        this.k = new EnumMap(fvo.class);
        this.r = mxm.PORTRAIT;
        this.W = mxj.PHONE_LAYOUT;
        this.aa = false;
        this.s = false;
        this.ab = false;
        this.ac = true;
        this.ad = -1;
        boolean z = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
        this.q = z;
        this.T = context.getColor(R.color.bottom_bar_background_color);
        ocq ocqVarK = ocq.k(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.bottom_bar_layout, this));
        this.n = (ShutterButton) ocqVarK.c(R.id.shutter_button);
        this.D = (ShutterButtonProgressOverlay) ocqVarK.c(R.id.shutter_progress_overlay);
        this.E = (ZoomLockView) ocqVarK.c(R.id.zoom_lock_view);
        this.P = (ViewStub) ocqVarK.c(R.id.pause_resume_button_view_stub);
        this.p = (CameraSwitchButton) ocqVarK.c(R.id.camera_switch_button);
        this.M = (ViewStub) ocqVarK.c(R.id.snapshot_button_stub);
        this.o = (ThumbnailView) ocqVarK.c(R.id.thumbnail_button);
        this.N = (ViewStub) ocqVarK.c(R.id.cancel_button_stub);
        this.O = (ViewStub) ocqVarK.c(R.id.left_side_cancel_button_view_stub);
        this.Q = (ViewStub) ocqVarK.c(R.id.retake_button_view_stub);
        this.R = (ViewStub) ocqVarK.c(R.id.review_play_button_view_stub);
        this.S = (ViewStub) ocqVarK.c(R.id.next_button_stub);
        FrameLayout frameLayout = (FrameLayout) ocqVarK.c(R.id.center_placeholder);
        this.B = frameLayout;
        this.l = new EnumMap(sbv.q(fvoVar, (FrameLayout) ocqVarK.c(R.id.left_placeholder), fvoVar2, (FrameLayout) ocqVarK.c(R.id.center_left_placeholder), fvoVar3, (FrameLayout) ocqVarK.c(R.id.center_right_placeholder), fvoVar4, (FrameLayout) ocqVarK.c(R.id.right_placeholder)));
        this.m = new EnumMap(sbv.q(fvoVar, (Space) ocqVarK.c(R.id.left_space), fvoVar2, (Space) ocqVarK.c(R.id.center_left_space), fvoVar3, (Space) ocqVarK.c(R.id.center_right_space), fvoVar4, (Space) ocqVarK.c(R.id.right_space)));
        this.C = new EnumMap(sbv.o(fvoVar, (SideButtonContainer) ocqVarK.c(R.id.left_placeholder_container), fvoVar4, (SideButtonContainer) ocqVarK.c(R.id.right_placeholder_container)));
        if (z) {
            this.U = getResources().getDrawable(R.drawable.freeway_bottom_bar_button_background, null);
            this.V = getResources().getDimension(R.dimen.freeway_bottom_bar_side_button_side_length);
            v(false);
            F(fvoVar);
            F(fvoVar2);
            F(fvoVar3);
            F(fvoVar4);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.getClass();
            int iMax = Math.max(B(), g());
            layoutParams.width = iMax;
            layoutParams.height = iMax;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.requestLayout();
        }
    }

    private final int A(scn scnVar) {
        sgj sgjVarListIterator = scnVar.listIterator();
        int i = 0;
        while (sgjVarListIterator.hasNext()) {
            fvo fvoVar = (fvo) sgjVarListIterator.next();
            EnumMap enumMap = this.m;
            if (enumMap.containsKey(fvoVar)) {
                Space space = (Space) enumMap.get(fvoVar);
                space.getClass();
                ckl cklVar = (ckl) space.getLayoutParams();
                if (space.getVisibility() != 8 && cklVar != null) {
                    i += cklVar.width;
                }
            }
        }
        return i;
    }

    private final int B() {
        return getResources().getDimensionPixelSize(R.dimen.bottom_bar_content_size);
    }

    private final void C() {
        Trace.beginSection("bottomBar:applyOrientation");
        D(ojl.bj(this));
        Trace.endSection();
    }

    private final void D(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof SideButtonContainer) {
                D(ojl.bj((ViewGroup) view));
            } else {
                boolean z = true;
                if (view instanceof ZoomLockView) {
                    ZoomLockView zoomLockView = (ZoomLockView) view;
                    if (zoomLockView.a) {
                        if (this.W == mxj.TABLET_LAYOUT) {
                            zoomLockView.b(mxm.PORTRAIT);
                            zoomLockView.resetPivot();
                            qpt.aR(zoomLockView, this.r, true);
                        } else {
                            zoomLockView.b(this.r);
                            view.resetPivot();
                            qpt.aR(view, mxm.PORTRAIT, true);
                        }
                    }
                }
                view.resetPivot();
                mxm mxmVar = this.r;
                if (!this.ac && !this.W.a()) {
                    z = false;
                }
                qpt.aR(view, mxmVar, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.bottombar.BottomBar.E():void");
    }

    private final void F(fvo fvoVar) {
        FrameLayout frameLayout = (FrameLayout) this.l.get(fvoVar);
        frameLayout.getClass();
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = (int) this.V;
        layoutParams.height = (int) this.V;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    private static final int G(sbp sbpVar, int i) {
        if (i < 0 || i >= ((sex) sbpVar).c) {
            return 0;
        }
        return ((View) sbpVar.get(i)).getId();
    }

    public static void r(View view, boolean z, boolean z2) {
        out.a();
        int i = true != z ? 8 : 0;
        if (z2) {
            nnu.a(i, view, true);
            return;
        }
        view.setVisibility(i);
        view.setClickable(z);
        view.setAlpha(true != z ? 0.0f : 1.0f);
    }

    private final int z(scn scnVar) {
        sgj sgjVarListIterator = scnVar.listIterator();
        int measuredWidth = 0;
        while (sgjVarListIterator.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) this.l.get((fvo) sgjVarListIterator.next());
            frameLayout.getClass();
            if (frameLayout.getVisibility() != 8) {
                measuredWidth += frameLayout.getMeasuredWidth();
            }
        }
        return measuredWidth;
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.r != mxmVar || this.W != mxjVar) {
            this.s = true;
            this.r = mxmVar;
            this.W = mxjVar;
            E();
            this.ab = true;
            C();
        }
        this.ac = false;
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.ac = true;
    }

    public final int g() throws Resources.NotFoundException {
        if (!this.q) {
            return getResources().getDimensionPixelSize(R.dimen.bottom_bar_content_size_small);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.freeway_shutter_button_radius);
        return dimensionPixelSize + dimensionPixelSize;
    }

    public final ImageButton h() {
        if (this.H == null) {
            out.a();
            this.H = (ImageButton) this.N.inflate();
        }
        return this.H;
    }

    public final ImageButton i() {
        if (this.I == null) {
            out.a();
            this.I = (ImageButton) this.O.inflate();
        }
        return this.I;
    }

    public final ImageButton j() {
        if (this.L == null) {
            out.a();
            this.L = (ImageButton) this.S.inflate();
        }
        return this.L;
    }

    public final ImageButton k() {
        if (this.J == null) {
            out.a();
            this.J = (ImageButton) this.Q.inflate();
        }
        return this.J;
    }

    public final ImageButton l() {
        if (this.K == null) {
            out.a();
            this.K = (ImageButton) this.R.inflate();
        }
        return this.K;
    }

    public final PauseResumeButton m() {
        if (this.F == null) {
            out.a();
            this.F = (PauseResumeButton) this.P.inflate();
        }
        return this.F;
    }

    public final SnapshotButton n() {
        if (this.G == null) {
            out.a();
            this.G = (SnapshotButton) this.M.inflate();
        }
        return this.G;
    }

    public final void o(fvo fvoVar, fwd fwdVar) {
        fwc fwcVar = (fwc) this.k.get(fvoVar);
        if (fwcVar != null) {
            int iOrdinal = fwcVar.ordinal();
            if (iOrdinal == 0) {
                fwdVar.a();
            } else if (iOrdinal == 1) {
                fwdVar.b();
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                fwdVar.c();
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(this.T);
        EnumMap enumMap = this.j;
        enumMap.put((EnumMap) fvo.CENTER_LEFT, (fvo) rwc.j(this.o));
        enumMap.put((EnumMap) fvo.CENTER_RIGHT, (fvo) rwc.j(this.p));
        this.aa = getBackground().getAlpha() != 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Trace.beginSection("bottomBar:onLayout");
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.s) {
            E();
            C();
            u();
            this.s = false;
            if (this.ab) {
                this.ab = false;
            }
        }
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onSizeChanged(i, i2, i3, i4);
        int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
        int iB = B();
        if (iB > iMin) {
            cku ckuVar = new cku();
            ckuVar.g(this);
            Iterable$EL.forEach(ojl.bj(this), new jgd(this, iB, ckuVar, 1));
            ckuVar.c(this);
        }
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(sbv sbvVar, final boolean z) {
        final int i;
        out.a();
        EnumMap enumMap = this.z;
        enumMap.clear();
        EnumMap enumMap2 = new EnumMap(fvo.class);
        final int i2 = 0;
        for (fvo fvoVar : fvo.values()) {
            rvk rvkVar = rvk.a;
            if (sbvVar.containsKey(fvoVar)) {
                rwc rwcVar = (rwc) sbvVar.get(fvoVar);
                rwcVar.getClass();
                if (rwcVar.h()) {
                    enumMap.put((EnumMap) fvoVar, (fvo) rwcVar.c());
                }
                EnumMap enumMap3 = this.y;
                if (!enumMap3.containsKey(fvoVar) || !rwcVar.h() || !((View) rwcVar.c()).equals(enumMap3.get(fvoVar))) {
                    rvkVar = rwcVar;
                }
            }
            enumMap2.put((EnumMap) fvoVar, (fvo) rvkVar);
        }
        this.k.clear();
        scn scnVar = v;
        Iterator it = enumMap2.entrySet().iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((rwc) entry.getValue()).h() && scnVar.contains(entry.getKey())) {
                if (((rwc) entry.getValue()).c() instanceof ThumbnailView) {
                    z2 = true;
                } else if (((rwc) entry.getValue()).c() instanceof ndy) {
                    z3 = true;
                }
            }
        }
        final fwc fwcVar = (z2 && z3) ? fwc.GROUP : fwc.SINGLE;
        Iterable$EL.forEach(scnVar, new Consumer(this) { // from class: fvm
            public final /* synthetic */ BottomBar a;

            {
                this.a = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                if (i != 0) {
                    this.a.k.put((EnumMap) obj, (fvo) fwcVar);
                } else {
                    this.a.k.put((EnumMap) obj, (fvo) fwcVar);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return i != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
            }
        });
        scn scnVar2 = w;
        int i3 = 0;
        boolean z4 = false;
        boolean z5 = false;
        for (Map.Entry entry2 : enumMap2.entrySet()) {
            if (((rwc) entry2.getValue()).h() && scnVar2.contains(entry2.getKey())) {
                i3++;
                if (((rwc) entry2.getValue()).c() instanceof JupiterButton) {
                    z4 = true;
                } else if (((rwc) entry2.getValue()).c() instanceof CameraSwitchButton) {
                    z5 = true;
                }
            }
        }
        final fwc fwcVar2 = i3 > 1 ? (z4 && z5) ? fwc.GROUP : fwc.INDIVIDUAL : fwc.SINGLE;
        Iterable$EL.forEach(scnVar2, new Consumer(this) { // from class: fvm
            public final /* synthetic */ BottomBar a;

            {
                this.a = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                if (i2 != 0) {
                    this.a.k.put((EnumMap) obj, (fvo) fwcVar2);
                } else {
                    this.a.k.put((EnumMap) obj, (fvo) fwcVar2);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return i2 != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Map.EL.forEach(this.C, new fvk(this, i));
        Map.EL.forEach(enumMap2, new fvk(this, i2));
        Map.EL.forEach(enumMap2, new BiConsumer() { // from class: fvl
            /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
            @Override // java.util.function.BiConsumer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void accept(java.lang.Object r9, java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fvl.accept(java.lang.Object, java.lang.Object):void");
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
    }

    public final void q(fvo fvoVar, rwc rwcVar) {
        out.a();
        if (rwcVar.h()) {
            this.y.put((EnumMap) fvoVar, (fvo) rwcVar.c());
        } else {
            this.y.remove(fvoVar);
        }
        sbr sbrVar = new sbr();
        for (Map.Entry entry : this.z.entrySet()) {
            sbrVar.f((fvo) entry.getKey(), rwc.j((View) entry.getValue()));
        }
        p(sbrVar.e(), true);
    }

    public final void s(boolean z) {
        Iterator it = this.j.entrySet().iterator();
        while (it.hasNext()) {
            rwc rwcVar = (rwc) ((Map.Entry) it.next()).getValue();
            if (rwcVar.h()) {
                ((View) rwcVar.c()).setClickable(z);
            }
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        s(z);
    }

    public final void t(fvo fvoVar) {
        if (this.A.contains(fvoVar)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.l.get(fvoVar);
        frameLayout.getClass();
        frameLayout.setBackground(this.U);
        frameLayout.invalidateDrawable(this.U);
    }

    public final void u() {
        rww rwwVar;
        if (!this.q || this.t == null || (rwwVar = this.u) == null) {
            return;
        }
        if (((Boolean) rwwVar.fr()).booleanValue()) {
            v(true);
            return;
        }
        Object objFr = this.t.fr();
        objFr.getClass();
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        v(((Rect) objFr).contains(rect.centerX(), rect.centerY()));
    }

    final void v(boolean z) {
        int color = z ? getResources().getColor(R.color.freeway_background_on_viewfinder, null) : getResources().getColor(R.color.freeway_background_on_black, null);
        if (this.ad != color) {
            this.U.setTint(color);
            t(fvo.LEFT);
            t(fvo.CENTER_LEFT);
            t(fvo.CENTER_RIGHT);
            t(fvo.RIGHT);
            this.ad = color;
        }
        int i = true != z ? 2 : 3;
        this.n.s(i);
        n().s(i);
    }

    public final void w() {
        out.a();
        p(sfc.a, true);
    }

    public final void x(boolean z) {
        out.a();
        if (this.aa == z) {
            return;
        }
        this.aa = z;
        ObjectAnimator objectAnimatorOfInt = z ? ObjectAnimator.ofInt(getBackground(), "alpha", 0, 255) : ObjectAnimator.ofInt(getBackground(), "alpha", 255, 0);
        objectAnimatorOfInt.setDuration(getResources().getInteger(R.integer.bottom_bar_recording_fade_duration_ms));
        objectAnimatorOfInt.setStartDelay(getResources().getInteger(R.integer.bottom_bar_recording_fade_delay_ms));
        objectAnimatorOfInt.start();
    }

    public final void y(fvo fvoVar, rwc rwcVar) {
        out.a();
        sbr sbrVar = new sbr();
        for (Map.Entry entry : this.z.entrySet()) {
            sbrVar.f((fvo) entry.getKey(), rwc.j((View) entry.getValue()));
        }
        sbrVar.f(fvoVar, rwcVar);
        p(sbrVar.e(), true);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
