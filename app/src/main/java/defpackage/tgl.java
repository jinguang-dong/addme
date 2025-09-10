package defpackage;

import com.google.googlex.gcam.creativecamera.skysegmentation.SkySegmenterManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgl implements paq {
    private long a;

    public tgl(String str) {
        this.a = SkySegmenterManager.getReservation(str);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            SkySegmenterManager.releaseReservation(j);
            this.a = 0L;
        }
    }
}
