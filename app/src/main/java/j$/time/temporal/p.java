package j$.time.temporal;

import j$.time.chrono.InterfaceC0018b;

/* loaded from: classes3.dex */
public final class p implements l {
    public static final o f = o.f(1, 7);
    public static final o g = o.g(0, 4, 6);
    public static final o h = o.g(0, 52, 54);
    public static final o i = o.g(1, 52, 53);
    public final String a;
    public final q b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final o e;

    public p(String str, q qVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, o oVar) {
        this.a = str;
        this.b = qVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = oVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        int iH = temporalAccessor.h(a.DAY_OF_WEEK) - this.b.a.getValue();
        int i2 = iH % 7;
        if (i2 == 0) {
            i2 = 0;
        } else if ((((iH ^ 7) >> 31) | 1) <= 0) {
            i2 += 7;
        }
        return i2 + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iH = temporalAccessor.h(aVar);
        int iF = f(iH, iB);
        int iA2 = a(iF, iH);
        return iA2 == 0 ? c(j$.desugar.sun.nio.fs.g.D(temporalAccessor).C(temporalAccessor).x(iH, ChronoUnit.DAYS)) : (iA2 <= 50 || iA2 < (iA = a(iF, ((int) temporalAccessor.l(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final o d(TemporalAccessor temporalAccessor, a aVar) {
        int iF = f(temporalAccessor.h(aVar), b(temporalAccessor));
        o oVarL = temporalAccessor.l(aVar);
        return o.f(a(iF, (int) oVarL.a), a(iF, (int) oVarL.d));
    }

    public final o e(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.c(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(aVar);
        int iF = f(iH, iB);
        int iA = a(iF, iH);
        if (iA == 0) {
            return e(j$.desugar.sun.nio.fs.g.D(temporalAccessor).C(temporalAccessor).x(iH + 7, ChronoUnit.DAYS));
        }
        return iA >= a(iF, this.b.b + ((int) temporalAccessor.l(aVar).d)) ? e(j$.desugar.sun.nio.fs.g.D(temporalAccessor).C(temporalAccessor).b((r0 - iH) + 8, (TemporalUnit) ChronoUnit.DAYS)) : o.f(1L, r1 - 1);
    }

    public final int f(int i2, int i3) {
        int i4 = i2 - i3;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i5 = 0;
        } else if ((((i4 ^ 7) >> 31) | 1) <= 0) {
            i5 += 7;
        }
        return i5 + 1 > this.b.b ? 7 - i5 : -i5;
    }

    @Override // j$.time.temporal.l
    public final boolean h(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.c(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.c(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == q.h) {
            return temporalAccessor.c(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.c(a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.l
    public final o k(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return d(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return d(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (temporalUnit == q.h) {
            return e(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.d;
        }
        throw new IllegalStateException(j$.time.e.b("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
    }

    @Override // j$.time.temporal.l
    public final long l(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iH = temporalAccessor.h(a.DAY_OF_MONTH);
            iC = a(f(iH, iB), iH);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iH2 = temporalAccessor.h(a.DAY_OF_YEAR);
            iC = a(f(iH2, iB2), iH2);
        } else {
            if (temporalUnit != q.h) {
                if (temporalUnit != ChronoUnit.FOREVER) {
                    throw new IllegalStateException(j$.time.e.b("unreachable, rangeUnit: ", String.valueOf(temporalUnit), ", this: ", String.valueOf(this)));
                }
                int iB3 = b(temporalAccessor);
                int iH3 = temporalAccessor.h(a.YEAR);
                a aVar = a.DAY_OF_YEAR;
                int iH4 = temporalAccessor.h(aVar);
                int iF = f(iH4, iB3);
                int iA = a(iF, iH4);
                if (iA == 0) {
                    iH3--;
                } else if (iA >= a(iF, ((int) temporalAccessor.l(aVar).d) + this.b.b)) {
                    iH3++;
                }
                return iH3;
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.l
    public final o range() {
        return this.e;
    }

    @Override // j$.time.temporal.l
    public final Temporal s(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.h(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(r0 - r1, this.c);
        }
        q qVar = this.b;
        int iH = temporal.h(qVar.c);
        int iH2 = temporal.h(qVar.e);
        InterfaceC0018b interfaceC0018bU = j$.desugar.sun.nio.fs.g.D(temporal).u((int) j);
        int iF = f(1, b(interfaceC0018bU));
        int i2 = iH - 1;
        return interfaceC0018bU.b(((Math.min(iH2, a(iF, interfaceC0018bU.K() + qVar.b) - 1) - 1) * 7) + i2 + (-iF), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
