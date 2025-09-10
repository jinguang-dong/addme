package defpackage;

import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npw implements poo {
    public final poo a;
    public final npx b;
    public final sgh c = new sgh();

    public npw(poo pooVar, npx npxVar) {
        this.a = pooVar;
        this.b = npxVar;
    }

    @Override // defpackage.poo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.poo
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.poo
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.poo, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.d();
    }

    @Override // defpackage.poo
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.poo
    public final Surface e() {
        return this.a.e();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.AutoCloseable, poj] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.AutoCloseable, poj] */
    @Override // defpackage.poo
    public final poj f() {
        if (this.b.k()) {
            return this.c.c();
        }
        poj pojVarF = this.a.f();
        if (pojVarF == null) {
            return this.c.c();
        }
        this.c.d();
        return pojVarF;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.AutoCloseable, poj] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.AutoCloseable, poj] */
    @Override // defpackage.poo
    public final poj g() {
        if (this.b.k()) {
            return this.c.c();
        }
        ?? C = this.c.c();
        return C == 0 ? this.a.g() : C;
    }

    @Override // defpackage.poo
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.poo
    public final void i(final pon ponVar, Handler handler) {
        this.a.i(new pon() { // from class: npu
            @Override // defpackage.pon
            public final void eS() {
                npw npwVar = this.a;
                npx npxVar = npwVar.b;
                if (npxVar.k()) {
                    poj pojVarF = npwVar.a.f();
                    if (pojVarF != null) {
                        pkf pkfVar = new pkf(pojVarF);
                        poj pojVarK = pkfVar.k();
                        if (pojVarK == null) {
                            throw new NullPointerException("Never null: The ref-count of the image is always non-zero.");
                        }
                        npxVar.h(pojVarK);
                        AutoCloseable autoCloseableB = npwVar.c.b(pkfVar);
                        if (autoCloseableB != null) {
                            ((pkf) autoCloseableB).l();
                        }
                    }
                } else {
                    npwVar.c.d();
                }
                ponVar.eS();
            }
        }, handler);
    }
}
