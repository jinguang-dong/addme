package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eud implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public eud(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        euc eucVar = new euc(new eao(this, runnable, 16));
        eucVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return eucVar;
    }
}
