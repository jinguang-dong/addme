package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class swn extends swv {
    private static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    ske.x();
                }
                throw th;
            }
        }
        if (z) {
            ske.x();
        }
        return obj;
    }

    private final void h(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            if (objG == null) {
                sb.append("null");
            } else if (objG == this) {
                sb.append("this future");
            } else {
                sb.append(objG.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objG)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    static Object k(Object obj) throws ExecutionException {
        if (obj instanceof swg) {
            Throwable th = ((swg) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof swj) {
            throw new ExecutionException(((swj) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object l(syu syuVar) {
        Throwable thM;
        if (syuVar instanceof swl) {
            Object swgVar = ((swn) syuVar).valueField;
            if (swgVar instanceof swg) {
                swg swgVar2 = (swg) swgVar;
                if (swgVar2.c) {
                    Throwable th = swgVar2.d;
                    swgVar = th != null ? new swg(false, th) : swg.b;
                }
            }
            swgVar.getClass();
            return swgVar;
        }
        if ((syuVar instanceof szq) && (thM = ((szq) syuVar).m()) != null) {
            return new swj(thM);
        }
        boolean zIsCancelled = syuVar.isCancelled();
        if ((!f) && zIsCancelled) {
            swg swgVar3 = swg.b;
            swgVar3.getClass();
            return swgVar3;
        }
        try {
            Object objG = g(syuVar);
            return zIsCancelled ? new swg(false, new IllegalArgumentException(eld.b(syuVar, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : objG == null ? d : objG;
        } catch (Error | Exception e) {
            return new swj(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new swj(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(syuVar))), e2)) : new swg(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new swg(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(syuVar))), e3)) : new swj(e3.getCause());
        }
    }

    public static void n(swn swnVar, boolean z) {
        swk swkVar = null;
        while (true) {
            for (swu swuVarB = swv.g.b(swnVar, swu.a); swuVarB != null; swuVarB = swuVarB.next) {
                Thread thread = swuVarB.thread;
                if (thread != null) {
                    swuVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                swnVar.o();
            }
            swnVar.d();
            swk swkVar2 = swkVar;
            swk swkVarA = swv.g.a(swnVar, swk.a);
            swk swkVar3 = swkVar2;
            while (swkVarA != null) {
                swk swkVar4 = swkVarA.next;
                swkVarA.next = swkVar3;
                swkVar3 = swkVarA;
                swkVarA = swkVar4;
            }
            while (swkVar3 != null) {
                Runnable runnable = swkVar3.b;
                swkVar = swkVar3.next;
                runnable.getClass();
                if (runnable instanceof swh) {
                    swh swhVar = (swh) runnable;
                    swnVar = swhVar.a;
                    if (swnVar.valueField != swhVar || !u(swnVar, swhVar, l(swhVar.b))) {
                    }
                } else {
                    Executor executor = swkVar3.c;
                    executor.getClass();
                    i(runnable, executor);
                }
                swkVar3 = swkVar;
            }
            return;
            z = false;
        }
    }

    static boolean q(Object obj) {
        return !(obj instanceof swh);
    }

    public boolean a(Throwable th) {
        th.getClass();
        if (!u(this, null, new swj(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    @Override // defpackage.syu
    public void c(Runnable runnable, Executor executor) {
        swk swkVar;
        executor.getClass();
        if (!isDone() && (swkVar = this.listenersField) != swk.a) {
            swk swkVar2 = new swk(runnable, executor);
            do {
                swkVar2.next = swkVar;
                if (swv.g.e(this, swkVar, swkVar2)) {
                    return;
                } else {
                    swkVar = this.listenersField;
                }
            } while (swkVar != swk.a);
        }
        i(runnable, executor);
    }

    protected void d() {
    }

    protected boolean e(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!u(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String ez() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean f(syu syuVar) {
        swj swjVar;
        syuVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (syuVar.isDone()) {
                if (!u(this, null, l(syuVar))) {
                    return false;
                }
                n(this, false);
                return true;
            }
            swh swhVar = new swh(this, syuVar);
            if (u(this, null, swhVar)) {
                try {
                    syuVar.c(swhVar, sxo.a);
                } catch (Throwable th) {
                    try {
                        swjVar = new swj(th);
                    } catch (Error | Exception unused) {
                        swjVar = swj.a;
                    }
                    u(this, swhVar, swjVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof swg) {
            syuVar.cancel(((swg) obj).c);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return s();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof swg;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & q(obj);
    }

    @Override // defpackage.szq
    public final Throwable m() {
        if (!(this instanceof swl)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof swj) {
            return ((swj) obj).b;
        }
        return null;
    }

    protected void o() {
    }

    public final void p(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(r());
        }
    }

    protected final boolean r() {
        Object obj = this.valueField;
        return (obj instanceof swg) && ((swg) obj).c;
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof swh) {
                sb.append(", setFuture=[");
                syu syuVar = ((swh) obj).b;
                try {
                    if (syuVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(syuVar);
                    }
                } catch (Throwable th) {
                    ske.z(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = ez();
                    if (true == rnt.V(strConcat)) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    ske.z(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                h(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.valueField
            boolean r1 = r0 instanceof defpackage.swh
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5e
            boolean r1 = defpackage.swn.f
            if (r1 == 0) goto L20
            swg r1 = new swg
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            r5 = 0
            java.lang.String r5 = com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl.djmULOPAvz
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L2a
        L20:
            if (r7 == 0) goto L25
            swg r1 = defpackage.swg.a
            goto L27
        L25:
            swg r1 = defpackage.swg.b
        L27:
            r1.getClass()
        L2a:
            r4 = r2
        L2b:
            boolean r5 = u(r6, r0, r1)
            if (r5 == 0) goto L55
            n(r6, r7)
            boolean r6 = r0 instanceof defpackage.swh
            if (r6 == 0) goto L54
            swh r0 = (defpackage.swh) r0
            syu r6 = r0.b
            boolean r0 = r6 instanceof defpackage.swl
            if (r0 == 0) goto L51
            swn r6 = (defpackage.swn) r6
            java.lang.Object r0 = r6.valueField
            if (r0 != 0) goto L48
            r4 = r3
            goto L49
        L48:
            r4 = r2
        L49:
            boolean r5 = r0 instanceof defpackage.swh
            r4 = r4 | r5
            if (r4 == 0) goto L50
            r4 = r3
            goto L2b
        L50:
            return r3
        L51:
            r6.cancel(r7)
        L54:
            return r3
        L55:
            java.lang.Object r0 = r6.valueField
            boolean r5 = q(r0)
            if (r5 == 0) goto L2b
            return r4
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swn.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return t(j, timeUnit);
    }

    private static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", HHdu.DfurDysreWbec, "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }
}
