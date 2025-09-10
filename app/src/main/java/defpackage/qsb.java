package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsb implements qpo {
    public final String a;
    private final int b;

    public qsb() {
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
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qsb)) {
            return false;
        }
        qsb qsbVar = (qsb) obj;
        int i = this.b;
        int i2 = qsbVar.b;
        if (i != 0) {
            return i2 == 1 && this.a.equals(qsbVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        a.aF(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "{" + qpp.a(this.b) + ", " + this.a + ", null}";
    }

    public qsb(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }
}
