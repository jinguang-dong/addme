package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class x extends AbstractC0020d {
    public static final j$.time.h d = j$.time.h.Z(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.h a;
    public final transient y b;
    public final transient int c;

    public x(j$.time.h hVar) {
        if (hVar.V(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        y yVarF = y.f(hVar);
        this.b = yVarF;
        this.c = (hVar.a - yVarF.b.a) + 1;
        this.a = hVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (x) super.x(j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = w.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        j$.time.h hVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (hVar.T() - yVar.b.T()) + 1 : hVar.T();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
            case 8:
                return yVar.a;
            default:
                return hVar.D(lVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final long E() {
        return this.a.E();
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new C0022f(this, localTime);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K() {
        /*
            r6 = this;
            j$.time.chrono.y r0 = r6.b
            j$.time.chrono.y r1 = r0.g()
            j$.time.h r2 = r6.a
            r3 = 1
            if (r1 == 0) goto L19
            j$.time.h r1 = r1.b
            int r4 = r1.a
            int r5 = r2.a
            if (r4 != r5) goto L19
            int r1 = r1.T()
            int r1 = r1 - r3
            goto L1d
        L19:
            int r1 = r2.K()
        L1d:
            int r2 = r6.c
            if (r2 != r3) goto L29
            j$.time.h r0 = r0.b
            int r0 = r0.T()
            int r0 = r0 - r3
            int r1 = r1 - r0
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.x.K():int");
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final m P() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b R(long j) {
        return W(this.a.c0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b S(long j) {
        return W(this.a.d0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b T(long j) {
        return W(this.a.e0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    /* renamed from: U */
    public final InterfaceC0018b k(TemporalAdjuster temporalAdjuster) {
        return (x) super.k(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final x a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (x) super.a(j, lVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        if (D(aVar) == j) {
            return this;
        }
        int[] iArr = w.a;
        int i = iArr[aVar.ordinal()];
        j$.time.h hVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            int iA = v.c.w(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return X(this.b, iA);
            }
            if (i2 == 8) {
                return X(y.i(iA), this.c);
            }
            if (i2 == 9) {
                return W(hVar.j0(iA));
            }
        }
        return W(hVar.a(j, lVar));
    }

    public final x W(j$.time.h hVar) {
        return hVar.equals(this.a) ? this : new x(hVar);
    }

    public final x X(y yVar, int i) {
        v.c.getClass();
        if (yVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = yVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || yVar != y.f(j$.time.h.Z(i3, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return W(this.a.j0(i3));
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b, j$.time.temporal.Temporal
    public final InterfaceC0018b b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b, j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || lVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || lVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || lVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return lVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) lVar).isDateBased() : lVar != null && lVar.h(this);
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final l getChronology() {
        return v.c;
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal k(j$.time.h hVar) {
        return (x) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!c(lVar)) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.o.f(1L, this.a.W());
        }
        if (i == 2) {
            return j$.time.temporal.o.f(1L, K());
        }
        if (i != 3) {
            return v.c.w(aVar);
        }
        y yVar = this.b;
        int i2 = yVar.b.a;
        return yVar.g() != null ? j$.time.temporal.o.f(1L, (r6.b.a - i2) + 1) : j$.time.temporal.o.f(1L, 999999999 - i2);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final InterfaceC0018b x(long j, TemporalUnit temporalUnit) {
        return (x) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }
}
