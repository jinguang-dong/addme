package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quw implements qpo {
    public final float a;
    private final int b;
    private final rwc c;
    private final int d;

    public quw() {
        throw null;
    }

    public static final quv d() {
        quv quvVar = new quv(null);
        quvVar.a = 10;
        quvVar.b = 1.0f;
        quvVar.d = (byte) 3;
        quvVar.c = rvk.a;
        quvVar.e = 1;
        return quvVar;
    }

    @Override // defpackage.qpo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ uem b() {
        return null;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof quw)) {
            return false;
        }
        quw quwVar = (quw) obj;
        int i = this.d;
        int i2 = quwVar.d;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.b == quwVar.b) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(quwVar.a) && this.c.equals(quwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        a.aF(i);
        float f = this.a;
        return ((((this.b ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ Float.floatToIntBits(f)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "{" + qpp.a(this.d) + ", " + this.b + ", " + this.a + ", " + String.valueOf(this.c) + "}";
    }

    public quw(int i, int i2, float f, rwc rwcVar) {
        this.d = i;
        this.b = i2;
        this.a = f;
        this.c = rwcVar;
    }
}
