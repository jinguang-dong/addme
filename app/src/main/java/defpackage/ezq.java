package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezq implements Future, ezr, faa {
    private Object a;
    private ezn b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ess f;

    private final synchronized Object n(Long l) {
        if (!isDone() && !fax.i()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (!this.d) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.e) {
                throw new ExecutionException(this.f);
            }
            if (this.c) {
                throw new CancellationException();
            }
            if (!this.d) {
                throw new TimeoutException();
            }
        }
        return this.a;
    }

    @Override // defpackage.faa
    public final synchronized ezn a() {
        return this.b;
    }

    @Override // defpackage.faa
    public final synchronized void c(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            ezn eznVar = null;
            if (z) {
                ezn eznVar2 = this.b;
                this.b = null;
                eznVar = eznVar2;
            }
            if (eznVar != null) {
                eznVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.faa
    public final synchronized void e(ezn eznVar) {
        this.b = eznVar;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.faa
    public final void i(ezt eztVar) {
        eztVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.c && !this.d) {
            if (!this.e) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ezr
    public final synchronized void k(ess essVar) {
        this.e = true;
        this.f = essVar;
        notifyAll();
    }

    @Override // defpackage.faa
    public final synchronized void l(Object obj) {
    }

    @Override // defpackage.ezr
    public final synchronized void m(Object obj) {
        this.d = true;
        this.a = obj;
        notifyAll();
    }

    public final String toString() {
        ezn eznVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            eznVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                eznVar = this.b;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (eznVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + eznVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.eyu
    public final void f() {
    }

    @Override // defpackage.eyu
    public final void g() {
    }

    @Override // defpackage.eyu
    public final void h() {
    }

    @Override // defpackage.faa
    public final void b(Drawable drawable) {
    }

    @Override // defpackage.faa
    public final void d(Drawable drawable) {
    }

    @Override // defpackage.faa
    public final void j(ezt eztVar) {
    }
}
