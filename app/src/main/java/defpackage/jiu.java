package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiu {
    final /* synthetic */ jiv a;
    private final Future b;
    private long c;
    private String e;
    private long d = 0;
    private final List f = new ArrayList();

    public jiu(jiv jivVar) {
        this.a = jivVar;
        this.c = 0L;
        this.b = jivVar.c.schedule(new jcq(this, 15), 60L, TimeUnit.SECONDS);
        this.c = SystemClock.elapsedRealtime();
    }

    public final synchronized void a() {
        long jElapsedRealtime;
        this.b.cancel(true);
        synchronized (this) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        }
        if (TimeUnit.MILLISECONDS.toNanos(jElapsedRealtime) > jiv.a) {
            jiv jivVar = this.a;
            List list = this.f;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.SLOW_PROCESSING_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = stm.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            stm stmVar = (stm) tphVar;
            stmVar.b = 1 | stmVar.b;
            stmVar.c = jElapsedRealtime;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            stm stmVar2 = (stm) tpcVarM2.b;
            tpw tpwVar = stmVar2.d;
            if (!tpwVar.c()) {
                stmVar2.d = tph.v(tpwVar);
            }
            tnq.e(list, stmVar2.d);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            mdy mdyVar = jivVar.d;
            sod sodVar2 = (sod) tpcVarM.b;
            stm stmVar3 = (stm) tpcVarM2.l();
            stmVar3.getClass();
            sodVar2.L = stmVar3;
            sodVar2.c |= 8192;
            mdyVar.I(tpcVarM);
        }
    }

    public final synchronized void b() {
        c(true);
    }

    public final synchronized void c(boolean z) {
        tpc tpcVarM = ste.a.m();
        String str = this.e;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ste steVar = (ste) tpcVarM.b;
        str.getClass();
        steVar.b |= 2;
        steVar.d = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ste steVar2 = (ste) tphVar;
        steVar2.b |= 1;
        steVar2.c = jElapsedRealtime;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        List list = this.f;
        ste steVar3 = (ste) tpcVarM.b;
        steVar3.b |= 4;
        steVar3.e = z;
        list.add((ste) tpcVarM.l());
        if (z) {
            this.a.b.b("Task is complete:".concat(String.valueOf(this.e)));
        } else {
            this.a.b.h("Task seems stuck:".concat(String.valueOf(this.e)));
        }
    }

    public final synchronized void d(String str) {
        this.a.b.b("Task started:".concat(str));
        this.d = SystemClock.elapsedRealtime();
        this.e = str;
    }
}
