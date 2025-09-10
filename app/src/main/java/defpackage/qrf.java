package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrf implements qpo {
    public final float a;
    public final int b;
    public final rwc c;
    private final uem d;
    private final int e;

    public qrf() {
        throw null;
    }

    public static final qre d() {
        qre qreVar = new qre(null);
        qreVar.a = 100.0f;
        qreVar.e = 1;
        qreVar.b = 100;
        qreVar.d = (byte) 3;
        return qreVar;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.qpo
    public final uem b() {
        return this.d;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        int i = this.e;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        uem uemVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qrf)) {
            return false;
        }
        qrf qrfVar = (qrf) obj;
        int i = this.e;
        int i2 = qrfVar.e;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(qrfVar.a) && this.b == qrfVar.b && ((uemVar = this.d) != null ? uemVar.equals(qrfVar.d) : qrfVar.d == null) && this.c.equals(qrfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.aF(i);
        int iFloatToIntBits = ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        uem uemVar = this.d;
        return ((((this.b ^ (iFloatToIntBits * 1000003)) * 1000003) ^ (uemVar == null ? 0 : uemVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        rwc rwcVar = this.c;
        return "{" + qpp.a(this.e) + ", " + this.a + ", " + this.b + ", " + String.valueOf(this.d) + ", " + String.valueOf(rwcVar) + "}";
    }

    public qrf(int i, float f, int i2, uem uemVar, rwc rwcVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.d = uemVar;
        this.c = rwcVar;
    }
}
