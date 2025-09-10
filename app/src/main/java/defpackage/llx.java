package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class llx implements Runnable {
    private final lly a;
    private final lmp b;
    private final pbn c;
    private final obu d;

    public llx(lly llyVar, obu obuVar, lmp lmpVar, pbn pbnVar) {
        this.a = llyVar;
        this.d = obuVar;
        this.b = lmpVar;
        this.c = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        this.c.f("TaskDoneWrapper#run");
        try {
            this.b.run();
            lly llyVar = this.a;
            llyVar.a(this.b);
            obu obuVar = this.d;
            Object obj = obuVar.b;
            synchronized (llyVar.f) {
                llf llfVar = ((lme) obj).b;
                if (llfVar.a(-1) == 0) {
                    llfVar.d();
                    ?? r1 = obuVar.a;
                    Map map = llyVar.e;
                    synchronized (map) {
                        for (poj pojVar : r1) {
                            if (((llw) map.get(pojVar)) != null) {
                                Set set = llyVar.g;
                                if (!set.contains(pojVar)) {
                                    set.add(pojVar);
                                }
                            }
                        }
                    }
                    Runnable runnable = ((lme) obj).c;
                    if (runnable != null) {
                        pbn pbnVar = this.c;
                        pbnVar.f("TaskDoneWrapper#done#run");
                        Executor executor = this.b.c;
                        if (executor == null) {
                            runnable.run();
                        } else {
                            executor.execute(runnable);
                        }
                        pbnVar.g();
                    }
                }
            }
            this.c.g();
        } catch (Throwable th) {
            this.a.a(this.b);
            throw th;
        }
    }
}
