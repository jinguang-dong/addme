package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpl implements owf {
    public final int a;
    private final owf b;

    public lpl(owf owfVar, int i) {
        this.b = owfVar;
        this.a = i;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(new lpk(this, executor, pauVar), new owr());
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (Integer) ((ovx) this.b).d;
    }
}
