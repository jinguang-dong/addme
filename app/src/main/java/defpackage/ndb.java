package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndb {
    public final /* synthetic */ ndc a;
    private final Animator b;

    public ndb(ndc ndcVar, Animator animator) {
        this.a = ndcVar;
        this.b = animator;
    }

    final void a() {
        this.b.setStartDelay(150L);
    }

    final void b() {
        this.b.addListener(new nda(this));
    }

    final void c(rwc rwcVar) {
        if (rwcVar.h()) {
            this.b.addListener(new nky(new ldn(this, rwcVar, 6)));
        }
    }

    final void d(int i) {
        this.b.setDuration(i);
    }

    final void e() {
        this.b.setInterpolator(ndc.a);
    }

    final void f() {
        this.b.setInterpolator(this.a.s);
    }

    final void g() {
        this.b.setInterpolator(this.a.t);
    }

    final void h(rwc rwcVar) {
        if (rwcVar.h()) {
            this.b.addListener(new nkz(new ldn(this, rwcVar, 5)));
        }
    }

    final void i() {
        this.b.addListener(new ncz(this));
    }
}
