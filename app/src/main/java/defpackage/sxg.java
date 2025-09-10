package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class sxg extends swm {
    public static final sxd a;
    private static final syt b = new syt(sxg.class);
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    static {
        Throwable th;
        sxd sxfVar;
        try {
            sxfVar = new sxe();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            sxfVar = new sxf();
        }
        Throwable th3 = th;
        a = sxfVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public sxg(int i) {
        this.remainingField = i;
    }

    public abstract void g(Set set);
}
