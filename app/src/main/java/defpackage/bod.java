package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bod extends bof {
    public final float a;

    public bod(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bod) && Float.compare(this.a, ((bod) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.a + ')';
    }
}
