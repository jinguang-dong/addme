package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouy implements Executor {
    static final out a = new out(out.a);
    public final out b = a;
    private final Executor c;

    public ouy(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(new ouz(this, runnable, 1));
    }
}
