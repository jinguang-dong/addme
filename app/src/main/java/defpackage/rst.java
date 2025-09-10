package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rst implements Callable {
    final /* synthetic */ rso a;
    final /* synthetic */ Callable b;

    public rst(rso rsoVar, Callable callable) {
        this.a = rsoVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        rso rsoVarC = rsa.c(rsa.a(), this.a);
        try {
            return this.b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
