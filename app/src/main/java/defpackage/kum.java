package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kum extends ojl {
    public boolean a;
    public volatile Long b;
    private final long c;
    private volatile Long d;

    public kum(long j) {
        super((short[]) null);
        this.a = true;
        this.d = null;
        this.b = null;
        this.c = j;
    }

    private final void cm() {
        synchronized (this) {
            this.a = false;
            notifyAll();
        }
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        int iIntValue;
        Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
        if (num != null && ((iIntValue = num.intValue()) == 2 || iIntValue == 6 || iIntValue == 4 || iIntValue == 5)) {
            this.b = Long.valueOf(poeVar.d());
            cm();
            return;
        }
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            if (this.d == null) {
                this.d = l;
            }
            if (l.longValue() - this.d.longValue() > this.c) {
                cm();
            }
        }
    }
}
