package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcs extends ojl {
    private final oyn a;
    private final pqn b;

    public gcs(oyn oynVar) {
        super((short[]) null);
        this.a = oynVar;
        this.b = pqn.b();
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        f(poeVar, timeUnit.toMicros(this.b.a(l.longValue())));
    }

    public final synchronized void f(poe poeVar, long j) {
        rwc rwcVarD = this.a.d("application/meta");
        if (rwcVarD.h()) {
            ((oyi) rwcVarD.c()).b(new gcr(poeVar), j);
        }
    }
}
