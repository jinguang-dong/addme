package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class evi implements eqv, equ {
    private final List a;
    private final cnj b;
    private int c;
    private epb d;
    private equ e;
    private List f;
    private boolean g;

    public evi(List list, cnj cnjVar) {
        this.b = cnjVar;
        eoz.i(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            eoz.k(this.f);
            this.e.e(new ess("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.eqv
    public final Class a() {
        return ((eqv) this.a.get(0)).a();
    }

    @Override // defpackage.equ
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.eqv
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eqv) it.next()).d();
        }
    }

    @Override // defpackage.eqv
    public final void dE() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eqv) it.next()).dE();
        }
    }

    @Override // defpackage.equ
    public final void e(Exception exc) {
        List list = this.f;
        eoz.k(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        this.d = epbVar;
        this.e = equVar;
        this.f = (List) this.b.a();
        ((eqv) this.a.get(this.c)).f(epbVar, this);
        if (this.g) {
            dE();
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return ((eqv) this.a.get(0)).g();
    }
}
