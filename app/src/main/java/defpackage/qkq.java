package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkq implements Comparable {
    public static final qkq a = new qkq(3, 0);
    public final int b;
    public final int c;

    public qkq(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qkq qkqVar) {
        int i = this.b;
        int i2 = qkqVar.b;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.c - qkqVar.c;
    }

    public final boolean b(qkq qkqVar) {
        return compareTo(qkqVar) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkq)) {
            return false;
        }
        qkq qkqVar = (qkq) obj;
        return this.b == qkqVar.b && this.c == qkqVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }

    public final String toString() {
        return this.b + "." + this.c;
    }
}
