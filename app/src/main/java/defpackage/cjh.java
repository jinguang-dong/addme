package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjh extends cje {
    public int f;
    final cjg g;
    private cji[] h;
    private cji[] i;

    public cjh(pmg pmgVar) {
        super(pmgVar);
        this.h = new cji[128];
        this.i = new cji[128];
        this.f = 0;
        this.g = new cjg(this);
    }

    @Override // defpackage.cje
    public final void d(cjf cjfVar, cje cjeVar, boolean z) {
        cji cjiVar = cjeVar.a;
        if (cjiVar == null) {
            return;
        }
        cjd cjdVar = cjeVar.e;
        int i = cjdVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            cji cjiVarD = cjdVar.d(i2);
            float fB = cjdVar.b(i2);
            cjg cjgVar = this.g;
            cjgVar.a = cjiVarD;
            if (cjgVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = cjgVar.a.i;
                    float f = fArr[i3] + (cjiVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        cjgVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    cjgVar.b.n(cjgVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = cjiVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        cjgVar.a.i[i4] = f3;
                    } else {
                        cjgVar.a.i[i4] = 0.0f;
                    }
                }
                m(cjiVarD);
            }
            this.b += cjeVar.b * fB;
        }
        n(cjiVar);
    }

    @Override // defpackage.cje
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.cje
    public final cji k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            cji[] cjiVarArr = this.h;
            cji cjiVar = cjiVarArr[i2];
            if (!zArr[cjiVar.c]) {
                cjg cjgVar = this.g;
                cjgVar.a = cjiVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = cjgVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    cji cjiVar2 = cjiVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = cjiVar2.i[i3];
                            float f3 = cjgVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(cji cjiVar) {
        int i;
        int i2 = this.f + 1;
        cji[] cjiVarArr = this.h;
        int length = cjiVarArr.length;
        if (i2 > length) {
            cji[] cjiVarArr2 = (cji[]) Arrays.copyOf(cjiVarArr, length + length);
            this.h = cjiVarArr2;
            int length2 = cjiVarArr2.length;
            this.i = (cji[]) Arrays.copyOf(cjiVarArr2, length2 + length2);
        }
        cji[] cjiVarArr3 = this.h;
        int i3 = this.f;
        cjiVarArr3[i3] = cjiVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && cjiVarArr3[i3].c > cjiVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new cbi(4));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        cjiVar.b = true;
        cjiVar.a(this);
    }

    public final void n(cji cjiVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == cjiVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        cjiVar.b = false;
                        return;
                    } else {
                        cji[] cjiVarArr = this.h;
                        int i3 = i + 1;
                        cjiVarArr[i] = cjiVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.cje
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            cji cjiVar = this.h[i];
            cjg cjgVar = this.g;
            cjgVar.a = cjiVar;
            str = str + cjgVar + " ";
        }
        return str;
    }
}
