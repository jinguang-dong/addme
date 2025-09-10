package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.ar.core.R;
import defpackage.bij;
import defpackage.byy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxv extends ViewGroup implements bws, bqf, cvt, bwp {
    public static final zo F = new zo((byte[]) null);
    public static Class a;
    public static Method b;
    public static Runnable c;
    public static Method d;
    public MotionEvent A;
    public long B;
    public boolean C;
    public final bju D;
    public final bxu E;
    public final yq G;
    public final bit H;
    public final ea I;
    public final cey J;
    public final byi K;
    public final bjq L;
    public final byx M;
    public final byz N;
    public final cgf O;
    public final cgg P;
    public final byi Q;
    public final det R;
    public final byz S;
    public final ocq T;
    public final ocq U;
    public final ocq V;
    public final ocq W;
    private int aA;
    private final azr aB;
    private float aC;
    private float aD;
    private final Runnable aE;
    private final uif aF;
    private boolean aG;
    private final byz aH;
    private final zo aI;
    private final ocq aJ;
    private long aa;
    private final boolean ab;
    private final azr ac;
    private View ad;
    private final cbg ae;
    private final EmptySemanticsElement af;
    private final AndroidComposeView$bringIntoViewNode$1 ag;
    private final bik ah;
    private final bik ai;
    private final bpm aj;
    private final bpy ak;
    private byv al;
    private cho am;
    private boolean an;
    private long ao;
    private final int[] ap;
    private final float[] aq;
    private long ar;
    private boolean as;
    private long at;
    private final bbo au;
    private final ViewTreeObserver.OnGlobalLayoutListener av;
    private final ViewTreeObserver.OnScrollChangedListener aw;
    private final ViewTreeObserver.OnTouchModeChangeListener ax;
    private final AtomicReference ay;
    private final azr az;
    public final bvo e;
    public final boolean f;
    public uhf g;
    public final bje h;
    public final caa i;
    public final bvm j;
    public final cce k;
    public final byc l;
    public final bjc m;
    public final List n;
    public List o;
    public boolean p;
    public uiq q;
    public final bio r;
    public boolean s;
    public final bwu t;
    public final bvy u;
    public final float[] v;
    public final azr w;
    public uiq x;
    public final cgf y;
    public final boq z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1, bik] */
    public bxv(Context context, uhf uhfVar) {
        super(context);
        this.aa = 9205357640488583168L;
        this.ab = true;
        byte[] bArr = null;
        this.e = new bvo(bArr);
        chq chqVarN = chp.n(context);
        bap bapVar = bap.a;
        this.ac = new azz(chqVarN, bapVar);
        this.f = true;
        cbg cbgVar = new cbg();
        this.ae = cbgVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(cbgVar);
        this.af = emptySemanticsElement;
        ?? r2 = new bwa() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // defpackage.bwa
            public final /* bridge */ /* synthetic */ bij a() {
                return new byy(this.a);
            }

            @Override // defpackage.bwa
            public final /* bridge */ /* synthetic */ void b(bij bijVar) {
                ((byy) bijVar).a = this.a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }
        };
        this.ag = r2;
        bju bjuVar = new bju(new aek((Object) this, 2, (char[]) null), new bxr(this, 0), new nt(this, 5, (boolean[]) null), new ujr(this) { // from class: bxs
            @Override // defpackage.ujr
            public final Object b() {
                return ((bxv) this.e).d();
            }
        });
        this.D = bjuVar;
        this.g = uhfVar;
        bje bjeVar = new bje();
        this.h = bjeVar;
        this.R = new det();
        KeyInputElement keyInputElement = new KeyInputElement(new bxt(this));
        this.ah = keyInputElement;
        RotaryInputElement rotaryInputElement = new RotaryInputElement(byj.b);
        this.ai = rotaryInputElement;
        this.aJ = new ocq((byte[]) null, (char[]) null, (byte[]) null);
        byu byuVar = new byu(ViewConfiguration.get(context));
        this.i = byuVar;
        new brr();
        bvm bvmVar = new bvm(false, 3, bArr);
        bvmVar.X(btj.a);
        bvmVar.W(c());
        bvmVar.Z(byuVar);
        bvmVar.Y(bay.t(emptySemanticsElement, rotaryInputElement).cM(keyInputElement).cM(bjuVar.e).cM(bjeVar.c).cM(r2));
        this.j = bvmVar;
        yq yqVar = yr.a;
        yq yqVar2 = new yq((byte[]) null);
        this.G = yqVar2;
        cce cceVar = new cce(null);
        this.k = cceVar;
        cey ceyVar = new cey(bvmVar, cbgVar, yqVar2);
        this.J = ceyVar;
        byc bycVar = new byc(this);
        this.l = bycVar;
        bjc bjcVar = new bjc(this, new nt((Object) this, 4, (int[]) null));
        this.m = bjcVar;
        this.V = new ocq(context, (char[]) null);
        this.S = new byz((ViewGroup) this);
        cgg cggVar = new cgg();
        this.P = cggVar;
        this.n = new ArrayList();
        this.aj = new bpm();
        this.ak = new bpy(bvmVar);
        this.q = aau.t;
        this.r = new bio(this, cggVar);
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            bqs.a("Autofill service could not be located.");
            throw new uer();
        }
        this.H = new bit(new ocq(autofillManager, (byte[]) null), ceyVar, this, cceVar, context.getPackageName());
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.U = new ocq((ClipboardManager) systemService, (byte[]) null);
        this.K = new byi();
        this.t = new bwu(new aal(this, 12));
        this.u = new bvy(bvmVar);
        this.ao = 9223372034707292159L;
        this.ap = new int[]{0, 0};
        bld.d();
        this.v = bld.d();
        this.aq = bld.d();
        this.ar = -1L;
        this.at = 9187343241974906880L;
        bap bapVar2 = bap.c;
        this.w = new azz(null, bapVar2);
        bol bolVar = new bol(this, 13);
        pmg pmgVar = bbj.a;
        this.au = new ayv(bolVar, null);
        this.av = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: bxo
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.y();
            }
        };
        this.aw = new ViewTreeObserver.OnScrollChangedListener() { // from class: bxp
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.a.y();
            }
        };
        this.ax = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: bxq
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                this.a.W.aw(true != z ? 2 : 1);
            }
        };
        new cgg(this);
        this.y = new cgf();
        this.ay = new AtomicReference(null);
        this.M = new byx();
        this.O = new cgf(null);
        this.az = new azz(clc.ai(context), bapVar);
        this.aA = context.getResources().getConfiguration().fontWeightAdjustment;
        cib cibVarX = bdq.x(context.getResources().getConfiguration().getLayoutDirection());
        this.aB = new azz(cibVarX == null ? cib.a : cibVarX, bapVar2);
        this.z = new bzf();
        this.W = new ocq(true != isInTouchMode() ? 2 : 1, (char[]) null);
        this.L = new bjq(this);
        this.Q = new byi();
        this.N = new byz((byte[]) null);
        this.aI = new zo(bArr);
        this.I = new ea(this, 12);
        this.aE = new ea(this, 11, bArr);
        this.aF = new bol(this, 12);
        this.aH = new byz();
        addOnAttachStateChangeListener(bjcVar);
        setWillNotDraw(false);
        setFocusable(true);
        byh.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        con.i(this, bycVar);
        setOnDragListener(bjeVar);
        bvmVar.v(this);
        byd.a.a(this);
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        view.setTag(R.id.hide_in_inspector_tag, true);
        this.ad = view;
        addView(view);
        this.T = new ocq((byte[]) null, (short[]) null);
        this.E = new bxu(this);
    }

    private final int F(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.I);
        try {
            this.ar = AnimationUtils.currentAnimationTimeMillis();
            I();
            long jA = bld.a(this.v, (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX()) << 32));
            this.at = (Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jA >> 32))) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jA & 4294967295L))) & 4294967295L);
            boolean z = true;
            this.as = true;
            f(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.A;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && N(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.ak.a();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        x(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                int toolType = motionEvent.getToolType(0);
                if (!z2 && toolType == 3 && actionMasked2 != 3 && actionMasked2 != 9 && L(motionEvent)) {
                    x(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.A;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.A;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.aj.a(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.A;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.A;
                        float y = motionEvent6 != null ? motionEvent6.getY() : Float.NaN;
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (x == x2 && y == y2) {
                            z = false;
                        }
                        MotionEvent motionEvent7 = this.A;
                        long eventTime = motionEvent7 != null ? motionEvent7.getEventTime() : -1L;
                        long eventTime2 = motionEvent.getEventTime();
                        if (z || eventTime != eventTime2) {
                            if (pointerId >= 0) {
                                this.aj.a(pointerId);
                            }
                            this.ak.a.a();
                        }
                    }
                }
                this.A = MotionEvent.obtainNoHistory(motionEvent);
                return r(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.as = false;
        }
    }

    private final void G(ViewGroup viewGroup) throws Throwable {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof bxv) {
                ((bxv) childAt).h();
            } else if (childAt instanceof ViewGroup) {
                G((ViewGroup) childAt);
            }
        }
    }

    private final void H(bvm bvmVar) {
        this.u.j(bvmVar, false);
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            H((bvm) objArr[i2]);
        }
    }

    private final void I() {
        float[] fArr = this.v;
        this.aH.a(this, fArr);
        clc.ah(fArr, this.aq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(bvm bvmVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (bvmVar != null) {
            while (bvmVar != null && bvmVar.ax() == 1) {
                if (!this.an) {
                    bvm bvmVarJ = bvmVar.j();
                    if (bvmVarJ == null) {
                        break;
                    }
                    long j = bvmVarJ.n().d;
                    if (cho.j(j) && cho.i(j)) {
                        break;
                    }
                }
                bvmVar = bvmVar.j();
            }
            if (bvmVar == this.j) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void K() {
        Object obj = this.R.b;
    }

    private final boolean L(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private final boolean M(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final boolean N(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean O(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !bzu.a.a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private static final long P(int i, int i2) {
        return i2 | (i << 32);
    }

    private static final long Q(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return P(0, size);
        }
        if (mode == 0) {
            return P(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return P(size, size);
        }
        throw new IllegalStateException();
    }

    public final boolean B(bjm bjmVar, bkg bkgVar) {
        Integer numY;
        if (isFocused() || hasFocus()) {
            return true;
        }
        int iIntValue = 130;
        if (bjmVar != null && (numY = bdq.y(bjmVar.a)) != null) {
            iIntValue = numY.intValue();
        }
        return super.requestFocus(iIntValue, bkgVar != null ? blb.c(bkgVar) : null);
    }

    public final byz E() {
        return (byz) this.au.a();
    }

    @Override // defpackage.bqf
    public final long a(long j) {
        w();
        long jA = bld.a(this.v, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) + Float.intBitsToFloat((int) (this.at >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) + Float.intBitsToFloat((int) (this.at & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // defpackage.bqf
    public final long b(long j) {
        w();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.at >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.at & 4294967295L));
        return bld.a(this.aq, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // defpackage.bws
    public final chq c() {
        return (chq) this.ac.a();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.l.y(false, i, this.aa);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.l.y(true, i, this.aa);
    }

    @Override // defpackage.bws
    public final cib d() {
        return (cib) this.aB.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [bku, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            u(this.j);
        }
        byi.n(this);
        bay.C();
        this.p = true;
        ?? r0 = this.aJ.a;
        Canvas canvas2 = ((bkj) r0).a;
        ((bkj) r0).a = canvas;
        View view = null;
        this.j.A(r0, null);
        ((bkj) r0).a = canvas2;
        List list = this.n;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((bwq) list.get(i)).h();
            }
        }
        int i2 = cac.a;
        list.clear();
        this.p = false;
        List list2 = this.o;
        if (list2 != null) {
            list.addAll(list2);
            list2.clear();
        }
        if (this.f) {
            byx.a(this, this.aC);
            View view2 = this.ad;
            if (view2 == null) {
                ujp.c("frameRateCategoryView");
                view2 = null;
            }
            byx.a(view2, this.aD);
            if (!Float.isNaN(this.aD)) {
                View view3 = this.ad;
                if (view3 == null) {
                    ujp.c("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.ad;
                if (view4 == null) {
                    ujp.c("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.aC = Float.NaN;
            this.aD = Float.NaN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v19, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52, types: [bdp] */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55, types: [bdp] */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [bij] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [bij] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [bdp] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [bdp] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [bdp] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [bdp] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [bdp] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [bdp] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v14, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v15, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v19, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v20, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [bdp] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [bdp] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [bdp] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        bos bosVar;
        int size;
        bwe bweVar;
        bup bupVarY;
        bwe bweVar2;
        bqp bqpVar;
        int size2;
        bwe bweVar3;
        bup bupVarY2;
        bwe bweVar4;
        int i = 0;
        if (this.C) {
            Runnable runnable = this.aE;
            removeCallbacks(runnable);
            if (motionEvent.getActionMasked() == 8) {
                this.C = false;
            } else {
                runnable.run();
            }
        }
        if (O(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (F(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f = -motionEvent.getAxisValue(26);
            getContext();
            float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f;
            getContext();
            bqr bqrVar = new bqr(scaledVerticalScrollFactor, f * viewConfiguration.getScaledHorizontalScrollFactor(), motionEvent.getEventTime(), motionEvent.getDeviceId());
            bju bjuVar = this.D;
            bpj bpjVar = new bpj(this, motionEvent, 5);
            if (bjuVar.d.a) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            bkb bkbVarA = bjuVar.a();
            if (bkbVarA != null) {
                if (!bkbVarA.m.w) {
                    bqs.c("visitAncestors called on an unattached node");
                }
                bij bijVar = bkbVarA.m;
                bvm bvmVarB = bko.B(bkbVarA);
                loop0: while (true) {
                    if (bvmVarB == null) {
                        bupVarY2 = 0;
                        break;
                    }
                    if ((bvmVarB.s.f.o & 16384) != 0) {
                        while (bijVar != null) {
                            if ((bijVar.n & 16384) != 0) {
                                bupVarY2 = bijVar;
                                ?? bdpVar = 0;
                                while (bupVarY2 != 0) {
                                    if (bupVarY2 instanceof bqp) {
                                        break loop0;
                                    }
                                    if ((bupVarY2.n & 16384) != 0 && (bupVarY2 instanceof bup)) {
                                        bij bijVar2 = bupVarY2.y;
                                        int i2 = 0;
                                        bupVarY2 = bupVarY2;
                                        bdpVar = bdpVar;
                                        while (bijVar2 != null) {
                                            if ((bijVar2.n & 16384) != 0) {
                                                i2++;
                                                bdpVar = bdpVar;
                                                if (i2 == 1) {
                                                    bupVarY2 = bijVar2;
                                                } else {
                                                    if (bdpVar == 0) {
                                                        bdpVar = new bdp(new bij[16]);
                                                    }
                                                    if (bupVarY2 != 0) {
                                                        bdpVar.n(bupVarY2);
                                                    }
                                                    bdpVar.n(bijVar2);
                                                    bupVarY2 = 0;
                                                }
                                            }
                                            bijVar2 = bijVar2.q;
                                            bupVarY2 = bupVarY2;
                                            bdpVar = bdpVar;
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    bupVarY2 = bko.y(bdpVar);
                                }
                            }
                            bijVar = bijVar.p;
                        }
                    }
                    bvmVarB = bvmVarB.j();
                    bijVar = (bvmVarB == null || (bweVar4 = bvmVarB.s) == null) ? null : bweVar4.e;
                }
                bqpVar = (bqp) bupVarY2;
            } else {
                bqpVar = null;
            }
            if (bqpVar != null) {
                if (!bqpVar.B().w) {
                    bqs.c("visitAncestors called on an unattached node");
                }
                bij bijVar3 = bqpVar.B().p;
                bvm bvmVarB2 = bko.B(bqpVar);
                ArrayList arrayList = null;
                while (bvmVarB2 != null) {
                    if ((bvmVarB2.s.f.o & 16384) != 0) {
                        while (bijVar3 != null) {
                            if ((bijVar3.n & 16384) != 0) {
                                bij bijVarY = bijVar3;
                                bdp bdpVar2 = null;
                                while (bijVarY != null) {
                                    if (bijVarY instanceof bqp) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(bijVarY);
                                    } else if ((bijVarY.n & 16384) != 0 && (bijVarY instanceof bup)) {
                                        int i3 = 0;
                                        for (bij bijVar4 = ((bup) bijVarY).y; bijVar4 != null; bijVar4 = bijVar4.q) {
                                            if ((bijVar4.n & 16384) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    bijVarY = bijVar4;
                                                } else {
                                                    if (bdpVar2 == null) {
                                                        bdpVar2 = new bdp(new bij[16]);
                                                    }
                                                    if (bijVarY != null) {
                                                        bdpVar2.n(bijVarY);
                                                    }
                                                    bdpVar2.n(bijVar4);
                                                    bijVarY = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    bijVarY = bko.y(bdpVar2);
                                }
                            }
                            bijVar3 = bijVar3.p;
                        }
                    }
                    bvmVarB2 = bvmVarB2.j();
                    bijVar3 = (bvmVarB2 == null || (bweVar3 = bvmVarB2.s) == null) ? null : bweVar3.e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = size2 - 1;
                        if (((bqp) arrayList.get(size2)).a(bqrVar)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        size2 = i4;
                    }
                }
                bup bupVarB = bqpVar.B();
                ?? bdpVar3 = 0;
                while (bupVarB != 0) {
                    if (bupVarB instanceof bqp) {
                        if (((bqp) bupVarB).a(bqrVar)) {
                            return true;
                        }
                    } else if ((bupVarB.n & 16384) != 0 && (bupVarB instanceof bup)) {
                        bij bijVar5 = bupVarB.y;
                        int i5 = 0;
                        bupVarB = bupVarB;
                        bdpVar3 = bdpVar3;
                        while (bijVar5 != null) {
                            if ((bijVar5.n & 16384) != 0) {
                                i5++;
                                bdpVar3 = bdpVar3;
                                if (i5 == 1) {
                                    bupVarB = bijVar5;
                                } else {
                                    if (bdpVar3 == 0) {
                                        bdpVar3 = new bdp(new bij[16]);
                                    }
                                    if (bupVarB != 0) {
                                        bdpVar3.n(bupVarB);
                                    }
                                    bdpVar3.n(bijVar5);
                                    bupVarB = 0;
                                }
                            }
                            bijVar5 = bijVar5.q;
                            bupVarB = bupVarB;
                            bdpVar3 = bdpVar3;
                        }
                        if (i5 != 1) {
                        }
                    }
                    bupVarB = bko.y(bdpVar3);
                }
                if (((Boolean) bpjVar.a()).booleanValue()) {
                    return true;
                }
                bup bupVarB2 = bqpVar.B();
                ?? bdpVar4 = 0;
                while (bupVarB2 != 0) {
                    if (bupVarB2 instanceof bqp) {
                        ((bqp) bupVarB2).c(bqrVar);
                    } else if ((bupVarB2.n & 16384) != 0 && (bupVarB2 instanceof bup)) {
                        bij bijVar6 = bupVarB2.y;
                        int i6 = 0;
                        bupVarB2 = bupVarB2;
                        bdpVar4 = bdpVar4;
                        while (bijVar6 != null) {
                            if ((bijVar6.n & 16384) != 0) {
                                i6++;
                                bdpVar4 = bdpVar4;
                                if (i6 == 1) {
                                    bupVarB2 = bijVar6;
                                } else {
                                    if (bdpVar4 == 0) {
                                        bdpVar4 = new bdp(new bij[16]);
                                    }
                                    if (bupVarB2 != 0) {
                                        bdpVar4.n(bupVarB2);
                                    }
                                    bdpVar4.n(bijVar6);
                                    bupVarB2 = 0;
                                }
                            }
                            bijVar6 = bijVar6.q;
                            bupVarB2 = bupVarB2;
                            bdpVar4 = bdpVar4;
                        }
                        if (i6 != 1) {
                        }
                    }
                    bupVarB2 = bko.y(bdpVar4);
                }
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        ((bqp) arrayList.get(i7)).c(bqrVar);
                    }
                }
            }
            return false;
        }
        if (!motionEvent.isFromSource(2)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Float.floatToRawIntBits(x);
            Float.floatToRawIntBits(y);
            motionEvent.getEventTime();
            motionEvent.getActionMasked();
            bju bjuVar2 = this.D;
            bpj bpjVar2 = new bpj(this, motionEvent, 3);
            if (bjuVar2.d.a) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            } else {
                bkb bkbVarA2 = bjuVar2.a();
                if (bkbVarA2 != null) {
                    if (!bkbVarA2.m.w) {
                        bqs.c("visitAncestors called on an unattached node");
                    }
                    bij bijVar7 = bkbVarA2.m;
                    bvm bvmVarB3 = bko.B(bkbVarA2);
                    loop14: while (true) {
                        if (bvmVarB3 == null) {
                            bupVarY = 0;
                            break;
                        }
                        if ((bvmVarB3.s.f.o & 2097152) != 0) {
                            while (bijVar7 != null) {
                                if ((bijVar7.n & 2097152) != 0) {
                                    ?? bdpVar5 = 0;
                                    bupVarY = bijVar7;
                                    while (bupVarY != 0) {
                                        if (bupVarY instanceof bos) {
                                            break loop14;
                                        }
                                        if ((bupVarY.n & 2097152) != 0 && (bupVarY instanceof bup)) {
                                            bij bijVar8 = bupVarY.y;
                                            int i8 = 0;
                                            bupVarY = bupVarY;
                                            bdpVar5 = bdpVar5;
                                            while (bijVar8 != null) {
                                                if ((bijVar8.n & 2097152) != 0) {
                                                    i8++;
                                                    bdpVar5 = bdpVar5;
                                                    if (i8 == 1) {
                                                        bupVarY = bijVar8;
                                                    } else {
                                                        if (bdpVar5 == 0) {
                                                            bdpVar5 = new bdp(new bij[16]);
                                                        }
                                                        if (bupVarY != 0) {
                                                            bdpVar5.n(bupVarY);
                                                        }
                                                        bdpVar5.n(bijVar8);
                                                        bupVarY = 0;
                                                    }
                                                }
                                                bijVar8 = bijVar8.q;
                                                bupVarY = bupVarY;
                                                bdpVar5 = bdpVar5;
                                            }
                                            if (i8 != 1) {
                                            }
                                        }
                                        bupVarY = bko.y(bdpVar5);
                                    }
                                }
                                bijVar7 = bijVar7.p;
                            }
                        }
                        bvmVarB3 = bvmVarB3.j();
                        bijVar7 = (bvmVarB3 == null || (bweVar2 = bvmVarB3.s) == null) ? null : bweVar2.e;
                    }
                    bosVar = (bos) bupVarY;
                } else {
                    bosVar = null;
                }
                if (bosVar != null) {
                    if (!bosVar.B().w) {
                        bqs.c("visitAncestors called on an unattached node");
                    }
                    bij bijVar9 = bosVar.B().p;
                    bvm bvmVarB4 = bko.B(bosVar);
                    ArrayList arrayList2 = null;
                    while (bvmVarB4 != null) {
                        if ((bvmVarB4.s.f.o & 2097152) != 0) {
                            while (bijVar9 != null) {
                                if ((bijVar9.n & 2097152) != 0) {
                                    bij bijVarY2 = bijVar9;
                                    bdp bdpVar6 = null;
                                    while (bijVarY2 != null) {
                                        if (bijVarY2 instanceof bos) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(bijVarY2);
                                        } else {
                                            if ((bijVarY2.n & 2097152) != 0 && (bijVarY2 instanceof bup)) {
                                                int i9 = i;
                                                for (bij bijVar10 = ((bup) bijVarY2).y; bijVar10 != null; bijVar10 = bijVar10.q) {
                                                    if ((bijVar10.n & 2097152) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            bijVarY2 = bijVar10;
                                                        } else {
                                                            if (bdpVar6 == null) {
                                                                bdpVar6 = new bdp(new bij[16]);
                                                            }
                                                            if (bijVarY2 != null) {
                                                                bdpVar6.n(bijVarY2);
                                                            }
                                                            bdpVar6.n(bijVar10);
                                                            bijVarY2 = null;
                                                        }
                                                    }
                                                }
                                                if (i9 != 1) {
                                                }
                                            }
                                            i = 0;
                                        }
                                        bijVarY2 = bko.y(bdpVar6);
                                        i = 0;
                                    }
                                }
                                bijVar9 = bijVar9.p;
                                i = 0;
                            }
                        }
                        bvmVarB4 = bvmVarB4.j();
                        bijVar9 = (bvmVarB4 == null || (bweVar = bvmVarB4.s) == null) ? null : bweVar.e;
                        i = 0;
                    }
                    if (arrayList2 != null && arrayList2.size() - 1 >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (((bos) arrayList2.get(size)).b()) {
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                    }
                    bup bupVarB3 = bosVar.B();
                    ?? bdpVar7 = 0;
                    while (true) {
                        if (bupVarB3 != 0) {
                            if (bupVarB3 instanceof bos) {
                                if (((bos) bupVarB3).b()) {
                                    break;
                                }
                            } else if ((bupVarB3.n & 2097152) != 0 && (bupVarB3 instanceof bup)) {
                                bij bijVar11 = bupVarB3.y;
                                int i11 = 0;
                                bupVarB3 = bupVarB3;
                                bdpVar7 = bdpVar7;
                                while (bijVar11 != null) {
                                    if ((bijVar11.n & 2097152) != 0) {
                                        i11++;
                                        bdpVar7 = bdpVar7;
                                        if (i11 == 1) {
                                            bupVarB3 = bijVar11;
                                        } else {
                                            if (bdpVar7 == 0) {
                                                bdpVar7 = new bdp(new bij[16]);
                                            }
                                            if (bupVarB3 != 0) {
                                                bdpVar7.n(bupVarB3);
                                            }
                                            bdpVar7.n(bijVar11);
                                            bupVarB3 = 0;
                                        }
                                    }
                                    bijVar11 = bijVar11.q;
                                    bupVarB3 = bupVarB3;
                                    bdpVar7 = bdpVar7;
                                }
                                if (i11 != 1) {
                                }
                            }
                            bupVarB3 = bko.y(bdpVar7);
                        } else if (!((Boolean) bpjVar2.a()).booleanValue()) {
                            bup bupVarB4 = bosVar.B();
                            ?? bdpVar8 = 0;
                            while (true) {
                                if (bupVarB4 != 0) {
                                    if (bupVarB4 instanceof bos) {
                                        if (((bos) bupVarB4).a()) {
                                            break;
                                        }
                                    } else if ((bupVarB4.n & 2097152) != 0 && (bupVarB4 instanceof bup)) {
                                        bij bijVar12 = bupVarB4.y;
                                        int i12 = 0;
                                        bupVarB4 = bupVarB4;
                                        bdpVar8 = bdpVar8;
                                        while (bijVar12 != null) {
                                            if ((bijVar12.n & 2097152) != 0) {
                                                i12++;
                                                bdpVar8 = bdpVar8;
                                                if (i12 == 1) {
                                                    bupVarB4 = bijVar12;
                                                } else {
                                                    if (bdpVar8 == 0) {
                                                        bdpVar8 = new bdp(new bij[16]);
                                                    }
                                                    if (bupVarB4 != 0) {
                                                        bdpVar8.n(bupVarB4);
                                                    }
                                                    bdpVar8.n(bijVar12);
                                                    bupVarB4 = 0;
                                                }
                                            }
                                            bijVar12 = bijVar12.q;
                                            bupVarB4 = bupVarB4;
                                            bdpVar8 = bdpVar8;
                                        }
                                        if (i12 != 1) {
                                        }
                                    }
                                    bupVarB4 = bko.y(bdpVar8);
                                } else if (arrayList2 != null) {
                                    int size4 = arrayList2.size();
                                    for (int i13 = 0; i13 < size4; i13++) {
                                        if (!((bos) arrayList2.get(i13)).a()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (this.C) {
            Runnable runnable = this.aE;
            removeCallbacks(runnable);
            runnable.run();
        }
        if (!O(motionEvent) && isAttachedToWindow()) {
            byc bycVar = this.l;
            if (bycVar.C()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    bxv bxvVar = bycVar.b;
                    byi.n(bxvVar);
                    buy buyVar = new buy();
                    bxvVar.j.am((Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), buyVar, true);
                    for (int iBk = ske.bk(buyVar); iBk >= 0; iBk--) {
                        bvm bvmVarB = bko.B(buyVar.get(iBk));
                        if (((cik) bxvVar.t().a.get(bvmVarB)) != null) {
                            break;
                        }
                        if (bvmVarB.s.j(8)) {
                            int iM = bycVar.m(bvmVarB.c);
                            cbr cbrVarAc = clc.ac(bvmVarB, false);
                            if (cbs.b(cbrVarAc) && !cbrVarAc.f().f(cbu.x)) {
                                i = iM;
                                break;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    bxvVar.t().dispatchGenericMotionEvent(motionEvent);
                    bycVar.x(i);
                } else if (action == 10) {
                    if (bycVar.c != Integer.MIN_VALUE) {
                        bycVar.x(Integer.MIN_VALUE);
                    } else {
                        bycVar.b.t().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && L(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.A;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.A = MotionEvent.obtainNoHistory(motionEvent);
                    this.C = true;
                    postDelayed(this.aE, 8L);
                    return false;
                }
            } else if (!M(motionEvent)) {
                return false;
            }
            if ((F(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.D.f(keyEvent, new bpj(this, keyEvent, 4));
        }
        det.f(keyEvent.getMetaState());
        return this.D.f(keyEvent, bre.b) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v11, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v12, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [bij] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [bij] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [bij] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [bdp] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [bdp] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxv.dispatchKeyEventPreIme(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.C) {
            Runnable runnable = this.aE;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || N(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.C = false;
            }
        }
        if (O(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !M(motionEvent))) {
            return false;
        }
        int iF = F(motionEvent);
        if ((iF & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iF & 1) != 0;
    }

    @Override // defpackage.bws
    public final void e(bvm bvmVar, boolean z) {
        this.u.e(bvmVar, z);
    }

    @Override // defpackage.bws
    public final void f(boolean z) {
        uif uifVar;
        bvy bvyVar = this.u;
        if (bvyVar.h() || ((bdp) bvyVar.h.a).b != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    uifVar = this.aF;
                } finally {
                    Trace.endSection();
                }
            } else {
                uifVar = null;
            }
            if (bvyVar.i(uifVar)) {
                requestLayout();
            }
            bvyVar.b(false);
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) throws Throwable {
        bkg bkgVarW;
        if (view == null || this.u.b) {
            return super.focusSearch(view, i);
        }
        bzj bzjVar = bzl.a;
        View viewA = bad.q().a(this, view, i);
        if (view != this || (bkgVarW = this.D.b()) == null) {
            bkgVarW = bdq.w(view, this);
        }
        bjm bjmVarV = bdq.v(i);
        int i2 = bjmVarV != null ? bjmVarV.a : 6;
        uka ukaVar = new uka();
        if (this.D.c(i2, bkgVarW, new aaw(ukaVar, 12)) != null) {
            Object obj = ukaVar.a;
            if (obj != null) {
                if (viewA != null) {
                    if (kk.h(i2)) {
                        return super.focusSearch(view, i);
                    }
                    if (!acv.s(acv.z((bkb) obj), bdq.w(viewA, this), bkgVarW, i2)) {
                    }
                }
                return this;
            }
            if (viewA != null) {
            }
            return viewA;
        }
        return view;
    }

    @Override // defpackage.bws
    public final void g(bvm bvmVar, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            bvy bvyVar = this.u;
            if (!bvmVar.w) {
                bvm bvmVar2 = bvyVar.a;
                if (a.ao(bvmVar, bvmVar2)) {
                    bqs.b("measureAndLayout called on root");
                }
                if (!bvmVar2.ag()) {
                    bqs.b("performMeasureAndLayout called with unattached root");
                }
                if (!bvmVar2.ah()) {
                    bqs.b("performMeasureAndLayout called with unplaced root");
                }
                if (bvyVar.b) {
                    bqs.b("performMeasureAndLayout called during measure layout");
                }
                if (bvyVar.f != null) {
                    bvyVar.b = true;
                    bvyVar.c = false;
                    try {
                        bvyVar.g.i(bvmVar);
                        if ((bvy.l(bvmVar, new cho(j)) || bvmVar.ad()) && a.ao(bvmVar.q(), true)) {
                            bvmVar.I();
                        }
                        bvyVar.d(bvmVar);
                        bvy.m(bvmVar, new cho(j));
                        if (bvmVar.ac() && bvmVar.ah()) {
                            bvmVar.Q();
                            bvyVar.h.h(bvmVar);
                        }
                        bvyVar.c();
                        bvyVar.b = false;
                        bvyVar.c = false;
                        amo amoVar = bvyVar.i;
                    } finally {
                    }
                }
                bvyVar.a();
            }
            bvy bvyVar2 = this.u;
            if (!bvyVar2.h()) {
                bvyVar2.b(false);
            }
            this.k.a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        bkg bkgVarS = s();
        if (bkgVarS == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = Math.round(bkgVarS.b);
        rect.top = Math.round(bkgVarS.c);
        rect.right = Math.round(bkgVarS.d);
        rect.bottom = Math.round(bkgVarS.e);
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:20:0x0059, B:22:0x0073, B:25:0x008b, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00b9, B:40:0x00d3, B:42:0x00db, B:44:0x00eb, B:37:0x00c4, B:50:0x010e, B:52:0x0122, B:54:0x0128, B:58:0x0137, B:56:0x012d, B:59:0x013f), top: B:94:0x0059 }] */
    @Override // defpackage.bws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxv.h():void");
    }

    @Override // defpackage.bws
    public final void i(bvm bvmVar) {
        byc bycVar = this.l;
        bycVar.r = true;
        if (bycVar.A()) {
            bycVar.t(bvmVar);
        }
        bjc bjcVar = this.m;
        bjcVar.b = true;
        if (bjcVar.g()) {
            bjcVar.d();
        }
    }

    @Override // defpackage.bws
    public final void j(bvm bvmVar, boolean z, boolean z2, boolean z3) {
        bvm bvmVarJ;
        bvm bvmVarJ2;
        if (!z) {
            if (this.u.j(bvmVar, z2) && z3) {
                J(bvmVar);
                return;
            }
            return;
        }
        bvy bvyVar = this.u;
        if (bvmVar.h == null) {
            bqs.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAw = bvmVar.aw();
        int i = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new uet();
                }
                if (!bvmVar.ae() || z2) {
                    bvmVar.K();
                    bvmVar.L();
                    if (bvmVar.w) {
                        return;
                    }
                    if ((a.ao(bvmVar.q(), true) || bvy.n(bvmVar)) && ((bvmVarJ = bvmVar.j()) == null || !bvmVarJ.ae())) {
                        bvyVar.g.f(bvmVar, true);
                    } else if ((bvmVar.ah() || bvy.o(bvmVar)) && ((bvmVarJ2 = bvmVar.j()) == null || !bvmVarJ2.af())) {
                        bvyVar.g.f(bvmVar, false);
                    }
                    if (bvyVar.c || !z3) {
                        return;
                    }
                    J(bvmVar);
                    return;
                }
                return;
            }
        }
        bvyVar.e.n(new hwv(bvmVar, true, z2));
        amo amoVar = bvyVar.i;
    }

    @Override // defpackage.bws
    public final void k(bvm bvmVar, boolean z, boolean z2) {
        if (!z) {
            bvy bvyVar = this.u;
            int iAw = bvmVar.aw();
            int i = iAw - 1;
            if (iAw == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                amo amoVar = bvyVar.i;
                return;
            }
            if (i != 4) {
                throw new uet();
            }
            bvm bvmVarJ = bvmVar.j();
            boolean z3 = bvmVarJ == null || bvmVarJ.ah();
            if (!z2 && (bvmVar.af() || (bvmVar.ac() && bvmVar.ah() == z3 && bvmVar.ah() == bvmVar.ai()))) {
                amo amoVar2 = bvyVar.i;
                return;
            }
            bvmVar.J();
            if (!bvmVar.w && bvmVar.ai() && z3) {
                if ((bvmVarJ == null || !bvmVarJ.ac()) && (bvmVarJ == null || !bvmVarJ.af())) {
                    bvyVar.g.f(bvmVar, false);
                }
                if (bvyVar.c) {
                    return;
                }
                J(null);
                return;
            }
            return;
        }
        bvy bvyVar2 = this.u;
        int iAw2 = bvmVar.aw();
        int i2 = iAw2 - 1;
        if (iAw2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new uet();
                        }
                    }
                }
            }
            amo amoVar3 = bvyVar2.i;
            return;
        }
        if ((bvmVar.ae() || bvmVar.ad()) && !z2) {
            amo amoVar4 = bvyVar2.i;
            return;
        }
        bvmVar.t.e();
        bvmVar.J();
        if (bvmVar.w) {
            return;
        }
        bvm bvmVarJ2 = bvmVar.j();
        if (a.ao(bvmVar.q(), true) && ((bvmVarJ2 == null || !bvmVarJ2.ae()) && (bvmVarJ2 == null || !bvmVarJ2.ad()))) {
            bvyVar2.g.f(bvmVar, true);
        } else if (bvmVar.ah() && ((bvmVarJ2 == null || !bvmVarJ2.ac()) && (bvmVarJ2 == null || !bvmVarJ2.af()))) {
            bvyVar2.g.f(bvmVar, false);
        }
        if (bvyVar2.c) {
            return;
        }
        J(null);
    }

    @Override // defpackage.bws
    public final void l() {
        byc bycVar = this.l;
        bycVar.r = true;
        if (bycVar.A() && !bycVar.v) {
            bycVar.v = true;
            bycVar.h.post(bycVar.w);
        }
        bjc bjcVar = this.m;
        bjcVar.b = true;
        if (!bjcVar.g() || bjcVar.d) {
            return;
        }
        bjcVar.d = true;
        bjcVar.c.post(bjcVar.e);
    }

    @Override // defpackage.bws
    public final void m(uif uifVar) {
        zo zoVar = this.aI;
        if (zoVar.e(uifVar)) {
            return;
        }
        zoVar.o(uifVar);
    }

    @Override // defpackage.bws
    public final void n(bvm bvmVar) {
        this.u.h.h(bvmVar);
        J(null);
    }

    @Override // defpackage.bws
    public final void o(float f) {
        if (this.f) {
            if (f > 0.0f) {
                if (Float.isNaN(this.aC) || f > this.aC) {
                    this.aC = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.aD) || f < this.aD) {
                    this.aD = f;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [cwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [cwh, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        cwc lifecycle;
        Object obj;
        super.onAttachedToWindow();
        if (c == null) {
            iyy iyyVar = new iyy(1);
            c = iyyVar;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (a == null) {
                    a = Class.forName("android.os.SystemProperties");
                }
                if (b == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = a;
                    b = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = b;
                if (method != null) {
                    method.invoke(null, iyyVar);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        zo zoVar = F;
        synchronized (zoVar) {
            zoVar.o(this);
        }
        this.R.e(hasWindowFocus());
        K();
        bvm bvmVar = this.j;
        H(bvmVar);
        u(bvmVar);
        this.t.a.a();
        bio bioVar = this.r;
        if (bioVar != null) {
            bioVar.b.registerCallback(bis.a);
        }
        cwh cwhVarE = col.e(this);
        deu deuVarH = coe.h(this);
        byz byzVarE = E();
        if (byzVarE == null || (cwhVarE != null && deuVarH != null && (cwhVarE != (obj = byzVarE.a) || deuVarH != obj))) {
            if (cwhVarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (deuVarH == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (byzVarE != null && (lifecycle = byzVarE.a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            cwhVarE.getLifecycle().a(this);
            byz byzVar = new byz(cwhVarE, deuVarH);
            this.w.b(byzVar);
            uiq uiqVar = this.x;
            if (uiqVar != null) {
                uiqVar.a(byzVar);
            }
            this.x = null;
        }
        this.W.aw(true != isInTouchMode() ? 2 : 1);
        byz byzVarE2 = E();
        cwc lifecycle2 = byzVarE2 != null ? byzVarE2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            bqs.a("No lifecycle owner exists");
            throw new uer();
        }
        lifecycle2.a(this);
        lifecycle2.a(this.m);
        getViewTreeObserver().addOnGlobalLayoutListener(this.av);
        getViewTreeObserver().addOnScrollChangedListener(this.aw);
        getViewTreeObserver().addOnTouchModeChangeListener(this.ax);
        byf.a.b(this);
        bit bitVar = this.H;
        if (bitVar != null) {
            this.D.g.o(bitVar);
            ((zo) this.J.d).o(bitVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        bin.a(this.ay);
        return false;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ac.b(chp.n(getContext()));
        K();
        if (configuration.fontWeightAdjustment != this.aA) {
            this.aA = configuration.fontWeightAdjustment;
            this.az.b(clc.ai(getContext()));
        }
        this.q.a(configuration);
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onCreate(cwh cwhVar) {
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        bin.a(this.ay);
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        Object obj;
        for (long j : jArr) {
            bjc bjcVar = this.m;
            ebn ebnVar = (ebn) bjcVar.a().a((int) j);
            if (ebnVar != null && (obj = ebnVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(bjcVar.a.getAutofillId(), r2.e);
                List list = (List) clc.ad(((cbr) obj).c, cbu.y);
                if (list != null) {
                    builder.setValue(IQwwK.GbonDEDBS, TranslationRequestValue.forText(new ccm(cij.c(list, "\n", null, 62))));
                    consumer.d(builder.build());
                }
            }
        }
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onDestroy(cwh cwhVar) {
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [cwh, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f) {
            View view = this.ad;
            if (view == null) {
                ujp.c("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        zo zoVar = F;
        synchronized (zoVar) {
            zoVar.n(this);
        }
        bhg bhgVar = this.t.a;
        rnu rnuVar = bhgVar.i;
        if (rnuVar != null) {
            rnuVar.m();
        }
        synchronized (bhgVar.f) {
            bdp bdpVar = bhgVar.e;
            Object[] objArr = bdpVar.a;
            int i = bdpVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                bhf bhfVar = (bhf) objArr[i2];
                bhfVar.i.i();
                bhfVar.j.i();
                bhfVar.l.i();
                bhfVar.g.clear();
            }
        }
        byz byzVarE = E();
        cwc lifecycle = byzVarE != null ? byzVarE.a.getLifecycle() : null;
        if (lifecycle == null) {
            bqs.a("No lifecycle owner exists");
            throw new uer();
        }
        lifecycle.c(this.m);
        lifecycle.c(this);
        bio bioVar = this.r;
        if (bioVar != null) {
            bioVar.b.unregisterCallback(bis.a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.av);
        getViewTreeObserver().removeOnScrollChangedListener(this.aw);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.ax);
        byf.a.a(this);
        bit bitVar = this.H;
        if (bitVar != null) {
            ((zo) this.J.d).n(bitVar);
            this.D.g.n(bitVar);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        acv.B(this.D.c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.ar = 0L;
        this.u.i(this.aF);
        this.am = null;
        y();
        if (this.al != null) {
            t().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                H(this.j);
            }
            long jQ = Q(i);
            long jQ2 = Q(i2);
            long jL = chp.l((int) (jQ >>> 32), (int) (jQ & 4294967295L), (int) (jQ2 >>> 32), (int) (4294967295L & jQ2));
            cho choVar = this.am;
            if (choVar == null) {
                this.am = new cho(jL);
                this.an = false;
            } else if (!a.q(choVar.a, jL)) {
                this.an = true;
            }
            bvy bvyVar = this.u;
            cho choVar2 = bvyVar.f;
            if (choVar2 == null || !a.q(choVar2.a, jL)) {
                if (bvyVar.b) {
                    bqs.b("updateRootConstraints called while measuring");
                }
                bvyVar.f = new cho(jL);
                bvm bvmVar = bvyVar.a;
                if (bvmVar.h != null) {
                    bvmVar.K();
                }
                bvmVar.L();
                bvyVar.g.f(bvmVar, bvmVar.h != null);
            }
            byz byzVar = bvyVar.g;
            if (byzVar.g()) {
                bvm bvmVar2 = bvyVar.a;
                if (!bvmVar2.ag()) {
                    bqs.b("performMeasureAndLayout called with unattached root");
                }
                if (!bvmVar2.ah()) {
                    bqs.b("performMeasureAndLayout called with unplaced root");
                }
                if (bvyVar.b) {
                    bqs.b("performMeasureAndLayout called during measure layout");
                }
                if (bvyVar.f != null) {
                    bvyVar.b = true;
                    bvyVar.c = false;
                    try {
                        if (!((buq) byzVar.b).d()) {
                            if (bvmVar2.h != null) {
                                bvyVar.g(bvmVar2, true);
                            } else {
                                bvyVar.f(bvmVar2);
                            }
                        }
                        bvyVar.g(bvmVar2, false);
                        bvyVar.b = false;
                        bvyVar.c = false;
                        amo amoVar = bvyVar.i;
                    } finally {
                    }
                }
            }
            bvm bvmVar3 = this.j;
            setMeasuredDimension(bvmVar3.g(), bvmVar3.e());
            if (this.al != null) {
                t().measure(View.MeasureSpec.makeMeasureSpec(bvmVar3.g(), 1073741824), View.MeasureSpec.makeMeasureSpec(bvmVar3.e(), 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onPause(cwh cwhVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            r11 = this;
            if (r12 == 0) goto Lf1
            bit r13 = r11.H
            r0 = 1
            if (r13 == 0) goto L9a
            cey r1 = r13.g
            android.view.autofill.AutofillId r2 = r13.d
            java.lang.String r3 = r13.c
            cce r4 = r13.b
            java.lang.Object r1 = r1.c
            r5 = r1
            bvm r5 = (defpackage.bvm) r5
            defpackage.kk.n(r12, r5, r2, r3, r4)
            zo r1 = defpackage.zp.c(r1, r12)
        L1b:
            boolean r2 = r1.g()
            if (r2 == 0) goto L9a
            int r2 = r1.b
            int r2 = r2 + (-1)
            java.lang.Object r2 = r1.h(r2)
            r2.getClass()
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            int r5 = r1.b
            int r5 = r5 + (-1)
            java.lang.Object r5 = r1.h(r5)
            r5.getClass()
            bvm r5 = (defpackage.bvm) r5
            java.util.List r5 = r5.t()
            int r6 = r5.size()
            r7 = 0
        L44:
            if (r7 >= r6) goto L1b
            java.lang.Object r8 = r5.get(r7)
            bvm r8 = (defpackage.bvm) r8
            boolean r9 = r8.w
            if (r9 != 0) goto L97
            boolean r9 = r8.ag()
            if (r9 == 0) goto L97
            boolean r9 = r8.ah()
            if (r9 != 0) goto L5d
            goto L97
        L5d:
            cbn r9 = r8.p()
            if (r9 == 0) goto L91
            zu r9 = r9.c
            cbz r10 = defpackage.cbm.g
            boolean r10 = defpackage.zu.e(r9, r10)
            if (r10 != 0) goto L7d
            cbz r10 = defpackage.cbu.q
            boolean r10 = defpackage.zu.e(r9, r10)
            if (r10 != 0) goto L7d
            cbz r10 = defpackage.cbu.r
            boolean r9 = defpackage.zu.e(r9, r10)
            if (r9 == 0) goto L91
        L7d:
            int r9 = r2.addChildCount(r0)
            android.view.ViewStructure r9 = r2.newChild(r9)
            android.view.autofill.AutofillId r10 = r13.d
            defpackage.kk.n(r9, r8, r10, r3, r4)
            r1.o(r8)
            r1.o(r9)
            goto L97
        L91:
            r1.o(r8)
            r1.o(r2)
        L97:
            int r7 = r7 + 1
            goto L44
        L9a:
            bio r11 = r11.r
            if (r11 == 0) goto Lf1
            cgg r13 = r11.d
            java.lang.Object r13 = r13.a
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto La9
            goto Lf1
        La9:
            int r1 = r13.size()
            int r1 = r12.addChildCount(r1)
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
            boolean r2 = r13.hasNext()
            if (r2 != 0) goto Lc0
            goto Lf1
        Lc0:
            java.lang.Object r13 = r13.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r2 = r13.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r13 = r13.getValue()
            biu r13 = (defpackage.biu) r13
            android.view.ViewStructure r12 = r12.newChild(r1)
            android.view.autofill.AutofillId r13 = r11.c
            r12.setAutofillId(r13, r2)
            android.view.View r11 = r11.a
            android.content.Context r11 = r11.getContext()
            java.lang.String r11 = r11.getPackageName()
            defpackage.bad.h(r12, r2, r11)
            r12.setAutofillType(r0)
            r11 = 0
            throw r11
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxv.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194)) {
            motionEvent.isFromSource(16386);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // defpackage.cvt
    public final void onResume(cwh cwhVar) {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.ab) {
            cib cibVarX = bdq.x(i);
            if (cibVarX == null) {
                cibVarX = cib.a;
            }
            this.aB.b(cibVarX);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        ocq ocqVar = this.T;
        if (ocqVar != null) {
            cey ceyVar = this.J;
            uhf uhfVar = this.g;
            bdp bdpVar = new bdp(new cbb[16]);
            blb.r(ceyVar.c(), 0, new cba(bdpVar));
            bdpVar.j(new aod(new uiq[]{aap.o, aap.p}, 11, false ? 1 : 0));
            int i = bdpVar.b;
            cbb cbbVar = i != 0 ? bdpVar.a[i - 1] : null;
            if (cbbVar == null) {
                return;
            }
            und undVarJ = ung.j(uhfVar);
            cbr cbrVar = cbbVar.a;
            chz chzVar = cbbVar.c;
            cav cavVar = new cav(cbrVar, chzVar, undVarJ, ocqVar, this);
            bkg bkgVarV = byi.v(cbbVar.d);
            long jB = chzVar.b();
            ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, blb.d(chx.c(bkgVarV)), new Point(chy.a(jB), chy.b(jB)), cavVar);
            scrollCaptureTarget.setScrollBounds(blb.d(chzVar));
            consumer.d(scrollCaptureTarget);
        }
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onStart(cwh cwhVar) {
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onStop(cwh cwhVar) {
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        boolean zAo = a.ao(Looper.getMainLooper().getThread(), Thread.currentThread());
        bjc bjcVar = this.m;
        if (zAo) {
            kk.m(bjcVar, longSparseArray);
        } else {
            bjcVar.a.post(new at(bjcVar, longSparseArray, 11));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.R.e(z);
        this.aG = true;
        super.onWindowFocusChanged(z);
    }

    @Override // defpackage.bws
    public final boolean p() {
        return byw.a.a(this);
    }

    @Override // defpackage.bws
    public final qqq q() {
        return (qqq) this.az.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final int r(MotionEvent motionEvent) {
        Object obj;
        if (this.aG) {
            this.aG = false;
            det.f(motionEvent.getMetaState());
        }
        bpm bpmVar = this.aj;
        cpq cpqVarB = bpmVar.b(motionEvent, this);
        if (cpqVarB == null) {
            this.ak.a();
            return 0;
        }
        ?? r1 = cpqVarB.a;
        int size = r1.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = r1.get(size);
                if (((bpx) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        bpx bpxVar = (bpx) obj;
        if (bpxVar != null) {
            this.aa = bpxVar.d;
        }
        int iB = this.ak.b(cpqVarB, this, L(motionEvent));
        cpqVarB.b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && (iB & 1) == 0) {
            bpmVar.a(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        bju bjuVar = this.D;
        int iOrdinal = bjuVar.c.c().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (iOrdinal != 3) {
            throw new uet();
        }
        bjm bjmVarV = bdq.v(i);
        int i2 = bjmVarV != null ? bjmVarV.a : 7;
        return a.ao(bjuVar.c(i2, rect != null ? blb.e(rect) : null, new bzn(i2, 1)), true);
    }

    public final bkg s() {
        if (isFocused()) {
            return this.D.b();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return bdq.w(viewFindFocus, this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final byv t() {
        if (this.al == null) {
            byv byvVar = new byv(getContext());
            this.al = byvVar;
            addView(byvVar);
            requestLayout();
        }
        byv byvVar2 = this.al;
        byvVar2.getClass();
        return byvVar2;
    }

    public final void u(bvm bvmVar) {
        bvmVar.F();
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            u((bvm) objArr[i2]);
        }
    }

    public final void v() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    public final void w() {
        if (this.as) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.ar) {
            this.ar = jCurrentAnimationTimeMillis;
            I();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.ap;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = iArr[1];
            this.at = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f2 - f4) & 4294967295L);
        }
    }

    public final void x(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jA = a((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jA >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jA & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        cpq cpqVarB = this.aj.b(motionEventObtain, this);
        cpqVarB.getClass();
        this.ak.b(cpqVarB, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r12 = this;
            int[] r0 = r12.ap
            r12.getLocationOnScreen(r0)
            long r1 = r12.ao
            int r3 = defpackage.chy.a(r1)
            int r1 = defpackage.chy.b(r1)
            r2 = 0
            r4 = r0[r2]
            r5 = 1
            if (r3 != r4) goto L21
            r6 = r0[r5]
            if (r1 != r6) goto L21
            long r6 = r12.ar
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L43
        L21:
            r0 = r0[r5]
            long r6 = (long) r4
            long r8 = (long) r0
            r0 = 32
            long r6 = r6 << r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r6 = r6 | r8
            r12.ao = r6
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L43
            if (r1 == r0) goto L43
            bvm r0 = r12.j
            bvq r0 = r0.t
            bvz r0 = r0.o
            r0.B()
            r0 = r5
            goto L44
        L43:
            r0 = r2
        L44:
            r12.w()
            cce r1 = r12.k
            long r3 = r12.ao
            long r6 = r12.at
            long r6 = defpackage.chp.I(r6)
            float[] r8 = r12.v
            int r9 = defpackage.byx.m(r8)
            r9 = r9 & 2
            if (r9 == 0) goto L5c
            r8 = 0
        L5c:
            ccf r9 = r1.b
            long r10 = r9.b
            boolean r10 = defpackage.a.q(r6, r10)
            if (r10 != 0) goto L6a
            r9.b = r6
            r6 = r5
            goto L6b
        L6a:
            r6 = r2
        L6b:
            long r10 = r9.c
            boolean r7 = defpackage.a.q(r3, r10)
            if (r7 != 0) goto L76
            r9.c = r3
            r6 = r5
        L76:
            if (r8 == 0) goto L7a
        L78:
            r2 = r5
            goto L81
        L7a:
            if (r6 != 0) goto L78
            boolean r3 = r1.c
            if (r3 == 0) goto L81
            goto L78
        L81:
            r1.c = r2
            bvy r12 = r12.u
            r12.b(r0)
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxv.y():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        cbn cbnVarP;
        cbc cbcVar;
        uiq uiqVar;
        bit bitVar = this.H;
        if (bitVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                if (autofillValue.isText()) {
                    bvm bvmVar = (bvm) ((yq) bitVar.g.b).a(iKeyAt);
                    if (bvmVar != null && (cbnVarP = bvmVar.p()) != null && (cbcVar = (cbc) clc.ad(cbnVarP, cbm.g)) != null && (uiqVar = (uiq) cbcVar.b) != null) {
                    }
                } else if (autofillValue.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValue.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValue.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        bio bioVar = this.r;
        if (bioVar != null) {
            ?? r7 = bioVar.d.a;
            if (r7.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (((biu) r7.get(Integer.valueOf(iKeyAt2))) != null) {
                        throw null;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new ueu("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new ueu("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new ueu(CGlJpiVWrCQOq.QVLsz);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }
}
