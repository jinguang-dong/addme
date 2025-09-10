package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oww implements owf {
    private final owf a;
    private final owf b;

    protected oww(owf owfVar) {
        this.a = owfVar;
        this.b = owb.a(new owv(this, owfVar));
    }

    protected abstract Object d(Object obj);

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.b.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final Object dL() {
        return this.b.dL();
    }

    public final Object o(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Input: " + String.valueOf(this.a) + " returned a null value");
        }
        Object objD = d(obj);
        if (objD != null) {
            return objD;
        }
        throw new NullPointerException("Transforming input value: " + obj.toString() + " resulted in a null output for: " + getClass().getName());
    }
}
