package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class civ {
    public Object a;
    public ciz b;
    public cjc c = new cjc();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        cjc cjcVar = this.c;
        if (cjcVar != null) {
            cjcVar.c(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean c(Object obj) {
        this.d = true;
        ciz cizVar = this.b;
        boolean z = cizVar != null && cizVar.b.e(obj);
        if (z) {
            b();
        }
        return z;
    }

    public final void d(Throwable th) {
        this.d = true;
        ciz cizVar = this.b;
        if (cizVar == null || !cizVar.a(th)) {
            return;
        }
        b();
    }

    protected final void finalize() {
        cjc cjcVar;
        ciz cizVar = this.b;
        if (cizVar != null && !cizVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            cizVar.a(new ciw("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (this.d || (cjcVar = this.c) == null) {
            return;
        }
        cjcVar.e(null);
    }
}
