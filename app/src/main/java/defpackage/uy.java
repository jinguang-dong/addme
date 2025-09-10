package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uy {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        threadFactoryDefaultThreadFactory.getClass();
        b = threadFactoryDefaultThreadFactory;
    }

    public static final ThreadFactory b(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new szi(threadFactory, str, new ulz(0, umc.a), 1);
    }

    public static final ScheduledExecutorService a(ThreadFactory threadFactory, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bE(i, "Threads (", CZAHo.MuUbQhuMXdHN));
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, threadFactory);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
