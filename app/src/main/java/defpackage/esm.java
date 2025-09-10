package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class esm {
    final Executor a;
    final ezt b;

    public esm(ezt eztVar, Executor executor) {
        this.b = eztVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof esm) {
            return this.b.equals(((esm) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
