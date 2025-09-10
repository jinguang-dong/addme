package defpackage;

import java.lang.ref.Cleaner;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxr implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public dxr(edb edbVar, Runnable runnable, int i) {
        this.a = i;
        this.b = edbVar;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future, syu] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Future, syu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, umk] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, umk] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uhb] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.lang.ref.Cleaner$Cleanable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, umk] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uhb] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, umk] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r3;
        int i = this.a;
        if (i == 0) {
            ?? r0 = this.b;
            if (r0.isCancelled()) {
                this.c.g(null);
                return;
            }
            try {
                this.c.fW(dyv.a(r0));
                return;
            } catch (ExecutionException e) {
                this.c.fW(rnt.aM(dyv.b(e)));
                return;
            }
        }
        if (i == 1) {
            ?? r02 = this.b;
            if (r02.isCancelled()) {
                this.c.g(null);
                return;
            }
            try {
                ?? r1 = this.c;
                int i2 = ciu.c;
                r1.fW(a.H(r02));
                return;
            } catch (ExecutionException e2) {
                this.c.fW(rnt.aM(cgh.j(e2)));
                return;
            }
        }
        if (i == 2) {
            try {
                this.c.run();
                Object obj = this.b;
                synchronized (((edb) obj).b) {
                    ((edb) obj).a();
                }
                return;
            } catch (Throwable th) {
                Object obj2 = this.b;
                synchronized (((edb) obj2).b) {
                    ((edb) obj2).a();
                    throw th;
                }
            }
        }
        if (i != 3) {
            if (!((AtomicBoolean) this.c).compareAndSet(true, false) || (r3 = this.b) == 0) {
                return;
            }
            r3.clean();
            return;
        }
        Object obj3 = this.c;
        synchronized (((edj) obj3).c) {
            Map map = ((edj) obj3).a;
            Object obj4 = this.b;
            if (((dxr) map.remove(obj4)) != null) {
                edi ediVar = (edi) ((edj) obj3).b.remove(obj4);
                if (ediVar != null) {
                    ediVar.b((ebm) obj4);
                }
            } else {
                dwj.b();
                String.format("Timer with %s is already marked as complete.", obj4);
            }
        }
    }

    public dxr(edj edjVar, ebm ebmVar, int i) {
        this.a = i;
        this.c = edjVar;
        this.b = ebmVar;
    }

    public dxr(syu syuVar, umk umkVar, int i) {
        this.a = i;
        this.b = syuVar;
        this.c = umkVar;
    }

    public dxr(Cleaner.Cleanable cleanable, int i) {
        this.a = i;
        this.c = new AtomicBoolean(true);
        this.b = cleanable;
    }
}
