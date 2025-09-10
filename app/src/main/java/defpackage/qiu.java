package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qiu implements qff {
    private final qgf a;
    public final qin b;

    protected qiu(qin qinVar, qgf qgfVar) {
        this.b = qinVar;
        this.a = qgfVar;
        if (qinVar.h() && qpt.al(qgfVar) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
        boolean z = qia.a;
    }

    public static qgf f(qin qinVar, Callable callable) {
        if (!qinVar.h()) {
            return qpt.ai(qinVar, callable);
        }
        try {
            return new qge(callable.call(), 0);
        } catch (Exception e) {
            return new qge(ske.L(qgg.a(e)), 1);
        }
    }

    @Override // defpackage.qff
    public qgi a() {
        boolean z = qia.a;
        return new qgi(g(new itd(5), new qfi()));
    }

    @Override // defpackage.qff, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qpt.am(a());
    }

    public final qgf g(qjt qjtVar, qfh qfhVar) {
        return f(this.b, new qit(this, qfhVar, qjtVar));
    }

    public final qke h() {
        if (this.b.h()) {
            return i();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }

    protected final qke i() {
        if (!this.b.h()) {
            return (qke) qpt.am(this.a);
        }
        qke qkeVar = (qke) qpt.al(this.a);
        if (qkeVar != null) {
            return qkeVar;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }
}
