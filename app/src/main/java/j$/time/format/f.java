package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class f extends j {
    public final boolean g;

    public f(j$.time.temporal.l lVar, int i, int i2, boolean z) {
        this(lVar, i, i2, z, 0);
        Objects.a(lVar, "field");
        j$.time.temporal.o oVarRange = lVar.range();
        if (oVarRange.a != oVarRange.b || oVarRange.c != oVarRange.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(lVar)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        j$.time.temporal.l lVar = this.a;
        Long lA = uVar.a(lVar);
        if (lA == null) {
            return false;
        }
        y yVar = uVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.o oVarRange = lVar.range();
        oVarRange.b(jLongValue, lVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(oVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(oVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            yVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                yVar.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                yVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    public f(j$.time.temporal.l lVar, int i, int i2, boolean z, int i3) {
        super(lVar, i, i2, A.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
