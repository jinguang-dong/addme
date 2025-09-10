package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tr {
    public final int a;
    public final int b;
    public final int c;

    public tr(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return this.a == trVar.a && this.b == trVar.b && this.c == trVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "InputConfigData(width=" + this.a + ", height=" + this.b + ", format=" + this.c + ')';
    }
}
