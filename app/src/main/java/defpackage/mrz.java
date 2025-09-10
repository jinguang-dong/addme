package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
class mrz extends mry {
    final /* synthetic */ msd b;

    public mrz(msd msdVar) {
        this.b = msdVar;
    }

    @Override // defpackage.mry, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        msd msdVar = this.b;
        msdVar.e.k();
        mzz mzzVar = msdVar.c;
        mzzVar.m(false);
        mzzVar.w(false);
        msdVar.d.a(true);
    }

    @Override // defpackage.mry, defpackage.mcz, defpackage.mda
    public final void b() {
        this.b.d.a(false);
    }

    @Override // defpackage.mry
    public void c() {
        msd msdVar = this.b;
        msdVar.a.w();
        msdVar.b.g();
    }

    @Override // defpackage.mry
    public void d() {
        this.b.b.ae();
    }
}
