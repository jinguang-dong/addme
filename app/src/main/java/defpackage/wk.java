package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wk implements ra, wc {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    private final void n() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            wl wlVar = (wl) it.next();
            if (wlVar.b()) {
                copyOnWriteArrayList.remove(wlVar);
            }
        }
    }

    @Override // defpackage.ra
    public final /* synthetic */ void a(rb rbVar) {
        rbVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void b(sy syVar, long j, int i) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void c(sy syVar, long j, qb qbVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void d(sy syVar, long j, rc rcVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void e(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void f(sy syVar, long j) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void g(sy syVar) {
        syVar.getClass();
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wl) it.next()).a();
        }
    }

    @Override // defpackage.ra
    public final /* synthetic */ void h(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void i(sy syVar, long j, long j2) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void j(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void k(sy syVar, qc qcVar) {
        syVar.getClass();
        n();
    }

    @Override // defpackage.ra
    public final /* synthetic */ void l(sy syVar) {
        syVar.getClass();
    }

    @Override // defpackage.ra
    public final void m(sy syVar) {
        syVar.getClass();
        n();
    }

    @Override // defpackage.wc
    public final void o() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wl) it.next()).q();
        }
    }

    @Override // defpackage.wc
    public final void p() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wl) it.next()).q();
        }
    }

    @Override // defpackage.wc
    public final void q() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wl) it.next()).q();
        }
    }
}
