package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qit implements Callable {
    final /* synthetic */ qfh a;
    final /* synthetic */ qjt b;
    final /* synthetic */ qiu c;

    public qit(qiu qiuVar, qfh qfhVar, qjt qjtVar) {
        this.a = qfhVar;
        this.b = qjtVar;
        this.c = qiuVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        try {
            return this.a.a(this.c.h());
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            throw new Error(th);
        }
    }

    public final String toString() {
        qjt qjtVar = this.b;
        return "withRawGLObject(" + this.c.toString() + ", fn=" + qjtVar.a() + ")";
    }
}
