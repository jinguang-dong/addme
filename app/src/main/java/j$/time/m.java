package j$.time;

import j$.time.format.z;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class m implements TemporalAccessor, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.s sVar = new j$.time.format.s();
        sVar.d("--");
        sVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        sVar.c('-');
        sVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        sVar.q(Locale.getDefault(), z.SMART, null);
    }

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        int i;
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i2 = l.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.b ? j$.time.chrono.s.c : j$.time.temporal.m.c(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.MONTH_OF_YEAR || lVar == j$.time.temporal.a.DAY_OF_MONTH : lVar != null && lVar.h(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return l(lVar).a(D(lVar), lVar);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return lVar.range();
        }
        if (lVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.m.d(this, lVar);
        }
        int iOrdinal = k.R(this.a).ordinal();
        return j$.time.temporal.o.g(1L, iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : 28, k.R(r8).Q());
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.D(temporal).equals(j$.time.chrono.s.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.l(aVar).d, this.b), aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
