package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmn extends blz {
    private static final bmg q = new bma(6);
    public final bmp d;
    public final float e;
    public final float f;
    public final bmo g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final bmg k;
    public final uiq l;
    public final bmg m;
    public final bmg n;
    public final uiq o;
    public final bmg p;
    private final boolean r;

    /* JADX WARN: Illegal instructions before constructor call */
    public bmn(String str, float[] fArr, bmp bmpVar, final double d, float f, float f2, int i) {
        bmg bmgVar;
        bmg bmgVar2;
        if (d == 1.0d) {
            bmgVar = q;
        } else {
            final int i2 = 1;
            bmgVar = new bmg() { // from class: bml
                @Override // defpackage.bmg
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        bmg bmgVar3 = bmgVar;
        if (d == 1.0d) {
            bmgVar2 = q;
        } else {
            final int i3 = 0;
            bmgVar2 = new bmg() { // from class: bml
                @Override // defpackage.bmg
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, bmpVar, null, bmgVar3, bmgVar2, f, f2, new bmo(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    @Override // defpackage.blz
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.blz
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.blz
    public final float c(float f, float f2, float f3) {
        bmg bmgVar = this.p;
        float fA = (float) bmgVar.a(f);
        float fA2 = (float) bmgVar.a(f2);
        float fA3 = (float) bmgVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.blz
    public final long d(float f, float f2, float f3) {
        bmg bmgVar = this.p;
        float fA = (float) bmgVar.a(f);
        float fA2 = (float) bmgVar.a(f2);
        float fA3 = (float) bmgVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        float f9 = fArr[7] * fA3;
        return (Float.floatToRawIntBits(f7 + f8 + f9) & 4294967295L) | (Float.floatToRawIntBits((f4 + f5) + f6) << 32);
    }

    @Override // defpackage.blz
    public final long e(float f, float f2, float f3, float f4, blz blzVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        bmg bmgVar = this.m;
        return bko.k((float) bmgVar.a(f5 + f6 + f7), (float) bmgVar.a(f8 + f9 + f10), (float) bmgVar.a(f11 + f12 + f13), f4, blzVar);
    }

    @Override // defpackage.blz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        bmn bmnVar = (bmn) obj;
        if (Float.compare(bmnVar.e, this.e) != 0 || Float.compare(bmnVar.f, this.f) != 0 || !a.ao(this.d, bmnVar.d) || !Arrays.equals(this.h, bmnVar.h)) {
            return false;
        }
        bmo bmoVar = this.g;
        if (bmoVar != null) {
            return a.ao(bmoVar, bmnVar.g);
        }
        if (bmnVar.g == null) {
            return true;
        }
        if (a.ao(this.k, bmnVar.k)) {
            return a.ao(this.n, bmnVar.n);
        }
        return false;
    }

    @Override // defpackage.blz
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.blz
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        bmo bmoVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (bmoVar != null ? bmoVar.hashCode() : 0);
        return bmoVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public bmn(String str, float[] fArr, bmp bmpVar, final bmo bmoVar, int i) {
        bmg bmgVar;
        bmg bmgVar2;
        final int i2 = 3;
        if (bmoVar.a()) {
            bmgVar = new bmg() { // from class: bmm
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i3 = i2;
                    if (i3 == 0) {
                        float[] fArr2 = bmb.a;
                        return bmb.c(bmoVar, d);
                    }
                    if (i3 == 1) {
                        float[] fArr3 = bmb.a;
                        return bmb.a(bmoVar, d);
                    }
                    if (i3 == 2) {
                        bmo bmoVar2 = bmoVar;
                        if (d < bmoVar2.e) {
                            return (bmoVar2.d * d) + bmoVar2.g;
                        }
                        double d2 = bmoVar2.a;
                        return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                    }
                    if (i3 == 3) {
                        float[] fArr4 = bmb.a;
                        return bmb.b(bmoVar, d);
                    }
                    if (i3 == 4) {
                        float[] fArr5 = bmb.a;
                        return bmb.d(bmoVar, d);
                    }
                    bmo bmoVar3 = bmoVar;
                    double d3 = bmoVar3.e;
                    double d4 = bmoVar3.d;
                    if (d < d3 * d4) {
                        return (d - bmoVar3.g) / d4;
                    }
                    double d5 = bmoVar3.a;
                    double d6 = bmoVar3.f;
                    double d7 = bmoVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                }
            };
        } else if (bmoVar.b()) {
            final int i3 = 4;
            bmgVar = new bmg() { // from class: bmm
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i32 = i3;
                    if (i32 == 0) {
                        float[] fArr2 = bmb.a;
                        return bmb.c(bmoVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = bmb.a;
                        return bmb.a(bmoVar, d);
                    }
                    if (i32 == 2) {
                        bmo bmoVar2 = bmoVar;
                        if (d < bmoVar2.e) {
                            return (bmoVar2.d * d) + bmoVar2.g;
                        }
                        double d2 = bmoVar2.a;
                        return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = bmb.a;
                        return bmb.b(bmoVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = bmb.a;
                        return bmb.d(bmoVar, d);
                    }
                    bmo bmoVar3 = bmoVar;
                    double d3 = bmoVar3.e;
                    double d4 = bmoVar3.d;
                    if (d < d3 * d4) {
                        return (d - bmoVar3.g) / d4;
                    }
                    double d5 = bmoVar3.a;
                    double d6 = bmoVar3.f;
                    double d7 = bmoVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                }
            };
        } else if (bmoVar.f == 0.0d && bmoVar.g == 0.0d) {
            bmgVar = new bmg() { // from class: bmk
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i4 = i2;
                    if (i4 == 0) {
                        return ((bmn) bmoVar).n.a(ukc.j(d, r12.e, r12.f));
                    }
                    if (i4 == 1) {
                        bmn bmnVar = (bmn) bmoVar;
                        return ukc.j(bmnVar.k.a(d), bmnVar.e, bmnVar.f);
                    }
                    if (i4 != 2) {
                        bmo bmoVar2 = (bmo) bmoVar;
                        double d2 = bmoVar2.a;
                        double d3 = bmoVar2.e;
                        return byi.O(d, bmoVar2.b, bmoVar2.c, bmoVar2.d, d3, d2);
                    }
                    bmo bmoVar3 = (bmo) bmoVar;
                    double d4 = bmoVar3.a;
                    double d5 = bmoVar3.e;
                    return byi.P(d, bmoVar3.b, bmoVar3.c, bmoVar3.d, d5, d4);
                }
            };
        } else {
            final int i4 = 5;
            bmgVar = new bmg() { // from class: bmm
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i32 = i4;
                    if (i32 == 0) {
                        float[] fArr2 = bmb.a;
                        return bmb.c(bmoVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = bmb.a;
                        return bmb.a(bmoVar, d);
                    }
                    if (i32 == 2) {
                        bmo bmoVar2 = bmoVar;
                        if (d < bmoVar2.e) {
                            return (bmoVar2.d * d) + bmoVar2.g;
                        }
                        double d2 = bmoVar2.a;
                        return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = bmb.a;
                        return bmb.b(bmoVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = bmb.a;
                        return bmb.d(bmoVar, d);
                    }
                    bmo bmoVar3 = bmoVar;
                    double d3 = bmoVar3.e;
                    double d4 = bmoVar3.d;
                    if (d < d3 * d4) {
                        return (d - bmoVar3.g) / d4;
                    }
                    double d5 = bmoVar3.a;
                    double d6 = bmoVar3.f;
                    double d7 = bmoVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                }
            };
        }
        bmg bmgVar3 = bmgVar;
        if (bmoVar.a()) {
            final int i5 = 1;
            bmgVar2 = new bmg() { // from class: bmm
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i32 = i5;
                    if (i32 == 0) {
                        float[] fArr2 = bmb.a;
                        return bmb.c(bmoVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = bmb.a;
                        return bmb.a(bmoVar, d);
                    }
                    if (i32 == 2) {
                        bmo bmoVar2 = bmoVar;
                        if (d < bmoVar2.e) {
                            return (bmoVar2.d * d) + bmoVar2.g;
                        }
                        double d2 = bmoVar2.a;
                        return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = bmb.a;
                        return bmb.b(bmoVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = bmb.a;
                        return bmb.d(bmoVar, d);
                    }
                    bmo bmoVar3 = bmoVar;
                    double d3 = bmoVar3.e;
                    double d4 = bmoVar3.d;
                    if (d < d3 * d4) {
                        return (d - bmoVar3.g) / d4;
                    }
                    double d5 = bmoVar3.a;
                    double d6 = bmoVar3.f;
                    double d7 = bmoVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                }
            };
        } else if (bmoVar.b()) {
            final int i6 = 0;
            bmgVar2 = new bmg() { // from class: bmm
                @Override // defpackage.bmg
                public final double a(double d) {
                    int i32 = i6;
                    if (i32 == 0) {
                        float[] fArr2 = bmb.a;
                        return bmb.c(bmoVar, d);
                    }
                    if (i32 == 1) {
                        float[] fArr3 = bmb.a;
                        return bmb.a(bmoVar, d);
                    }
                    if (i32 == 2) {
                        bmo bmoVar2 = bmoVar;
                        if (d < bmoVar2.e) {
                            return (bmoVar2.d * d) + bmoVar2.g;
                        }
                        double d2 = bmoVar2.a;
                        return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                    }
                    if (i32 == 3) {
                        float[] fArr4 = bmb.a;
                        return bmb.b(bmoVar, d);
                    }
                    if (i32 == 4) {
                        float[] fArr5 = bmb.a;
                        return bmb.d(bmoVar, d);
                    }
                    bmo bmoVar3 = bmoVar;
                    double d3 = bmoVar3.e;
                    double d4 = bmoVar3.d;
                    if (d < d3 * d4) {
                        return (d - bmoVar3.g) / d4;
                    }
                    double d5 = bmoVar3.a;
                    double d6 = bmoVar3.f;
                    double d7 = bmoVar3.c;
                    return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                }
            };
        } else {
            final int i7 = 2;
            if (bmoVar.f == 0.0d && bmoVar.g == 0.0d) {
                bmgVar2 = new bmg() { // from class: bmk
                    @Override // defpackage.bmg
                    public final double a(double d) {
                        int i42 = i7;
                        if (i42 == 0) {
                            return ((bmn) bmoVar).n.a(ukc.j(d, r12.e, r12.f));
                        }
                        if (i42 == 1) {
                            bmn bmnVar = (bmn) bmoVar;
                            return ukc.j(bmnVar.k.a(d), bmnVar.e, bmnVar.f);
                        }
                        if (i42 != 2) {
                            bmo bmoVar2 = (bmo) bmoVar;
                            double d2 = bmoVar2.a;
                            double d3 = bmoVar2.e;
                            return byi.O(d, bmoVar2.b, bmoVar2.c, bmoVar2.d, d3, d2);
                        }
                        bmo bmoVar3 = (bmo) bmoVar;
                        double d4 = bmoVar3.a;
                        double d5 = bmoVar3.e;
                        return byi.P(d, bmoVar3.b, bmoVar3.c, bmoVar3.d, d5, d4);
                    }
                };
            } else {
                bmgVar2 = new bmg() { // from class: bmm
                    @Override // defpackage.bmg
                    public final double a(double d) {
                        int i32 = i7;
                        if (i32 == 0) {
                            float[] fArr2 = bmb.a;
                            return bmb.c(bmoVar, d);
                        }
                        if (i32 == 1) {
                            float[] fArr3 = bmb.a;
                            return bmb.a(bmoVar, d);
                        }
                        if (i32 == 2) {
                            bmo bmoVar2 = bmoVar;
                            if (d < bmoVar2.e) {
                                return (bmoVar2.d * d) + bmoVar2.g;
                            }
                            double d2 = bmoVar2.a;
                            return Math.pow((bmoVar2.b * d) + bmoVar2.c, d2) + bmoVar2.f;
                        }
                        if (i32 == 3) {
                            float[] fArr4 = bmb.a;
                            return bmb.b(bmoVar, d);
                        }
                        if (i32 == 4) {
                            float[] fArr5 = bmb.a;
                            return bmb.d(bmoVar, d);
                        }
                        bmo bmoVar3 = bmoVar;
                        double d3 = bmoVar3.e;
                        double d4 = bmoVar3.d;
                        if (d < d3 * d4) {
                            return (d - bmoVar3.g) / d4;
                        }
                        double d5 = bmoVar3.a;
                        double d6 = bmoVar3.f;
                        double d7 = bmoVar3.c;
                        return (Math.pow(d - d6, 1.0d / d5) - d7) / bmoVar3.b;
                    }
                };
            }
        }
        this(str, fArr, bmpVar, null, bmgVar3, bmgVar2, 0.0f, 1.0f, bmoVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bmn(java.lang.String r33, float[] r34, defpackage.bmp r35, float[] r36, defpackage.bmg r37, defpackage.bmg r38, float r39, float r40, defpackage.bmo r41, int r42) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmn.<init>(java.lang.String, float[], bmp, float[], bmg, bmg, float, float, bmo, int):void");
    }
}
