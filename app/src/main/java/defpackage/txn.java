package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txn {
    public float a;
    public float b;
    public float c;

    public txn() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public static float a(txn txnVar, txn txnVar2) {
        return (txnVar.a * txnVar2.a) + (txnVar.b * txnVar2.b) + (txnVar.c * txnVar2.c);
    }

    public static txn d(txn txnVar, txn txnVar2) {
        return new txn(txnVar.a + txnVar2.a, txnVar.b + txnVar2.b, txnVar.c + txnVar2.c);
    }

    public static txn g(txn txnVar, txn txnVar2) {
        return new txn(txnVar.a - txnVar2.a, txnVar.b - txnVar2.b, txnVar.c - txnVar2.c);
    }

    public final float b() {
        return (float) Math.sqrt(c());
    }

    public final float c() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final txn e() {
        txn txnVar = new txn(this);
        float fC = c();
        float f = 0.0f;
        if (fC <= 0.0f) {
            txnVar.a = 0.0f;
            txnVar.b = 0.0f;
        } else {
            float fI = thu.i(fC);
            txnVar.a *= fI;
            txnVar.b *= fI;
            f = txnVar.c * fI;
        }
        txnVar.c = f;
        return txnVar;
    }

    public final txn f(float f) {
        return new txn(this.a * f, this.b * f, this.c * f);
    }

    public final String toString() {
        return "[x=" + this.a + ", y=" + this.b + ", z=" + this.c + "]";
    }

    public txn(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public txn(txn txnVar) {
        this.a = txnVar.a;
        this.b = txnVar.b;
        this.c = txnVar.c;
    }
}
