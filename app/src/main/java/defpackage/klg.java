package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klg extends pog {
    private final AtomicBoolean a;

    public klg(poj pojVar) {
        super(pojVar);
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.getAndSet(true);
    }
}
