package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cip {
    static final cip a = new cip(null, null);
    final Runnable b;
    final Executor c;
    cip next;

    public cip(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
