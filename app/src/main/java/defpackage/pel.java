package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pel implements pau {
    public final szh a;
    private final CaptureResult.Key b;
    private final scn c;
    private final long d;
    private final long e;
    private long f = -1;
    private long g = -1;

    public pel(CaptureResult.Key key, scn scnVar, long j, long j2) {
        this.b = key;
        this.c = scnVar;
        this.d = j <= 0 ? 3000000000L : j;
        this.e = j2 <= 0 ? 60L : j2;
        this.a = new szh();
    }

    @Override // defpackage.pau
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(pnx pnxVar) {
        szh szhVar = this.a;
        if (szhVar.isDone()) {
            return;
        }
        Long l = (Long) pnxVar.a(CaptureResult.SENSOR_TIMESTAMP);
        pdo pdoVar = new pdo(l == null ? -1L : l.longValue(), pnxVar.d(), pnxVar.ew());
        scn scnVar = this.c;
        if (scnVar.isEmpty()) {
            szhVar.e(pdoVar);
            return;
        }
        if (l != null) {
            if (this.f == -1) {
                this.f = l.longValue();
            }
            if (l.longValue() - this.f > this.d) {
                szhVar.e(pdoVar);
                return;
            }
        }
        if (this.g == -1) {
            this.g = pnxVar.d();
        }
        if (pnxVar.d() - this.g > this.e) {
            szhVar.e(pdoVar);
        } else if (scnVar.contains(pnxVar.a(this.b))) {
            szhVar.e(pdoVar);
        }
    }
}
