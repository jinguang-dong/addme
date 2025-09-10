package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwz extends lqp {
    private static final paq a = new fgp(14);
    private owf b;
    private paq c;
    private final Executor d;

    public lwz(lrc lrcVar, Executor executor) {
        super(lrcVar, executor);
        this.b = new ovx(false);
        this.c = a;
        this.d = executor;
    }

    @Override // defpackage.lqp, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.c.close();
        this.c = a;
    }

    @Override // defpackage.lqp
    protected final synchronized ixq d() {
        ixq ixqVarD = super.d();
        if (((Boolean) this.b.dL()).booleanValue()) {
            return ixqVarD;
        }
        return ixq.INACTIVE;
    }

    public final synchronized void l(owf owfVar) {
        this.b = owfVar;
        this.c.close();
        this.c = owfVar.dK(new lqn(this, 14), this.d);
    }
}
