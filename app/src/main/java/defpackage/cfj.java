package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cfj {
    public final int a = 0;

    @ueo
    public /* synthetic */ cfj() {
    }

    public static String a() {
        return a.p(0, 0) ? "Normal" : a.p(0, 1) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cfj)) {
            return false;
        }
        int i = ((cfj) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a();
    }
}
