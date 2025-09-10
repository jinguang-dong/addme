package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chz {
    public static final chz a = new chz(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public chz(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final long b() {
        return (this.b << 32) | (this.c & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chz)) {
            return false;
        }
        chz chzVar = (chz) obj;
        return this.b == chzVar.b && this.c == chzVar.c && this.d == chzVar.d && this.e == chzVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ')';
    }
}
