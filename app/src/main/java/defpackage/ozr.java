package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ozr implements Callable {
    final /* synthetic */ oyk a;
    final /* synthetic */ ozv b;

    public ozr(ozv ozvVar, oyk oykVar) {
        this.a = oykVar;
        this.b = ozvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ozv ozvVar = this.b;
        synchronized (ozvVar.a) {
            boolean z = true;
            if (ozvVar.c != 1) {
                z = false;
            }
            rnt.L(z);
            ozp ozpVar = ozvVar.b;
            ozpVar.s(new ozq(this.a));
            ozpVar.B();
            ges gesVar = ozvVar.d;
            if (gesVar != null) {
                gesVar.b(ozpVar.a());
            }
            ozvVar.c = 2;
        }
        return null;
    }
}
