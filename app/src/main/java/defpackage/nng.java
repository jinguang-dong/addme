package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nng {
    public double a;
    public double b;
    public double c;
    public double d;

    public final void a(nng nngVar) {
        this.a = nngVar.a;
        this.b = nngVar.b;
        this.c = nngVar.c;
        this.d = nngVar.d;
    }

    public final void b(float[] fArr) {
        float f = (float) this.a;
        float f2 = (float) this.b;
        float f3 = (float) this.c;
        float f4 = (float) this.d;
        float f5 = f3 + f3;
        float f6 = f2 + f2;
        float f7 = f6 * f2;
        float f8 = f3 * f5;
        fArr[0] = 1.0f - (f7 + f8);
        float f9 = f6 * f;
        float f10 = f5 * f4;
        fArr[1] = f9 + f10;
        float f11 = f5 * f;
        float f12 = f6 * f4;
        fArr[2] = f11 - f12;
        fArr[3] = 0.0f;
        fArr[4] = f9 - f10;
        float f13 = f + f;
        float f14 = f * f13;
        fArr[5] = 1.0f - (f8 + f14);
        float f15 = f5 * f2;
        float f16 = f13 * f4;
        fArr[6] = f15 + f16;
        fArr[7] = 0.0f;
        fArr[8] = f11 + f12;
        fArr[9] = f15 - f16;
        fArr[10] = 1.0f - (f14 + f7);
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }
}
