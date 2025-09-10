package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqa extends ojl {
    private final Set a;
    private volatile long b;
    private volatile double c;

    public kqa(Set set) {
        super((short[]) null);
        this.b = -1L;
        this.c = -1.0d;
        this.a = set;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        double d;
        double d2;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        long jLongValue = l == null ? -1L : l.longValue();
        if (this.b >= 0) {
            long j = jLongValue - this.b;
            double d3 = this.c > 0.0d ? this.c : -1.0d;
            double d4 = j / 1000000.0d;
            this.c = d4;
            d2 = d3;
            d = d4;
        } else {
            d = -1.0d;
            d2 = -1.0d;
        }
        if (jLongValue > this.b) {
            this.b = jLongValue;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kpz) it.next()).a(poeVar, d, d2);
        }
    }
}
