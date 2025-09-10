package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jms {
    private final moc A;
    private final mbj B;
    private final mdy C;
    public final ndj a;
    public final mua b;
    public final mzz c;
    public final ScheduledExecutorService d;
    public final fvu f;
    public final out g;
    public final owq h;
    public final tzj i;
    public final boolean o;
    public final mmk q;
    public final gtn r;
    public final nks s;
    public final krj t;
    public final nca u;
    public final ktx v;
    public final hbj w;
    public final mns x;
    private final jnx y;
    private our z = new our();
    public volatile ScheduledFuture j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final AtomicReference p = new AtomicReference();
    public final Handler e = new Handler(Looper.getMainLooper());

    public jms(hbj hbjVar, krj krjVar, fvu fvuVar, ndj ndjVar, nks nksVar, mua muaVar, AtomicBoolean atomicBoolean, mzz mzzVar, ScheduledExecutorService scheduledExecutorService, mbj mbjVar, nca ncaVar, ktx ktxVar, jnx jnxVar, mns mnsVar, out outVar, gtn gtnVar, mdy mdyVar, mmk mmkVar, moc mocVar, owq owqVar, tzj tzjVar) {
        this.t = krjVar;
        this.f = fvuVar;
        this.a = ndjVar;
        this.b = muaVar;
        this.c = mzzVar;
        this.d = scheduledExecutorService;
        this.B = mbjVar;
        this.u = ncaVar;
        this.v = ktxVar;
        this.y = jnxVar;
        this.x = mnsVar;
        this.s = nksVar;
        this.g = outVar;
        this.C = mdyVar;
        this.r = gtnVar;
        this.q = mmkVar;
        this.w = hbjVar;
        this.A = mocVar;
        this.h = owqVar;
        this.i = tzjVar;
        boolean zP = hbjVar.p(gzz.o);
        boolean zP2 = hbjVar.p(gzz.q);
        this.o = zP2;
        ndjVar.H(zP || zP2);
        ndjVar.I(new jmq(this, jnxVar, zP, atomicBoolean, nksVar));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Queue] */
    public final void a() {
        this.z.close();
        this.z = new our();
        if (this.l) {
            boolean z = this.o;
            if (z) {
                nks nksVar = this.s;
                nksVar.b();
                nksVar.c.setImageDrawable(nksVar.a());
                nksVar.b.bringToFront();
                nksVar.i = false;
            }
            int i = 1;
            if (!this.k) {
                this.n = true;
                return;
            }
            if (this.j != null) {
                this.j.cancel(false);
                this.j = null;
            }
            jnx jnxVar = this.y;
            jnxVar.d();
            if (jnxVar.e.isPresent()) {
                owq owqVar = jnxVar.a;
                owqVar.dL();
                jnxVar.e.get();
                owqVar.a(jnxVar.e.get());
            }
            jnxVar.f = 0.0f;
            jnxVar.g = 0.0f;
            jnxVar.e = Optional.empty();
            jnxVar.b.d();
            jnxVar.i = 0.0f;
            this.b.b(true);
            this.q.d(false);
            if (z && this.s.i) {
                this.C.D(3, System.currentTimeMillis());
                this.a.as();
            } else {
                this.a.ar();
            }
            paq paqVar = (paq) this.x.a.poll();
            paqVar.getClass();
            paqVar.close();
            fvu fvuVar = this.f;
            ThumbnailView thumbnailView = fvuVar.c;
            fvuVar.a.p(sbv.p(fvo.LEFT, fvuVar.d(), fvo.CENTER_LEFT, rwc.j(thumbnailView), fvo.CENTER_RIGHT, rwc.j(fvuVar.b)), true);
            fvuVar.f(fvv.CAPTURING_OR_RECORDING);
            this.t.j();
            this.c.w(true);
            this.r.d(true);
            out outVar = this.g;
            nca ncaVar = this.u;
            ncaVar.getClass();
            outVar.c(new jmr(ncaVar, i));
            ncaVar.f();
            this.B.c(R.raw.video_stop);
            this.A.l(6);
            this.v.k(jms.class);
            this.k = false;
            this.n = false;
            this.l = false;
            this.m = false;
        }
    }
}
