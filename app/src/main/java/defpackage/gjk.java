package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
class gjk extends gjy {
    final /* synthetic */ gjn b;

    public gjk(gjn gjnVar) {
        this.b = gjnVar;
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.h = this;
    }

    @Override // defpackage.gjw
    public final int e() {
        return 1;
    }

    @Override // defpackage.gjy, defpackage.gjw
    public void f() throws Resources.NotFoundException {
        gjn gjnVar = this.b;
        gjnVar.j.g();
        fvu fvuVar = gjnVar.e;
        if (!fvuVar.g) {
            fvuVar.a.x(false);
        }
        fvuVar.a.w();
        gjnVar.f.am();
        gjnVar.g.d(false);
        nql.b();
    }
}
