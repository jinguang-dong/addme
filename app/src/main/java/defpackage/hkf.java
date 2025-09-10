package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkf implements npn {
    private final owf a;
    private final Executor b;

    public hkf(owf owfVar, Executor executor) {
        this.a = owfVar;
        this.b = executor;
    }

    @Override // defpackage.npn
    public final synchronized npl a(npj npjVar) {
        return new hkg(this.b, this.a);
    }
}
