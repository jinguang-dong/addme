package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class owk implements pau {
    final AtomicBoolean a = new AtomicBoolean(false);
    final /* synthetic */ pau b;

    public owk(pau pauVar) {
        this.b = pauVar;
    }

    @Override // defpackage.pau
    public final void a(Object obj) {
        if (this.a.getAndSet(true)) {
            this.b.a(obj);
        }
    }
}
