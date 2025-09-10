package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tov {
    private final Object a;
    private final int b;

    public tov(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tov)) {
            return false;
        }
        tov tovVar = (tov) obj;
        return this.a == tovVar.a && this.b == tovVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
