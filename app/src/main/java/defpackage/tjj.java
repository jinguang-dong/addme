package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjj extends Number {
    private final String a;

    public tjj(String str) {
        this.a = str;
    }

    private final BigDecimal a() {
        return sla.B(this.a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return a();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tjj) {
            return this.a.equals(((tjj) obj).a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.a);
            } catch (NumberFormatException unused) {
                return this.a().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public final String toString() {
        return this.a;
    }
}
