package defpackage;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hdw implements lst {
    private final ScheduledExecutorService a;
    private final long b;
    private final Set c = new HashSet();
    private hdv d;
    private ScheduledFuture e;
    private final cxb f;

    public hdw(ScheduledExecutorService scheduledExecutorService, cxb cxbVar, hbj hbjVar) {
        this.a = scheduledExecutorService;
        this.f = cxbVar;
        long jIntValue = ((Integer) hbjVar.a(gzs.r).get()).intValue();
        Long.valueOf(jIntValue).getClass();
        this.b = jIntValue;
    }

    private final synchronized void k() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.e = null;
    }

    private final synchronized void l() {
        if (this.e != null) {
            return;
        }
        this.e = this.a.schedule(new hbv(this, 2), this.b, TimeUnit.MILLISECONDS);
    }

    private final synchronized void m(ltd ltdVar) {
        Set set = this.c;
        set.remove(ltdVar);
        if (set.isEmpty()) {
            this.d = null;
            k();
        }
    }

    public final synchronized void a() {
        hdv hdvVar = this.d;
        if (hdvVar == null || hdvVar.a != ltf.HDR_PLUS_AUTO) {
            return;
        }
        this.e = null;
        cxb.I();
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        m(ltdVar);
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        m(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        synchronized (this) {
            Set set = this.c;
            set.add(ltdVar);
            if (set.size() == 1) {
                ltf ltfVar = lsyVar.c;
                ltfVar.getClass();
                this.d = new hdv(ltfVar);
                l();
            } else {
                this.d = null;
                k();
            }
        }
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        m(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final void h(ltd ltdVar, par parVar) {
    }
}
