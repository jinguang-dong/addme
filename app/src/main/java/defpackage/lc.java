package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lc {
    private final la a;
    public int b;
    public RecyclerView c;
    public kq d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public lc() {
        this.b = -1;
        this.a = new la();
    }

    public static final int n(View view) {
        lg lgVarI = RecyclerView.i(view);
        if (lgVarI != null) {
            return lgVarI.b();
        }
        return -1;
    }

    protected static final void o(PointF pointF) {
        float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    private static int p(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int b(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void c(View view, la laVar) {
        int iH = h(view, k());
        int i = i(view, l());
        int iJ = j((int) Math.sqrt((iH * iH) + (i * i)));
        if (iJ > 0) {
            laVar.b(-iH, -i, iJ, this.j);
        }
    }

    public final PointF d(int i) {
        Object obj = this.d;
        if (obj instanceof lb) {
            return ((lb) obj).L(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(lb.class.getCanonicalName())));
        return null;
    }

    final void e(int i, int i2) {
        PointF pointFD;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (pointFD = d(this.b)) != null && (pointFD.x != 0.0f || pointFD.y != 0.0f)) {
            recyclerView.Y((int) Math.signum(pointFD.x), (int) Math.signum(pointFD.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (n(view) == this.b) {
                View view2 = this.g;
                ld ldVar = recyclerView.O;
                la laVar = this.a;
                c(view2, laVar);
                laVar.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            ld ldVar2 = recyclerView.O;
            la laVar2 = this.a;
            if (this.c.m.an() == 0) {
                f();
            } else {
                int iP = p(this.l, i);
                this.l = iP;
                int iP2 = p(this.m, i2);
                this.m = iP2;
                if (iP == 0 && iP2 == 0) {
                    m(laVar2);
                }
            }
            int i3 = laVar2.a;
            laVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.L.b();
        }
    }

    public final void f() {
        if (this.f) {
            this.f = false;
            this.m = 0;
            this.l = 0;
            this.k = null;
            this.c.O.a = -1;
            this.g = null;
            this.b = -1;
            this.e = false;
            kq kqVar = this.d;
            if (kqVar.t == this) {
                kqVar.t = null;
            }
            this.d = null;
            this.c = null;
        }
    }

    public int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int h(View view, int i) {
        kq kqVar = this.d;
        if (kqVar == null || !kqVar.X()) {
            return 0;
        }
        kr krVar = (kr) view.getLayoutParams();
        return g(kq.bt(view) - krVar.leftMargin, kq.bu(view) + krVar.rightMargin, kqVar.au(), kqVar.C - kqVar.av(), i);
    }

    public int i(View view, int i) {
        kq kqVar = this.d;
        if (kqVar == null || !kqVar.Y()) {
            return 0;
        }
        kr krVar = (kr) view.getLayoutParams();
        return g(kq.bv(view) - krVar.topMargin, kq.bs(view) + krVar.bottomMargin, kqVar.aw(), kqVar.D - kqVar.at(), i);
    }

    protected int j(int i) {
        return (int) Math.ceil(b(i) / 0.3356d);
    }

    protected int k() {
        PointF pointF = this.k;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.k.x <= 0.0f ? -1 : 1;
    }

    protected int l() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.k.y <= 0.0f ? -1 : 1;
    }

    protected void m(la laVar) {
        PointF pointFD = d(this.b);
        if (pointFD == null || (pointFD.x == 0.0f && pointFD.y == 0.0f)) {
            laVar.a = this.b;
            f();
            return;
        }
        o(pointFD);
        this.k = pointFD;
        this.l = (int) (pointFD.x * 10000.0f);
        this.m = (int) (pointFD.y * 10000.0f);
        int iB = b(10000);
        laVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (iB * 1.2f), this.i);
    }

    public lc(Context context) {
        this.b = -1;
        this.a = new la();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }
}
