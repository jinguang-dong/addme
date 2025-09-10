package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtp {
    private static final qto g = new qto() { // from class: qtm
        @Override // defpackage.qto
        public final void a(int i, String str) {
        }
    };
    public final tzj a;
    public final Executor b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile qto d = g;
    public ScheduledFuture e;
    public ScheduledFuture f;

    public qtp(qoz qozVar, syx syxVar, Executor executor, tzj tzjVar) {
        this.a = tzjVar;
        this.b = executor;
        qozVar.a(new qtn(this, syxVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
