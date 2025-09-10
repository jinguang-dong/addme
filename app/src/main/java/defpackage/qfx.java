package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfx implements Runnable {
    public final qhd a = new qhd();
    protected final syu b;
    public final qfw c;
    protected final qfw d;
    public final Executor e;
    protected final qpt f;

    public qfx(syu syuVar, qfw qfwVar, qfw qfwVar2, Executor executor, qpt qptVar) {
        this.b = syuVar;
        this.c = qfwVar;
        this.d = qfwVar2;
        this.e = executor;
        this.f = qptVar;
    }

    private final void b(Throwable th) {
        qfw qfwVar = this.d;
        qgg qggVarA = qgg.a(th);
        if (qfwVar == null) {
            this.a.j(qggVarA);
            return;
        }
        try {
            this.e.execute(new qgs(this, qggVarA, 1));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public final void a(Throwable th) {
        this.a.j(qgg.a(th));
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object objH = a.H(this.b);
            if (objH == null) {
                a(new IllegalStateException(qcjAcSmlN.nbTIEdmGPbqrT));
                return;
            }
            try {
                this.e.execute(new pev(this, objH, 11));
            } catch (Throwable th) {
                a(th);
            }
        } catch (ExecutionException e) {
            b(e.getCause());
        } catch (Throwable th2) {
            b(th2);
        }
    }
}
