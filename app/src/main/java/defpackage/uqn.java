package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uqn extends umd implements uqm {
    public final uqm b;

    public uqn(uhf uhfVar, uqm uqmVar) {
        super(uhfVar, true);
        this.b = uqmVar;
    }

    @Override // defpackage.uqz
    public final uqa A() {
        return this.b.A();
    }

    @Override // defpackage.uqz
    public final uwt B() {
        throw null;
    }

    @Override // defpackage.uov
    public final void H(Throwable th) throws Throwable {
        uqm uqmVar = this.b;
        CancellationException cancellationExceptionS = uov.S(this, th);
        uqmVar.s(cancellationExceptionS);
        L(cancellationExceptionS);
    }

    @Override // defpackage.uqz
    public final Object d(uhb uhbVar) {
        throw null;
    }

    @Override // defpackage.uqz
    public final Object e(uhb uhbVar) {
        throw null;
    }

    @Override // defpackage.ura
    public final Object h(Object obj, uhb uhbVar) {
        return this.b.h(obj, uhbVar);
    }

    @Override // defpackage.uqz
    public final Object i() {
        return this.b.i();
    }

    @Override // defpackage.ura
    public final Object j(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.ura
    public final void r(uiq uiqVar) {
        this.b.r(uiqVar);
    }

    @Override // defpackage.uov, defpackage.uol
    public final void s(CancellationException cancellationException) throws Throwable {
        if (fZ()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new uom(fR(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.ura
    public final boolean u(Throwable th) {
        return this.b.u(th);
    }

    @Override // defpackage.ura
    public final boolean x() {
        return this.b.x();
    }
}
