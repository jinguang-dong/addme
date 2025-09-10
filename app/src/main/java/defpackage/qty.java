package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qty implements qpo {
    public final rwc a;
    private final int b;
    private final int c;

    public qty() {
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
        if (!(obj instanceof qty)) {
            return false;
        }
        qty qtyVar = (qty) obj;
        int i = this.c;
        int i2 = qtyVar.c;
        if (i != 0) {
            return i == i2 && this.b == qtyVar.b && this.a.equals(qtyVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.aF(i);
        return ((((this.b ^ ((i ^ 1000003) * 1000003)) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "{" + qpp.a(this.c) + ", " + this.b + ", null, false, " + String.valueOf(this.a) + "}";
    }

    public qty(rwc rwcVar) {
        this.c = 2;
        this.b = 50;
        this.a = rwcVar;
    }
}
