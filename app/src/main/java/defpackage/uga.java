package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uga {
    public final int a;
    public final Object b;

    public uga(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga)) {
            return false;
        }
        uga ugaVar = (uga) obj;
        return this.a == ugaVar.a && a.ao(this.b, ugaVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
