package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mco implements mcq, ksf {
    public final Context a;
    public final out b;
    public boolean c = false;
    public paq d;
    public final kqy e;
    public final imi f;
    private final owf g;
    private paq h;
    private final krj i;
    private final luj j;
    private final luj k;

    public mco(Context context, krj krjVar, kqy kqyVar, out outVar, imi imiVar, luj lujVar, luj lujVar2, owf owfVar) {
        this.a = context;
        this.i = krjVar;
        this.e = kqyVar;
        this.b = outVar;
        this.f = imiVar;
        this.j = lujVar;
        this.k = lujVar2;
        this.g = owfVar;
    }

    private final boolean j() {
        return ((Boolean) this.j.b(luf.aa)).booleanValue() || this.c;
    }

    public final boolean d() {
        return (!pka.FRONT.equals(((ovx) this.g).d) || this.i.t() || j()) ? false : true;
    }

    @Override // defpackage.mcq
    public final void e() {
        this.k.d(luf.aa, true);
    }

    @Override // defpackage.mcq
    public final void g() {
        this.i.g(this);
        if (j()) {
            return;
        }
        this.h = this.g.dK(new lld(this, 13), this.b);
    }

    @Override // defpackage.mcq
    public final void h() {
        this.i.l(this);
        paq paqVar = this.h;
        if (paqVar != null) {
            paqVar.close();
            this.h = null;
        }
        paq paqVar2 = this.d;
        if (paqVar2 != null) {
            paqVar2.close();
            this.d = null;
        }
    }

    @Override // defpackage.mcq
    public final boolean i() {
        return false;
    }

    @Override // defpackage.mcq
    public final int k() {
        return 1;
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

    @Override // defpackage.mcq
    public final void f() {
    }
}
