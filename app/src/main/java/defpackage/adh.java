package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adh implements bbo {
    public final adk a;
    public uiq b;
    public uiq c;
    final /* synthetic */ adi d;

    public adh(adi adiVar, adk adkVar, uiq uiqVar, uiq uiqVar2) {
        this.d = adiVar;
        this.a = adkVar;
        this.b = uiqVar;
        this.c = uiqVar2;
    }

    @Override // defpackage.bbo
    public final Object a() {
        b(this.d.b.s());
        return this.a.a();
    }

    public final void b(adj adjVar) {
        Object objA = this.c.a(adjVar.b);
        if (this.d.b.r()) {
            this.a.n(this.c.a(adjVar.a), objA, (acn) this.b.a(adjVar));
            return;
        }
        adk adkVar = this.a;
        acn acnVar = (acn) this.b.a(adjVar);
        if (adkVar.a && a.ao(objA, null)) {
            return;
        }
        if (a.ao(adkVar.f(), objA) && adkVar.b() == -1.0f) {
            return;
        }
        adkVar.k(objA);
        adkVar.g(acnVar);
        adkVar.m(adkVar.b() == -3.0f ? objA : adkVar.a(), !adkVar.o());
        adkVar.i(adkVar.b() == -3.0f);
        if (adkVar.b() >= 0.0f) {
            adkVar.l(adkVar.e().d((long) (adkVar.e().a() * adkVar.b())));
        } else if (adkVar.b() == -3.0f) {
            adkVar.l(objA);
        }
        adkVar.a = false;
        adkVar.j(-1.0f);
    }
}
