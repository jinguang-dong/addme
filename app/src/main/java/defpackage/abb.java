package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abb {
    public final acn a;
    private final float b = 0.0f;

    public abb(acn acnVar) {
        this.a = acnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abb)) {
            return false;
        }
        abb abbVar = (abb) obj;
        float f = abbVar.b;
        return Float.compare(0.0f, 0.0f) == 0 && a.ao(this.a, abbVar.a);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
