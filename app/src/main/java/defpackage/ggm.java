package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggm implements paq {
    public final oyn a;
    private final AtomicLong c = new AtomicLong(0);
    public ggl b = ggl.FPS_30;

    public ggm(oyn oynVar) {
        this.a = oynVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.set(0L);
        this.b = ggl.FPS_30;
    }
}
