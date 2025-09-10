package defpackage;

import android.os.HandlerThread;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxd {
    public final oyn a;
    public final ExecutorService b;
    public final syw e;
    public final HandlerThread f;
    public oyk h;
    public final Object d = new Object();
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public oxc g = oxc.READY;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, oyk] */
    public oxd(oyn oynVar, ExecutorService executorService, rwc rwcVar, syw sywVar, HandlerThread handlerThread) {
        this.h = new owz(this, 0);
        this.a = oynVar;
        this.b = executorService;
        this.e = sywVar;
        this.f = handlerThread;
        if (rwcVar.h()) {
            this.h = rwcVar.c();
        }
    }

    public final void a(owy owyVar) {
        this.c.add(owyVar);
    }

    public final void b() {
        synchronized (this.d) {
            oxc oxcVar = this.g;
            oxc oxcVar2 = oxc.STARTED;
            boolean z = true;
            if (oxcVar != oxcVar2 && oxcVar != oxc.PAUSED) {
                z = false;
            }
            rnt.Q(z, "%s or %s is expected but we get %s", oxcVar2, oxc.PAUSED, oxcVar);
            this.g = oxc.d;
            ske.W(this.a.h(), new fxw(this, 14), this.b);
        }
    }
}
