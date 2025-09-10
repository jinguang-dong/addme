package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ays implements bbs {
    public final uiq a;

    public ays(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bbs
    public final Object a(bfk bfkVar) {
        return this.a.a(bfkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ays) && a.ao(this.a, ((ays) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
