package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvb implements qpo {
    private final int a;
    private final boolean b;
    private final int c;
    private final qsp d;

    public qvb() {
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
        if (!(obj instanceof qvb)) {
            return false;
        }
        qvb qvbVar = (qvb) obj;
        int i = this.c;
        int i2 = qvbVar.c;
        if (i != 0) {
            return i == i2 && this.a == qvbVar.a && this.d.equals(qvbVar.d) && this.b == qvbVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.aF(i);
        return (((true != this.b ? 1237 : 1231) ^ ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "{" + qpp.a(this.c) + ", " + this.a + ", " + String.valueOf(this.d) + ", " + this.b + ", false}";
    }

    public qvb(qsp qspVar) {
        this.c = 2;
        this.a = 10;
        this.d = qspVar;
        this.b = true;
    }
}
