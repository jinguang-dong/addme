package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvd {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = ujp.M(ujp.L(new coq(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator(), 2)));
    }

    public static final void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
