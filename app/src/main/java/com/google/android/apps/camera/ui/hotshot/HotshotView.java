package com.google.android.apps.camera.ui.hotshot;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import android.util.AttributeSet;
import com.google.android.apps.camera.ui.hotshot.HotshotView;
import com.google.ar.core.R;
import defpackage.efh;
import defpackage.efm;
import defpackage.efs;
import defpackage.efx;
import defpackage.eia;
import defpackage.eji;
import defpackage.elq;
import defpackage.hfo;
import defpackage.jgf;
import defpackage.lig;
import defpackage.mdn;
import defpackage.mux;
import defpackage.muy;
import defpackage.muz;
import defpackage.mwd;
import defpackage.mwg;
import defpackage.mwh;
import defpackage.mwi;
import defpackage.mwj;
import defpackage.mwk;
import defpackage.mwl;
import defpackage.mwm;
import defpackage.mwo;
import defpackage.nlj;
import defpackage.nmv;
import defpackage.ovx;
import defpackage.owq;
import defpackage.pnu;
import defpackage.sbp;
import defpackage.sbv;
import defpackage.sex;
import defpackage.sgv;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HotshotView extends hfo {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.hotshot.HotshotView");
    private static final int r = Color.argb(255, 232, 200, 107);
    private static final int s = Color.argb(128, 220, 54, 46);
    private final Paint A;
    private final Paint B;
    private final Paint C;
    private final Paint D;
    private final Paint E;
    private final efs F;
    private final efs G;
    private final nmv H;
    private final eia I;
    private final eia J;
    private final eia K;
    private List L;
    private efh M;
    private efh N;
    private efh O;
    private efh P;
    private efh Q;
    private elq R;
    private elq S;
    private elq T;
    private long U;
    private float V;
    private volatile Rect W;
    public final RectF b;
    public mwd c;
    public boolean d;
    public float f;
    public mwo g;
    public Rect h;
    public int i;
    public boolean j;
    public owq k;
    public volatile List l;
    public volatile Map m;
    public volatile List n;
    public volatile mwj o;
    public volatile RectF p;
    public boolean q;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final Paint w;
    private final Paint x;
    private final Paint y;
    private final Paint z;

    public HotshotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.t = new Paint();
        this.u = new Paint();
        this.v = new Paint();
        this.w = new Paint();
        this.x = new Paint();
        this.y = new Paint();
        this.z = new Paint();
        this.A = new Paint();
        this.B = new Paint();
        this.C = new Paint();
        this.D = new Paint();
        this.E = new Paint();
        this.F = new efs();
        this.G = new efs();
        this.H = new nmv(3);
        this.I = new eia("main", "mainShape", "mainSize");
        this.J = new eia("pulse", "pulseShape", "pulseSize");
        this.K = new eia("pulse", "pulseShape", "pulseStroke");
        this.c = mwd.IDLE;
        this.d = true;
        this.f = 1.0f;
        this.g = mwo.ONLY_FOR_FACE;
        this.h = new Rect();
        this.i = 0;
        this.j = false;
        this.U = 0L;
        this.V = 0.0f;
        this.k = new ovx(new mwl[0]);
        int i = sbp.d;
        sbp sbpVar = sex.a;
        this.l = sbpVar;
        this.m = new HashMap();
        this.n = sbpVar;
        this.o = mwj.a(sbpVar);
        this.p = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.W = new Rect(0, 0, 0, 0);
        this.q = false;
        c();
    }

    private final float d() {
        if (this.V == 0.0f && this.U == 0) {
            this.U = SystemClock.elapsedRealtime();
        }
        float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.U) / this.Q.a();
        this.V = fElapsedRealtime;
        if (fElapsedRealtime < 1.0f) {
            return fElapsedRealtime;
        }
        this.V = 1.0f;
        return 1.0f;
    }

    private final PointF e(float f, float f2) {
        if (!this.e.f()) {
            return new PointF(0.0f, 0.0f);
        }
        float[] fArr = {f, f2};
        a().mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    private final RectF f(mwo mwoVar, RectF rectF) {
        if (!mwoVar.equals(mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT)) {
            float fMax = Math.max(rectF.width(), rectF.height()) / 2.0f;
            return new RectF(rectF.centerX() - fMax, rectF.centerY() - fMax, rectF.centerX() + fMax, rectF.centerY() + fMax);
        }
        float fMax2 = (Math.max(rectF.width(), rectF.height()) * 0.861f) / 2.0f;
        float fMax3 = (Math.max(rectF.width(), rectF.height()) * 1.018f) / 2.0f;
        int i = this.i % 180;
        float fCenterX = rectF.centerX();
        float f = i != 0 ? fMax3 : fMax2;
        float f2 = fCenterX - f;
        float fCenterY = rectF.centerY();
        if (i == 0) {
            fMax2 = fMax3;
        }
        return new RectF(f2, fCenterY - fMax2, rectF.centerX() + f, rectF.centerY() + fMax2);
    }

    private final RectF g(mwk mwkVar) {
        mux muxVar = mwkVar.a;
        nmv nmvVar = (nmv) this.m.get(Integer.valueOf(muxVar.b));
        return nmvVar != null ? nmvVar.a() : muxVar.d;
    }

    private final void h(Canvas canvas) {
        if (this.n.isEmpty()) {
            return;
        }
        for (mux muxVar : this.n) {
            RectF rectF = muxVar.d;
            RectF rectFB = b(o(rectF, 0.8f), true);
            RectF rectFB2 = b(rectF, true);
            canvas.drawRect(rectFB2, l(rectFB2, rectFB) ? this.w : this.t);
            mwo mwoVar = this.g;
            mwo mwoVar2 = mwo.DEBUG_OBJECT_DETECTION;
            if (mwoVar.equals(mwoVar2)) {
                String str = muxVar.f;
                String str2 = muxVar.a.al;
                if (!str.equals(str2)) {
                    str = String.format(Locale.ROOT, "%s(%s)", str, str2);
                }
                canvas.drawText(str, rectFB2.left, rectFB2.bottom, this.B);
            }
            canvas.drawText(this.g.equals(mwoVar2) ? muxVar.f : muxVar.a.al, rectFB2.left, rectFB2.bottom, this.B);
            PointF pointFE = e(rectF.centerX(), rectF.centerY());
            Paint paint = this.y;
            m(pointFE, paint, canvas);
            if (muxVar.a.equals(muz.FACE_CAM_HAL)) {
                Face face = (Face) muxVar.j.get();
                RectF rectFN = n(face.getBounds());
                RectF rectFB3 = b(p(face.getBounds()), true);
                canvas.drawRect(rectFB3, l(rectFB3, rectFN) ? this.w : this.v);
                m(e(face.getBounds().centerX(), face.getBounds().centerY()), paint, canvas);
                m(e(face.getLeftEyePosition().x, face.getLeftEyePosition().y), paint, canvas);
                m(e(face.getRightEyePosition().x, face.getRightEyePosition().y), paint, canvas);
                m(e(face.getMouthPosition().x, face.getMouthPosition().y), paint, canvas);
            }
        }
    }

    private final void i(Canvas canvas, muz muzVar, RectF rectF, boolean z, boolean z2) {
        efs efsVar;
        efh efhVar;
        boolean z3;
        int i;
        efh efhVar2;
        boolean z4;
        if ((this.g.equals(mwo.OBJECT_DETECTION_WITH_BORDER_GUIDANCE) || this.g.equals(mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT)) && !this.W.isEmpty()) {
            this.p = rectF;
            if (!muzVar.a() || this.g.equals(mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT)) {
                efsVar = new efs();
                if (z2) {
                    efhVar = this.Q;
                    z3 = true;
                } else {
                    efhVar = this.P;
                    z3 = false;
                }
                efsVar.v(efhVar);
                eia eiaVar = this.I;
                PointF pointF = efx.l;
                efsVar.g(eiaVar, pointF, this.R);
                efsVar.g(this.J, pointF, this.S);
                efsVar.g(this.K, efx.s, this.T);
                if (z3) {
                    efsVar.s(d());
                } else {
                    i = true == z ? 0 : 20;
                    k();
                    efsVar.r(i);
                }
            } else {
                efsVar = new efs();
                if (z2) {
                    efhVar2 = this.O;
                    z4 = true;
                } else {
                    efhVar2 = this.N;
                    z4 = false;
                }
                efsVar.v(efhVar2);
                eia eiaVar2 = this.I;
                PointF pointF2 = efx.k;
                efsVar.g(eiaVar2, pointF2, this.R);
                efsVar.g(this.J, pointF2, this.S);
                efsVar.g(this.K, efx.s, this.T);
                if (z4) {
                    efsVar.s(d());
                } else {
                    i = true == z ? 0 : 20;
                    k();
                    efsVar.r(i);
                }
            }
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f / getResources().getDisplayMetrics().density, 1.0f / getResources().getDisplayMetrics().density);
            matrix.postTranslate(((this.p.width() - this.W.width()) / 2.0f) + rectF.left, ((this.p.height() - this.W.height()) / 2.0f) + rectF.top);
            eji ejiVar = efsVar.k;
            efh efhVar3 = efsVar.a;
            if (ejiVar != null && efhVar3 != null) {
                if (efsVar.m) {
                    canvas.save();
                    canvas.concat(matrix);
                    efsVar.p(canvas, ejiVar);
                    canvas.restore();
                } else {
                    ejiVar.b(canvas, matrix, efsVar.l);
                }
                efsVar.n = false;
            }
            efsVar.j();
        }
    }

    private final void j(float f) {
        if (this.M == null) {
            return;
        }
        float f2 = (f / 300.0f) / getResources().getDisplayMetrics().density;
        Rect rect = this.M.g;
        efs efsVar = this.F;
        efsVar.setBounds(new Rect(0, 0, (int) (rect.width() * f2), (int) (rect.height() * f2)));
        this.G.setBounds(efsVar.getBounds());
    }

    private final void k() {
        this.V = 0.0f;
        this.U = 0L;
    }

    private final boolean l(RectF rectF, RectF rectF2) {
        if (rectF2.left != rectF.left && rectF2.top != rectF.top && rectF2.right != rectF.right && rectF2.bottom != rectF.bottom) {
            float fWidth = rectF2.width() / rectF2.height();
            float fWidth2 = rectF.width() / rectF.height();
            float fAbs = Math.abs(rectF2.left - rectF.left);
            float fAbs2 = Math.abs(rectF2.top - rectF.top);
            float fAbs3 = Math.abs(rectF2.right - rectF.right);
            float fAbs4 = Math.abs(rectF2.bottom - rectF.bottom);
            if (Math.abs(fAbs - fAbs3) <= 2.0f && Math.abs(fAbs2 - fAbs4) <= 2.0f) {
                float f = 1.0f;
                if (this.q && Math.abs(fWidth - 0.75f) <= 0.025f) {
                    f = 0.75f;
                }
                return Math.abs(fWidth2 - f) > 0.025f;
            }
        }
        return true;
    }

    private static final void m(PointF pointF, Paint paint, Canvas canvas) {
        canvas.drawLine(pointF.x - 20.0f, pointF.y, pointF.x + 20.0f, pointF.y, paint);
        canvas.drawLine(pointF.x, pointF.y - 20.0f, pointF.x, pointF.y + 20.0f, paint);
    }

    private final RectF n(Rect rect) {
        return b(new RectF(rect), true);
    }

    private static final RectF o(RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        if (f != 1.0f) {
            float fWidth = (rectF.width() / 2.0f) * f;
            float fHeight = (rectF.height() / 2.0f) * f;
            rectF2.left = rectF.centerX() - fWidth;
            rectF2.top = rectF.centerY() - fHeight;
            rectF2.right = rectF.centerX() + fWidth;
            rectF2.bottom = rectF.centerY() + fHeight;
        }
        return rectF2;
    }

    private static final RectF p(Rect rect) {
        return o(new RectF(rect), 1.6f);
    }

    public final RectF b(RectF rectF, boolean z) {
        if (!this.e.f()) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        RectF rectF2 = new RectF(rectF);
        a().mapRect(rectF2);
        if (z) {
            rectF2.intersect(this.b);
        }
        return rectF2;
    }

    public final void c() {
        if (this.g.equals(mwo.DEBUG_ONLY_FOR_FACE)) {
            Paint paint = this.t;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(6.0f);
            paint.setColor(-1);
            Paint paint2 = this.v;
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(6.0f);
            paint2.setColor(-256);
            Paint paint3 = this.w;
            paint3.setAntiAlias(true);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(10.0f);
            paint3.setColor(-65536);
            Paint paint4 = this.y;
            paint4.setAntiAlias(true);
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeWidth(5.0f);
            paint4.setColor(-16776961);
            ArrayList arrayList = new ArrayList();
            this.L = arrayList;
            arrayList.add(new mwm(mwd.READY_TO_CAPTURE, new Paint()));
            mwd mwdVar = mwd.DISTANCE_1;
            if (mwdVar.a(false) != 2.1474836E9f) {
                this.L.add(new mwm(mwdVar, new Paint()));
            }
            mwd mwdVar2 = mwd.DISTANCE_2;
            if (mwdVar2.a(false) != 2.1474836E9f) {
                this.L.add(new mwm(mwdVar2, new Paint()));
            }
            mwd mwdVar3 = mwd.DISTANCE_3;
            if (mwdVar3.a(false) != 2.1474836E9f) {
                this.L.add(new mwm(mwdVar3, new Paint()));
            }
            Iterable$EL.forEach(this.L, new lig(6));
            Paint paint5 = this.B;
            paint5.setAntiAlias(true);
            paint5.setStyle(Paint.Style.FILL);
            paint5.setStrokeWidth(1.0f);
            paint5.setColor(paint.getColor());
            paint5.setTextSize(40.0f);
            paint5.setTextAlign(Paint.Align.LEFT);
            paint5.setShadowLayer(nlj.b(2.0f), 0.0f, nlj.b(1.0f), -16777216);
            return;
        }
        if (!this.g.equals(mwo.DEBUG_OBJECT_DETECTION) && !this.g.equals(mwo.OBJECT_DETECTION_WITH_BORDER_GUIDANCE) && !this.g.equals(mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT)) {
            Paint paint6 = this.t;
            paint6.setAntiAlias(true);
            paint6.setStyle(Paint.Style.STROKE);
            paint6.setStrokeWidth(6.0f);
            paint6.setColor(-1);
            Paint paint7 = this.w;
            paint7.setAntiAlias(true);
            paint7.setStyle(Paint.Style.STROKE);
            paint7.setStrokeWidth(6.0f);
            paint7.setColor(-65536);
            Paint paint8 = this.x;
            paint8.setAntiAlias(true);
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setStrokeWidth(6.0f);
            paint8.setColor(r);
            paint8.setAntiAlias(true);
            Paint paint9 = this.u;
            paint9.setStyle(Paint.Style.STROKE);
            paint9.setStrokeWidth(2.0f);
            paint9.setColor(-16777216);
            ArrayList arrayList2 = new ArrayList();
            this.L = arrayList2;
            arrayList2.add(new mwm(mwd.DISTANCE_1, new Paint()));
            Iterable$EL.forEach(this.L, new jgf(14));
            Paint paint10 = this.z;
            paint10.setAntiAlias(true);
            paint10.setStyle(Paint.Style.STROKE);
            paint10.setStrokeWidth(2.0f);
            paint10.setColor(-16777216);
            return;
        }
        Paint paint11 = this.A;
        paint11.setAntiAlias(true);
        paint11.setStyle(Paint.Style.STROKE);
        paint11.setStrokeWidth(6.0f);
        paint11.setColor(-1);
        Paint paint12 = this.C;
        paint12.setAntiAlias(true);
        paint12.setStyle(Paint.Style.STROKE);
        paint12.setStrokeWidth(6.0f);
        paint12.setColor(-65536);
        Paint paint13 = this.D;
        paint13.setAntiAlias(true);
        paint13.setStyle(Paint.Style.STROKE);
        paint13.setStrokeWidth(6.0f);
        paint13.setColor(r);
        paint13.setAntiAlias(true);
        Paint paint14 = this.B;
        paint14.setAntiAlias(true);
        paint14.setStyle(Paint.Style.FILL);
        paint14.setStrokeWidth(1.0f);
        paint14.setColor(this.t.getColor());
        paint14.setTextSize(40.0f);
        paint14.setTextAlign(Paint.Align.LEFT);
        paint14.setShadowLayer(nlj.b(2.0f), 0.0f, nlj.b(1.0f), -16777216);
        Paint paint15 = this.E;
        paint15.setStyle(Paint.Style.STROKE);
        paint15.setStrokeWidth(80.0f);
        paint15.setColor(s);
        if (this.g.equals(mwo.DRAW_RECTANGLE_FOR_KEY_SUBJECT)) {
            this.F.j();
            this.G.j();
        }
    }

    @Override // android.view.View
    protected final void onDraw(final Canvas canvas) {
        RectF rectF;
        efs efsVar;
        final HotshotView hotshotView = this;
        if (hotshotView.j) {
            hotshotView.j = false;
            return;
        }
        int iOrdinal = hotshotView.g.ordinal();
        if (iOrdinal == 1) {
            h(canvas);
            RectF rectF2 = hotshotView.b;
            final float fCenterX = rectF2.centerX();
            final float fCenterY = rectF2.centerY();
            Iterable$EL.forEach(hotshotView.L, new Consumer() { // from class: mwf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    mwm mwmVar = (mwm) obj;
                    Paint paint = mwmVar.b;
                    mwd mwdVar = mwmVar.a;
                    HotshotView hotshotView2 = this.a;
                    paint.setStrokeWidth(true != mwdVar.equals(hotshotView2.c) ? 2.0f : 15.0f);
                    canvas.drawCircle(fCenterX, fCenterY, (mwdVar.a(false) * hotshotView2.f) / 100.0f, paint);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (iOrdinal == 2) {
            h(canvas);
            return;
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            if (hotshotView.l.isEmpty()) {
                hotshotView.k.a(new mwl[0]);
                return;
            }
            mwl[] mwlVarArr = new mwl[hotshotView.l.size()];
            int i = 0;
            while (i < hotshotView.l.size()) {
                Face face = (Face) hotshotView.l.get(i);
                RectF rectFB = hotshotView.b(p(face.getBounds()), false);
                if (i == 0) {
                    nmv nmvVar = hotshotView.H;
                    nmvVar.b(rectFB);
                    rectFB = nmvVar.a();
                    i = 0;
                }
                float fMax = Math.max(rectFB.width(), rectFB.height()) / 2.0f;
                boolean zL = hotshotView.l(hotshotView.b(p(face.getBounds()), true), hotshotView.n(face.getBounds()));
                mwlVarArr[i] = new mwl(pnu.a(face), zL);
                float fCenterX2 = rectFB.centerX();
                float fCenterY2 = rectFB.centerY();
                boolean zEquals = hotshotView.c.equals(mwd.READY_TO_CAPTURE);
                hotshotView.j(fMax);
                efs efsVar2 = hotshotView.F;
                if (zEquals) {
                    efsVar = hotshotView.G;
                    if (((int) efsVar.b.f) == 0 && !efsVar.u()) {
                        efsVar.n();
                    }
                } else {
                    efs efsVar3 = hotshotView.G;
                    efsVar3.l();
                    efsVar3.r(0);
                    efsVar = efsVar2;
                }
                efsVar2.r(zL ? 0 : zEquals ? 40 : 20);
                canvas.save();
                canvas.translate(fCenterX2 - (efsVar2.getBounds().width() / 2.0f), fCenterY2 - (efsVar2.getBounds().height() / 2.0f));
                efsVar.draw(canvas);
                canvas.restore();
                i++;
            }
            hotshotView.k.a(mwlVarArr);
            return;
        }
        sbp sbpVar = hotshotView.o.a;
        sbv sbvVarM = sbv.m(hotshotView.m);
        hotshotView.m.clear();
        int size = sbpVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            mux muxVar = ((mwk) sbpVar.get(i2)).a;
            Integer numValueOf = Integer.valueOf(muxVar.b);
            nmv nmvVar2 = (nmv) sbvVarM.get(numValueOf);
            if (nmvVar2 == null) {
                nmvVar2 = new nmv(3);
            }
            nmvVar2.b(muxVar.d);
            hotshotView.m.put(numValueOf, nmvVar2);
        }
        if (sbpVar.isEmpty()) {
            return;
        }
        if (sbpVar.size() > 0 && !((mwk) sbpVar.get(0)).e.equals(hotshotView.h)) {
            hotshotView.m.clear();
            return;
        }
        if (sbpVar.size() == 1 || hotshotView.o.c == 1) {
            mwk mwkVar = (mwk) sbpVar.get(0);
            if (sbpVar.size() > 1 && !mwkVar.a.a.a()) {
                Optional optionalFindFirst = Collection.EL.stream(sbpVar).filter(new mdn(6)).findFirst();
                if (optionalFindFirst.isPresent()) {
                    mwkVar = (mwk) optionalFindFirst.get();
                }
            }
            new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            muz muzVar = mwkVar.a.a;
            if (muzVar.a()) {
                rectF = hotshotView.f(hotshotView.g, hotshotView.b(hotshotView.g(mwkVar), false));
            } else {
                RectF rectFG = hotshotView.g(mwkVar);
                muy muyVar = mwkVar.b;
                RectF rectFB2 = hotshotView.b(rectFG, true);
                rectF = new RectF(muyVar.q ? hotshotView.b.left + 3.0f : rectFB2.left, muyVar.r ? hotshotView.b.top + 3.0f : rectFB2.top, muyVar.s ? hotshotView.b.right - 3.0f : rectFB2.right, muyVar.t ? hotshotView.b.bottom - 3.0f : rectFB2.bottom);
            }
            hotshotView.i(canvas, muzVar, rectF, mwkVar.b.c(), hotshotView.c.equals(mwd.READY_TO_CAPTURE));
        }
        if (hotshotView.o.c >= 2) {
            int size2 = sbpVar.size();
            int i3 = 0;
            while (i3 < size2) {
                mwk mwkVar2 = (mwk) sbpVar.get(i3);
                muz muzVar2 = mwkVar2.a.a;
                if (muzVar2.a()) {
                    hotshotView.i(canvas, muzVar2, hotshotView.f(hotshotView.g, hotshotView.b(hotshotView.g(mwkVar2), false)), mwkVar2.b.c(), hotshotView.c.equals(mwd.READY_TO_CAPTURE));
                }
                i3++;
                hotshotView = hotshotView;
            }
        }
        HotshotView hotshotView2 = hotshotView;
        if (hotshotView2.o.c > 0) {
            muy muyVar2 = hotshotView2.o.b;
            boolean z = muyVar2.q;
            if (z) {
                Paint paint = hotshotView2.E;
                canvas.drawLine(paint.getStrokeWidth() / 2.0f, 0.0f, paint.getStrokeWidth() / 2.0f, canvas.getHeight(), paint);
            }
            boolean z2 = muyVar2.s;
            if (z2) {
                float width = canvas.getWidth();
                Paint paint2 = hotshotView2.E;
                canvas.drawLine(width - (paint2.getStrokeWidth() / 2.0f), 0.0f, canvas.getWidth() - (paint2.getStrokeWidth() / 2.0f), canvas.getHeight(), paint2);
            }
            if (muyVar2.r) {
                float strokeWidth = z ? hotshotView2.E.getStrokeWidth() : 0.0f;
                Paint paint3 = hotshotView2.E;
                canvas.drawLine(strokeWidth, paint3.getStrokeWidth() / 2.0f, z2 ? canvas.getWidth() - paint3.getStrokeWidth() : canvas.getWidth(), paint3.getStrokeWidth() / 2.0f, paint3);
            }
            if (muyVar2.t) {
                float strokeWidth2 = z ? hotshotView2.E.getStrokeWidth() : 0.0f;
                float height = canvas.getHeight();
                Paint paint4 = hotshotView2.E;
                canvas.drawLine(strokeWidth2, height - (paint4.getStrokeWidth() / 2.0f), z2 ? canvas.getWidth() - paint4.getStrokeWidth() : canvas.getWidth(), canvas.getHeight() - (paint4.getStrokeWidth() / 2.0f), paint4);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Object obj = efm.c(getContext(), R.raw.hotshot_face_tracking_ring_animation).a;
        obj.getClass();
        efh efhVar = (efh) obj;
        this.M = efhVar;
        this.F.v(efhVar);
        Object obj2 = efm.c(getContext(), R.raw.hotshot_confirmation_single_pulse).a;
        obj2.getClass();
        this.G.v((efh) obj2);
        j(300.0f);
        Object obj3 = efm.c(getContext(), R.raw.hotshot_circle_track).a;
        obj3.getClass();
        this.N = (efh) obj3;
        Object obj4 = efm.c(getContext(), R.raw.hotshot_circle_pulse).a;
        obj4.getClass();
        this.O = (efh) obj4;
        Object obj5 = efm.c(getContext(), R.raw.hotshot_rectangle_track).a;
        obj5.getClass();
        this.P = (efh) obj5;
        Object obj6 = efm.c(getContext(), R.raw.hotshot_rectangle_pulse).a;
        obj6.getClass();
        this.Q = (efh) obj6;
        float f = getResources().getDisplayMetrics().density;
        this.W = new Rect((int) (this.N.g.left / f), (int) (this.N.g.top / f), (int) (this.N.g.right / f), (int) (this.N.g.bottom / f));
        this.R = new mwg(this);
        this.S = new mwh(this);
        this.T = new mwi();
    }
}
