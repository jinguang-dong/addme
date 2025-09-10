package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mij implements fda {
    final /* synthetic */ Object a;
    final /* synthetic */ ejt b;
    private final /* synthetic */ int c;

    public mij(Object obj, ejt ejtVar, int i) {
        this.c = i;
        this.b = ejtVar;
        this.a = obj;
    }

    @Override // defpackage.fda
    public final syu a() {
        int i = this.c;
        ejt ejtVar = this.b;
        return i != 0 ? ske.M(new ovx(ejtVar.a)) : ske.M(new ovx(ejtVar.a));
    }

    @Override // defpackage.fda
    public final syu b() {
        return this.c != 0 ? ske.M(new eoz()) : ske.M(new eoz());
    }

    @Override // defpackage.fda
    public final syu c() {
        szh szhVar;
        if (this.c == 0) {
            return ((mik) this.a).o;
        }
        Object obj = this.a;
        synchronized (obj) {
            szhVar = ((fyl) obj).b;
            szhVar.getClass();
        }
        return szhVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void e() {
        if (this.c == 0) {
            mik mikVar = (mik) this.a;
            mikVar.u.d.a(true);
            mikVar.s.o(eoz.d());
            mikVar.g.g(false);
            return;
        }
        fyl fylVar = (fyl) this.a;
        fylVar.b();
        fylVar.a.d.a(true);
        fylVar.c.o(eoz.d());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void f() {
        if (this.c != 0) {
            fyl fylVar = (fyl) this.a;
            gau gauVar = fylVar.a;
            gauVar.d.a(true);
            gauVar.e.a(true);
            fylVar.c.o(eoz.c());
            return;
        }
        mik mikVar = (mik) this.a;
        mikVar.u.d.a(true);
        mikVar.w.a.a(true);
        mikVar.p = 2;
        mikVar.s.o(eoz.c());
        mikVar.g.g(false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    @Override // defpackage.fda
    public final void g() {
        if (this.c != 0) {
            fyl fylVar = (fyl) this.a;
            fylVar.a.e.a(true);
            fylVar.c.o(eoz.e());
            return;
        }
        mik mikVar = (mik) this.a;
        mikVar.w.a.a(true);
        mikVar.p = 2;
        mikVar.s.o(eoz.e());
    }

    @Override // defpackage.fda
    public final void h() {
        if (this.c != 0) {
            ((fyl) this.a).d(false, true);
        } else {
            ((mik) this.a).b(false, true);
        }
    }

    @Override // defpackage.fda
    public final void i() {
        if (this.c != 0) {
            ((fyl) this.a).d(true, true);
        } else {
            ((mik) this.a).b(true, true);
        }
    }

    @Override // defpackage.fda
    public final void j() {
        if (this.c != 0) {
            ((fyl) this.a).d(true, false);
        } else {
            ((mik) this.a).b(true, false);
        }
    }

    @Override // defpackage.fda
    public final /* synthetic */ void d() {
    }
}
