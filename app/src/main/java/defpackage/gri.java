package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.LruCache;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gri implements gqj {
    public static final grh a = new grh() { // from class: grf
        @Override // defpackage.grh
        public final void b(gqf gqfVar) {
        }
    };
    public final gqg b;
    public final gqk c;
    public final pbs d;
    public final Context f;
    public final pbn g;
    public final cxb i;
    public grh e = a;
    public final LruCache h = new LruCache(20);

    public gri(gqg gqgVar, cxb cxbVar, gqk gqkVar, pbs pbsVar, Context context, pbn pbnVar) {
        this.b = gqgVar;
        this.i = cxbVar;
        this.c = gqkVar;
        this.d = pbsVar;
        this.f = context;
        this.g = pbnVar;
    }

    @Override // defpackage.gqj
    public final void a(Long l) {
        grh grhVar = this.e;
        gqe gqeVarA = gqf.a();
        gqeVarA.c(SystemClock.elapsedRealtimeNanos());
        gpq gpqVarA = gpr.a();
        gpqVarA.f(l.longValue());
        gpqVarA.g(SystemClock.elapsedRealtime());
        gpqVarA.e = 4;
        gqeVarA.b(sbp.l(gpqVarA.a()));
        grhVar.b(gqeVarA.a());
    }
}
