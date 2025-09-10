package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ule implements uli {
    private final AtomicReference a;

    public ule(uli uliVar) {
        this.a = new AtomicReference(uliVar);
    }

    @Override // defpackage.uli
    public final Iterator a() {
        uli uliVar = (uli) this.a.getAndSet(null);
        if (uliVar != null) {
            return uliVar.a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
