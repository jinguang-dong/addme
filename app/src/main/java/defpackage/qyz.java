package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
class qyz extends qze {
    private final qyv d;
    private volatile Object e;

    public qyz(String str, qzn qznVar, qyv qyvVar) {
        super("com.google.android.libraries.performance.primes", str, qznVar);
        this.d = qyvVar;
    }

    @Override // defpackage.qyq
    protected final Object b(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.qyq
    protected final Object c(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.qyu
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.qyu
    public final void g(Object obj) {
        this.e = obj;
    }
}
