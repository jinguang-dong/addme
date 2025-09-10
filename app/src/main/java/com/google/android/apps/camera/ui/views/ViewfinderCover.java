package com.google.android.apps.camera.ui.views;

import android.animation.RectEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.ar.core.R;
import defpackage.cth;
import defpackage.cto;
import defpackage.fdi;
import defpackage.goh;
import defpackage.gzo;
import defpackage.hbj;
import defpackage.mxu;
import defpackage.myd;
import defpackage.mzu;
import defpackage.mzv;
import defpackage.mzx;
import defpackage.mzy;
import defpackage.ndk;
import defpackage.ngq;
import defpackage.nhr;
import defpackage.nht;
import defpackage.nhu;
import defpackage.nkt;
import defpackage.nkw;
import defpackage.owf;
import defpackage.pka;
import defpackage.qpr;
import defpackage.rnt;
import defpackage.rvk;
import defpackage.rwc;
import defpackage.sgt;
import defpackage.sgv;
import defpackage.syu;
import defpackage.szh;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewfinderCover extends GcaLayout implements mzx, goh {
    private static final sgv v = sgv.g(PJGqOKsIpSdZ.UauOOc);
    public ImageView o;
    public AnimatedVectorDrawable p;
    public boolean q;
    public Callable r;
    public final mzy s;
    public final boolean t;
    public boolean u;
    private TextView w;
    private final int x;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewfinderCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = true;
        this.u = false;
        this.s = new mzy(this);
        hbj hbjVarB = ((fdi) context).b();
        this.x = hbjVarB.p(gzo.aX) ? getResources().getDimensionPixelSize(R.dimen.viewfinder_rounded_corner_radius) : 0;
        this.t = hbjVarB.p(gzo.bw);
    }

    @Override // defpackage.goh
    public final syu a(pka pkaVar) {
        this.p = (AnimatedVectorDrawable) getResources().getDrawable(pkaVar == pka.BACK ? R.drawable.camera_front_back_animation : R.drawable.camera_back_front_animation, null);
        final szh szhVar = new szh();
        this.s.p(nkw.UNINITIALIZED, new ndk(10), new nht(this), new mzu() { // from class: nhs
            @Override // defpackage.mzu
            public final void a(nkw nkwVar) {
                szhVar.e(null);
            }
        });
        return szhVar;
    }

    @Override // defpackage.mzx
    public final rwc b() {
        Object objFr = this.i.fr();
        if (objFr == null) {
            return rvk.a;
        }
        myd mydVar = ((mxu) objFr).b;
        rnt.x(mydVar);
        Rect rectH = mydVar.h(mydVar.k, mydVar.j);
        qpr qprVar = new qpr();
        qprVar.c = rectH;
        qprVar.f(this.x);
        return rwc.j(qprVar.e());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.mzx
    public final rwc c() {
        try {
            return (rwc) this.r.call();
        } catch (Exception e) {
            ((sgt) ((sgt) v.b().i(e)).M((char) 5387)).s("Failed to create snapshot");
            return rvk.a;
        }
    }

    @Override // defpackage.mzx
    public final void d() {
        this.s.f();
    }

    @Override // defpackage.mzx
    public final void e() {
        this.s.g();
    }

    @Override // defpackage.mzx
    public final void f(nkw nkwVar) throws Resources.NotFoundException {
        Drawable drawable;
        ImageView imageView = this.o;
        String strC = null;
        if (nkwVar == null || nkwVar == nkw.UNINITIALIZED || this.t) {
            drawable = null;
        } else {
            drawable = getResources().getDrawable(nkt.a(nkwVar).a, null);
        }
        imageView.setImageDrawable(drawable);
        if (nkwVar != null && nkwVar != nkw.UNINITIALIZED && !this.t) {
            strC = nkt.a(nkwVar).c(getResources());
        }
        this.w.setText(strC);
    }

    @Override // defpackage.mzx
    public final boolean g() {
        return this.q;
    }

    @Override // defpackage.mzx
    public final boolean h() {
        return true;
    }

    @Override // defpackage.mzx
    public final void i() {
        mzy mzyVar = this.s;
        mzyVar.v.setAlpha(0.0f);
        mzyVar.m();
        mzyVar.v.animate().alpha(1.0f).setDuration(250L).start();
    }

    public final void j(Runnable runnable) {
        this.s.E.add(runnable);
    }

    public final void k() {
        mzy mzyVar = this.s;
        int i = mzyVar.F;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 2 || i2 == 3) {
            mzyVar.d();
        }
    }

    public final void l(Runnable runnable) {
        this.s.E.remove(runnable);
    }

    public final void m() {
        this.s.l();
    }

    public final void n(nkw nkwVar, nhu nhuVar, Runnable runnable) {
        this.s.p(nkwVar, runnable, this, new nhr(nhuVar, 1));
    }

    public final void o(nkw nkwVar, Runnable runnable) {
        this.s.p(nkwVar, new ndk(9), this, new nhr(runnable, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        mzy mzyVar = this.s;
        if (!mzyVar.k.h()) {
            canvas.drawColor(0);
            return;
        }
        if (mzyVar.y > 0) {
            canvas.saveLayer(null, null, 31);
            mzy.b(canvas, mzyVar.m.a, mzyVar.y, mzyVar.i);
        }
        canvas.drawBitmap(((ngq) mzyVar.k.c()).a, mzyVar.l, mzyVar.m.a, mzyVar.g);
        if (mzyVar.y > 0) {
            canvas.restore();
        }
        int i = mzyVar.n;
        if (i > 0) {
            Paint paint = mzyVar.h;
            paint.setAlpha(i);
            mzy.b(canvas, mzyVar.m.a, mzyVar.y, paint);
        }
        if (mzyVar.o.h()) {
            mzyVar.j.post(mzyVar.o.c());
            mzyVar.o = rvk.a;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.o = (ImageView) findViewById(R.id.viewfinder_cover_icon);
        this.w = (TextView) findViewById(R.id.viewfinder_cover_title);
        mzy mzyVar = this.s;
        mzyVar.v = this.o;
        mzyVar.w = this.w;
        mzyVar.f();
        mzyVar.g();
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Size size;
        float f;
        float fHeight;
        final Rect rect;
        int iRound;
        int iRound2;
        super.onLayout(z, i, i2, i3, i4);
        Object objFr = this.i.fr();
        if (!this.u || objFr == null) {
            return;
        }
        this.u = false;
        myd mydVar = ((mxu) objFr).b;
        rnt.x(mydVar);
        Size size2 = mydVar.k;
        if (size2 == null || (size = mydVar.j) == null) {
            return;
        }
        if ((size2.getWidth() <= size2.getHeight() || size.getWidth() <= size.getHeight()) && (size2.getHeight() <= size2.getWidth() || size.getHeight() <= size.getWidth())) {
            return;
        }
        Rect rectH = mydVar.h(size2, size);
        qpr qprVar = new qpr();
        qprVar.c = rectH;
        qprVar.f(this.x);
        final mzv mzvVarE = qprVar.e();
        final mzy mzyVar = this.s;
        if (mzyVar.F == 3) {
            if (!g()) {
                mzyVar.F = 4;
                return;
            }
            mzyVar.F = 4;
            if (!mzyVar.k.h() || mzyVar.q == null) {
                return;
            }
            if (mzyVar.C != mzyVar.B.a()) {
                mzyVar.C = mzyVar.B.a();
                return;
            }
            owf owfVar = mzyVar.q;
            owfVar.getClass();
            float fFloatValue = ((Float) owfVar.dL()).floatValue();
            if (mzyVar.p <= fFloatValue) {
                cto ctoVar = new cto(mzyVar.e);
                ctoVar.s = mzyVar.f;
                ctoVar.k(0.002f);
                ctoVar.l(0.0f);
                float f2 = mzyVar.p;
                Rect rect2 = mzvVarE.a;
                if (rect2.equals(mzyVar.m.a)) {
                    Rect rect3 = mzyVar.m.a;
                    if (mzyVar.x) {
                        if (mzyVar.p < fFloatValue || mzyVar.o()) {
                            Rect rect4 = mzyVar.l;
                            float f3 = mzyVar.p;
                            if (mzyVar.o()) {
                                fFloatValue /= 0.8f;
                            }
                            float f4 = f3 / fFloatValue;
                            int iRound3 = Math.round(rect4.width() * f4);
                            int iRound4 = Math.round(rect4.height() * f4);
                            int iCenterX = rect4.centerX();
                            int iCenterY = rect4.centerY();
                            int i5 = iRound3 / 2;
                            int i6 = iRound4 / 2;
                            final Rect rect5 = new Rect(iCenterX - i5, iCenterY - i6, iCenterX + i5, iCenterY + i6);
                            Rect rect6 = mzyVar.l;
                            if (rect5.left < 0 || rect5.top < 0) {
                                return;
                            }
                            final RectEvaluator rectEvaluator = new RectEvaluator(new Rect());
                            ctoVar.j(new cth() { // from class: mzn
                                @Override // defpackage.cth
                                public final void l(float f5) {
                                    RectEvaluator rectEvaluator2 = rectEvaluator;
                                    mzy mzyVar2 = mzyVar;
                                    mzyVar2.j(rectEvaluator2.evaluate(f5, mzyVar2.l, rect5));
                                }
                            });
                            ctoVar.g();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Rect rectA = ((ngq) mzyVar.k.c()).a();
                Rect rect7 = mzyVar.l;
                if (!rect7.equals(rectA)) {
                    if (rect7.height() > rect7.width()) {
                        iRound = rectA.height();
                        iRound2 = Math.round(iRound * mzy.a(rect7));
                    } else {
                        int iWidth = rectA.width();
                        iRound = Math.round(iWidth / mzy.a(rect7));
                        iRound2 = iWidth;
                    }
                    int iCenterX2 = rectA.centerX();
                    int iCenterY2 = rectA.centerY();
                    int i7 = iRound2 / 2;
                    int i8 = iRound / 2;
                    rect7 = new Rect(iCenterX2 - i7, iCenterY2 - i8, iCenterX2 + i7, iCenterY2 + i8);
                }
                ngq ngqVar = (ngq) mzyVar.k.c();
                int iWidth2 = rect2.width();
                int i9 = ngqVar.b;
                int i10 = i9 + i9;
                int i11 = iWidth2 / i10;
                int iHeight = rect2.height() / i10;
                int iCenterX3 = rect2.centerX() / i9;
                int iCenterY3 = rect2.centerY() / i9;
                Rect rect8 = new Rect(iCenterX3 - i11, iCenterY3 - iHeight, iCenterX3 + i11, iCenterY3 + iHeight);
                float f5 = true != mzyVar.o() ? 1.0f : 0.8f;
                float fA = mzy.a(rect7);
                float fA2 = mzy.a(rect8);
                if (fA2 == 0.0f) {
                    ((sgt) mzy.a.c().M(5202)).v("Invalid aspect ratio in fitToRect: %s", rect8);
                    rect = rect7;
                } else {
                    if (fA2 < fA) {
                        fHeight = rect7.height();
                        f = fA2 * fHeight;
                    } else {
                        float fWidth = rect7.width();
                        float f6 = fWidth / fA2;
                        f = fWidth;
                        fHeight = f6;
                    }
                    int iCenterX4 = rect7.centerX();
                    int iCenterY4 = rect7.centerY();
                    int iRound5 = Math.round((f / 2.0f) * f5);
                    int iRound6 = Math.round((fHeight / 2.0f) * f5);
                    rect = new Rect(iCenterX4 - iRound5, iCenterY4 - iRound6, iCenterX4 + iRound5, iCenterY4 + iRound6);
                }
                final RectEvaluator rectEvaluator2 = new RectEvaluator(new Rect());
                final RectEvaluator rectEvaluator3 = new RectEvaluator(new Rect());
                ctoVar.j(new cth() { // from class: mzo
                    @Override // defpackage.cth
                    public final void l(float f7) {
                        mzy mzyVar2 = mzyVar;
                        Rect rect9 = mzyVar2.m.a;
                        mzyVar2.m.a.set(rectEvaluator2.evaluate(f7, rect9, mzvVarE.a));
                        mzyVar2.i();
                        mzyVar2.j(rectEvaluator3.evaluate(f7, mzyVar2.l, rect));
                        mzyVar2.y = (int) (mzyVar2.m.b + ((r3.b - r5) * f7));
                        mzyVar2.i();
                    }
                });
                ctoVar.g();
                mzv mzvVar = mzyVar.m;
                Rect rect9 = mzyVar.l;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
