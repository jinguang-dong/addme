package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uen implements Serializable {
    public final double a;
    public final double b;

    public uen() {
        this.a = 0.0d;
        this.b = 0.0d;
    }

    public final boolean a(uen uenVar) {
        return this.a == uenVar.a && this.b == uenVar.b;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof uen) && a((uen) obj);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return (int) ((j ^ jDoubleToLongBits2) ^ (jDoubleToLongBits2 >> 32));
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public uen(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
