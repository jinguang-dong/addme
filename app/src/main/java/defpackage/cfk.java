package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cfk {
    public final int a = 65535;

    public static String a() {
        return a.p(65535, 0) ? "None" : a.p(65535, 1) ? "Weight" : a.p(65535, 2) ? "Style" : a.p(65535, 65535) ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cfk)) {
            return false;
        }
        int i = ((cfk) obj).a;
        return true;
    }

    public final int hashCode() {
        return 65535;
    }

    public final String toString() {
        return a();
    }
}
