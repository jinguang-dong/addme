package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbq implements bbs {
    public final Object a;

    public bbq(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bbs
    public final Object a(bfk bfkVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbq) && a.ao(this.a, ((bbq) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
