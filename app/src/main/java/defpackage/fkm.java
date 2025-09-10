package defpackage;

import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkm implements npn {
    public final fkw a;
    private final AtomicReference b = new AtomicReference();

    public fkm(fkw fkwVar) {
        this.a = fkwVar;
    }

    @Override // defpackage.npn
    public final npl a(npj npjVar) {
        return (npl) DesugarAtomicReference.updateAndGet(this.b, new fpn(this, npjVar, 1));
    }
}
