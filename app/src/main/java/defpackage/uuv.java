package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uuv implements syu {
    public final szh a = new szh();
    public boolean b;
    private final uol c;

    public uuv(uol uolVar) {
        this.c = uolVar;
    }

    private static final void a(Object obj) throws Throwable {
        if (obj instanceof uuu) {
            throw new CancellationException().initCause(((uuu) obj).a);
        }
    }

    @Override // defpackage.syu
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.a.cancel(z)) {
            return false;
        }
        this.c.s(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object objS = this.a.s();
        a(objS);
        return objS;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        szh szhVar = this.a;
        if (szhVar.isCancelled()) {
            return true;
        }
        if (!isDone() || this.b) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.b = true;
        }
        return a.H(szhVar) instanceof uuu;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objH = a.H(this.a);
                if (objH instanceof uuu) {
                    sb.append("CANCELLED, cause=[" + ((uuu) objH).a + "]");
                } else {
                    sb.append(a.bz(objH, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.a + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object objT = this.a.t(j, timeUnit);
        a(objT);
        return objT;
    }
}
