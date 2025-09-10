package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0018b;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public final class t implements TemporalAccessor {
    public final /* synthetic */ InterfaceC0018b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.l c;
    public final /* synthetic */ ZoneId d;

    public t(InterfaceC0018b interfaceC0018b, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = interfaceC0018b;
        this.b = temporalAccessor;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        InterfaceC0018b interfaceC0018b = this.a;
        return (interfaceC0018b == null || !lVar.isDateBased()) ? this.b.D(lVar) : interfaceC0018b.D(lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.b ? this.c : nVar == j$.time.temporal.m.a ? this.d : nVar == j$.time.temporal.m.c ? this.b.N(nVar) : nVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        InterfaceC0018b interfaceC0018b = this.a;
        return (interfaceC0018b == null || !lVar.isDateBased()) ? this.b.c(lVar) : interfaceC0018b.c(lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        InterfaceC0018b interfaceC0018b = this.a;
        return (interfaceC0018b == null || !lVar.isDateBased()) ? this.b.l(lVar) : interfaceC0018b.l(lVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.l lVar = this.c;
        String strConcat = lVar != null ? " with chronology ".concat(String.valueOf(lVar)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }
}
