package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class sxc extends sxg {
    private static final syt b = new syt(sxc.class);
    private sbe c;
    private final boolean h;
    private final boolean i;

    public sxc(sbe sbeVar, boolean z, boolean z2) {
        super(sbeVar.size());
        sbeVar.getClass();
        this.c = sbeVar;
        this.h = z;
        this.i = z2;
    }

    private static void A(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean B(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void y(int i, Future future) {
        try {
            h(i, a.H(future));
        } catch (ExecutionException e) {
            z(e.getCause());
        } catch (Throwable th) {
            z(th);
        }
    }

    private final void z(Throwable th) {
        th.getClass();
        if (this.h && !a(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set setAk = ujp.ak();
                g(setAk);
                sxg.a.b(this, setAk);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (B(set, th)) {
                A(th);
                return;
            }
        }
        if (th instanceof Error) {
            A(th);
        }
    }

    @Override // defpackage.swn
    protected final void d() {
        sbe sbeVar = this.c;
        x(1);
        if ((sbeVar != null) && isCancelled()) {
            boolean zR = r();
            sgj sgjVarListIterator = sbeVar.listIterator();
            while (sgjVarListIterator.hasNext()) {
                ((Future) sgjVarListIterator.next()).cancel(zR);
            }
        }
    }

    @Override // defpackage.swn
    protected final String ez() {
        sbe sbeVar = this.c;
        return sbeVar != null ? "futures=".concat(sbeVar.toString()) : super.ez();
    }

    @Override // defpackage.sxg
    public final void g(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thM = m();
        thM.getClass();
        B(set, thM);
    }

    public abstract void h(int i, Object obj);

    public final void i(sbe sbeVar) {
        int iA = sxg.a.a(this);
        int i = 0;
        rnt.M(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (sbeVar != null) {
                sgj sgjVarListIterator = sbeVar.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    Future future = (Future) sgjVarListIterator.next();
                    if (!future.isCancelled()) {
                        y(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            j();
            x(2);
        }
    }

    public abstract void j();

    final void v() {
        sbe sbeVar = this.c;
        sbeVar.getClass();
        if (sbeVar.isEmpty()) {
            j();
            return;
        }
        if (this.h) {
            sgj sgjVarListIterator = this.c.listIterator();
            final int i = 0;
            while (sgjVarListIterator.hasNext()) {
                final syu syuVar = (syu) sgjVarListIterator.next();
                int i2 = i + 1;
                if (syuVar.isDone()) {
                    w(i, syuVar);
                } else {
                    syuVar.c(new Runnable() { // from class: sxa
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.w(i, syuVar);
                        }
                    }, sxo.a);
                }
                i = i2;
            }
            return;
        }
        sbe sbeVar2 = this.c;
        final sbe sbeVar3 = true != this.i ? null : sbeVar2;
        Runnable runnable = new Runnable() { // from class: sxb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(sbeVar3);
            }
        };
        sgj sgjVarListIterator2 = sbeVar2.listIterator();
        while (sgjVarListIterator2.hasNext()) {
            syu syuVar2 = (syu) sgjVarListIterator2.next();
            if (syuVar2.isDone()) {
                i(sbeVar3);
            } else {
                syuVar2.c(runnable, sxo.a);
            }
        }
    }

    public final void w(int i, syu syuVar) {
        try {
            if (syuVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                y(i, syuVar);
            }
        } finally {
            i(null);
        }
    }

    public void x(int i) {
        this.c = null;
    }
}
