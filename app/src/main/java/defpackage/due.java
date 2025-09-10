package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class due {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ due(Runnable runnable, dgp dgpVar, Runnable runnable2) {
        this.a = runnable;
        this.b = dgpVar;
        this.c = runnable2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r02 = this.c;
        ((dgp) this.b).n();
        r02.run();
    }

    public due(Method method, Object obj, Object obj2) {
        this.c = method;
        this.a = obj;
        this.b = obj2;
    }
}
