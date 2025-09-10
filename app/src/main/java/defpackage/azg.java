package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azg {
    private final Object a;
    private final Object b;

    public azg(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        return obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azg)) {
            return false;
        }
        azg azgVar = (azg) obj;
        return a.ao(this.a, azgVar.a) && a.ao(this.b, azgVar.b);
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
