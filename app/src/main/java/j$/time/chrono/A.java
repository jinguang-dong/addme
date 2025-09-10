package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class A extends AbstractC0017a implements Serializable {
    public static final A c = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    private A() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof C ? (C) temporalAccessor : new C(j$.time.h.Q(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0025i J(Instant instant, ZoneId zoneId) {
        return k.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final boolean M(long j) {
        return s.c.M(j + 1911);
    }

    @Override // j$.time.chrono.l
    public final String f() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final String o() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b u(int i) {
        return new C(j$.time.h.Z(i + 1911, 1, 1));
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.o w(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.o oVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.o.f(oVar.a - 22932, oVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.o oVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.o.g(1L, oVar2.d - 1911, (-oVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.d;
        }
        j$.time.temporal.o oVar3 = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.o.f(oVar3.a - 1911, oVar3.d - 1911);
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }

    @Override // j$.time.chrono.l
    public final m y(int i) {
        if (i == 0) {
            return D.BEFORE_ROC;
        }
        if (i == 1) {
            return D.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
