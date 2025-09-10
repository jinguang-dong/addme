package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzi implements pdn {
    public final pdn b;
    public final Executor c;
    public pdn d;
    public boolean e;
    private final pdv g;
    private final int h;
    private final pfu i;
    public final List a = new ArrayList();
    public final pdm f = new kzh(this, 0);

    public kzi(pfu pfuVar, our ourVar, Executor executor, pdv pdvVar, int i, owf owfVar) {
        this.i = pfuVar;
        this.c = executor;
        this.g = pdvVar;
        this.h = i;
        kzg kzgVar = new kzg(pdvVar, i);
        this.b = kzgVar;
        if (((Boolean) owfVar.dL()).booleanValue()) {
            this.d = r();
        } else {
            this.d = kzgVar;
        }
        ourVar.d(owfVar.dK(new fun(this, pfuVar, 19), sxo.a));
    }

    @Override // defpackage.pdn
    public final synchronized int a() {
        return this.d.a();
    }

    @Override // defpackage.pdn
    public final synchronized int b() {
        return this.d.b();
    }

    @Override // defpackage.pdn
    public final synchronized pdk c() {
        return this.d.c();
    }

    @Override // defpackage.pdn, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.a.clear();
        this.d.m(this.f);
        kzz.k(this.i, this.d);
        this.d.close();
        this.d = this.b;
    }

    @Override // defpackage.pdn
    public final synchronized pdk d(rwe rweVar) {
        return this.d.d(rweVar);
    }

    @Override // defpackage.pdn
    public final synchronized pdk e() {
        return this.d.e();
    }

    @Override // defpackage.pdn
    public final synchronized pdk f(rwe rweVar) {
        return this.d.f(rweVar);
    }

    @Override // defpackage.pdn
    public final synchronized pdk g() {
        return this.d.g();
    }

    @Override // defpackage.pdn
    public final synchronized pdk h() {
        return this.d.h();
    }

    @Override // defpackage.pdn
    public final synchronized pdv i() {
        return this.g;
    }

    @Override // defpackage.pdn
    public final synchronized List j() {
        return this.d.j();
    }

    @Override // defpackage.pdn
    public final synchronized List k() {
        return this.d.k();
    }

    @Override // defpackage.pdn
    public final synchronized void l(pdm pdmVar) {
        this.a.add(pdmVar);
    }

    @Override // defpackage.pdn
    public final synchronized void m(pdm pdmVar) {
        this.a.remove(pdmVar);
    }

    @Override // defpackage.pdn
    public final synchronized void n(int i) {
        this.d.n(i);
    }

    @Override // defpackage.pdn
    public final synchronized boolean o(pdo pdoVar) {
        return this.d.o(pdoVar);
    }

    @Override // defpackage.pdn
    public final synchronized void p() {
        throw null;
    }

    @Override // defpackage.pdn
    public final synchronized void q(rnu rnuVar) {
        this.d.q(rnuVar);
    }

    public final pdn r() {
        pfu pfuVar = this.i;
        pfuVar.getClass();
        pdv pdvVar = this.g;
        pdvVar.getClass();
        pdn pdnVarC = pfuVar.c(pdvVar, this.h);
        pdnVarC.l(this.f);
        return pdnVarC;
    }
}
