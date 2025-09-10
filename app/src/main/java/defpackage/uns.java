package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uns implements unt {
    private final Future a;

    public uns(Future future) {
        this.a = future;
    }

    @Override // defpackage.unt
    public final void fL() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
