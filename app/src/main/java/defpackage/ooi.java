package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooi implements oos, ooo, oon, ook {
    public final oog a;
    public final oow b;
    private final Executor c;

    public ooi(Executor executor, oog oogVar, oow oowVar) {
        this.c = executor;
        this.a = oogVar;
        this.b = oowVar;
    }

    @Override // defpackage.oos
    public final void a(oor oorVar) {
        this.c.execute(new lor(this, oorVar, 15, (byte[]) null));
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
