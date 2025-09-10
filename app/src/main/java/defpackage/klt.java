package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klt extends our {
    private static final sgv b = sgv.g("klt");
    public final pbn a;
    private final uem c;
    private final AtomicBoolean d;
    private final Optional e;

    public klt(uem uemVar, ovq ovqVar, Optional optional, pbn pbnVar) {
        super(ovqVar);
        this.c = uemVar;
        this.d = new AtomicBoolean(false);
        this.e = optional;
        this.a = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [sgt, shi] */
    public final void a() {
        Iterator it = ((Set) this.c.a()).iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                ((klr) it.next()).run();
            } catch (Throwable th2) {
                th = th2;
                ((sgt) ((sgt) b.b().i(th)).M((char) 3313)).s("Error thrown while running shutdown task");
            }
        }
        super.close();
        if (th != null) {
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.our
    public final boolean b() {
        return this.d.get();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // defpackage.our, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        Optional optional = this.e;
        if (optional.isPresent()) {
            optional.get().submit(new Runnable() { // from class: kls
                @Override // java.lang.Runnable
                public final void run() {
                    klt kltVar = this.a;
                    pbn pbnVar = kltVar.a;
                    pbnVar.f("Low Priority OneCamera Shutdown");
                    kltVar.a();
                    pbnVar.g();
                }
            });
            return;
        }
        pbn pbnVar = this.a;
        pbnVar.f("Critical Path OneCamera Shutdown");
        a();
        pbnVar.g();
    }
}
