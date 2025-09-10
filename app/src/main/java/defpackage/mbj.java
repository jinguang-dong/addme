package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbj {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    private final Object h;

    public mbj(SharedPreferences sharedPreferences, owf owfVar, ovx ovxVar, fut futVar, khb khbVar, iso isoVar, fvc fvcVar, owq owqVar, fdq fdqVar, mbj mbjVar) {
        this.h = sharedPreferences;
        this.b = ovxVar;
        this.e = futVar;
        this.d = khbVar;
        this.g = isoVar;
        this.c = fvcVar;
        this.f = mbjVar;
        our ourVarJ = fdqVar.j();
        owf owfVarA = owb.a(owfVar);
        fun funVar = new fun(this, owqVar, 0);
        ouu ouuVar = out.a;
        ourVarJ.d(owfVarA.dK(funVar, ouuVar));
        ourVarJ.d(owqVar.dK(new fnb(this, 3), ouuVar));
    }

    public final void a() {
        ((luj) this.g).d(luf.t, false);
    }

    public final void b() {
        ((mbq) this.c).e();
        ((mbq) this.e).e();
        ((mbq) this.f).e();
    }

    public final void c(int i) {
        f(i, 0.6f, 1);
    }

    public final void d(int i) {
        g(i, 1);
    }

    public final void e() {
        ((mbq) this.c).g();
        ((mbq) this.e).g();
        ((mbq) this.f).g();
    }

    public final void f(int i, float f, int i2) {
        int i3 = 3;
        if (this.a) {
            if (i == R.raw.camera_shutter) {
                ((mbq) this.c).i(R.raw.camera_shutter, f);
            } else if (i2 == 3) {
                if (f == 0.0f) {
                    ((mbq) this.e).f(i);
                } else {
                    ((mbq) this.e).i(i, f);
                }
            } else if (i2 != 2) {
                ((mbq) this.c).i(i, f);
            } else if (f == 0.0f) {
                ((mbq) this.d).f(i);
            } else {
                ((mbq) this.d).i(i, f);
            }
        }
        if (i == R.raw.camera_shutter || i == R.raw.video_stop || i == R.raw.longexposure_stop) {
            ((Handler) this.h).postDelayed(new man(this, i3), 100L);
        }
    }

    public final void g(int i, int i2) {
        f(i, 1.0f, i2);
    }

    public final void h() {
        Object obj = this.c;
        fvc fvcVar = (fvc) obj;
        if (fvcVar.f) {
            fvcVar.d.post(new foh(obj, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void i() {
        this.h.edit().putBoolean("autotimer_tutorial_shown", true).apply();
    }

    public final void j() {
        if (m() && n()) {
            Object obj = this.c;
            fvc fvcVar = (fvc) obj;
            if (!fvcVar.f) {
                fvcVar.d = (ConstraintLayout) fvcVar.g.c(R.id.camera_app_root);
                Context context = fvcVar.a;
                fvcVar.b = new fvd(context);
                fvcVar.c = new fvb(context);
                fvcVar.b.setId(View.generateViewId());
                fvcVar.c.setId(View.generateViewId());
                fvcVar.d.addView(fvcVar.b);
                fvcVar.d.addView(fvcVar.c);
                mxf mxfVar = (mxf) fvcVar.b.getLayoutParams();
                mxfVar.ax = 2;
                fvcVar.b.setLayoutParams(mxfVar);
                mxf mxfVar2 = (mxf) fvcVar.c.getLayoutParams();
                mxfVar2.ax = 3;
                fvcVar.c.setLayoutParams(mxfVar2);
                fvcVar.b.setOnTouchListener(fvcVar.e);
                fvcVar.f = true;
            }
            fvcVar.d.post(new foh(obj, 10));
            fvcVar.e = new fuo(this, 0, null);
            if (fvcVar.f) {
                fvcVar.b.setOnTouchListener(fvcVar.e);
            }
        }
    }

    public final void k(fuu fuuVar) {
        ovx ovxVar = (ovx) this.b;
        Object obj = ovxVar.d;
        ovxVar.a(fuuVar);
    }

    public final boolean l() {
        return ((ovx) this.b).d == fuu.CAPTURING;
    }

    public final boolean m() {
        return ((ovx) this.b).d != fuu.DISABLED;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean n() {
        return !this.h.getBoolean("autotimer_tutorial_shown", false);
    }

    public mbj(mbq mbqVar, mbq mbqVar2, mbq mbqVar3, mbq mbqVar4, pbn pbnVar, out outVar, jgt jgtVar, luj lujVar) {
        this.c = mbqVar;
        this.d = mbqVar2;
        this.e = mbqVar3;
        this.f = mbqVar4;
        this.b = pbnVar;
        this.g = lujVar;
        this.h = new Handler(Looper.getMainLooper());
        ins.g(outVar, jgtVar, new mbi(this));
    }
}
