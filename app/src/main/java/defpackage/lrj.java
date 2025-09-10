package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrj implements pow {
    public final /* synthetic */ lrl a;

    public lrj(lrl lrlVar) {
        this.a = lrlVar;
    }

    @Override // defpackage.pow
    public final void a() {
        lrl lrlVar = this.a;
        lrlVar.K("Mediagroup.Listener#onAbandoned: ".concat(lrlVar.q.toString()));
        lrlVar.b.h(lrlVar.f.b, "onAbandoned");
        lrlVar.s.cancel(false);
    }

    @Override // defpackage.pow
    public final void b(Throwable th) {
        lrl lrlVar = this.a;
        lrlVar.K("Mediagroup.Listener#onError: " + lrlVar.q.toString() + ": " + th.toString());
        lrlVar.b.h(lrlVar.f.b, "onError");
        lrlVar.s.a(th);
        lrlVar.g.h(lrlVar.x, lrlVar.y, th);
        lrlVar.P(nfo.a);
    }

    @Override // defpackage.pow
    public final void c() {
        lrl lrlVar = this.a;
        hem hemVar = lrlVar.b;
        long j = lrlVar.f.b;
        hemVar.h(j, "onPublished");
        lrlVar.i.e(SystemClock.elapsedRealtime());
        lrlVar.E.r(3, 4);
        lrlVar.W(par.a, true);
        lrlVar.g.i(lrlVar.x, lrlVar.y);
        ske.W(hemVar.c(j), new fxw(this, 9), sxo.a);
    }

    @Override // defpackage.pow
    public final void d() {
        gzi gziVar = gzo.a;
    }
}
