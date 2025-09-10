package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public class peb extends ojl {
    public final CountDownLatch a;

    public peb() {
        super((short[]) null);
        this.a = new CountDownLatch(1);
    }

    public final void cm() throws InterruptedException {
        this.a.await();
    }

    protected final void cn() {
        this.a.countDown();
    }
}
