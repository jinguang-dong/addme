package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukr implements uks {
    private final float a = 0.0f;
    private final float b;

    public ukr(float f) {
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final /* bridge */ /* synthetic */ Comparable a() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.uks
    public final boolean b() {
        return this.b < 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ukr)) {
            return false;
        }
        if (b() && ((ukr) obj).b()) {
            return true;
        }
        ukr ukrVar = (ukr) obj;
        float f = ukrVar.a;
        return this.b == ukrVar.b;
    }

    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "0.0.." + this.b;
    }
}
