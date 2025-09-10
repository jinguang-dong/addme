package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q extends AbstractC0020d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public q(o oVar, int i, int i2, int i3) {
        oVar.B(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (q) super.x(j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = p.a[((j$.time.temporal.a) lVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return V();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.desugar.sun.nio.fs.g.M(E() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((V() - 1) % 7) + 1;
            case 7:
                return E();
            case 8:
                return ((V() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final long E() {
        return this.a.B(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new C0022f(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final int K() {
        return this.a.O(this.b, 12);
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final m P() {
        return r.AH;
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b T(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return Y(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0020d
    /* renamed from: U */
    public final InterfaceC0018b k(TemporalAdjuster temporalAdjuster) {
        return (q) super.k(temporalAdjuster);
    }

    public final int V() {
        return this.a.O(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC0020d
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final q R(long j) {
        return new q(this.a, E() + j);
    }

    @Override // j$.time.chrono.AbstractC0020d
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final q S(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long jF = j$.desugar.sun.nio.fs.g.F(j2, 12L);
        o oVar = this.a;
        if (jF >= oVar.s(0) && jF <= oVar.s(oVar.d.length - 1) - 1) {
            return Y((int) jF, ((int) j$.desugar.sun.nio.fs.g.M(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jF);
    }

    public final q Y(int i, int i2, int i3) {
        o oVar = this.a;
        int iD = oVar.D(i, i2);
        if (i3 > iD) {
            i3 = iD;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final q a(long j, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return (q) super.a(j, lVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        o oVar = this.a;
        oVar.w(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return Y(i5, i4, i);
            case 2:
                return R(Math.min(i, K()) - V());
            case 3:
                return R((j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return R(j - (((int) j$.desugar.sun.nio.fs.g.M(E() + 3, 7)) + 1));
            case 5:
                return R(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return R(j - D(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return R((j - D(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Y(i5, i, i3);
            case 10:
                return S(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return Y(i, i4, i3);
            case 12:
                return Y(i, i4, i3);
            case 13:
                return Y(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b, j$.time.temporal.Temporal
    public final InterfaceC0018b b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final l getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal k(j$.time.h hVar) {
        return (q) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.k(this);
        }
        if (!j$.desugar.sun.nio.fs.g.n(this, lVar)) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) lVar;
        int i = p.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.w(aVar) : j$.time.temporal.o.f(1L, 5L) : j$.time.temporal.o.f(1L, K()) : j$.time.temporal.o.f(1L, r2.D(this.b, this.c));
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final boolean v() {
        return this.a.M(this.b);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final InterfaceC0018b x(long j, TemporalUnit temporalUnit) {
        return (q) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.k();
        if (i >= oVar.e && i < oVar.f) {
            int iBinarySearch = Arrays.binarySearch(oVar.d, i);
            iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
            int[] iArr = {oVar.s(iBinarySearch), ((oVar.g + iBinarySearch) % 12) + 1, (i - oVar.d[iBinarySearch]) + 1};
            this.a = oVar;
            this.b = iArr[0];
            this.c = iArr[1];
            this.d = iArr[2];
            return;
        }
        throw new j$.time.b("Hijrah date out of range");
    }
}
