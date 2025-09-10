package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyh implements hyg {
    public final owq a;
    public final owf b;
    public final ovx c;
    private boolean d = false;
    private final owq e = new ovx(false);
    private boolean f = false;
    private final List g = new CopyOnWriteArrayList();

    public hyh(owf owfVar, owf owfVar2, owf owfVar3, fuf fufVar, fqg fqgVar, out outVar) {
        ovx ovxVar = new ovx(false);
        this.a = ovxVar;
        ovx ovxVar2 = new ovx(false);
        this.c = ovxVar2;
        this.b = owb.a(owl.c(owfVar, ovxVar, ovxVar2));
        if (fufVar.a) {
            fqgVar.b.d(owfVar2.dK(new glc(this, owfVar3, 13), outVar));
        }
    }

    @Override // defpackage.hyg
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.e.a(Boolean.valueOf(z));
        if (this.f != z && (!z4 || !z)) {
            this.f = z;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((hyg) it.next()).a(z, z2, z3, z4);
        }
    }

    @Override // defpackage.hyg
    public final void b(boolean z) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((hyg) it.next()).b(z);
        }
    }

    @Override // defpackage.hyg
    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((hyg) it.next()).c();
        }
    }

    public final owf d() {
        return owb.a(this.a);
    }

    public final synchronized owf e() {
        return owb.a(this.e);
    }

    public final synchronized paq f(hyg hygVar) {
        List list = this.g;
        if (list.contains(hygVar)) {
            return new pan(0);
        }
        list.add(hygVar);
        return new hty(this, hygVar, 3, null);
    }

    public final synchronized void g(hyg hygVar) {
        this.g.remove(hygVar);
    }

    public final void h() {
        a(false, false, false, false);
    }

    public final synchronized void i(boolean z) {
        this.c.a(Boolean.valueOf(z));
    }

    public final synchronized void j(boolean z) {
        this.d = z;
    }

    public final synchronized boolean k() {
        return ((Boolean) ((ovx) this.e).d).booleanValue();
    }

    public final synchronized boolean l() {
        return this.f;
    }

    public final synchronized boolean m() {
        return this.d;
    }
}
