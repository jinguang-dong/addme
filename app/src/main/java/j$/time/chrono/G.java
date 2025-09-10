package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class G extends AbstractC0017a implements Serializable {
    public static final G c = new G();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private G() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b C(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof I ? (I) temporalAccessor : new I(j$.time.h.Q(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0025i J(Instant instant, ZoneId zoneId) {
        return k.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final boolean M(long j) {
        return s.c.M(j - 543);
    }

    @Override // j$.time.chrono.l
    public final String f() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String o() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0018b u(int i) {
        return new I(j$.time.h.Z(i - 543, 1, 1));
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.o w(j$.time.temporal.a aVar) {
        int i = F.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.o oVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.o.f(oVar.a + 6516, oVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.o oVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.o.g(1L, (-(oVar2.a + 543)) + 1, oVar2.d + 543);
        }
        if (i != 3) {
            return aVar.d;
        }
        j$.time.temporal.o oVar3 = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.o.f(oVar3.a + 543, oVar3.d + 543);
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }

    @Override // j$.time.chrono.l
    public final m y(int i) {
        if (i == 0) {
            return J.BEFORE_BE;
        }
        if (i == 1) {
            return J.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
