package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sjr extends ske {
    public static final sjr a = new sjr(skg.a);
    public final AtomicReference b;

    public sjr(ske skeVar) {
        this.b = new AtomicReference(skeVar);
    }

    @Override // defpackage.ske
    public final sij a() {
        return ((ske) this.b.get()).a();
    }

    @Override // defpackage.ske
    public final skl b() {
        return ((ske) this.b.get()).b();
    }

    @Override // defpackage.ske
    public final void c(String str, Level level, boolean z) {
        ((ske) this.b.get()).c(str, level, z);
    }
}
