package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boe extends bof {
    public final float a;

    public boe(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boe) && Float.compare(this.a, ((boe) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.a + ')';
    }
}
