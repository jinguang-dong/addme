package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qps implements qpo {
    private final int a;
    private final qpt b;

    public qps() {
        throw null;
    }

    public static final qpr d() {
        qpr qprVar = new qpr();
        qprVar.c = new qpt((byte[]) null);
        qprVar.b = 1;
        qprVar.a = (byte) 1;
        return qprVar;
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
        return this.a == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qps)) {
            return false;
        }
        qps qpsVar = (qps) obj;
        int i = this.a;
        int i2 = qpsVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(qpsVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aF(i);
        return this.b.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        return "{" + qpp.a(this.a) + ", false, " + String.valueOf(this.b) + "}";
    }

    public qps(int i, qpt qptVar) {
        this.a = i;
        this.b = qptVar;
    }
}
