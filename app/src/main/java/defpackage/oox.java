package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oox implements ooo, oon, ook {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.ook
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.oon
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.ooo
    public final void d(Object obj) {
        this.a.countDown();
    }
}
