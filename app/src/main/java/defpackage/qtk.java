package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtk implements qpo {
    public final rwc a;
    public final boolean b;
    private final int c;
    private final int d;

    public qtk() {
        throw null;
    }

    public static qtj d() {
        qtj qtjVar = new qtj((byte[]) null);
        qtjVar.a = 3;
        qtjVar.e = rvk.a;
        qtjVar.b = true;
        qtjVar.d = 1;
        qtjVar.c = (byte) 127;
        return qtjVar;
    }

    @Override // defpackage.qpo
    public final int a() {
        return this.c;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ uem b() {
        return null;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        return this.d != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qtk)) {
            return false;
        }
        qtk qtkVar = (qtk) obj;
        int i = this.d;
        int i2 = qtkVar.d;
        if (i != 0) {
            return i == i2 && this.c == qtkVar.c && this.a.equals(qtkVar.a) && this.b == qtkVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.aF(i);
        return ((((((((((((((this.c ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "{" + qpp.a(this.d) + ", " + this.c + ", false, " + String.valueOf(this.a) + ", false, false, " + this.b + ", false, false}";
    }

    public qtk(int i, int i2, rwc rwcVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = rwcVar;
        this.b = z;
    }
}
