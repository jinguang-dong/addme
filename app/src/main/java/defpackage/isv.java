package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class isv implements syf {
    final /* synthetic */ isx a;
    final /* synthetic */ isw b;

    public isv(isw iswVar, isx isxVar) {
        this.a = isxVar;
        this.b = iswVar;
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        shl shlVar = shx.a;
        Object obj2 = this.b.c;
        synchronized (obj2) {
            isx isxVar = this.a;
            isxVar.e.e(true);
            ((isy) obj2).g.remove(isxVar.a);
        }
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        ((sgt) ((sgt) ((sgt) isy.a.b().h(shx.a, IQwwK.vfqGmThfSFWXUP)).i(th)).M(2274)).s("Encoder writing failed");
        Object obj = this.b.c;
        synchronized (obj) {
            isx isxVar = this.a;
            isxVar.e.a(th);
            ((isy) obj).g.remove(isxVar.a);
        }
    }
}
