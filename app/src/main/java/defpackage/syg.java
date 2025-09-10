package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class syg implements Runnable {
    final Future a;
    final syf b;

    public syg(Future future, syf syfVar) {
        this.a = future;
        this.b = syfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM;
        Future future = this.a;
        if ((future instanceof szq) && (thM = ((szq) future).m()) != null) {
            this.b.a(thM);
            return;
        }
        try {
            this.b.b(ske.U(future));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.a(this.b);
        return rwbVarW.toString();
    }
}
