package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.cardboard.ExternalSurfaceManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class two implements twl {
    private final Runnable a;
    private final long b;
    private final Handler c = new Handler(Looper.getMainLooper());

    public two(final long j, long j2) {
        this.a = new Runnable() { // from class: twn
            @Override // java.lang.Runnable
            public final void run() {
                ExternalSurfaceManager.nativeCallback(j);
            }
        };
        this.b = j2;
    }

    @Override // defpackage.twl
    public final void a() {
        this.c.removeCallbacks(this.a);
    }

    @Override // defpackage.twl
    public final void b() {
        ExternalSurfaceManager.nativeCallback(this.b);
    }

    @Override // defpackage.twl
    public final void c() {
        this.c.post(this.a);
    }
}
