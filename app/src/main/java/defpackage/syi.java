package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class syi implements Callable {
    final /* synthetic */ Runnable a;

    public syi(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.run();
        return null;
    }
}
