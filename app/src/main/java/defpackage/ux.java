package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ux implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadFactory b;

    public /* synthetic */ ux(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int[] iArr = uy.a;
        int i3 = 0;
        while (true) {
            i = this.a;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            i2 = i3 + 1;
            if (i >= uy.a[i3]) {
                break;
            }
            i3 = i2;
        }
        Thread threadNewThread = this.b.newThread(new cmu(i, runnable, 1));
        threadNewThread.getClass();
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
