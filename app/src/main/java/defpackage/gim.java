package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gim extends gjk {
    final /* synthetic */ gip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gim(gip gipVar) {
        super(gipVar);
        this.a = gipVar;
    }

    @Override // defpackage.gjk, defpackage.gjy, defpackage.gjw
    public final void f() throws Resources.NotFoundException {
        gip gipVar = this.a;
        mdb mdbVar = gipVar.a;
        mdbVar.e();
        super.f();
        mdbVar.g(gipVar.c);
    }
}
