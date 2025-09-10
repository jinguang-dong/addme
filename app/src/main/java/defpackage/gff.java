package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gff implements oyi, oyk {
    public static final sgv a = sgv.g("gff");
    public final oyj b;
    public final P11MetadataSerializer d;
    public long g;
    public vdu h;
    private final owq i;
    private paq j;
    private final qrh m;
    public final AtomicLong c = new AtomicLong(-1);
    public boolean e = false;
    public boolean f = true;
    private final Object l = new Object();
    private gfe k = gfe.READY;

    public gff(oyj oyjVar, owq owqVar, P11MetadataSerializer p11MetadataSerializer, qrh qrhVar) {
        this.b = oyjVar;
        this.i = owqVar;
        this.d = p11MetadataSerializer;
        this.m = qrhVar;
    }

    @Override // defpackage.oyi
    public final String a() {
        return "application/p11-global-meta";
    }

    @Override // defpackage.oyi
    public final void j() {
        synchronized (this.l) {
            gfe gfeVar = this.k;
            gfe gfeVar2 = gfe.CLOSED;
            if (gfeVar == gfeVar2) {
                return;
            }
            paq paqVar = this.j;
            if (paqVar != null) {
                paqVar.close();
            }
            this.k = gfeVar2;
        }
    }

    @Override // defpackage.oyi
    public final void l() {
        synchronized (this.l) {
            if (this.k != gfe.READY) {
                ((sgt) a.b().M(856)).v("Trying to start with state %s", this.k);
                return;
            }
            this.h = this.m.k();
            this.b.d(this);
            this.j = this.i.dK(new gej(this, 3), sxo.a);
            this.k = gfe.STARTED;
        }
    }

    @Override // defpackage.oyi
    public final void m(long j) {
        synchronized (this.l) {
            if (this.k != gfe.STARTED) {
                ((sgt) a.b().M(858)).v("Trying to stop with state %s", this.k);
            } else {
                this.k = gfe.c;
                this.b.h(this);
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.oyk
    public final void d() {
    }

    @Override // defpackage.oyk
    public final void e() {
    }

    @Override // defpackage.oyk
    public final void f() {
    }

    @Override // defpackage.oyk
    public final void g() {
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
    }

    @Override // defpackage.oyi
    public final void i(long j) {
    }

    @Override // defpackage.oyi
    public final void k(long j) {
    }

    @Override // defpackage.oyi
    public final void b(oyh oyhVar, long j) {
    }

    @Override // defpackage.oyk
    public final void h(long j, long j2) {
    }
}
