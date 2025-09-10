package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientDelegate;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffk implements fev {
    public final ffm a;
    public final Resources b;
    public final owf c;
    public final Handler d;
    public final owf f;
    public boolean g;
    public final owq h;
    public rwc j;
    public rwc k;
    public rwc l;
    public fex m;
    public int n;
    public final fqg o;
    public fey p;
    public final mdy q;
    public final hbj r;
    public final AmbientDelegate s;
    public final ejt u;
    private final Runnable v;
    private final boolean w;
    private final long x;
    public final Map e = new ConcurrentHashMap();
    public final ezh t = new ffi(this);
    public AtomicInteger i = new AtomicInteger(0);

    public ffk(ejt ejtVar, ffm ffmVar, AmbientDelegate ambientDelegate, ezh ezhVar, Resources resources, mdy mdyVar, hbj hbjVar, fqg fqgVar, pjp pjpVar, luj lujVar, owf owfVar) {
        rvk rvkVar = rvk.a;
        this.j = rvkVar;
        this.k = rvkVar;
        this.l = rvkVar;
        ejtVar.getClass();
        this.u = ejtVar;
        this.s = ambientDelegate;
        ffmVar.getClass();
        this.a = ffmVar;
        ezhVar.getClass();
        this.b = resources;
        owq owqVarA = lujVar.a(luf.c);
        this.c = owqVarA;
        this.q = mdyVar;
        this.r = hbjVar;
        this.o = fqgVar;
        this.w = hbjVar.p(gyg.i);
        this.f = owfVar;
        this.x = 2500L;
        this.d = new Handler(Looper.getMainLooper());
        this.v = new eao(this, ffmVar, 19, (char[]) null);
        this.n = 2;
        this.h = ffmVar.a;
        fqgVar.b.d(owqVarA.dK(new ffj(pjpVar, ffmVar, ambientDelegate), sxo.a));
    }

    public final void a() {
        this.g = false;
        this.d.removeCallbacks(this.v);
        ffm ffmVar = this.a;
        ffmVar.b.a(false);
        ffmVar.a.a(0);
    }

    @Override // defpackage.fev
    public final fes b() {
        return this.a;
    }

    @Override // defpackage.fev
    public final void c() {
        if (h()) {
            a();
            fex fexVar = this.m;
            if (fexVar != null) {
                fexVar.a();
            }
        }
    }

    @Override // defpackage.fev
    public final void d(pjr pjrVar) {
        if (this.w) {
            return;
        }
        this.s.x(this.a.d(pjrVar));
        this.n = 2;
        this.i = new AtomicInteger(0);
        this.h.a(15);
        g();
    }

    @Override // defpackage.fev
    public final void e(pjo pjoVar) {
        this.j = rwc.j(pjoVar);
    }

    @Override // defpackage.fev
    public final void f(fey feyVar) {
        this.p = feyVar;
    }

    public final void g() {
        this.g = true;
        Handler handler = this.d;
        Runnable runnable = this.v;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.x);
    }

    public final boolean h() {
        fex fexVar = this.m;
        if (fexVar != null) {
            return fexVar.c() == 1 || fexVar.c() == 2;
        }
        return false;
    }
}
