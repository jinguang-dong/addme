package defpackage;

import java.lang.ref.Cleaner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdg {
    public static final tdg a = new tdg();
    public static final Logger b = Logger.getLogger("AndroidNativeAllocationNotifier");
    public Cleaner c;
    public Object d;
    public Method e;
    private Method f;

    public tdg() throws ClassNotFoundException {
        this.c = null;
        this.d = null;
        this.f = null;
        this.e = null;
        try {
            this.c = (Cleaner) Class.forName("android.system.SystemCleaner").getMethod("cleaner", null).invoke(null, null);
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            this.d = cls.getMethod("getRuntime", null).invoke(null, null);
            this.f = cls.getMethod("registerNativeAllocation", Long.TYPE);
            this.e = cls.getMethod("registerNativeFree", Long.TYPE);
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
            this.c = null;
            this.d = null;
            this.f = null;
            this.e = null;
        }
    }

    public final void a(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f;
        if (method != null) {
            try {
                method.invoke(this.d, Long.valueOf(j));
            } catch (ReflectiveOperationException e) {
                b.logp(Level.SEVERE, "com.google.googlex.gcam.clientallocator.AndroidNativeAllocationNotifier", "registerAllocation", "Unable to invoke registerNativeAllocation(long) ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    public final boolean b() {
        return (this.c == null || this.d == null || this.f == null || this.e == null) ? false : true;
    }
}
