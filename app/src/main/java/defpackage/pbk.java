package defpackage;

import android.os.Trace;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbk implements pbn {
    private static final AtomicInteger a = new AtomicInteger();
    private final String b = "";

    private static boolean j() {
        return Trace.isEnabled();
    }

    @Override // defpackage.pbn
    public final pbp a(String str) {
        return new pbi(a.incrementAndGet(), str);
    }

    @Override // defpackage.pbn
    public final pbr b(String str) {
        return new pbj(str);
    }

    @Override // defpackage.pbn
    public final Runnable c(String str, Runnable runnable) {
        return !j() ? runnable : new lqd((Object) this, (Object) str, (Object) runnable, 17, (char[]) null);
    }

    @Override // defpackage.pbn
    public final Callable d(String str, Callable callable) {
        return !j() ? callable : new efk((Object) this, str, (Object) callable, 3);
    }

    @Override // defpackage.pbn
    public final /* synthetic */ void e(String str, Runnable runnable) {
        ojl.bG(this, str, runnable);
    }

    @Override // defpackage.pbn
    public final void f(String str) {
        rnt.M(!str.isEmpty(), "Empty sectionName.");
        Trace.beginSection(this.b.concat(String.valueOf(str)));
    }

    @Override // defpackage.pbn
    public final void g() {
        Trace.endSection();
    }

    @Override // defpackage.pbn
    public final void h(String str) {
        Trace.endSection();
        f(str);
    }

    @Override // defpackage.pbn
    public final void i() {
    }
}
