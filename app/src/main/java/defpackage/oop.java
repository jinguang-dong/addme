package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oop implements oos, ooo, oon, ook {
    private final Executor a;
    private final oow b;

    public oop(Executor executor, oow oowVar) {
        this.a = executor;
        this.b = oowVar;
    }

    @Override // defpackage.oos
    public final void a(oor oorVar) {
        this.a.execute(new lor(this, oorVar, 19, (byte[]) null));
    }

    @Override // defpackage.ook
    public final void b() {
        this.b.q();
    }

    @Override // defpackage.oon
    public final void c(Exception exc) {
        this.b.o(exc);
    }

    @Override // defpackage.ooo
    public final void d(Object obj) {
        this.b.p(obj);
    }
}
