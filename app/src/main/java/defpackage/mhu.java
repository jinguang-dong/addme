package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhu implements mho {
    public final owf a;
    private final mho b;

    public mhu(Executor executor, owq owqVar, mhp mhpVar) {
        this.a = owb.a(owqVar);
        mhs mhsVar = new mhs();
        mhsVar.c(executor);
        mhsVar.d("PortraitTeleStream");
        mhsVar.e(new lac(owqVar, 14));
        mhsVar.f(new lac(owqVar, 15));
        mhsVar.g(mhpVar);
        this.b = mhsVar.a();
    }

    @Override // defpackage.mho
    public final synchronized void d(mhp mhpVar) {
        this.b.d(mhpVar);
    }
}
