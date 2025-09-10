package defpackage;

import android.opengl.EGL14;
import android.opengl.EGL15;
import android.opengl.EGLSync;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qis extends qfn implements qin {
    private static final Callable b = new qiq();
    private final Executor c;
    private final qgf d;
    private final qhd e = new qhd();
    private final HashMap f = new HashMap();
    public volatile boolean a = true;
    private final szh g = new szh();

    public qis(Executor executor) {
        this.c = executor;
        this.d = qpt.ai(executor, b);
    }

    public static EGLSync j() {
        return EGL15.eglCreateSync(EGL14.eglGetDisplay(0), 12537, new long[]{12344}, 0);
    }

    private final Collection n() {
        ArrayList arrayList;
        HashMap map = this.f;
        synchronized (map) {
            arrayList = new ArrayList(map.values());
            map.clear();
        }
        return arrayList;
    }

    @Override // defpackage.qfn
    protected final qgi b() {
        Collection collectionN = n();
        qir qirVar = qir.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionN.iterator();
        while (it.hasNext()) {
            arrayList.add(new qge(it.next(), 0));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            Executor executor = this.c;
            if (!it2.hasNext()) {
                return new qgi(qpt.aj(arrayList2).b(executor, new qga(this.e, 2)).b(executor, new qir(1)).b(executor, new qip(this, 0)));
            }
            arrayList2.add(((qgf) it2.next()).b(executor, qirVar));
        }
    }

    @Override // defpackage.qin
    public final qim d() {
        return (qim) qpt.ak(this.e);
    }

    @Override // defpackage.qin
    public final qjq e() {
        final szh szhVar = new szh();
        try {
            execute(new Runnable() { // from class: qio
                @Override // java.lang.Runnable
                public final void run() {
                    szhVar.e(qsp.j(qis.j()));
                }
            });
            return new qjp(szhVar, 1);
        } catch (RejectedExecutionException e) {
            if (this.a) {
                throw new IllegalStateException("Unable to schedule EGLSync!", e);
            }
            return new qjp(this.g, 0);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.a) {
            throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
        }
        this.c.execute(runnable);
    }

    @Override // defpackage.qin
    public final qkq f() {
        return ((qjy) ((qim) qpt.ak(this.e)).i()).h();
    }

    @Override // defpackage.qfn
    protected final void fl() {
        Iterator it = n().iterator();
        while (it.hasNext()) {
            ((qms) it.next()).close();
        }
        ((qim) qpt.am(this.e)).close();
        this.a = false;
        this.c.execute(new oze(this, 15));
        qpt.am(k());
    }

    @Override // defpackage.qin
    public final void g(qjt qjtVar, Runnable runnable) {
        execute(new qgs(runnable, qjtVar, 2));
    }

    @Override // defpackage.qin
    public final boolean h() {
        return qpt.al(this.d) == Thread.currentThread();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qmn] */
    @Override // defpackage.qin
    public final qms i(Object obj, rww rwwVar) {
        qms qmsVar;
        HashMap map = this.f;
        synchronized (map) {
            qms qmsVar2 = (qms) map.get(obj);
            if (qmsVar2 == null) {
                try {
                    qmsVar2 = new qms((qmn) rwwVar.fr());
                    this.f.put(obj, qmsVar2);
                } catch (Throwable th) {
                    throw rxa.a(th);
                }
            }
            if (!qmsVar2.b.get()) {
                throw new qmp();
            }
            qmr qmrVar = qmsVar2.a;
            qmrVar.a.incrementAndGet();
            qmsVar = new qms(qmrVar);
        }
        return qmsVar;
    }

    protected qgi k() {
        return qgh.a;
    }

    public final void l(qim qimVar) {
        this.e.i(qimVar);
    }

    public final void m() {
        qjq qjqVarJ = qsp.j(j());
        try {
            qjqVarJ.a();
            qjqVarJ.close();
            this.g.e(true);
        } catch (Throwable th) {
            try {
                qjqVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
