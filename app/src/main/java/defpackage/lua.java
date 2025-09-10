package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class lua implements owq {
    protected final luk a;
    protected final String b;

    public lua(luk lukVar, String str) {
        this.a = lukVar;
        this.b = str;
    }

    protected abstract Object d();

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        pauVar.getClass();
        executor.getClass();
        ltz ltzVar = new ltz(this, pauVar, executor);
        this.a.e(ltzVar);
        ltzVar.a(this.b);
        return ltzVar;
    }

    @Override // defpackage.owf
    public final Object dL() {
        Object objD = d();
        if (objD != null) {
            return objD;
        }
        throw new NullPointerException("Null value for setting: ".concat(this.b));
    }
}
