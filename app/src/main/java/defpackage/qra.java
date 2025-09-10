package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qra implements qpo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public qra() {
        throw null;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ uem b() {
        return null;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qra)) {
            return false;
        }
        qra qraVar = (qra) obj;
        int i = this.f;
        int i2 = qraVar.f;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 && this.a == qraVar.a && this.b == qraVar.b && this.c == qraVar.c && this.d == qraVar.d) {
            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(qraVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.aF(this.f);
        double d = this.e;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        return ((this.d ^ ((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003)) * 1000003) ^ ((int) jDoubleToLongBits);
    }

    public final String toString() {
        return "{" + qpp.a(this.f) + ", " + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public qra(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }
}
