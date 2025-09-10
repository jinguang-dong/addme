package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mzy {
    public mzw A;
    public goj B;
    public pka C;
    public final List D;
    public final List E;
    public int F;
    private final ViewGroup H;
    private rwc I;
    private boolean J;
    private boolean K;
    public final ObjectAnimator c;
    public final ValueAnimator d;
    public final ctn e = new ctn();
    public final ctp f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Handler j;
    public rwc k;
    public Rect l;
    public mzv m;
    public int n;
    public rwc o;
    public float p;
    public owf q;
    public int r;
    public owq s;
    public nkw t;
    public int u;
    public View v;
    public View w;
    public boolean x;
    public int y;
    public rwc z;
    public static final sgv a = sgv.g("mzy");
    private static final int G = Math.round(102.0f);
    static final int b = mus.OFF.e;

    public mzy(ViewGroup viewGroup) {
        ctp ctpVar = new ctp();
        this.f = ctpVar;
        rvk rvkVar = rvk.a;
        this.k = rvkVar;
        this.n = 0;
        this.o = rvkVar;
        this.p = 1.0f;
        this.r = -1;
        this.s = owp.a(Integer.valueOf(b));
        this.I = rvkVar;
        this.F = 1;
        this.t = nkw.UNINITIALIZED;
        this.u = 0;
        this.x = true;
        this.y = 0;
        this.z = rvkVar;
        this.A = new mzw() { // from class: mzr
            @Override // defpackage.mzw
            public final boolean a() {
                sgv sgvVar = mzy.a;
                return false;
            }
        };
        this.J = false;
        this.B = new goj() { // from class: mzs
            @Override // defpackage.goj
            public final pka a() {
                sgv sgvVar = mzy.a;
                return pka.BACK;
            }
        };
        this.C = pka.BACK;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.K = false;
        this.H = viewGroup;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        this.c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new mzt(this));
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        Paint paint = new Paint();
        this.g = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setAlpha(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, G);
        this.d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new fve(this, 17));
        valueAnimatorOfInt.setDuration(250L);
        this.l = new Rect(0, 0, 1, 1);
        qpr qprVar = new qpr();
        qprVar.c = new Rect(0, 0, 1, 1);
        qprVar.f(0);
        this.m = qprVar.e();
        this.j = new Handler(Looper.getMainLooper());
        mmw mmwVar = mms.a;
        ctpVar.e(mmwVar.b);
        ctpVar.c(mmwVar.a);
        ctpVar.d(1.0f);
        viewGroup.setWillNotDraw(false);
    }

    public static float a(Rect rect) {
        if (rect.height() == 0.0f) {
            return 0.0f;
        }
        return rect.width() / rect.height();
    }

    public static void b(Canvas canvas, Rect rect, int i, Paint paint) {
        if (i <= 0) {
            canvas.drawRect(rect, paint);
        } else {
            float f = i;
            canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, f, f, paint);
        }
    }

    private final int q() {
        int i = this.u + 1;
        this.u = i;
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    public final void c() {
        if (this.I.h()) {
            this.I.c().run();
            this.I = rvk.a;
        }
        try {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } finally {
            this.E.clear();
        }
    }

    public final void d() {
        int i = this.r;
        if (i != -1) {
            this.s.a(Integer.valueOf(i));
            this.r = -1;
        }
        if (this.H.getAlpha() != 1.0f) {
            e();
            c();
        } else {
            this.F = 5;
            this.c.start();
        }
    }

    public final void e() {
        ViewGroup viewGroup = this.H;
        viewGroup.setVisibility(8);
        this.F = 1;
        q();
        this.k = rvk.a;
        viewGroup.setLayerType(0, null);
        if (this.K && this.z.h()) {
            ((ktx) this.z.c()).k(mzy.class);
            this.K = false;
        }
    }

    public final void f() {
        this.v.setVisibility(8);
    }

    public final void g() {
        this.w.setVisibility(8);
    }

    public final void h() {
        this.H.invalidate();
    }

    public final void i() {
        this.H.postInvalidateOnAnimation();
    }

    public final void j(Rect rect) {
        this.l.set(rect);
        i();
    }

    final void k(Runnable runnable) {
        this.I = rwc.j(runnable);
    }

    public final void l() {
        ViewGroup viewGroup = this.H;
        if (viewGroup.getVisibility() != 0) {
            this.c.cancel();
            viewGroup.setVisibility(0);
        }
        viewGroup.setAlpha(1.0f);
    }

    public final void m() {
        this.v.setVisibility(0);
    }

    final boolean n() {
        if (this.t != nkw.SLOW_MOTION && this.t.c()) {
            return this.A.a();
        }
        return false;
    }

    public final boolean o() {
        return n() && !this.J;
    }

    public final void p(nkw nkwVar, Runnable runnable, mzx mzxVar, mzu mzuVar) {
        lse lseVar = new lse(this, nkwVar, runnable, mzxVar, mzuVar, 2);
        int i = 0;
        int i2 = 5;
        if (this.F == 5) {
            k(new mzq(this.I, lseVar, i));
            return;
        }
        if (this.q == null) {
            runnable.run();
            return;
        }
        int iQ = q();
        k(runnable);
        if (this.z.h()) {
            ((ktx) this.z.c()).g(mzy.class);
            this.K = true;
        }
        this.H.setLayerType(2, null);
        this.x = mzxVar.h();
        this.J = n();
        if (this.r == -1) {
            this.r = ((Integer) this.s.dL()).intValue();
            this.s.a(Integer.valueOf(b));
        }
        rwc rwcVarC = mzxVar.c();
        rwc rwcVarB = mzxVar.b();
        ValueAnimator valueAnimator = this.d;
        valueAnimator.removeAllListeners();
        this.t = nkwVar;
        owf owfVar = this.q;
        if (owfVar != null) {
            this.p = ((Float) owfVar.dL()).floatValue();
        }
        int i3 = this.F;
        if (i3 == 5) {
            ((sgt) a.b().M(5220)).s("Somehow trying to go from FADING to WAITING_FOR_BITMAP: Illegal!");
            throw new IllegalStateException(INRGuObcrHjSQz.FamtIrqsd);
        }
        if (i3 == 1) {
            this.c.cancel();
            valueAnimator.cancel();
            this.k = rwcVarC;
            if (rwcVarC.h()) {
                ((ngq) rwcVarC.c()).a.prepareToDraw();
                this.l = ((ngq) rwcVarC.c()).a();
                rwc rwcVarB2 = rwcVarB.b(new mdv(4));
                ngq ngqVar = (ngq) rwcVarC.c();
                Bitmap bitmap = ngqVar.a;
                int i4 = ngqVar.b;
                Rect rect = (Rect) rwcVarB2.e(new Rect(0, 0, bitmap.getWidth() * i4, bitmap.getHeight() * i4));
                rwc rwcVar = ((ngq) rwcVarC.c()).c;
                if (rwcVar.h()) {
                    Rect rect2 = new Rect((Rect) rwcVar.c());
                    rect2.offset(rect.left, rect.top);
                    if (rect.contains(rect2)) {
                        rect = rect2;
                    } else {
                        ((sgt) a.c().M(5216)).E("Source %s is not contained in preview box %s", rect2, rect);
                    }
                }
                qpr qprVar = new qpr();
                qprVar.c = rect;
                qprVar.f(((Integer) rwcVarB.b(new mdv(i2)).e(0)).intValue());
                mzv mzvVarE = qprVar.e();
                this.m = mzvVarE;
                this.y = mzvVarE.b;
                valueAnimator.setIntValues(0, G);
                this.n = 0;
                this.F = 2;
                h();
            } else {
                this.F = 1;
            }
        } else if (rwcVarC.h()) {
            this.F = 2;
            h();
        } else {
            this.F = 1;
        }
        mzxVar.d();
        mzxVar.e();
        mzxVar.f(nkwVar);
        l();
        this.j.postDelayed(new mzp(this, iQ, i), 4000L);
        hts htsVar = new hts(this, iQ, mzxVar, nkwVar, mzuVar, 3);
        if (rwcVarC.h()) {
            this.o = rwc.j(htsVar);
        } else {
            htsVar.run();
        }
    }
}
