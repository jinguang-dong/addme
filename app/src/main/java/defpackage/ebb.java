package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebb {
    public final String a;
    public final Long b;

    public ebb(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebb)) {
            return false;
        }
        ebb ebbVar = (ebb) obj;
        return a.ao(this.a, ebbVar.a) && a.ao(this.b, ebbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
