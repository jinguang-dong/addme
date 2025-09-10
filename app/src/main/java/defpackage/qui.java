package defpackage;

import android.os.Process;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qui {
    public static final qui a = new qui();
    public volatile qqx b;
    public volatile qqx c;
    public volatile qqx d;
    public volatile qqx e;
    public volatile qqx f;
    public volatile qqx g;
    public volatile qqx h;
    public volatile qqx i;
    public volatile qqx j;
    public volatile qqx k;
    public volatile qqx l;
    public volatile qna m;
    private volatile int p = Integer.MAX_VALUE;
    public final que n = new que();
    public final que o = new que();

    public static void b(String str, long j) {
        Trace.setCounter(str, j - Process.getStartElapsedRealtime());
        Trace.setCounter(str, 0L);
    }

    public final void a(int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            rcc.d(new kpl(this, i, 4));
        }
    }

    final boolean c(long j) {
        return ((long) this.p) < j;
    }
}
