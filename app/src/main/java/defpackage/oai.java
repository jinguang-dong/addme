package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oai implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new oaj(runnable, wzgaYJqO.mYMugAXJ + a.incrementAndGet());
    }
}
