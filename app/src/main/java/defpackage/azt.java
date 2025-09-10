package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azt {
    private final String a;

    public azt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azt) && a.ao(this.a, ((azt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.a + ')';
    }
}
