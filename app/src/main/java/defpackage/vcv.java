package defpackage;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.ThreadStatsUid;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ vcv(int i, boolean z, int i2, Runnable runnable, int i3) {
        this.e = i3;
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = runnable;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.e != 0) {
            boolean z = this.b;
            int i = this.c;
            ((gbe) this.d).e(this.a, i, z);
            return;
        }
        int i2 = this.a;
        String str = vda.a;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(i2);
        boolean z2 = this.b;
        ?? r2 = this.d;
        if (z2) {
            ThreadStatsUid.set(this.c);
        }
        try {
            r2.run();
            if (z2) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (z2) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
            throw th;
        }
    }

    public /* synthetic */ vcv(gbe gbeVar, int i, int i2, boolean z, int i3) {
        this.e = i3;
        this.d = gbeVar;
        this.a = i;
        this.c = i2;
        this.b = z;
    }
}
