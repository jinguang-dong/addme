package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ehd {
    public elq d;
    private final eha e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public ehd(List list) {
        eha ehcVar;
        if (list.isEmpty()) {
            ehcVar = new egz();
        } else {
            ehcVar = list.size() == 1 ? new ehc(list) : new ehb(list);
        }
        this.e = ehcVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float fB = this.e.b();
        this.g = fB;
        return fB;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fA = this.e.a();
        this.h = fA;
        return fA;
    }

    public final float b() {
        elo eloVarD = d();
        if (eloVarD == null || eloVarD.e()) {
            return 0.0f;
        }
        return eloVarD.d.getInterpolation(c());
    }

    final float c() {
        if (this.b) {
            return 0.0f;
        }
        elo eloVarD = d();
        if (eloVarD.e()) {
            return 0.0f;
        }
        return (this.c - eloVarD.c()) / (eloVarD.b() - eloVarD.c());
    }

    public final elo d() {
        elo eloVarC = this.e.c();
        efa.a();
        return eloVarC;
    }

    public Object e() {
        Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        elo eloVarD = d();
        Interpolator interpolator2 = eloVarD.e;
        Object objF = (interpolator2 == null || (interpolator = eloVarD.f) == null) ? f(eloVarD, b()) : g(eloVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract Object f(elo eloVar, float f);

    protected Object g(elo eloVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(egy egyVar) {
        this.a.add(egyVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((egy) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        eha ehaVar = this.e;
        if (ehaVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (ehaVar.f(f)) {
                i();
            }
        }
    }
}
