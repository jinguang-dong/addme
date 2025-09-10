package j$.time.format;

/* loaded from: classes3.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.l a;
    public final int b;
    public final int c;
    public final A d;
    public final int e;

    public j(j$.time.temporal.l lVar, int i, int i2, A a) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = a;
        this.e = 0;
    }

    public long a(u uVar, long j) {
        return j;
    }

    public j b() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j c(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean h(u uVar, StringBuilder sb) {
        j$.time.temporal.l lVar = this.a;
        Long lA = uVar.a(lVar);
        if (lA == null) {
            return false;
        }
        long jA = a(uVar, lA.longValue());
        y yVar = uVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + String.valueOf(lVar) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        yVar.getClass();
        int i2 = this.b;
        A a = this.d;
        if (jA >= 0) {
            int i3 = AbstractC0028b.a[a.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0028b.a[a.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + String.valueOf(lVar) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        j$.time.temporal.l lVar = this.a;
        A a = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && a == A.NORMAL) {
            return "Value(" + String.valueOf(lVar) + ")";
        }
        if (i2 == i && a == A.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(lVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(lVar) + "," + i2 + "," + i + "," + String.valueOf(a) + ")";
    }

    public j(j$.time.temporal.l lVar, int i, int i2, A a, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = a;
        this.e = i3;
    }
}
