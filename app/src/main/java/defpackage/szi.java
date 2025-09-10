package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class szi implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ szi(ThreadFactory threadFactory, String str, ulz ulzVar, int i) {
        this.d = i;
        this.a = threadFactory;
        this.b = str;
        this.c = ulzVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.d == 0) {
            Thread threadNewThread = this.a.newThread(runnable);
            threadNewThread.getClass();
            threadNewThread.setName(rup.u(Long.valueOf(((AtomicLong) this.c).getAndIncrement())));
            return threadNewThread;
        }
        int[] iArr = uy.a;
        Thread threadNewThread2 = this.a.newThread(runnable);
        threadNewThread2.getClass();
        threadNewThread2.setName(this.b.concat(String.valueOf(ujp.x(String.valueOf(((ulz) this.c).b()), 2))));
        return threadNewThread2;
    }

    public szi(ThreadFactory threadFactory, AtomicLong atomicLong, int i) {
        this.d = i;
        this.a = threadFactory;
        this.b = "ConsentVerifierLibraryThread-%d";
        this.c = atomicLong;
    }
}
