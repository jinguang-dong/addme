package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sjj {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(sgh sghVar) {
        if (!a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
        Object obj = sghVar.a;
        if (obj == null) {
            obj = sju.c;
        }
        if (!a.x(sjq.d, obj)) {
            throw new IllegalStateException("Logger backends can only be configured once.");
        }
        sjq.e();
        sjr.a.b.set(skg.a);
    }
}
