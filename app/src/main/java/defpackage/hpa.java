package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpa {
    private static final sgv b = sgv.g(IQwwK.mMvtadfEzZ);
    public final pmv a;
    private final Map c;

    public hpa() {
        this(null);
    }

    public final lnl a(long j) {
        return (lnl) this.a.k(hgc.l(j));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sfo] */
    public final lnl b() {
        paq paqVar;
        pmv pmvVar = this.a;
        synchronized (pmvVar.a) {
            ?? r1 = pmvVar.c;
            if (r1.isEmpty()) {
                paqVar = null;
            } else {
                paqVar = (paq) ((ryo) pmvVar.b).b((Long) r1.k().b()).get(r3.size() - 1);
            }
        }
        return (lnl) paqVar;
    }

    public final synchronized paq c(hpb hpbVar, Executor executor) {
        this.c.put(hpbVar, executor);
        return new ffx(this, hpbVar, 13);
    }

    public final List d() {
        return this.a.n();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [sgt, shi] */
    public final synchronized void e(lnl lnlVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new cmc(entry, lnlVar, 17));
            } catch (RejectedExecutionException e) {
                ((sgt) ((sgt) b.b().i(e)).M((char) 1416)).v("RejectedExecutionException on %s", entry.getKey());
            }
        }
    }

    public final synchronized void f(hpb hpbVar) {
        Map map = this.c;
        if (map.containsKey(hpbVar)) {
            map.remove(hpbVar);
        }
    }

    public hpa(byte[] bArr) {
        this.a = ojl.bb(1048);
        this.c = new HashMap();
    }
}
