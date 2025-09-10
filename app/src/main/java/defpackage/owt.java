package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owt implements owf {
    private final owf a;
    private final owu b;

    public owt(owf owfVar) {
        this.a = owfVar;
        owu owuVar = new owu(owfVar.dL());
        this.b = owuVar;
        owfVar.dK(new nta(owuVar, 12), sxo.a);
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.b.d;
    }
}
