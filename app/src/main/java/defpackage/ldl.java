package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldl implements hzi, iam {
    public static final sgv a = sgv.g("ldl");
    public final tzj b;
    public final pas c;
    public final lat d;
    public final iob e;
    public long f;
    public int g;
    public int h;
    public boolean i;
    public hxu j;
    private final hxv k;
    private final Executor l;
    private boolean m;
    private final iso n;

    public ldl(tzj tzjVar, pas pasVar, hxv hxvVar, lat latVar, Executor executor, iso isoVar, iob iobVar) {
        this.b = tzjVar;
        this.c = pasVar;
        this.k = hxvVar;
        this.d = latVar;
        this.l = executor;
        this.n = isoVar;
        this.e = iobVar;
    }

    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        this.i = false;
        this.m = false;
    }

    @Override // defpackage.hzi
    public final synchronized void b(iby ibyVar, lau lauVar) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.h++;
            if (!this.i || !this.m) {
                lauVar.close();
            } else {
                this.l.execute(new lqd((Object) this, (Object) ibyVar, (Object) lauVar, 1, (byte[]) null));
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        this.j = this.k.a();
        if (burstSpec != null) {
            this.g = (int) burstSpec.c().a();
            this.h = 0;
        }
    }

    @Override // defpackage.hzi
    public final synchronized void d(iby ibyVar, BurstSpec burstSpec) {
        this.i = false;
        this.m = false;
    }

    public final synchronized void f(long j) {
        this.i = true;
        this.f = j;
        if (j >= 30000) {
            this.m = true;
        }
    }

    public final synchronized void g(iby ibyVar) {
        if (this.i) {
            this.l.execute(new kee(this, ibyVar, 14, null));
        }
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        this.n.f(ltdVar).f(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        a(ibyVar.x.b.l());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }
}
