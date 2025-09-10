package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class djk {
    private dkd a;
    private final azr b = new azz(null, bap.c);
    public float d;

    public float a(float f, float f2, long j) {
        throw null;
    }

    public abstract float b(float f);

    public abstract dkd c(float f, float f2);

    public void e(djo djoVar, Iterator it) {
        throw null;
    }

    public void f(btd btdVar) {
        throw null;
    }

    public void h(kbz kbzVar, ayc aycVar, int i) {
        throw null;
    }

    public final float k(float f, float f2, long j) {
        float fA = a(f, f2, j);
        float fN = n();
        dkd dkdVar = this.a;
        dkd dkdVar2 = null;
        if (dkdVar == null) {
            ujp.c("partialLayoutInfo");
            dkdVar = null;
        }
        dkd dkdVar3 = this.a;
        if (dkdVar3 == null) {
            ujp.c("partialLayoutInfo");
            dkdVar3 = null;
        }
        dkd dkdVar4 = this.a;
        if (dkdVar4 == null) {
            ujp.c("partialLayoutInfo");
        } else {
            dkdVar2 = dkdVar4;
        }
        this.b.b(new djm(fN, dkdVar.b, dkdVar3.c, j, dkdVar2.d, fA));
        return fA;
    }

    public final float l(float f) {
        float fB = b(f);
        this.d = fB;
        return fB;
    }

    public final float m() {
        dkd dkdVar = this.a;
        if (dkdVar == null) {
            ujp.c("partialLayoutInfo");
            dkdVar = null;
        }
        return dkdVar.d;
    }

    public final float n() {
        dkd dkdVar = this.a;
        if (dkdVar == null) {
            ujp.c("partialLayoutInfo");
            dkdVar = null;
        }
        return dkdVar.a;
    }

    public final djm o() {
        return (djm) this.b.a();
    }

    public final dkd p(float f, float f2) {
        dkd dkdVarC = c(f, f2);
        this.a = dkdVarC;
        return dkdVarC;
    }

    public void g() {
    }

    public void d(bmv bmvVar) {
    }
}
