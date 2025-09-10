package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duz {
    public final duc a;
    private final float b;

    public duz(duc ducVar, float f) {
        this.a = ducVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        duz duzVar = (duz) obj;
        return a.ao(this.a, duzVar.a) && this.b == duzVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }
}
