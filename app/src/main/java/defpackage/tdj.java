package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdj implements Runnable {
    private final long a;
    private final tdg b;
    private final AtomicBoolean c = new AtomicBoolean(true);

    public tdj(long j, tdg tdgVar) {
        this.a = j;
        this.b = tdgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.c.compareAndSet(true, false)) {
            tdg tdgVar = this.b;
            if (tdgVar.b()) {
                long j = this.a;
                Method method = tdgVar.e;
                if (method != null) {
                    try {
                        method.invoke(tdgVar.d, Long.valueOf(j));
                    } catch (Exception e) {
                        tdg.b.logp(Level.SEVERE, "com.google.googlex.gcam.clientallocator.AndroidNativeAllocationNotifier", "registerFree", "Unable to invoke registerNativeFree(long) ".concat(String.valueOf(e.getMessage())));
                    }
                }
            }
        }
    }
}
