package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooh implements oos {
    public final oog a;
    public final oow b;
    private final Executor c;

    public ooh(Executor executor, oog oogVar, oow oowVar) {
        this.c = executor;
        this.a = oogVar;
        this.b = oowVar;
    }

    @Override // defpackage.oos
    public final void a(oor oorVar) {
        this.c.execute(new nzq(this, oorVar, 12, (char[]) null));
    }
}
