package defpackage;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyf {
    public Future c;
    private final Gcam d;
    private final ScheduledExecutorService e;
    public final Object a = new Object();
    public final List b = new ArrayList();
    private float f = 1.0f;

    public hyf(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.d = gcam;
        this.e = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.a) {
            Future future = this.c;
            if (future != null) {
                future.cancel(false);
            }
        }
        this.e.execute(new hvm(this, 5, null));
    }

    public final void b() {
        byte[] bArr = null;
        hvm hvmVar = new hvm(this, 6, bArr);
        ScheduledExecutorService scheduledExecutorService = this.e;
        scheduledExecutorService.execute(hvmVar);
        synchronized (this.a) {
            this.c = scheduledExecutorService.schedule(new hvm(this, 7, bArr), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void c(float f) {
        synchronized (this.a) {
            if (f == this.f) {
                return;
            }
            this.f = f;
            sbp sbpVarJ = sbp.j(this.b);
            int size = sbpVarJ.size();
            for (int i = 0; i < size; i++) {
                int i2 = ((rfv) sbpVarJ.get(i)).a;
                Gcam gcam = this.d;
                GcamModuleJNI.Gcam_LimitShotCpuUsage(gcam.a, gcam, i2, f);
            }
        }
    }
}
