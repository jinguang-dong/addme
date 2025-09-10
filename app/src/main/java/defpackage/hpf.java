package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpf implements hpb {
    private static final sgv a = sgv.g("hpf");
    private final hpa b;
    private final nms c;
    private final Map d = new HashMap();
    private boolean e = true;
    private hpd f;

    public hpf(hpa hpaVar, nms nmsVar) {
        this.b = hpaVar;
        this.c = nmsVar;
    }

    public final synchronized paq b(final how howVar, Executor executor) {
        this.d.put(howVar, executor);
        return new paq() { // from class: hpe
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                this.a.c(howVar);
            }
        };
    }

    public final synchronized void c(how howVar) {
        if (this.d.remove(howVar) != null) {
            howVar.b(this.f);
        }
    }

    @Override // defpackage.hpb
    public final void ey(lnl lnlVar) {
        if (this.e) {
            hpd hpdVar = new hpd(this.b, this.c);
            this.f = hpdVar;
            synchronized (this) {
                for (Map.Entry entry : this.d.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new cmc(entry, hpdVar, 18));
                    } catch (RejectedExecutionException e) {
                        ((sgt) ((sgt) a.b().i(e)).M(1418)).s(INRGuObcrHjSQz.pmOJ);
                    }
                }
            }
            hgc.m(hpdVar);
            this.e = false;
        }
    }
}
