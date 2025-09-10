package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pgc implements rvu {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ pgc(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return Long.valueOf(((Long) obj).longValue() / this.a);
        }
        tpc tpcVarM = snn.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        long j = this.a;
        snn snnVar = (snn) tpcVarM.b;
        snnVar.b |= 1;
        snnVar.c = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        snn snnVar2 = (snn) tpcVarM.b;
        snnVar2.b |= 2;
        snnVar2.d = jElapsedRealtimeNanos;
        return (snn) tpcVarM.l();
    }
}
