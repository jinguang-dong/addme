package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eap {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final gga e;

    protected eap(Context context, gga ggaVar) {
        this.e = ggaVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !a.ao(obj2, obj)) {
                this.d = obj;
                this.e.c.execute(new eao(ske.bN(this.c), this, 0));
            }
        }
    }
}
