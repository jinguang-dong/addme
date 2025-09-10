package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class los implements mho {
    private final mho a;

    public los(Executor executor, owq owqVar, owq owqVar2, mhp mhpVar) {
        mhs mhsVar = new mhs();
        mhsVar.g(mhpVar);
        mhsVar.d("liveRectiface");
        mhsVar.f(new lor(owqVar, owqVar2, 1));
        mhsVar.e(new lor(owqVar, owqVar2, 0));
        mhsVar.c(executor);
        this.a = mhsVar.a();
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        this.a.d(mhpVar);
    }
}
