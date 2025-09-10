package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cje {
    cji a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public cjd e;

    public cje() {
    }

    public static final boolean l(cji cjiVar) {
        return cjiVar.l <= 1;
    }

    public final cji a(boolean[] zArr, cji cjiVar) {
        int i;
        int i2 = this.e.a;
        cji cjiVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                cji cjiVarD = this.e.d(i3);
                if ((zArr == null || !zArr[cjiVarD.c]) && cjiVarD != cjiVar && (((i = cjiVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    cjiVar2 = cjiVarD;
                }
            }
        }
        return cjiVar2;
    }

    final void b(cji cjiVar) {
        cji cjiVar2 = this.a;
        if (cjiVar2 != null) {
            this.e.g(cjiVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(cjiVar, true);
        this.a = cjiVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        cjd cjdVar = this.e;
        int i = cjdVar.e;
        for (int i2 = 0; i != -1 && i2 < cjdVar.a; i2++) {
            float[] fArr = cjdVar.d;
            fArr[i] = fArr[i] / f;
            i = cjdVar.c[i];
        }
    }

    public final void c(cjf cjfVar, cji cjiVar, boolean z) {
        if (cjiVar == null || !cjiVar.g) {
            return;
        }
        this.b += cjiVar.f * this.e.a(cjiVar);
        this.e.c(cjiVar, z);
        if (z) {
            cjiVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            cjfVar.c = true;
        }
    }

    public void d(cjf cjfVar, cje cjeVar, boolean z) {
        cjd cjdVar = this.e;
        float fA = cjdVar.a(cjeVar.a);
        cjdVar.c(cjeVar.a, z);
        cjd cjdVar2 = cjeVar.e;
        int i = cjdVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            cji cjiVarD = cjdVar2.d(i2);
            cjdVar.e(cjiVarD, cjdVar2.a(cjiVarD) * fA, z);
        }
        this.b += cjeVar.b * fA;
        if (z) {
            cjeVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        cjfVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(cjf cjfVar, int i) {
        this.e.g(cjfVar.p(i), 1.0f);
        this.e.g(cjfVar.p(i), -1.0f);
    }

    public final void g(cji cjiVar, cji cjiVar2, cji cjiVar3, cji cjiVar4, float f) {
        this.e.g(cjiVar, -1.0f);
        this.e.g(cjiVar2, 1.0f);
        this.e.g(cjiVar3, f);
        this.e.g(cjiVar4, -f);
    }

    public final void h(cji cjiVar, cji cjiVar2, cji cjiVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(cjiVar, 1.0f);
                this.e.g(cjiVar2, -1.0f);
                this.e.g(cjiVar3, -1.0f);
                return;
            }
        }
        this.e.g(cjiVar, -1.0f);
        this.e.g(cjiVar2, 1.0f);
        this.e.g(cjiVar3, 1.0f);
    }

    public final void i(cji cjiVar, cji cjiVar2, cji cjiVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(cjiVar, 1.0f);
                this.e.g(cjiVar2, -1.0f);
                this.e.g(cjiVar3, 1.0f);
                return;
            }
        }
        this.e.g(cjiVar, -1.0f);
        this.e.g(cjiVar2, 1.0f);
        this.e.g(cjiVar3, -1.0f);
    }

    public final void j(cji cjiVar, cji cjiVar2, cji cjiVar3, cji cjiVar4, float f) {
        this.e.g(cjiVar3, 0.5f);
        this.e.g(cjiVar4, 0.5f);
        this.e.g(cjiVar, -0.5f);
        this.e.g(cjiVar2, -0.5f);
        this.b = -f;
    }

    public cji k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            cji cjiVar = this.a;
            Objects.toString(cjiVar);
            strConcat = "".concat(String.valueOf(cjiVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            cji cjiVarD = this.e.d(i2);
            if (cjiVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string = cjiVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public cje(pmg pmgVar) {
        this.e = new cjd(this, pmgVar);
    }
}
