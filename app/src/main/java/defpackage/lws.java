package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lws implements pau {
    private static final sgv c = sgv.g("lws");
    public final kuj a;
    public final szh b = new szh();
    private final owq d;
    private final CaptureResult.Key e;
    private final long f;
    private final nmt g;

    public lws(owq owqVar, nmt nmtVar, kuj kujVar, CaptureResult.Key key, long j) {
        this.d = owqVar;
        this.g = nmtVar;
        this.a = kujVar;
        this.e = key;
        this.f = j;
    }

    @Override // defpackage.pau
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(pnx pnxVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = this.f;
        if (jElapsedRealtimeNanos >= j) {
            ((sgt) ((sgt) c.c().h(shx.a, "SkylaProposedValueWaiter")).M(4517)).u("Timeout waiting for proposed value, target timeout timestamp ns was %d.", j);
            this.b.e(false);
            return;
        }
        Float f = (Float) pnxVar.a(this.e);
        if (f != null) {
            shl shlVar = shx.a;
            float fA = this.g.a(f.floatValue());
            owq owqVar = this.d;
            if (fA != ((Float) owqVar.dL()).floatValue()) {
                owqVar.a(Float.valueOf(fA));
            }
            this.b.e(true);
        }
    }
}
