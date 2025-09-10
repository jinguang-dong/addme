package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvd implements qpo {
    public final float a;
    private final int b;

    public qvd() {
        throw null;
    }

    public static final qvc d() {
        qvc qvcVar = new qvc();
        qvcVar.a = 0.5f;
        qvcVar.b = (byte) 1;
        qvcVar.c = 1;
        return qvcVar;
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
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qvd)) {
            return false;
        }
        qvd qvdVar = (qvd) obj;
        int i = this.b;
        int i2 = qvdVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(qvdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aF(i);
        return Float.floatToIntBits(this.a) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + qpp.a(this.b) + ", " + this.a + "}";
    }

    public qvd(int i, float f) {
        this.b = i;
        this.a = f;
    }
}
