package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dke implements dkf {
    private final dlh a;
    private Float b;

    public dke(dlh dlhVar) {
        this.a = dlhVar;
    }

    @Override // defpackage.dkf
    public final float a() {
        Object obj;
        List listG = this.a.h().g();
        int size = listG.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listG.get(i);
            if (((dkl) obj).a == 1) {
                break;
            }
            i++;
        }
        dkl dklVar = (dkl) obj;
        if (dklVar == null) {
            return Float.NaN;
        }
        float fAa = a.aa(dklVar, 1);
        Float f = this.b;
        if (f == null || fAa > f.floatValue()) {
            this.b = Float.valueOf(fAa);
        }
        int i2 = dklVar.c;
        Float f2 = this.b;
        f2.getClass();
        return (-i2) + f2.floatValue();
    }

    @Override // defpackage.dkf
    public final float b() {
        dlh dlhVar = this.a;
        dle dleVar = (dle) dlhVar.d.a();
        int i = dleVar != null ? dleVar.f : 0;
        dkl dklVar = (dkl) ske.bG(dlhVar.h().g());
        if (dklVar == null) {
            return 0.0f;
        }
        if (dklVar.a != r4.e() - 1) {
            return 0.0f;
        }
        return ukc.k(i - ((dklVar.c + (i >> 1)) + (dklVar.d / 2)), 0.0f);
    }

    @Override // defpackage.dkf
    public final boolean c() {
        dlh dlhVar = this.a;
        int iE = dlhVar.h().e();
        dle dleVar = (dle) dlhVar.d.a();
        return iE > (dleVar != null ? dleVar.g.a : 1);
    }

    @Override // defpackage.dkf
    public final boolean d() {
        return this.a.e();
    }

    @Override // defpackage.dkf
    public final boolean e() {
        dlh dlhVar = this.a;
        if (dlhVar.h().g().isEmpty()) {
            return false;
        }
        return dlhVar.c() || dlhVar.d();
    }

    public final String toString() {
        return "ScalingLazyListStateScrollInfoProvider(isScrollAwayValid=" + c() + ", isScrollable=" + e() + ",isScrollInProgress=" + d() + ", anchorItemOffset=" + a() + ", lastItemOffset=" + b() + ')';
    }
}
