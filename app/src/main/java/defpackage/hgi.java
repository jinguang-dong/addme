package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgi implements hgj {
    public final hgj a;
    public final Executor b;

    public hgi(hgj hgjVar, Executor executor) {
        this.a = hgjVar;
        this.b = executor;
    }

    @Override // defpackage.hgj
    public final szh a(lnl lnlVar, lnl lnlVar2) {
        throw null;
    }

    @Override // defpackage.hgj
    public final szh b(lnl lnlVar, lnl lnlVar2) {
        throw null;
    }

    public final /* synthetic */ void c(lnl lnlVar, lnl lnlVar2, szh szhVar) {
        try {
            szhVar.e((List) this.a.a(lnlVar, lnlVar2).s());
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            szhVar.a(e);
        }
    }

    public final /* synthetic */ void d(lnl lnlVar, lnl lnlVar2, szh szhVar) {
        try {
            szhVar.e((qib) this.a.b(lnlVar, lnlVar2).s());
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            szhVar.a(e);
        }
    }

    @Override // defpackage.hgj
    public final void e(long j) {
        if (this.a.i()) {
            this.b.execute(new hcv(this, j, 2));
        }
    }

    @Override // defpackage.hgj
    public final void f(final long j, final float f, final float f2, final String str) {
        if (this.a.i()) {
            this.b.execute(new Runnable() { // from class: hgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(j, f, f2, str);
                }
            });
        }
    }

    @Override // defpackage.hgj
    public final void g() {
        hgj hgjVar = this.a;
        if (hgjVar.i()) {
            return;
        }
        Executor executor = this.b;
        hgjVar.getClass();
        executor.execute(new hbv(hgjVar, 5));
    }

    @Override // defpackage.hgj
    public final void h() {
        this.b.execute(new hbv(this, 6));
    }

    @Override // defpackage.hgj
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.hgj
    public final void j(jpp jppVar) {
        this.b.execute(new hdk(this, jppVar, 7));
    }

    @Override // defpackage.hgj
    public final void k(jpp jppVar) {
        this.b.execute(new hdk(this, jppVar, 6));
    }
}
