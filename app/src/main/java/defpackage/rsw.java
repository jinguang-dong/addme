package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLU;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsw implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public rsw(qjj qjjVar, Runnable runnable, Throwable th, int i) {
        this.d = i;
        this.a = runnable;
        this.b = th;
        this.c = qjjVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, rso] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            Runnable runnable = this.a;
            qjj qjjVar = (qjj) this.c;
            AtomicBoolean atomicBoolean = qjjVar.b;
            int iIncrementAndGet = qjjVar.a.incrementAndGet();
            boolean z = atomicBoolean.get();
            runnable.run();
            Object obj = this.b;
            int iEglGetError = EGL14.eglGetError();
            if (iEglGetError != 12288) {
                qpt.B(runnable, iIncrementAndGet, iEglGetError, GLES30.glGetError(), z);
                throw new qjk(runnable.toString(), iEglGetError, (Throwable) obj);
            }
            int iGlGetError = GLES30.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            qpt.B(runnable, iIncrementAndGet, EGL14.eglGetError(), iGlGetError, z);
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            throw new RuntimeException("Executing GL task '" + runnable.toString() + "' caused error " + strGluErrorString + "!", (Throwable) obj);
        }
        if (((rsy) ((uka) this.b).a) != null) {
            throw null;
        }
        ?? r0 = this.c;
        Runnable runnable2 = this.a;
        rso rsoVarC = rsa.c(rsa.a(), r0);
        try {
            runnable2.run();
        } finally {
        }
    }

    public final String toString() {
        if (this.d == 0) {
            return "propagating=[" + this.a + "]";
        }
        return "checked [" + this.a.toString() + "]";
    }

    public rsw(uka ukaVar, rso rsoVar, Runnable runnable, int i) {
        this.d = i;
        this.b = ukaVar;
        this.c = rsoVar;
        this.a = runnable;
    }
}
