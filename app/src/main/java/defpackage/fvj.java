package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fvj implements fre {
    private final Executor a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    public volatile szh h = new szh();

    protected fvj(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        if (!this.b.compareAndSet(false, true)) {
            return this.h;
        }
        this.a.execute(new fnf(this, 6));
        return this.h;
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }

    public abstract void f();
}
