package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dre {
    public final chq a;
    public float b;
    public float c;
    public float d;
    public float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private bki j;
    private final azr k = new azz(new bkg(0.0f, 0.0f, 0.0f, 0.0f), bap.c);

    public dre(chq chqVar) {
        this.a = chqVar;
        this.f = chqVar.dk(46.0f);
        this.g = chqVar.dk(3.0f);
        this.h = chqVar.dk(58.0f);
        this.i = chqVar.dk(20.0f);
    }

    public final bkg a() {
        return (bkg) this.k.a();
    }

    public final void b(long j) {
        if (bki.c(j, this.j)) {
            return;
        }
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) == 0.0f || Float.isNaN(Float.intBitsToFloat(i))) {
            return;
        }
        this.j = new bki(j);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float f = this.f;
        this.c = ukc.k(1.0f - (fIntBitsToFloat / f), 0.0f);
        this.d = chp.x(this.h + ((Float.intBitsToFloat(i) - f) * 1.42f), Float.intBitsToFloat(i), this.c);
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / 2.0f;
        float fIntBitsToFloat3 = ((Float.intBitsToFloat(i2) / 2.0f) - this.g) - (this.d / 2.0f);
        this.b = ((Float.intBitsToFloat(i2) / 2.0f) - ((float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) - (fIntBitsToFloat3 * fIntBitsToFloat3)))) + this.i;
        this.e = Float.intBitsToFloat(i) - (this.d / 2.0f);
        bkg bkgVar = new bkg(this.b, 0.0f, Float.intBitsToFloat(i2) - this.b, Float.intBitsToFloat(i));
        float f2 = this.e;
        float f3 = bkgVar.b;
        float f4 = bkgVar.d;
        float f5 = bkgVar.c;
        float f6 = bkgVar.e;
        float f7 = ((f4 - f3) / 2.0f) - f2;
        float fK = ukc.k(((f6 - f5) / 2.0f) + 0.0f, 0.0f);
        float fK2 = ukc.k(f7, 0.0f);
        float f8 = (f3 + f4) / 2.0f;
        float f9 = (f5 + f6) / 2.0f;
        this.k.b(new bkg(f8 - fK2, f9 - fK, f8 + fK2, f9 + fK));
    }
}
