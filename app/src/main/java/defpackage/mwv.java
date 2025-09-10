package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwv {
    public final int a;

    public mwv() {
        throw null;
    }

    public static mwu a() {
        mwu mwuVar = new mwu();
        mwuVar.a = 1;
        return mwuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mwv)) {
            return false;
        }
        int i = this.a;
        boolean z = i == ((mwv) obj).a;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        a.aQ(this.a);
        return 1000002;
    }

    public final String toString() {
        return a.bw(this.a != 1 ? "null" : "COMMAND_UNSPECIFIED", "{", "}");
    }

    public mwv(byte[] bArr) {
        this.a = 1;
    }
}
