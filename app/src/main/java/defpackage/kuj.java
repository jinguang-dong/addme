package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuj extends ojl {
    private final Set a;

    public kuj() {
        super((short[]) null);
        this.a = new CopyOnWriteArraySet();
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).a(poeVar);
        }
    }

    @Override // defpackage.ojl
    public final void dG(peo peoVar, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).dG(peoVar, j);
        }
    }

    @Override // defpackage.ojl
    public final void dH(piw piwVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).dH(piwVar);
        }
    }

    @Override // defpackage.ojl
    public final void dT(pnx pnxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).dT(pnxVar);
        }
    }

    @Override // defpackage.ojl
    public final void dV(Set set) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).dV(set);
        }
    }

    @Override // defpackage.ojl
    public final void dW() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).dW();
        }
    }

    @Override // defpackage.ojl
    public final void l(pdo pdoVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).l(pdoVar);
        }
    }

    @Override // defpackage.ojl
    public final void m(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).m(j);
        }
    }

    @Override // defpackage.ojl
    public final void n() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ojl) it.next()).n();
        }
    }

    public final void o(ojl ojlVar) {
        this.a.add(ojlVar);
    }

    public final void p(ojl ojlVar) {
        this.a.remove(ojlVar);
    }
}
