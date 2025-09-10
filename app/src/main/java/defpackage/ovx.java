package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ovx implements owq, ggw {
    private volatile boolean a;
    public final Set b;
    public final Executor c;
    public volatile Object d;

    public ovx(qrh qrhVar, owq owqVar) {
        this(new kiy(new pke(0L), null));
        dK(new fun(owqVar, qrhVar, 8, null), sxo.a);
    }

    @Override // defpackage.pau
    public void a(Object obj) {
        this.c.execute(new ovw(this, obj, 1));
    }

    public void d(Object obj) {
        try {
            rnt.M(!this.a, "Re-entrance isn't supported.");
            this.a = true;
            this.d = obj;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    ((pau) it.next()).a(obj);
                } catch (RejectedExecutionException unused) {
                }
            }
        } finally {
            this.a = false;
        }
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        oul oulVar = new oul(pauVar, executor);
        this.b.add(oulVar);
        this.c.execute(new ovw(this, oulVar, 2));
        return new ktu(this, oulVar, 18, (char[]) null);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.d;
    }

    public final String toString() {
        return new rwb("ConcurrentObs").toString();
    }

    public ovx(Object obj) {
        this(obj, new owr());
    }

    public ovx(Object obj, owr owrVar) {
        this.b = new CopyOnWriteArraySet();
        this.d = obj;
        this.c = owrVar;
    }
}
