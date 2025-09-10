package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxf {
    public static Context a;
    private static volatile qxf j;
    private static volatile qxf k;
    public final Context c;
    public final rww d;
    public final rak e;
    public final rww f;
    public final qzw g;
    public final qqq h = new qqq();
    private final rww l;
    private final rww m;
    private final rww n;
    private static final Object i = new Object();
    public static final rww b = rnt.y(new qxd(0));

    public qxf(Context context, rww rwwVar, rww rwwVar2, rww rwwVar3, rww rwwVar4, rww rwwVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        rwwVar.getClass();
        rwwVar2.getClass();
        rwwVar3.getClass();
        rwwVar4.getClass();
        rwwVar5.getClass();
        rww rwwVarY = rnt.y(rwwVar);
        rww rwwVarY2 = rnt.y(rwwVar2);
        rww rwwVarY3 = rnt.y(new fvq(rwwVar3, 19));
        rww rwwVarY4 = rnt.y(rwwVar4);
        rww rwwVarY5 = rnt.y(rwwVar5);
        this.c = applicationContext;
        this.l = rwwVarY;
        this.m = rwwVarY2;
        this.d = rwwVarY3;
        this.n = rwwVarY4;
        this.e = new rak(applicationContext, rwwVarY, rwwVarY4, rwwVarY2);
        this.f = rwwVarY5;
        this.g = new qzw(applicationContext, rwwVarY, rwwVarY3, rwwVarY2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qxf a(Context context) {
        boolean z;
        qxf qxfVar = j;
        if (qxfVar != null) {
            return qxfVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Object applicationContext2 = applicationContext.getApplicationContext();
            if (!(applicationContext2 instanceof tzp)) {
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext2.getClass()))));
            }
            try {
                try {
                    return (qxf) ((rwg) ((qxe) qxe.class.cast(((tzp) applicationContext2).a())).e()).a;
                } catch (IllegalStateException unused) {
                    z = true;
                    synchronized (i) {
                        if (j != null) {
                            return j;
                        }
                        rwc rwcVarE = rvk.a;
                        boolean z2 = applicationContext instanceof qxe;
                        if (z2) {
                            rwcVarE = ((qxe) applicationContext).e();
                        }
                        qxf qxfVar2 = (qxf) rwcVarE.d(new fvq(applicationContext, 16));
                        j = qxfVar2;
                        if (!z && !z2) {
                            qpt.x(Level.CONFIG, qxfVar2.b(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        return qxfVar2;
                    }
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
            }
        } catch (IllegalStateException unused2) {
            z = false;
        }
    }

    public static void c(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                d();
                qpt.x(Level.WARNING, (Executor) b.fr(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void d() {
        qxh.a();
        if (a == null && qxh.a == null) {
            qxh.a = new qxg();
        }
    }

    public final syx b() {
        return (syx) this.l.fr();
    }

    public final qqe e() {
        return (qqe) this.m.fr();
    }

    public final lat f() {
        return (lat) this.n.fr();
    }
}
