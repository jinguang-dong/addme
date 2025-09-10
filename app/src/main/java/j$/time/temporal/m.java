package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes3.dex */
public abstract class m {
    public static final j$.desugar.sun.nio.fs.n a = new j$.desugar.sun.nio.fs.n(2);
    public static final j$.desugar.sun.nio.fs.n b = new j$.desugar.sun.nio.fs.n(3);
    public static final j$.desugar.sun.nio.fs.n c = new j$.desugar.sun.nio.fs.n(4);
    public static final j$.desugar.sun.nio.fs.n d = new j$.desugar.sun.nio.fs.n(5);
    public static final j$.desugar.sun.nio.fs.n e = new j$.desugar.sun.nio.fs.n(6);
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(7);
    public static final j$.desugar.sun.nio.fs.n g = new j$.desugar.sun.nio.fs.n(8);

    public static int a(TemporalAccessor temporalAccessor, l lVar) {
        o oVarL = temporalAccessor.l(lVar);
        if (!oVarL.d()) {
            throw new n("Invalid field " + String.valueOf(lVar) + " for get() method, use getLong() instead");
        }
        long jD = temporalAccessor.D(lVar);
        if (oVarL.e(jD)) {
            return (int) jD;
        }
        throw new j$.time.b("Invalid value for " + String.valueOf(lVar) + " (valid values " + String.valueOf(oVarL) + "): " + jD);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == a || nVar == b || nVar == c) {
            return null;
        }
        return nVar.a(temporalAccessor);
    }

    public static o d(TemporalAccessor temporalAccessor, l lVar) {
        if (!(lVar instanceof a)) {
            Objects.a(lVar, "field");
            return lVar.k(temporalAccessor);
        }
        if (temporalAccessor.c(lVar)) {
            return ((a) lVar).d;
        }
        throw new n("Unsupported field: ".concat(String.valueOf(lVar)));
    }
}
