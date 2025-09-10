package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class op extends byi {
    public static final Executor a = new oo(0);
    private static volatile op c;
    public final byi b;
    private final byi d;

    private op() {
        super((char[]) null);
        or orVar = new or();
        this.d = orVar;
        this.b = orVar;
    }

    public static op g() {
        if (c == null) {
            synchronized (op.class) {
                if (c == null) {
                    c = new op();
                }
            }
        }
        return c;
    }

    public final boolean h() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
