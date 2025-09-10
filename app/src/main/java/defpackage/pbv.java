package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbv {
    public final pdh a;
    public long b;

    public pbv() {
        throw null;
    }

    public final void a(pbw pbwVar) {
        pdh pdhVar = this.a;
        if (pdhVar != null) {
            pdhVar.a(pbwVar, this.b != 0 ? SystemClock.elapsedRealtimeNanos() - this.b : 0L);
        }
    }

    public pbv(pdh pdhVar) {
        this.a = pdhVar;
    }
}
