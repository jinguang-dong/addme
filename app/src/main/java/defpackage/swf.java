package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class swf extends sxz implements Runnable {
    syu a;
    Class b;
    Object c;

    public swf(syu syuVar, Class cls, Object obj) {
        syuVar.getClass();
        this.a = syuVar;
        this.b = cls;
        this.c = obj;
    }

    public static syu i(syu syuVar, Class cls, rvu rvuVar, Executor executor) {
        swe sweVar = new swe(syuVar, cls, rvuVar);
        syuVar.c(sweVar, ske.C(executor, sweVar));
        return sweVar;
    }

    public static syu j(syu syuVar, Class cls, sxi sxiVar, Executor executor) {
        swd swdVar = new swd(syuVar, cls, sxiVar);
        syuVar.c(swdVar, ske.C(executor, swdVar));
        return swdVar;
    }

    @Override // defpackage.swn
    protected final void d() {
        p(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object g(Object obj, Throwable th);

    public abstract void h(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        syu syuVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((syuVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = syuVar instanceof szq ? ((szq) syuVar).m() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(syuVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objU = th == null ? ske.U(syuVar) : null;
        if (th == null) {
            e(objU);
            return;
        }
        if (!cls.isInstance(th)) {
            f(syuVar);
            return;
        }
        try {
            Object objG = g(obj, th);
            this.b = null;
            this.c = null;
            h(objG);
        } catch (Throwable th2) {
            try {
                ske.y(th2);
                a(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }

    @Override // defpackage.swn
    protected final String ez() {
        syu syuVar = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strEz = super.ez();
        String strBx = syuVar != null ? a.bx(syuVar, "inputFuture=[", "], ") : LmJPKwPBa.jLk;
        if (cls == null || obj == null) {
            if (strEz != null) {
                return strBx.concat(strEz);
            }
            return null;
        }
        return strBx + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }
}
