package defpackage;

import android.app.Activity;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jug {
    private static final sgv d = sgv.g("jug");
    public final owf a;
    public final gnt b;
    public final owq c = new ovx(false);
    private final boolean e;
    private final Activity f;
    private final pjp g;
    private final luj h;
    private final kgn i;
    private final hbj j;

    public jug(Activity activity, fdq fdqVar, gnt gntVar, hbj hbjVar, luj lujVar, owf owfVar, owf owfVar2, kgn kgnVar, pjp pjpVar, owf owfVar3) {
        int i = 0;
        boolean zP = hbjVar.p(gza.b);
        this.e = zP;
        this.h = lujVar;
        this.a = owfVar;
        this.f = activity;
        this.b = gntVar;
        this.j = hbjVar;
        this.i = kgnVar;
        this.g = pjpVar;
        if (zP) {
            our ourVarJ = fdqVar.j();
            juf jufVar = new juf(this, i);
            sxo sxoVar = sxo.a;
            ourVarJ.d(owfVar2.dK(jufVar, sxoVar));
            fdqVar.j().d(owfVar.dK(new glc(this, owfVar2, 19), sxoVar));
            fdqVar.j().d(owfVar3.dK(new glc(this, owfVar2, 20), sxoVar));
        }
    }

    private final int f(pka pkaVar) {
        pjp pjpVar = this.g;
        pjr pjrVarE = pjpVar.e(pkaVar);
        if (pjrVarE != null) {
            return kzz.o(pjrVarE, pjpVar, this.i, this.j).g();
        }
        ((sgt) d.c().M(3080)).v("Can't find camera ID with facing %s", pkaVar);
        return 90;
    }

    public final boolean a(muj mujVar, int i) {
        if (this.e) {
            Activity activity = this.f;
            if (!activity.isInMultiWindowMode()) {
                int i2 = mujVar.b;
                if (i2 == 1 && activity.getDisplay() != null) {
                    Display display = activity.getDisplay();
                    display.getClass();
                    return qpt.bk(activity, display, null, null, null, null, null) == mxj.TABLET_LAYOUT && i % 180 == 90;
                }
                int i3 = i % 180;
                if (i2 == 5) {
                    return i3 == 0;
                }
                if (i3 == 90 && i2 == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b() {
        return this.e && d() == 2;
    }

    public final boolean c(pka pkaVar) {
        if (pkaVar == pka.FRONT) {
            return this.f.isInMultiWindowMode() || ((muj) this.a.dL()).b == 4;
        }
        return false;
    }

    public final int d() {
        if (!this.e) {
            return 1;
        }
        gnt gntVar = this.b;
        if (a((muj) this.a.dL(), f(gntVar.a()))) {
            return qpt.bC(((Integer) this.h.b(luf.f)).intValue());
        }
        return 1;
    }

    public final int e(pka pkaVar) {
        if (!this.e) {
            return qpt.bH(((Integer) this.h.b(luf.e)).intValue());
        }
        if (a((muj) this.a.dL(), f(pkaVar))) {
            return qpt.bH(((Integer) this.h.b(luf.g)).intValue());
        }
        if (c(pkaVar)) {
            return 2;
        }
        return qpt.bH(((Integer) this.h.b(luf.e)).intValue());
    }
}
