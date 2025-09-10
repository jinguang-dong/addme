package defpackage;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psi implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public psi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 1) {
            coe.d(runnable);
            Object obj = this.b;
            if (((Handler) obj).post(runnable)) {
                return;
            }
            Objects.toString(obj);
            throw new RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        vdc vdcVar = new vdc(runnable, Thread.currentThread());
        this.b.execute(vdcVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = vdcVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        vdcVar.a = null;
    }

    public psi(Handler handler, int i, byte[] bArr) {
        this.a = i;
        coe.d(handler);
        this.b = handler;
    }
}
