package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owa implements pau {
    Object a = null;
    final /* synthetic */ Executor b;
    final /* synthetic */ pau c;

    public owa(Executor executor, pau pauVar) {
        this.b = executor;
        this.c = pauVar;
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
        if (a.K(this.a, obj)) {
            return;
        }
        this.a = obj;
        this.b.execute(new ovw(this.c, obj, 3));
    }
}
