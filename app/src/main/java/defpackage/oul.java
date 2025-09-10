package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oul implements pau {
    public final pau a;
    private final Executor b;

    public oul(pau pauVar, Executor executor) {
        this.a = pauVar;
        this.b = executor;
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
        this.b.execute(new lor(this, obj, 20));
    }
}
