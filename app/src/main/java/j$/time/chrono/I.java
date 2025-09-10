package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class I extends AbstractC0020d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient j$.time.h a;

    public I(j$.time.h hVar) {
        Objects.a(hVar, "isoDate");
        this.a = hVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: B */
    public final Temporal x(long j, ChronoUnit chronoUnit) {
        return (I) super.x(j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(this);
        }
        int i = H.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i == 4) {
            int iV = V();
            if (iV < 1) {
                iV = 1 - iV;
            }
            return iV;
        }
        j$.time.h hVar = this.a;
        if (i == 5) {
            return ((V() * 12) + hVar.b) - 1;
        }
        if (i == 6) {
            return V();
        }
        if (i != 7) {
            return hVar.D(lVar);
        }
        return V() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final long E() {
        return this.a.E();
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new C0022f(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final m P() {
        return V() >= 1 ? J.BE : J.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b R(long j) {
        return X(this.a.c0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b S(long j) {
        return X(this.a.d0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final InterfaceC0018b T(long j) {
        return X(this.a.e0(j));
    }

    @Override // j$.time.chrono.AbstractC0020d
    /* renamed from: U */
    public final InterfaceC0018b k(TemporalAdjuster temporalAdjuster) {
        return (I) super.k(temporalAdjuster);
    }

    public final int V() {
        return this.a.a + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.I a(long r9, j$.time.temporal.l r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L98
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.D(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.H.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            j$.time.h r6 = r8.a
            if (r2 == r5) goto L4a
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r4) goto L4a
            if (r2 == r3) goto L4a
            goto L60
        L27:
            j$.time.chrono.G r11 = j$.time.chrono.G.c
            j$.time.temporal.o r11 = r11.w(r0)
            r11.b(r9, r0)
            int r11 = r8.V()
            long r0 = (long) r11
            r2 = 12
            long r0 = r0 * r2
            short r11 = r6.b
            long r2 = (long) r11
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r9 = r9 - r0
            j$.time.h r9 = r6.d0(r9)
            j$.time.chrono.I r9 = r8.X(r9)
            return r9
        L4a:
            j$.time.chrono.G r2 = j$.time.chrono.G.c
            j$.time.temporal.o r2 = r2.w(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L83
            if (r0 == r4) goto L78
            if (r0 == r3) goto L69
        L60:
            j$.time.h r9 = r6.a(r9, r11)
            j$.time.chrono.I r9 = r8.X(r9)
            return r9
        L69:
            int r9 = r8.V()
            int r9 = (-542) - r9
            j$.time.h r9 = r6.j0(r9)
            j$.time.chrono.I r9 = r8.X(r9)
            return r9
        L78:
            int r2 = r2 + (-543)
            j$.time.h r9 = r6.j0(r2)
            j$.time.chrono.I r9 = r8.X(r9)
            return r9
        L83:
            int r9 = r8.V()
            r10 = 1
            if (r9 < r10) goto L8b
            goto L8d
        L8b:
            int r2 = 1 - r2
        L8d:
            int r2 = r2 + (-543)
            j$.time.h r9 = r6.j0(r2)
            j$.time.chrono.I r9 = r8.X(r9)
            return r9
        L98:
            j$.time.chrono.b r9 = super.a(r9, r11)
            j$.time.chrono.I r9 = (j$.time.chrono.I) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.I.a(long, j$.time.temporal.l):j$.time.chrono.I");
    }

    public final I X(j$.time.h hVar) {
        return hVar.equals(this.a) ? this : new I(hVar);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b, j$.time.temporal.Temporal
    public final InterfaceC0018b b(long j, TemporalUnit temporalUnit) {
        return (I) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.a.equals(((I) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0018b
    public final l getChronology() {
        return G.c;
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final int hashCode() {
        G.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal k(j$.time.h hVar) {
        return (I) super.k(hVar);
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
        int i = H.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(lVar);
        }
        if (i != 4) {
            return G.c.w(aVar);
        }
        j$.time.temporal.o oVar = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.o.f(1L, V() <= 0 ? (-(oVar.a + 543)) + 1 : 543 + oVar.d);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.chrono.InterfaceC0018b
    public final InterfaceC0018b x(long j, TemporalUnit temporalUnit) {
        return (I) super.x(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0020d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (I) super.b(j, temporalUnit);
    }
}
