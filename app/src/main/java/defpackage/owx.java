package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class owx implements owq {
    private final owq a;
    private final owf b;

    protected owx(owq owqVar) {
        this.a = owqVar;
        this.b = owl.h(owqVar, new kou(this, 12));
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
        obj.getClass();
        Object objC = c(obj);
        if (objC != null) {
            this.a.a(objC);
            return;
        }
        throw new NullPointerException("Transforming output value: " + obj.toString() + " resulted in a null input value for: " + getClass().getName());
    }

    public abstract Object b(Object obj);

    protected abstract Object c(Object obj);

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(pauVar, executor);
    }

    public Object dL() {
        return this.b.dL();
    }
}
