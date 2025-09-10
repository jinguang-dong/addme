package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class v extends AbstractC0017a implements Serializable {
    public static final v c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof x ? (x) temporalAccessor : new x(j$.time.h.Q(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0025i J(Instant instant, ZoneId zoneId) {
        return k.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final boolean M(long j) {
        return s.c.M(j);
    }

    @Override // j$.time.chrono.l
    public final String f() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String o() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b u(int i) {
        return new x(j$.time.h.Z(i, 1, 1));
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.o w(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(aVar)));
            case 5:
                y[] yVarArr = y.e;
                int i = yVarArr[yVarArr.length - 1].b.a;
                int iMin = 1000000000 - yVarArr[yVarArr.length - 1].b.a;
                int i2 = yVarArr[0].b.a;
                for (int i3 = 1; i3 < yVarArr.length; i3++) {
                    y yVar = yVarArr[i3];
                    iMin = Math.min(iMin, (yVar.b.a - i2) + 1);
                    i2 = yVar.b.a;
                }
                return j$.time.temporal.o.g(1L, iMin, 999999999 - i);
            case 6:
                y yVar2 = y.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.d.c;
                long jMin = j;
                for (y yVar3 : y.e) {
                    long jMin2 = Math.min(jMin, (yVar3.b.K() - yVar3.b.T()) + 1);
                    jMin = yVar3.g() != null ? Math.min(jMin2, yVar3.g().b.T() - 1) : jMin2;
                }
                return j$.time.temporal.o.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.d.d);
            case 7:
                return j$.time.temporal.o.f(x.d.a, 999999999L);
            case 8:
                long j2 = y.d.a;
                y[] yVarArr2 = y.e;
                return j$.time.temporal.o.f(j2, yVarArr2[yVarArr2.length - 1].a);
            default:
                return aVar.d;
        }
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }

    @Override // j$.time.chrono.l
    public final m y(int i) {
        return y.i(i);
    }
}
