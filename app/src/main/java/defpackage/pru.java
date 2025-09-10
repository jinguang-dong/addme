package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pru implements syf {
    final /* synthetic */ syu a;
    final /* synthetic */ pfl b;
    final /* synthetic */ qaq c;

    public pru(pfl pflVar, syu syuVar, qaq qaqVar) {
        this.b = pflVar;
        this.a = syuVar;
        this.c = qaqVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            ((oow) ((qaq) this.c.a).a).r(null);
        } else if (th instanceof Exception) {
            this.b.c((Exception) th);
        } else {
            this.b.c(new ExecutionException(th));
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        this.b.d(obj);
    }
}
