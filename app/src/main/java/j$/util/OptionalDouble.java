package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class OptionalDouble {
    public static final OptionalDouble c = new OptionalDouble();
    public final boolean a;
    public final double b;

    public OptionalDouble() {
        this.a = false;
        this.b = Double.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalDouble)) {
            return false;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        boolean z = this.a;
        return (z && optionalDouble.a) ? Double.compare(this.b, optionalDouble.b) == 0 : z == optionalDouble.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public double orElse(double d) {
        return this.a ? this.b : d;
    }

    public double orElseThrow() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }

    public OptionalDouble(double d) {
        this.a = true;
        this.b = d;
    }
}
