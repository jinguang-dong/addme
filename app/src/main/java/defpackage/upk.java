package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upk {
    public static final ThreadLocal a = new ThreadLocal();

    public static final unw a() {
        ThreadLocal threadLocal = a;
        unw unwVar = (unw) threadLocal.get();
        if (unwVar != null) {
            return unwVar;
        }
        umh umhVar = new umh(Thread.currentThread());
        threadLocal.set(umhVar);
        return umhVar;
    }
}
