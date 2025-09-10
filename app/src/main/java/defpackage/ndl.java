package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ndl implements ndo {
    final /* synthetic */ ndn a;

    public ndl(ndn ndnVar) {
        this.a = ndnVar;
    }

    @Override // defpackage.ndo
    public final void a() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            nks nksVar = ndnVar.h;
            boolean z = false;
            if (nksVar != null && nksVar.i) {
                z = true;
            }
            for (ndo ndoVar : ndnVar.c) {
                if (z) {
                    if (ndnVar.aJ()) {
                        ndnVar.a.setPressed(true);
                    }
                    ndoVar.g();
                } else {
                    ndoVar.a();
                }
            }
        }
    }

    @Override // defpackage.ndo
    public final void b(boolean z) {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).b(z);
            }
        }
    }

    @Override // defpackage.ndo
    public final void c() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).c();
            }
        }
    }

    @Override // defpackage.ndo
    public final void d() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).d();
            }
        }
    }

    @Override // defpackage.ndo
    public final void e() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).e();
            }
        }
    }

    @Override // defpackage.ndo
    public final void f() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            ndnVar.a.q = true;
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).f();
            }
        }
    }

    @Override // defpackage.ndo
    public final void g() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            ndnVar.a.q = true;
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).g();
            }
        }
    }

    @Override // defpackage.ndo
    public final void h() {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            ndnVar.a.q = false;
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).h();
            }
        }
    }

    @Override // defpackage.ndo
    public final void i(nli nliVar) {
        ndn ndnVar = this.a;
        synchronized (ndnVar.b) {
            Iterator it = ndnVar.c.iterator();
            while (it.hasNext()) {
                ((ndo) it.next()).i(nliVar);
            }
        }
    }
}
