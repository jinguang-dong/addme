package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsx implements qpo {
    private final int a;
    private final int b;

    public qsx() {
        throw null;
    }

    @Override // defpackage.qpo
    public final int a() {
        return this.a;
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
        if (!(obj instanceof qsx)) {
            return false;
        }
        qsx qsxVar = (qsx) obj;
        int i = this.b;
        int i2 = qsxVar.b;
        if (i != 0) {
            return i == i2 && this.a == qsxVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aF(i);
        return ((this.a ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "{" + qpp.a(this.b) + ", " + this.a + ", false}";
    }

    public qsx(byte[] bArr) {
        this.b = 2;
        this.a = 10;
    }
}
