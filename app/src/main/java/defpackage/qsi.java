package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsi implements qpo {
    private final int a;

    public qsi() {
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
        if (!(obj instanceof qsi)) {
            return false;
        }
        int i = this.a;
        int i2 = ((qsi) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.aF(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "{null, " + qpp.a(this.a) + "}";
    }

    public qsi(byte[] bArr) {
        this.a = 2;
    }
}
