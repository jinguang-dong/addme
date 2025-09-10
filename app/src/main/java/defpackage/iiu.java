package defpackage;

import android.opengl.GLSurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iiu {
    private static final sgv a = sgv.g("iiu");
    private final GLSurfaceView b;

    public iiu(GLSurfaceView gLSurfaceView) {
        this.b = gLSurfaceView;
    }

    public final void a(Runnable runnable) {
        this.b.queueEvent(runnable);
    }

    public final void b(Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a(new hdk(runnable, atomicBoolean, 19));
        synchronized (atomicBoolean) {
            while (!atomicBoolean.get()) {
                try {
                    atomicBoolean.wait();
                } catch (InterruptedException e) {
                    ((sgt) ((sgt) a.c().i(e)).M(2055)).s("Interrupted during wait");
                }
            }
        }
    }
}
