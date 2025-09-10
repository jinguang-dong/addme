package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocn {
    public static final ocn a;
    public final double b;
    public final int c;

    static {
        b(1, Double.valueOf(0.0d));
        a(3);
        a(4);
        a = a(5);
        b(2, Double.valueOf(1.0d));
    }

    public ocn() {
        throw null;
    }

    static ocn a(int i) {
        a.I(true);
        a.I(true);
        return b(i, null);
    }

    static ocn b(int i, Double d) {
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        return new ocn(i, d.doubleValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ocn) {
            ocn ocnVar = (ocn) obj;
            if (this.c == ocnVar.c) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(ocnVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.aF(i);
        double d = this.b;
        return ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.c;
        return "{" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", " + this.b + "}";
    }

    public ocn(int i, double d) {
        this.c = i;
        this.b = d;
    }
}
