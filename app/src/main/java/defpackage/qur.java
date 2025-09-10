package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qur implements qpo {
    public final rwc a;
    private final int b;

    public qur() {
        throw null;
    }

    public static final quq d() {
        quq quqVar = new quq(null);
        quqVar.b = (byte) 1;
        quqVar.a = rvk.a;
        quqVar.c = 1;
        return quqVar;
    }

    @Override // defpackage.qpo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.qpo
    public final uem b() {
        return null;
    }

    @Override // defpackage.qpo
    public final boolean c() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qur)) {
            return false;
        }
        qur qurVar = (qur) obj;
        int i = this.b;
        int i2 = qurVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(qurVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.aF(i);
        return (this.a.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "{" + qpp.a(this.b) + ", false, " + String.valueOf(this.a) + ", null}";
    }

    public qur(int i, rwc rwcVar) {
        this.b = i;
        this.a = rwcVar;
    }
}
