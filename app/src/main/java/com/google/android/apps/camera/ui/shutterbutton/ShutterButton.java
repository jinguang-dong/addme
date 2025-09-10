package com.google.android.apps.camera.ui.shutterbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import defpackage.cot;
import defpackage.cto;
import defpackage.fgp;
import defpackage.ftk;
import defpackage.fvq;
import defpackage.gzi;
import defpackage.gzo;
import defpackage.gzz;
import defpackage.hay;
import defpackage.hbj;
import defpackage.ht;
import defpackage.inl;
import defpackage.iyu;
import defpackage.ltw;
import defpackage.mej;
import defpackage.mew;
import defpackage.mpc;
import defpackage.mxj;
import defpackage.nci;
import defpackage.ncj;
import defpackage.nck;
import defpackage.ncl;
import defpackage.ncm;
import defpackage.ncn;
import defpackage.nco;
import defpackage.ncp;
import defpackage.ncq;
import defpackage.ndo;
import defpackage.ndv;
import defpackage.ndw;
import defpackage.nkw;
import defpackage.nli;
import defpackage.nlj;
import defpackage.ojl;
import defpackage.owb;
import defpackage.owf;
import defpackage.owm;
import defpackage.paq;
import defpackage.pbl;
import defpackage.pbm;
import defpackage.pbn;
import defpackage.pbp;
import defpackage.pez;
import defpackage.pnq;
import defpackage.rnu;
import defpackage.scn;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.syj;
import defpackage.uif;
import j$.util.OptionalInt;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShutterButton extends ht {
    public static ncp a;
    public syj A;
    public rnu B;
    private boolean F;
    private final owm G;
    private GestureDetector H;
    private nli I;
    private final AtomicBoolean J;
    private int K;
    private int L;
    private final Object M;
    private ndw N;
    private Paint O;
    private Paint P;
    private Paint Q;
    private Paint R;
    private Paint S;
    private Paint T;
    private Paint U;
    private Paint V;
    private Paint W;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private paq ae;
    private final AccessibilityNodeInfo.AccessibilityAction af;
    private final AccessibilityNodeInfo.AccessibilityAction ag;
    private pbp ah;
    private pbp ai;
    private int aj;
    private pez ak;
    public boolean b;
    public final owf c;
    public ndo d;
    public pbn e;
    public pnq f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public float i;
    public ndv j;
    public final boolean[] k;
    public Paint l;
    public RectF m;
    public boolean n;
    public mxj o;
    public boolean p;
    public boolean q;
    public int r;
    public ncm s;
    public nkw t;
    public int u;
    public boolean v;
    public boolean w;
    public MotionEvent x;
    public hbj z;
    private static final sgv C = sgv.g("com.google.android.apps.camera.ui.shutterbutton.ShutterButton");
    private static final scn D = scn.L(ncn.NIGHT_IDLE, ncn.ASTRO_IDLE, ncn.PORTRAIT_IDLE, ncn.PHOTO_IDLE, ncn.TIMELAPSE_IDLE, ncn.VIDEO_IDLE, ncn.LANDSCAPE_IDLE, ncn.ACTION_PAN_IDLE, ncn.AMBER_IDLE, ncn.COTTAGE_IDLE, ncn.VIDEO_NIGHT_SIGHT_IDLE, ncn.SLOW_MOTION_IDLE, ncn.ROOSTER_IDLE);
    public static int y = 1;
    private static final VibrationEffect E = VibrationEffect.startComposition().addPrimitive(1, 0.7f, 0).compose();

    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private final void u(int i) {
        if (this.ad) {
            if (this.t == nkw.COTTAGE) {
                syj syjVar = this.A;
                if (syjVar == null || i != 0) {
                    return;
                }
                syjVar.h(E);
                return;
            }
            if (this.t != nkw.SERENGETI) {
                if (i == 0) {
                    performHapticFeedback(6);
                    return;
                } else {
                    performHapticFeedback(4);
                    return;
                }
            }
            if (this.A == null || i != 0) {
                return;
            }
            if (d() == ncn.SERENGETI_IDLE) {
                this.A.h(VibrationEffect.startComposition().addPrimitive(2, 1.0f, 0).compose());
            } else {
                this.A.h(VibrationEffect.startComposition().addPrimitive(1, 1.0f, 0).addPrimitive(1, 1.0f, 52).compose());
            }
        }
    }

    private final void v() {
        ndw ndwVarE = e();
        ncn ncnVar = ndwVarE.B;
        ltw ltwVar = ndwVarE.C;
        h(false);
        m(f(ncnVar, ltwVar));
        invalidate();
    }

    private final void w(ncn ncnVar) {
        Resources resources = getResources();
        int iOrdinal = ncnVar.ordinal();
        int i = R.string.accessibility_capture_video_stop;
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 38:
            case 44:
            case 45:
            case 46:
            case 51:
            case 52:
            case 53:
            default:
                i = R.string.accessibility_take_photo_button;
                break;
            case 3:
            case 4:
                i = R.string.accessibility_take_portrait_button;
                break;
            case 5:
            case 6:
            case 43:
            case 56:
            case 57:
                if (this.t != nkw.SLOW_MOTION) {
                    if (this.t != nkw.AMBER) {
                        i = R.string.accessibility_capture_video_start;
                        break;
                    } else {
                        i = R.string.accessibility_amber_start;
                        break;
                    }
                } else {
                    i = R.string.accessibility_hfr_video_start;
                    break;
                }
            case 7:
            case 23:
            case 24:
                i = R.string.accessibility_cancel_button;
                break;
            case 8:
            case 9:
            case 10:
                i = R.string.accessibility_done_button;
                break;
            case 11:
                if (this.t != nkw.SLOW_MOTION) {
                    if (this.t == nkw.AMBER) {
                        i = R.string.accessibility_amber_stop;
                        break;
                    }
                } else {
                    i = R.string.accessibility_hfr_video_stop;
                    break;
                }
                break;
            case 12:
                i = R.string.accessibility_capture_imax_start;
                break;
            case 13:
                i = R.string.accessibility_capture_imax_stop;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
                i = R.string.accessibility_take_nightsight_button;
                break;
            case 17:
            case 18:
            case 19:
                i = R.string.accessibility_take_catshark_portrait_button;
                break;
            case 25:
            case 26:
                i = R.string.accessibility_take_astro_button;
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                i = R.string.accessibility_take_lasagna_button;
                break;
            case 33:
            case 34:
            case 37:
                i = R.string.accessibility_cheetah_video_start;
                break;
            case ImageFormat.YUV_420_888 /* 35 */:
            case 36:
                i = R.string.accessibility_cheetah_video_stop;
                break;
            case 39:
                break;
            case 40:
                i = R.string.accessibility_autotimer_start;
                break;
            case 41:
                i = R.string.accessibility_autotimer_stop;
                break;
            case 42:
                i = R.string.accessibility_take_photosphere_button;
                break;
            case 47:
                i = R.string.accessibility_capture_serengeti_start;
                break;
            case 48:
                i = R.string.accessibility_capture_serengeti_start_night;
                break;
            case 49:
            case 50:
                i = R.string.accessibility_capture_serengeti_stop;
                break;
            case 54:
                i = R.string.accessibility_video_night_sight_start;
                break;
            case 55:
                i = R.string.accessibility_video_night_sight_stop;
                break;
        }
        super.setContentDescription(resources.getString(i));
    }

    public float a() {
        return (this.n && this.o == mxj.TABLET_LAYOUT) ? 0.861f : 1.0f;
    }

    protected float b() {
        if (this.n) {
            return 0.0f;
        }
        return nlj.b(3.0f);
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        invalidate();
        super.buildDrawingCache(z);
    }

    public void c(ncn ncnVar, ncq ncqVar) throws Resources.NotFoundException {
        o(ncnVar, e().C, ncqVar);
    }

    public final ncn d() {
        return e().B;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8 A[PHI: r6 r9 r11 r12 r13
      0x01f8: PHI (r6v28 int) = (r6v21 int), (r6v32 int), (r6v35 int) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r9v10 float) = (r9v3 float), (r9v11 float), (r9v12 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r11v11 float) = (r11v8 float), (r11v14 float), (r11v17 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r12v20 boolean) = (r12v7 boolean), (r12v22 boolean), (r12v28 boolean) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r13v7 float) = (r13v4 float), (r13v10 float), (r13v13 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb A[PHI: r6 r9 r11 r12 r13
      0x01fb: PHI (r6v22 int) = (r6v21 int), (r6v32 int), (r6v35 int) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r9v4 float) = (r9v3 float), (r9v11 float), (r9v12 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r11v9 float) = (r11v8 float), (r11v14 float), (r11v17 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r12v12 boolean) = (r12v7 boolean), (r12v22 boolean), (r12v28 boolean) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r13v5 float) = (r13v4 float), (r13v10 float), (r13v13 float) binds: [B:111:0x0266, B:102:0x0230, B:92:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.shutterbutton.ShutterButton.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.ht, android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        ndo ndoVar;
        super.drawableStateChanged();
        boolean zIsPressed = isPressed();
        if (!zIsPressed && this.g.compareAndSet(true, false) && (ndoVar = this.d) != null) {
            ndoVar.f();
        }
        if (zIsPressed != this.ac) {
            ndo ndoVar2 = this.d;
            if (ndoVar2 != null) {
                ndoVar2.b(zIsPressed);
            }
            this.ac = zIsPressed;
        }
    }

    public final ndw e() {
        ndw ndwVar;
        synchronized (this.M) {
            ndwVar = this.N;
        }
        return ndwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ndw f(defpackage.ncn r17, defpackage.ltw r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.shutterbutton.ShutterButton.f(ncn, ltw):ndw");
    }

    public final void g(boolean z) {
        isEnabled();
        this.F = z;
    }

    @Override // android.widget.ImageView
    public final Drawable getDrawable() {
        return getBackground();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.drawable.Animatable2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.graphics.drawable.Animatable2, java.lang.Object] */
    final void h(boolean z) {
        pez pezVar = this.ak;
        if (pezVar != null) {
            if (z) {
                Iterator it = pezVar.b.iterator();
                while (it.hasNext()) {
                    ((cto) it.next()).n();
                }
                Object obj = pezVar.c;
                if (obj != null) {
                    ((AnimatorSet) obj).end();
                }
                ?? r3 = pezVar.a;
                if (r3 != 0) {
                    r3.stop();
                }
            }
            pez pezVar2 = this.ak;
            Iterator it2 = pezVar2.b.iterator();
            while (it2.hasNext()) {
                ((cto) it2.next()).c();
            }
            Object obj2 = pezVar2.c;
            if (obj2 != null) {
                ((AnimatorSet) obj2).cancel();
            }
            ?? r2 = pezVar2.a;
            if (r2 != 0) {
                r2.stop();
            }
        }
    }

    public final void i() {
        if (!r() || getVisibility() != 0) {
            isEnabled();
            getVisibility();
        } else {
            ndo ndoVar = this.d;
            if (ndoVar != null) {
                ndoVar.e();
            }
        }
    }

    public final void j(ncn ncnVar) {
        m(f(ncnVar, e().C));
        v();
    }

    public final void k(boolean z, ncq ncqVar) throws Resources.NotFoundException {
        ncn ncnVarD = d();
        if (!z) {
            if (!this.n) {
                ncqVar.a(1.0f, 250).start();
            }
            switch (ncnVarD.ordinal()) {
                case 1:
                    c(ncn.PHOTO_IDLE, ncqVar);
                    break;
                case 4:
                    c(ncn.PORTRAIT_IDLE, ncqVar);
                    break;
                case 6:
                    c(ncn.VIDEO_RECORDING, ncqVar);
                    break;
                case 15:
                    c(ncn.CATSHARK_PHOTO_IDLE, ncqVar);
                    break;
                case 18:
                    c(ncn.CATSHARK_PORTRAIT_IDLE, ncqVar);
                    break;
                case 21:
                case ImageFormat.RGBA_FP16 /* 22 */:
                    c(ncn.NIGHT_IDLE, ncqVar);
                    break;
                case 26:
                    c(ncn.ASTRO_IDLE, ncqVar);
                    break;
                case 28:
                    c(ncn.LANDSCAPE_IDLE, ncqVar);
                    break;
                case 31:
                    c(ncn.ACTION_PAN_IDLE, ncqVar);
                    break;
                case 34:
                    c(ncn.TIMELAPSE_RECORDING, ncqVar);
                    break;
                case 45:
                    c(ncn.SQUAD_IDLE, ncqVar);
                    break;
                case 52:
                    c(ncn.COTTAGE_IDLE, ncqVar);
                    break;
            }
        }
        if (!isEnabled() || !this.b) {
            isEnabled();
            return;
        }
        if (!this.n) {
            ncqVar.a(1.06f, 100).start();
        }
        int iOrdinal = ncnVarD.ordinal();
        if (iOrdinal == 0) {
            c(ncn.PHOTO_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 3) {
            c(ncn.PORTRAIT_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 14) {
            c(ncn.CATSHARK_PHOTO_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 17) {
            c(ncn.CATSHARK_PORTRAIT_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 20) {
            c(ncn.NIGHT_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 25) {
            c(ncn.ASTRO_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 27) {
            c(ncn.LANDSCAPE_PRESSED, ncqVar);
            return;
        }
        if (iOrdinal == 30) {
            c(ncn.ACTION_PAN_PRESSED, ncqVar);
        } else if (iOrdinal == 44) {
            c(ncn.SQUAD_PRESSED, ncqVar);
        } else {
            if (iOrdinal != 51) {
                return;
            }
            c(ncn.COTTAGE_PRESSED, ncqVar);
        }
    }

    public final void l(boolean z) {
        getClass().getSimpleName();
        isEnabled();
        isClickable();
        this.b = z;
        setClickable(z);
        this.G.a();
        invalidate();
    }

    public final void m(ndw ndwVar) {
        synchronized (this.M) {
            this.N = ndwVar;
        }
        this.j = new ndv(ndwVar);
    }

    public final void n(boolean z, boolean z2) {
        if (z) {
            this.ah.a();
        } else {
            pbn pbnVar = this.e;
            if (pbnVar != null) {
                this.ah = pbnVar.a("ShutterButton#disabled");
            }
        }
        getClass().getSimpleName();
        isEnabled();
        isClickable();
        super.setEnabled(z);
        l(z);
        this.ae.close();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.r, true != z ? 165 : 255);
        valueAnimatorOfInt.setDuration(150L);
        byte[] bArr = null;
        valueAnimatorOfInt.addUpdateListener(new cot(this, 15, bArr));
        if (!z) {
            valueAnimatorOfInt.setStartDelay(true != z2 ? 0L : 500L);
            nci nciVar = new nci(this);
            valueAnimatorOfInt.addUpdateListener(nciVar);
            valueAnimatorOfInt.addListener(new ncj(valueAnimatorOfInt, nciVar));
        }
        valueAnimatorOfInt.getClass();
        this.ae = new mpc(valueAnimatorOfInt, 6, bArr);
        valueAnimatorOfInt.start();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.graphics.drawable.Animatable2, java.lang.Object] */
    public final void o(final ncn ncnVar, final ltw ltwVar, ncq ncqVar) throws Resources.NotFoundException {
        w(ncnVar);
        hbj hbjVar = this.z;
        if (hbjVar == null || !hbjVar.p(gzo.bs)) {
            this.ad = ncnVar == ncn.VIDEO_IDLE || ncnVar == ncn.IMAX_IDLE || ncnVar == ncn.IMAX_RECORDING;
        } else {
            this.ad = true;
        }
        if (this.z != null && !this.f.m()) {
            this.aa = this.z.p(gzz.q);
            invalidate();
        }
        ndw ndwVarE = e();
        if (ncnVar == ndwVarE.B && ltwVar == ndwVarE.C) {
            return;
        }
        ltw ltwVar2 = ndwVarE.C;
        h(true);
        ndw ndwVarE2 = e();
        final ndw ndwVarF = f(ncnVar, ltwVar);
        pez pezVarB = ncqVar.b(ndwVarF);
        synchronized (this.M) {
            this.N = ndwVarF;
        }
        this.j = new ndv(ndwVarE2);
        pezVarB.d = new uif() { // from class: nch
            @Override // defpackage.uif
            public final Object a() {
                ShutterButton shutterButton = this.a;
                if (shutterButton.n) {
                    shutterButton.m(shutterButton.f(ncnVar, ltwVar));
                } else {
                    shutterButton.j = new ndv(ndwVarF);
                }
                shutterButton.p = false;
                shutterButton.invalidate();
                return ufg.a;
            }
        };
        this.ak = pezVarB;
        this.p = true;
        Iterator it = pezVarB.b.iterator();
        while (it.hasNext()) {
            ((cto) it.next()).g();
        }
        Object obj = pezVarB.c;
        if (obj != null) {
            ((AnimatorSet) obj).start();
        }
        ?? r6 = pezVarB.a;
        if (r6 != 0) {
            r6.start();
        }
        setTag(ncnVar.toString());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        LightingColorFilter lightingColorFilter;
        int i;
        ndw ndwVarB = this.j.b();
        int i2 = ndwVarB.g;
        this.P.setColor(i2);
        int i3 = ndwVarB.f;
        this.P.setAlpha(i3);
        Drawable drawableMutate = null;
        this.T.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        this.S.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        if (this.W == null) {
            Paint paint = new Paint();
            this.W = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.V = paint2;
            paint2.setAntiAlias(true);
            this.V.setStrokeWidth(nlj.b(3.0f));
            this.V.setStyle(Paint.Style.STROKE);
            this.V.setColor(-1);
        }
        this.T.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
        this.S.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
        this.S.setAlpha(127);
        Paint paint3 = this.W;
        int i4 = ndwVarB.y;
        paint3.setColor(i4);
        if (!this.n) {
            this.W.setAlpha((int) ((ndwVarB.j > 0 ? 0.86f : 0.32f) * 255.0f));
        }
        this.R.setAlpha(ndwVarB.w);
        this.Q.setColor(ndwVarB.i);
        this.O.setColor(i4);
        boolean zIsEnabled = isEnabled();
        ncn ncnVar = ndwVarB.B;
        int i5 = 0;
        if (this.q && !zIsEnabled && D.contains(ncnVar)) {
            int i6 = this.r;
            lightingColorFilter = new LightingColorFilter(Color.rgb(i6, i6, i6), 0);
        } else {
            lightingColorFilter = null;
        }
        if (lightingColorFilter == null) {
            isEnabled();
        }
        this.V.setColorFilter(lightingColorFilter);
        this.W.setColorFilter(lightingColorFilter);
        this.T.setColorFilter(lightingColorFilter);
        this.S.setColorFilter(lightingColorFilter);
        this.P.setColorFilter(lightingColorFilter);
        this.Q.setColorFilter(lightingColorFilter);
        this.O.setColorFilter(lightingColorFilter);
        this.U.setColorFilter(lightingColorFilter);
        rnu rnuVar = this.B;
        if (rnuVar != null) {
            Object obj = rnuVar.a;
            mej mejVar = mej.ACTIVITY_SHUTTER_BUTTON_DRAWN;
            mew mewVar = CameraActivityTiming.a;
            ((iyu) obj).e.l(mejVar, mewVar);
            if (r()) {
                iyu iyuVar = (iyu) this.B.a;
                CameraActivityTiming cameraActivityTiming = iyuVar.e;
                if (cameraActivityTiming.n(mejVar)) {
                    mej mejVar2 = mej.ACTIVITY_SHUTTER_BUTTON_ENABLED;
                    if (!cameraActivityTiming.n(mejVar2)) {
                        cameraActivityTiming.l(mejVar2, mewVar);
                        cameraActivityTiming.g.a();
                        cameraActivityTiming.g = pbp.a;
                        iyuVar.F.e(ftk.a);
                    }
                }
            }
        }
        this.V.setAlpha(ndwVarB.H);
        if (!this.ab) {
            this.R.setColor(ojl.aP(this));
        }
        this.P.setColor(i2);
        this.P.setAlpha(i3);
        this.U.setColor(ndwVarB.I);
        canvas.drawCircle(this.K, this.L, ndwVarB.A * this.i, this.V);
        canvas.drawCircle(this.K, this.L, ndwVarB.z * this.i, this.W);
        int i7 = ndwVarB.m;
        int i8 = ndwVarB.e;
        if (i7 <= i8 || ndwVarB.l <= i8) {
            canvas.drawCircle(this.K, this.L, i7 * this.i, this.S);
        }
        int i9 = ndwVarB.l;
        if (i9 < i8) {
            canvas.drawCircle(this.K, this.L, i9 * this.i, this.T);
        }
        if (i3 > 0) {
            float f = i8;
            if (this.n) {
                float f2 = this.i;
                float f3 = f * f2;
                float f4 = (i8 - ndwVarB.k) * f2;
                float f5 = this.K;
                float f6 = this.L;
                canvas.drawRoundRect(f5 - f3, f6 - f3, f5 + f3, f3 + f6, f4, f4, this.P);
            } else {
                canvas.drawCircle(this.K, this.L, f * this.i, this.P);
            }
        }
        if (ndwVarB.v) {
            if (ncnVar == ncn.PHOTO_LONGPRESS) {
                this.R.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
            }
            canvas.drawCircle(this.K, this.L, ndwVarB.x * this.i, this.R);
        }
        if (ncnVar == ncn.VIDEO_IDLE || ncnVar == ncn.VIDEO_PRESSED || ncnVar == ncn.AUTOTIMER_RUNNING || ncnVar == ncn.CONFIRM_ENABLED || ncnVar == ncn.CONFIRM_DISABLED || ncnVar == ncn.VIDEO_RECORDING || ncnVar == ncn.TIMELAPSE_IDLE || ncnVar == ncn.TIMELAPSE_RECORDING || ncnVar == ncn.TIMELAPSE_PRESSED || ncnVar == ncn.IMAX_RECORDING || ncnVar == ncn.NIGHT_STOP || ncnVar == ncn.AMBER_IDLE || ncnVar == ncn.SLOW_MOTION_IDLE || ncnVar == ncn.ROOSTER_IDLE || this.p) {
            int i10 = ndwVarB.h;
            if (i10 > 0) {
                canvas.drawCircle(this.K, this.L, i10 * this.i, this.Q);
            }
            if (ndwVarB.j > 0 && ndwVarB.G > 0 && (i = y) != 1 && i != 2) {
                ndw ndwVarE = e();
                float f7 = ndwVarE.D;
                float f8 = ndwVarE.E;
                float f9 = ndwVarE.F;
                while (true) {
                    boolean[] zArr = this.k;
                    int length = zArr.length;
                    if (i5 >= 30) {
                        break;
                    }
                    if (zArr[i5]) {
                        canvas.save();
                        canvas.rotate(i5 * 12.0f, this.K, this.L);
                        canvas.drawRoundRect(this.K - nlj.b(0.5f), f8, this.K + nlj.b(0.5f), f8 + f7, f9, f9, this.l);
                        canvas.restore();
                    }
                    i5++;
                }
                if (y == 4) {
                    q();
                }
            }
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) ndwVarB.o.f();
        Drawable.ConstantState constantState = (Drawable.ConstantState) ndwVarB.n.f();
        if (animatedVectorDrawable != null && this.n) {
            drawableMutate = animatedVectorDrawable;
        } else if (constantState != null) {
            drawableMutate = constantState.newDrawable().mutate();
            OptionalInt optionalInt = ndwVarB.s;
            if (optionalInt.isPresent()) {
                drawableMutate.setTint(optionalInt.getAsInt());
            } else {
                drawableMutate.setColorFilter(lightingColorFilter);
            }
        }
        if (drawableMutate != null) {
            int i11 = ndwVarB.u;
            int i12 = this.K;
            int i13 = this.L;
            drawableMutate.setBounds(i12 - i11, i13 - i11, i12 + i11, i13 + i11);
            drawableMutate.getBounds();
            drawableMutate.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled() && isAccessibilityFocused() && accessibilityEvent.getContentChangeTypes() == 4096 && accessibilityEvent.getEventType() == 2048) {
            ((sgt) C.c().M(5318)).s("Ignore state announcement");
        } else {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = this.af;
        accessibilityNodeInfo.removeAction(accessibilityAction);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = this.ag;
        accessibilityNodeInfo.removeAction(accessibilityAction2);
        if (this.t != nkw.PHOTO) {
            return;
        }
        ncn ncnVar = e().B;
        if (ncnVar == ncn.PHOTO_IDLE || ncnVar == ncn.CATSHARK_PHOTO_IDLE) {
            setClickable(true);
            accessibilityNodeInfo.addAction(accessibilityAction);
        } else if (ncnVar == ncn.PHOTO_LONGPRESS || ncnVar == ncn.PHOTO_LONGPRESS_LOCKED) {
            if (this.J.get()) {
                setEnabled(true);
                setClickable(false);
            }
            accessibilityNodeInfo.addAction(accessibilityAction2);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        p();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.K = i / 2;
        this.L = i2 / 2;
        p();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void p() {
        int i = (int) (e().z * this.i);
        int i2 = this.K - i;
        int i3 = this.L - i;
        this.m.set(i2, i3, r0 + i2, i3 + i + i);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == R.id.action_long_shot_start) {
            ndo ndoVar = this.d;
            if (ndoVar != null) {
                this.J.set(true);
                ndoVar.b(true);
                ndoVar.h();
            }
        } else {
            if (i != R.id.action_long_shot_end) {
                return super.performAccessibilityAction(i, bundle);
            }
            ndo ndoVar2 = this.d;
            if (ndoVar2 != null) {
                this.J.set(false);
                ndoVar2.f();
                ndoVar2.b(false);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        ndo ndoVar;
        pbn pblVar = this.e;
        if (pblVar == null) {
            pblVar = new pbl();
        }
        pbm pbmVar = new pbm(pblVar, "ShutterButton#performClick");
        try {
            if (!r()) {
                isEnabled();
                pbmVar.close();
                return false;
            }
            boolean zPerformClick = super.performClick();
            if (getVisibility() == 0 && (ndoVar = this.d) != null) {
                nli nliVar = this.I;
                if (nliVar != null) {
                    ndoVar.i(nliVar);
                }
                this.I = null;
                this.d.a();
            }
            pbmVar.close();
            return zPerformClick;
        } catch (Throwable th) {
            try {
                pbmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void q() {
        a.sendMessageDelayed(a.obtainMessage(1001), 1000L);
    }

    public final boolean r() {
        return !this.F && this.b;
    }

    public final void s(int i) {
        if (this.n && this.aj != i) {
            this.aj = i;
            pez pezVar = this.ak;
            if (pezVar == null || !pezVar.h()) {
                v();
            } else {
                this.j.n(f(d(), ltw.f).y);
            }
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        n(z, true);
    }

    public final void t(int i) {
        int i2 = this.u;
        if (i2 >= 30) {
            i2 = 0;
            this.u = 0;
            boolean z = this.w;
            this.v = z;
            this.w = !z;
        }
        int i3 = i2;
        int i4 = 29;
        if (i == 4) {
            boolean z2 = !this.v;
            this.v = z2;
            boolean[] zArr = this.k;
            if (i2 == 0) {
                int length = zArr.length;
            } else {
                i4 = i2 - 1;
            }
            zArr[i4] = z2;
            invalidate();
            return;
        }
        if (i != 3) {
            if (i == 5) {
                this.k[i3] = this.w;
                this.u = i3 + 1;
                invalidate();
                return;
            }
            return;
        }
        boolean[] zArr2 = this.k;
        if (i3 == 0) {
            int length2 = zArr2.length;
        } else {
            i4 = i3 - 1;
        }
        zArr2[i4] = this.w;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShutterButton(Context context, AttributeSet attributeSet, boolean z) throws Resources.NotFoundException {
        boolean zP;
        super(context, attributeSet);
        this.F = false;
        this.b = false;
        owm owmVar = new owm(new fvq(this, 10));
        this.G = owmVar;
        this.c = owb.a(owmVar);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.J = new AtomicBoolean(false);
        this.M = new Object();
        this.k = new boolean[30];
        this.n = false;
        this.o = mxj.PHONE_LAYOUT;
        this.aa = false;
        this.ab = false;
        this.ad = false;
        this.q = true;
        this.ae = new fgp(19);
        this.af = new AccessibilityNodeInfo.AccessibilityAction(R.id.action_long_shot_start, getResources().getString(R.string.accessibility_longshot_capture));
        this.ag = new AccessibilityNodeInfo.AccessibilityAction(R.id.action_long_shot_end, getResources().getString(R.string.accessibility_capture_video_stop));
        pbp pbpVar = pbp.a;
        this.ah = pbpVar;
        this.ai = pbpVar;
        if (context instanceof inl) {
            ((nck) ((inl) context).c(nck.class)).d(this);
        }
        getClass().getSimpleName();
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (longPressTimeout <= 0) {
            ((sgt) C.c().M(5308)).u("System has invalid long press threshold value=%d ms", longPressTimeout);
        }
        this.ab = z;
        hbj hbjVar = this.z;
        if (hbjVar != null) {
            if (z) {
                gzi gziVar = hay.a;
                zP = false;
            } else {
                zP = hbjVar.p(gzo.bw);
            }
            this.n = zP;
        }
        this.aj = true != z ? 1 : 3;
        setLayerType(2, null);
        this.H = new GestureDetector(context, new ncl(this));
        Paint paint = new Paint();
        this.O = paint;
        paint.setAntiAlias(true);
        this.O.setColor(-1);
        this.R = new Paint(this.O);
        Paint paint2 = new Paint();
        this.W = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.V = paint3;
        paint3.setAntiAlias(true);
        this.V.setStrokeWidth(b());
        this.V.setStyle(Paint.Style.STROKE);
        this.V.setColor(-1);
        Paint paint4 = new Paint();
        this.U = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint(this.O);
        this.P = paint5;
        paint5.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
        Paint paint6 = new Paint(this.O);
        this.T = paint6;
        paint6.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        Paint paint7 = new Paint(this.O);
        this.S = paint7;
        paint7.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        this.r = 255;
        Paint paint8 = new Paint(this.O);
        this.Q = paint8;
        paint8.setColor(getResources().getColor(R.color.video_mode_color, null));
        Paint paint9 = new Paint();
        this.l = paint9;
        paint9.setAntiAlias(true);
        this.l.setColor(-1);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(nlj.b(2.3f));
        ndw ndwVarF = f(ncn.PHOTO_IDLE, ltw.f);
        m(ndwVarF);
        v();
        this.m = new RectF();
        this.i = a();
        setOutlineProvider(new nco(this));
        w(ndwVarF.B);
        l(false);
    }
}
