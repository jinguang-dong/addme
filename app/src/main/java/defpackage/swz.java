package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class swz extends sxz implements Runnable {
    syu a;
    Object b;

    public swz(syu syuVar, Object obj) {
        syuVar.getClass();
        this.a = syuVar;
        this.b = obj;
    }

    public static syu i(syu syuVar, rvu rvuVar, Executor executor) {
        swy swyVar = new swy(syuVar, rvuVar);
        syuVar.c(swyVar, ske.C(executor, swyVar));
        return swyVar;
    }

    public static syu j(syu syuVar, sxi sxiVar, Executor executor) {
        swx swxVar = new swx(syuVar, sxiVar);
        syuVar.c(swxVar, ske.C(executor, swxVar));
        return swxVar;
    }

    @Override // defpackage.swn
    protected final void d() {
        p(this.a);
        this.a = null;
        this.b = null;
    }

    public abstract Object g(Object obj, Object obj2);

    public abstract void h(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        syu syuVar = this.a;
        Object obj = this.b;
        if ((isCancelled() | (syuVar == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (syuVar.isCancelled()) {
            f(syuVar);
            return;
        }
        try {
            try {
                Object objG = g(obj, ske.U(syuVar));
                this.b = null;
                h(objG);
            } catch (Throwable th) {
                try {
                    ske.y(th);
                    a(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            a(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            a(e2.getCause());
        } catch (Exception e3) {
            a(e3);
        }
    }

    @Override // defpackage.swn
    protected final String ez() {
        syu syuVar = this.a;
        Object obj = this.b;
        String strEz = super.ez();
        String strBx = syuVar != null ? a.bx(syuVar, "inputFuture=[", nWEkBGOQPWQp.ebN) : "";
        if (obj == null) {
            if (strEz != null) {
                return strBx.concat(strEz);
            }
            return null;
        }
        return strBx + "function=[" + obj.toString() + "]";
    }
}
