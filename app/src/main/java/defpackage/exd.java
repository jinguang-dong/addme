package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exd {
    public static final /* synthetic */ int a = 0;
    private static final File b = new File("/proc/self/fd");
    private static volatile exd c;
    private int d;
    private boolean e = true;

    public exd() {
        new AtomicBoolean(false);
    }

    public static exd a() {
        if (c == null) {
            synchronized (exd.class) {
                if (c == null) {
                    c = new exd();
                }
            }
        }
        return c;
    }

    private final synchronized boolean c() {
        boolean z = true;
        int i = this.d + 1;
        this.d = i;
        if (i >= 50) {
            this.d = 0;
            int length = b.list().length;
            if (length >= 20000) {
                z = false;
            }
            this.e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", a.bE(length, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ", ", limit 20000"));
            }
        }
        return this.e;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        return z && !z2 && i >= 0 && i2 >= 0 && c();
    }
}
