package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptk {
    public final cfo a;

    public ptk(cfo cfoVar) {
        this.a = cfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptk) && a.ao(this.a, ((ptk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoogleSansFlexConfig(variationSettings=" + this.a + ")";
    }
}
