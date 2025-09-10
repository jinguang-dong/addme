package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
class hii extends hig {
    final /* synthetic */ hil a;

    public hii(hil hilVar) {
        this.a = hilVar;
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        hil hilVar = this.a;
        hilVar.a.setVisibility(8);
        hilVar.d.k();
    }

    @Override // defpackage.hig
    public void d(int i, int i2, float f) {
        hiq hiqVar = this.a.d;
        hiqVar.g = i;
        hiqVar.h = i2 - i;
        hiqVar.i = f;
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void b() {
    }
}
