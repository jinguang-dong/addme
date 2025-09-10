package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anw {
    public final int a;
    public final int b;

    public anw(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            akg.b("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        akg.b("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anw)) {
            return false;
        }
        anw anwVar = (anw) obj;
        return this.a == anwVar.a && this.b == anwVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ')';
    }
}
