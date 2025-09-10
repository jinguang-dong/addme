package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hiv extends hin {
    final /* synthetic */ hiy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiv(hiy hiyVar) {
        super(hiyVar);
        this.b = hiyVar;
    }

    @Override // defpackage.hin, defpackage.him
    public final void e() {
        hiy hiyVar = this.b;
        mdb mdbVar = hiyVar.o;
        mdbVar.e();
        mdbVar.g(hiyVar.q);
    }

    @Override // defpackage.hin, defpackage.him
    public final void f(float f, hhy hhyVar) throws Resources.NotFoundException {
        hiy hiyVar = this.b;
        mdb mdbVar = hiyVar.o;
        mdbVar.e();
        super.f(f, hhyVar);
        mdbVar.g(hiyVar.r);
    }
}
