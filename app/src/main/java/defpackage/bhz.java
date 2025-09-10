package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhz {
    public final int a;
    public final Integer b;

    public bhz(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhz)) {
            return false;
        }
        bhz bhzVar = (bhz) obj;
        return this.a == bhzVar.a && a.ao(this.b, bhzVar.b);
    }

    public final int hashCode() {
        Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
