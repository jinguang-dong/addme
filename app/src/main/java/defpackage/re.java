package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class re {
    private final int a = 4;
    private final qc b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        int i = reVar.a;
        if (!a.p(4, 4)) {
            return false;
        }
        qc qcVar = reVar.b;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return 124;
    }

    public final String toString() {
        return "Result3A(status=Status(value=4), frameMetadata=null)";
    }
}
