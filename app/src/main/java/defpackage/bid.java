package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bid {
    private final float a;

    public bid(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round(((i2 - i) / 2.0f) * (this.a + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bid) && Float.compare(this.a, ((bid) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}
