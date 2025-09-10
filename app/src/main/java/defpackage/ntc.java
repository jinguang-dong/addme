package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ntc implements oon {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    @Override // defpackage.oon
    public final void c(Exception exc) {
        odj odjVar;
        int i = this.b;
        if (i == 0) {
            ((sgt) ntf.a.c().M(5535)).s("Wearable api is not available");
            ntf ntfVar = (ntf) this.a;
            ntfVar.E = false;
            ntfVar.F = false;
            return;
        }
        if (i == 1) {
            ((sgt) ((sgt) nmm.a.c().i(exc)).M((char) 5435)).s("Failed to get app update info");
            ((nmm) this.a).c.m();
            return;
        }
        if (i == 2) {
            ntf ntfVar2 = (ntf) this.a;
            int i2 = ntfVar2.N + 1;
            ntfVar2.N = i2;
            if (i2 == 30) {
                ((sgt) ntf.a.c().M(5536)).s("Send message failed reaches the threshold. No connection between GCA and WCA");
                ntfVar2.D = false;
                ntfVar2.N = 0;
                return;
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                boolean z = prn.a;
                Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
                return;
            } else {
                boolean z2 = prn.a;
                Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
                return;
            }
        }
        if ((exc instanceof oep) && (odjVar = ((oep) exc).a.h) != null && odjVar.c == 24) {
            ((omu) this.a).c.set(SystemClock.elapsedRealtime());
        }
    }
}
