package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiq extends til {
    public final Object a;

    public tiq(Object obj) {
        this.a = obj;
    }

    private static boolean h(tiq tiqVar) {
        Object obj = tiqVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final double a() {
        return g() ? b().doubleValue() : Double.parseDouble(c());
    }

    public final Number b() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new tjj((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (g()) {
            return b().toString();
        }
        if (f()) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public final BigDecimal d() {
        Object obj = this.a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : sla.B(c());
    }

    public final BigInteger e() {
        Object obj = this.a;
        return obj instanceof BigInteger ? (BigInteger) obj : h(this) ? BigInteger.valueOf(b().longValue()) : sla.C(c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tiq tiqVar = (tiq) obj;
        if (h(this) && h(tiqVar)) {
            return ((this.a instanceof BigInteger) || (tiqVar.a instanceof BigInteger)) ? e().equals(tiqVar.e()) : b().longValue() == tiqVar.b().longValue();
        }
        Object obj2 = this.a;
        if (obj2 instanceof Number) {
            Object obj3 = tiqVar.a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return d().compareTo(tiqVar.d()) == 0;
                }
                double dA = a();
                double dA2 = tiqVar.a();
                if (dA != dA2) {
                    return Double.isNaN(dA) && Double.isNaN(dA2);
                }
                return true;
            }
        }
        return obj2.equals(tiqVar.a);
    }

    public final boolean f() {
        return this.a instanceof Boolean;
    }

    public final boolean g() {
        return this.a instanceof Number;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (h(this)) {
            jDoubleToLongBits = b().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public tiq(String str) {
        str.getClass();
        this.a = str;
    }
}
