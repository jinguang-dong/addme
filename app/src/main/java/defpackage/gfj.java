package defpackage;

import android.os.SystemClock;
import com.pairip.VMRunner;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gfj implements oyi, oyk {
    private static final sgv c = sgv.g("gfj");
    private final oyj d;
    private final owq e;
    private final gkt g;
    private final paq h;
    private final fyw i;
    private final pbn j;
    private boolean l;
    private long m;
    private long n;
    public final AtomicLong a = new AtomicLong(-1);
    private boolean k = false;
    public boolean b = true;
    private final Object p = new Object();
    private final String f = "application/microvideo-image-meta";
    private gfi o = gfi.READY;

    public gfj(oyj oyjVar, owq owqVar, gkt gktVar, fyw fywVar, pbn pbnVar) {
        this.d = oyjVar;
        this.e = owqVar;
        this.g = gktVar;
        this.h = owqVar.dK(new gej(this, 4), sxo.a);
        this.i = fywVar;
        this.j = pbnVar;
    }

    private final long n(long j) {
        o();
        return j + this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.l) {
            return;
        }
        this.m = (SystemClock.elapsedRealtimeNanos() / 1000) - (SystemClock.uptimeMillis() * 1000);
        this.l = true;
    }

    private void p() {
        VMRunner.invoke("s67DULHtCWeRQXAG", new Object[]{this});
    }

    @Override // defpackage.oyi
    public final String a() {
        return this.f;
    }

    @Override // defpackage.oyi
    public final void b(oyh oyhVar, long j) {
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.oyk
    public final void d() {
    }

    @Override // defpackage.oyk
    public final void e() {
        synchronized (this.p) {
            if (this.i.j()) {
                p();
            }
        }
    }

    @Override // defpackage.oyk
    public final void f() {
    }

    @Override // defpackage.oyk
    public final void g() {
        synchronized (this.p) {
            this.a.set(((Long) ((ovx) this.e).d).longValue());
            this.g.a();
            this.k = false;
        }
    }

    @Override // defpackage.oyk
    public final void h(long j, long j2) {
    }

    @Override // defpackage.oyi
    public final void i(long j) {
        List list = this.g.d;
        long jN = n(j);
        boolean z = true;
        if (!list.isEmpty() && jN < ((Long) ujp.aQ(list)).longValue()) {
            z = false;
        }
        rnt.L(z);
        list.add(Long.valueOf(jN));
    }

    @Override // defpackage.oyi
    public final void j() {
        synchronized (this.p) {
            gfi gfiVar = this.o;
            gfi gfiVar2 = gfi.CLOSED;
            if (gfiVar == gfiVar2) {
                return;
            }
            this.h.close();
            this.o = gfiVar2;
        }
    }

    @Override // defpackage.oyi
    public final void k(long j) {
        List list = this.g.e;
        long jN = n(j);
        boolean z = true;
        if (!list.isEmpty() && jN < ((Long) ujp.aQ(list)).longValue()) {
            z = false;
        }
        rnt.L(z);
        list.add(Long.valueOf(jN));
    }

    @Override // defpackage.oyi
    public final void l() {
        synchronized (this.p) {
            if (this.o != gfi.READY) {
                ((sgt) c.b().M(865)).v("Trying to start with state %s", this.o);
            } else {
                this.d.d(this);
                this.o = gfi.STARTED;
            }
        }
    }

    @Override // defpackage.oyi
    public final void m(long j) {
        synchronized (this.p) {
            if (this.o != gfi.STARTED) {
                ((sgt) c.b().M(868)).v("Trying to stop with state %s", this.o);
                return;
            }
            this.o = gfi.STOPPED;
            this.d.h(this);
            if (this.a.get() == -1) {
                ((sgt) c.b().M(867)).s("No video frame is received yet.");
            } else {
                p();
            }
        }
    }
}
