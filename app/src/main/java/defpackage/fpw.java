package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpw implements paq {
    private ene a;

    public fpw(Context context) {
        this.a = enf.a(context);
    }

    public final synchronized enn a() {
        ene eneVar;
        eneVar = this.a;
        eneVar.getClass();
        return eneVar.b();
    }

    public final synchronized void b(Handler handler, int i, emw emwVar) {
        ene eneVar = this.a;
        eneVar.getClass();
        try {
            eneVar.e().a(new glk(eneVar, i, handler, emwVar, 1));
        } catch (RuntimeException e) {
            eneVar.c().c(e);
        }
    }

    public final synchronized void c(enr enrVar) {
        ene eneVar = this.a;
        eneVar.getClass();
        eneVar.f(enrVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
        enf.b();
    }

    public final synchronized void d(boolean z) {
        ene eneVar = this.a;
        eneVar.getClass();
        eneVar.g(z);
    }
}
