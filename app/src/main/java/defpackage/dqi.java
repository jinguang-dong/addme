package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqi implements dpj {
    private final dlh a;
    private final dpq b;
    private final boolean c;
    private float d;
    private int e;

    public dqi(dlh dlhVar, dpq dpqVar, boolean z) {
        this.a = dlhVar;
        this.b = dpqVar;
        this.c = z;
    }

    private static final float c(dkz dkzVar) {
        int i;
        int iD;
        if (dkzVar.g().isEmpty()) {
            return 0.0f;
        }
        dkl dklVar = (dkl) ske.bB(dkzVar.g());
        int i2 = dklVar.a;
        if (i2 == 0) {
            iD = dkzVar.d() + dkzVar.c();
            i = 0;
        } else {
            i = i2;
            iD = 0;
        }
        dkzVar.h();
        int i3 = drc.a;
        return i + ukc.k(((-(((int) (dkzVar.f() & 4294967295L)) / 2.0f)) - (a.aa(dklVar, 0) - iD)) / ukc.n(dklVar.d + iD, 1), 0.0f);
    }

    private static final float d(dkz dkzVar) {
        if (dkzVar.g().isEmpty()) {
            return 0.0f;
        }
        dkl dklVar = (dkl) ske.bF(dkzVar.g());
        int i = dklVar.a;
        int iB = dklVar.d + (i == dkzVar.e() + (-1) ? dkzVar.b() + dkzVar.a() : 0);
        dkzVar.h();
        int i2 = drc.a;
        return i + ukc.l(1.0f - (((a.aa(dklVar, 0) + iB) - (((int) (dkzVar.f() & 4294967295L)) / 2.0f)) / ukc.n(iB, 1)), 1.0f);
    }

    @Override // defpackage.dpj
    public final float a() {
        dkz dkzVarH = this.a.h();
        if (!dkzVarH.g().isEmpty()) {
            float fC = c(dkzVarH);
            float fE = (dkzVarH.e() - d(dkzVarH)) + fC;
            if (fE != 0.0f) {
                return fC / fE;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.dpj
    public final float b() {
        dlh dlhVar = this.a;
        dkz dkzVarH = dlhVar.h();
        if (dkzVarH.g().isEmpty()) {
            return 0.0f;
        }
        if (this.e != dkzVarH.e()) {
            this.e = dkzVarH.e();
            this.d = ukc.m((d(dkzVarH) - c(dkzVarH)) / dkzVarH.e(), 0.3f, 0.7f);
        }
        float f = this.d;
        dpq dpqVar = this.b;
        return drc.a(f, dpqVar != null ? Float.valueOf(dpqVar.b()) : null, dlhVar, this.c);
    }

    public final boolean equals(Object obj) {
        dqi dqiVar = obj instanceof dqi ? (dqi) obj : null;
        return a.ao(dqiVar != null ? dqiVar.a : null, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
