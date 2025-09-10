package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eva {
    public final String a;

    public eva(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eva) {
            return this.a.equals(((eva) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
