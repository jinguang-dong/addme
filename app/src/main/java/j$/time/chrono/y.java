package j$.time.chrono;

import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class y implements m, Serializable {
    public static final y d;
    public static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.h b;
    public final transient String c;

    static {
        y yVar = new y(-1, j$.time.h.Z(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, j$.time.h.Z(1912, 7, 30), "Taisho"), new y(1, j$.time.h.Z(1926, 12, 25), "Showa"), new y(2, j$.time.h.Z(1989, 1, 8), "Heisei"), new y(3, j$.time.h.Z(2019, 5, 1), "Reiwa")};
    }

    public y(int i, j$.time.h hVar, String str) {
        this.a = i;
        this.b = hVar;
        this.c = str;
    }

    public static y f(j$.time.h hVar) {
        if (hVar.V(x.d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        y[] yVarArr = e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (hVar.compareTo(yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    public static y i(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.m(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object N(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.s(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.o(this, lVar);
    }

    public final y g() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return i(this.a + 1);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.l(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return lVar == aVar ? v.c.w(aVar) : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    public final String toString() {
        return this.c;
    }
}
