package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owc implements pau {
    final /* synthetic */ owd a;
    private final int b;

    public owc(owd owdVar, int i) {
        this.a = owdVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        owd owdVar = this.a;
        ?? r1 = owdVar.b;
        r1.set(this.b, obj);
        if (!owdVar.a) {
            Iterator it = r1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    owdVar.a = true;
                    break;
                } else if (it.next() == null) {
                    break;
                }
            }
        }
        if (owdVar.a) {
            owdVar.d.execute(new ovw(this, sbp.j(r1), 4));
        }
    }
}
