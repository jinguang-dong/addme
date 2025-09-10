package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayf extends ayk {
    public final Set a = new LinkedHashSet();
    public final azr b = new azz(bfk.d, bap.a);
    final /* synthetic */ ayg c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public ayf(ayg aygVar, long j, boolean z, boolean z2) {
        this.c = aygVar;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.ayk
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ayk
    public final ayj b() {
        return this.c.x;
    }

    @Override // defpackage.ayk
    public final uhf c() {
        return this.c.b.c();
    }

    @Override // defpackage.ayk
    public final void d(azq azqVar) {
        this.c.b.d(azqVar);
    }

    public final void e() {
        Set<ayg> set = this.a;
        if (set.isEmpty()) {
            return;
        }
        Set set2 = this.g;
        if (set2 != null) {
            for (ayg aygVar : set) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(aygVar.c);
                }
            }
        }
        set.clear();
    }

    @Override // defpackage.ayk
    public final void f() {
        ayg aygVar = this.c;
        aygVar.l--;
    }

    @Override // defpackage.ayk
    public final void g(Set set) {
        Set hashSet = this.g;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.g = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.ayk
    public final void h(ayc aycVar) {
        this.a.add(aycVar);
    }

    @Override // defpackage.ayk
    public final void i() {
        this.c.l++;
    }

    @Override // defpackage.ayk
    public final void j(ayc aycVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((ayg) aycVar).c);
            }
        }
        Set set2 = this.a;
        ukc.f(set2);
        set2.remove(aycVar);
    }

    @Override // defpackage.ayk
    public final boolean k() {
        return this.c.b.k();
    }

    @Override // defpackage.ayk
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.ayk
    public final boolean m() {
        return this.f;
    }

    @Override // defpackage.ayk
    public final bfk n() {
        return (bfk) this.b.a();
    }

    @Override // defpackage.ayk
    public final void o(ayn aynVar, uiu uiuVar) {
        this.c.b.o(aynVar, uiuVar);
    }

    @Override // defpackage.ayk
    public final void p(ayn aynVar) {
        ayg aygVar = this.c;
        ayk aykVar = aygVar.b;
        aykVar.p(aygVar.x);
        aykVar.p(aynVar);
    }

    @Override // defpackage.ayk
    public final void q(ayn aynVar) {
        this.c.b.q(aynVar);
    }

    @Override // defpackage.ayk
    public final void r(ayn aynVar) {
        this.c.b.r(aynVar);
    }

    @Override // defpackage.ayk
    public final ejs s(azq azqVar) {
        return this.c.b.s(azqVar);
    }

    @Override // defpackage.ayk
    public final void t(azq azqVar, ejs ejsVar, axr axrVar) {
        this.c.b.t(azqVar, ejsVar, axrVar);
    }
}
