package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qud implements qpo {
    public final rwc a;
    public final rwc b;
    private final int c;

    public qud() {
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
        return this.c == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qud)) {
            return false;
        }
        qud qudVar = (qud) obj;
        int i = this.c;
        int i2 = qudVar.c;
        if (i != 0) {
            return i2 == 1 && this.a.equals(qudVar.a) && this.b.equals(qudVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        a.aF(this.c);
        return 395873938;
    }

    public final String toString() {
        rwc rwcVar = this.b;
        return "{" + qpp.a(this.c) + ", " + String.valueOf(this.a) + ", " + String.valueOf(rwcVar) + "}";
    }

    public qud(rwc rwcVar, rwc rwcVar2) {
        this.c = 1;
        this.a = rwcVar;
        this.b = rwcVar2;
    }
}
