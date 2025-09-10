package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsw implements Executor {
    private final Executor c;
    private final List b = new ArrayList();
    private boolean a = false;

    public fsw(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a() {
        rnt.L(!this.a);
        this.a = true;
    }

    public final synchronized void b() {
        rnt.L(this.a);
        this.a = false;
        List list = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.execute((Runnable) it.next());
        }
        list.clear();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.a) {
            this.b.add(runnable);
        } else {
            rnt.M(this.b.isEmpty(), "LatchExecutor: Bad pending task.");
            this.c.execute(runnable);
        }
    }
}
