package defpackage;

import android.os.Looper;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dco {
    public volatile dfa a;
    public und b;
    public Executor c;
    public Executor d;
    public dcf e;
    public boolean f;
    public dbw i;
    public final got j = new got(new nt(this, 6, (float[]) null));
    private final ThreadLocal k = new ThreadLocal();
    public final Map g = new LinkedHashMap();
    public boolean h = true;

    private final Object w(uif uifVar) {
        if (!q()) {
            return dei.a(this, false, true, new asj(uifVar, 13));
        }
        l();
        try {
            Object objA = uifVar.a();
            p();
            return objA;
        } finally {
            n();
        }
    }

    protected abstract dcf a();

    public final dcf b() {
        dcf dcfVar = this.e;
        if (dcfVar != null) {
            return dcfVar;
        }
        ujp.c("internalTracker");
        return null;
    }

    protected dcq c() {
        throw new ueu((byte[]) null);
    }

    @ueo
    public dfe d(dbx dbxVar) {
        throw new ueu((byte[]) null);
    }

    public final dfe e() {
        dbw dbwVar = this.i;
        if (dbwVar == null) {
            ujp.c("connectionManager");
            dbwVar = null;
        }
        dfe dfeVarB = dbwVar.b();
        if (dfeVarB != null) {
            return dfeVarB;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object f(Callable callable) {
        return w(new ats(callable, 13));
    }

    protected Map g() {
        return ufx.a;
    }

    @ueo
    public Set h() {
        return ufy.a;
    }

    public final und i() {
        und undVar = this.b;
        if (undVar != null) {
            return undVar;
        }
        ujp.c("coroutineScope");
        return null;
    }

    public final void k() {
        if (q() && !r() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @ueo
    public final void l() {
        j();
        j();
        dfa dfaVarB = e().b();
        if (!dfaVarB.i()) {
            cwy.g(new crd(b(), (uhb) null, 4));
        }
        if (((dfj) dfaVarB).d.isWriteAheadLoggingEnabled()) {
            dfaVarB.e();
        } else {
            dfaVarB.d();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, uif] */
    public final void m() {
        got gotVar = this.j;
        synchronized (gotVar) {
            if (((AtomicBoolean) gotVar.b).compareAndSet(false, true)) {
                while (((AtomicInteger) gotVar.c).get() != 0) {
                }
                gotVar.a.a();
            }
        }
    }

    public final void n() {
        e().b().f();
        if (r()) {
            return;
        }
        dcf dcfVarB = b();
        dcfVarB.b.f(dcfVarB.e, dcfVarB.f);
    }

    public final void o(Runnable runnable) {
        w(new ats(runnable, 12));
    }

    @ueo
    public final void p() {
        e().b().h();
    }

    public final boolean q() {
        dbw dbwVar = this.i;
        if (dbwVar == null) {
            ujp.c("connectionManager");
            dbwVar = null;
        }
        return dbwVar.b() != null;
    }

    public final boolean r() {
        return s() && e().b().i();
    }

    public final boolean s() {
        dbw dbwVar = this.i;
        if (dbwVar == null) {
            ujp.c("connectionManager");
            dbwVar = null;
        }
        dfa dfaVar = dbwVar.d;
        if (dfaVar != null) {
            return dfaVar.j();
        }
        return false;
    }

    public final void t(ddo ddoVar) throws Exception {
        dcf dcfVarB = b();
        ddi ddiVar = dcfVarB.b;
        ddw ddwVarA = ddoVar.a("PRAGMA query_only");
        try {
            ddwVarA.j();
            boolean zL = ddwVarA.l();
            ske.ay(ddwVarA, null);
            if (!zL) {
                cog.p(ddoVar, "PRAGMA temp_store = MEMORY");
                cog.p(ddoVar, "PRAGMA recursive_triggers = 1");
                cog.p(ddoVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ddiVar.c) {
                    cog.p(ddoVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    cog.p(ddoVar, ujp.z("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                owd owdVar = ddiVar.g;
                ReentrantLock reentrantLock = (ReentrantLock) owdVar.b;
                reentrantLock.lock();
                try {
                    owdVar.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (dcfVarB.g) {
                cpn cpnVar = dcfVarB.h;
            }
        } finally {
        }
    }

    @ueo
    public List u() {
        return ufw.a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [dfe, java.lang.Object] */
    public final Object v(uiu uiuVar, uhb uhbVar) {
        dbw dbwVar = this.i;
        if (dbwVar == null) {
            ujp.c("connectionManager");
            dbwVar = null;
        }
        return uiuVar.a(new dds(new ddo(dbwVar.e.a.a.b())), uhbVar);
    }

    public final void j() {
        if (!this.f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException(oUZhwRhE.rvKNpz);
        }
    }
}
