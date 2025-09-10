package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
final class his extends hij {
    final /* synthetic */ hiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public his(hiu hiuVar) {
        super(hiuVar);
        this.b = hiuVar;
    }

    @Override // defpackage.hij, defpackage.hig
    public final void c() {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        mdbVar.g(hiuVar.g);
    }

    @Override // defpackage.hij, defpackage.hig
    public final void f(boolean z, boolean z2) throws Resources.NotFoundException {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        super.f(z, z2);
        mdbVar.g(hiuVar.i);
    }
}
