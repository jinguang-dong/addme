package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uny extends unz {
    private final Runnable a;

    public uny(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.unz
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
