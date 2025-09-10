package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcl implements mcq, ksf {
    public final Context a;
    public final out b;
    public final owf c;
    public boolean d = false;
    public paq e;
    public paq f;
    public final imi g;
    public final kqy h;
    private final owf i;
    private final owq j;
    private final gag k;
    private final krj l;
    private final luj m;
    private final luj n;

    public mcl(Context context, out outVar, imi imiVar, krj krjVar, kqy kqyVar, luj lujVar, luj lujVar2, owf owfVar, owq owqVar, gag gagVar, owf owfVar2) {
        this.a = context;
        this.b = outVar;
        this.g = imiVar;
        this.l = krjVar;
        this.h = kqyVar;
        this.m = lujVar;
        this.n = lujVar2;
        this.i = owfVar;
        this.j = owqVar;
        this.k = gagVar;
        this.c = owfVar2;
    }

    public final void d() {
        paq paqVar = this.e;
        if (paqVar != null) {
            paqVar.close();
            this.e = null;
        }
        paq paqVar2 = this.f;
        if (paqVar2 != null) {
            paqVar2.close();
            this.f = null;
        }
    }

    @Override // defpackage.mcq
    public final void e() {
        this.n.d(luf.ab, true);
    }

    @Override // defpackage.mcq
    public final void f() {
        this.b.execute(new man(this, 8));
    }

    @Override // defpackage.mcq
    public final void g() {
        this.l.g(this);
    }

    @Override // defpackage.mcq
    public final void h() {
        this.l.l(this);
        d();
    }

    @Override // defpackage.mcq
    public final boolean i() {
        return j();
    }

    public final boolean j() {
        return (!pka.BACK.equals(((ovx) this.i).d) || this.l.t() || ((Boolean) this.m.b(luf.ab)).booleanValue() || this.d || !((Boolean) this.j.dL()).booleanValue() || !((ltv) this.k.dL()).equals(ltv.OFF) || ((fyx) this.c.dL()).a()) ? false : true;
    }

    @Override // defpackage.mcq
    public final int k() {
        return 2;
    }

    @Override // defpackage.ksf
    public final void a() {
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void c() {
    }
}
