package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsz implements syf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fsz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.b != 0) {
            this.a.a();
            throw new fqr(th);
        }
        th.getClass();
        if (th instanceof CancellationException) {
            return;
        }
        ((sgt) fta.a.c().i(th).M(369)).v("Failed the readiness: %s", this.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pbp] */
    @Override // defpackage.syf
    public final void b(Object obj) {
        if (this.b == 0) {
            obj.getClass();
        } else {
            this.a.a();
            SystemClock.elapsedRealtime();
        }
    }
}
