package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kqt implements pau {
    private static final sgv b = sgv.g("kqt");
    private final long c;
    private Long d;
    private boolean e = false;
    public final szh a = new szh();

    public kqt(long j) {
        this.c = j;
    }

    @Override // defpackage.pau
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(pnx pnxVar) {
        if (this.e) {
            return;
        }
        if (this.d == null) {
            this.d = Long.valueOf(pnxVar.d());
        }
        long jD = pnxVar.d();
        Long l = this.d;
        rnt.x(l);
        long jLongValue = jD - l.longValue();
        Long l2 = (Long) pnxVar.a(CaptureResult.SENSOR_TIMESTAMP);
        if (l2 != null) {
            if (l2.longValue() > this.c) {
                this.e = true;
                this.a.e(true);
                return;
            }
        }
        if (jLongValue >= 10) {
            ((sgt) b.c().M(3384)).G("timeout waiting for %d at %d, after %dframes", Long.valueOf(this.c), l2, Long.valueOf(jLongValue));
            this.e = true;
            this.a.e(false);
        }
    }
}
