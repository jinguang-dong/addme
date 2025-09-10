package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class swk {
    static final swk a = new swk();
    final Runnable b;
    final Executor c;
    swk next;

    public swk() {
        this.b = null;
        this.c = null;
    }

    public swk(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
