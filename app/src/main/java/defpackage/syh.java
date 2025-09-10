package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syh implements Runnable {
    public Object a;
    public Object b;
    private final /* synthetic */ int c;

    public syh(syu syuVar, Future future, int i) {
        this.c = i;
        this.a = syuVar;
        this.b = future;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ske.X(this.a, this.b);
        }
        this.a = null;
        this.b = null;
    }

    public syh(sxh sxhVar, Executor executor, int i) {
        this.c = i;
        this.a = sxhVar;
        executor.getClass();
        this.b = executor;
    }
}
