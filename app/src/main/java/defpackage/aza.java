package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aza implements bbs {
    public final azr a;

    public aza(azr azrVar) {
        this.a = azrVar;
    }

    @Override // defpackage.bbs
    public final Object a(bfk bfkVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aza) && a.ao(this.a, ((aza) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
