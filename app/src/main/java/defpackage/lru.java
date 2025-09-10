package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lru implements ltb {
    private final LinkedList a = new LinkedList();

    @Override // defpackage.ltb
    public final void a() {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).a();
            }
        }
    }

    @Override // defpackage.ltb
    public final void b() {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).b();
            }
        }
    }

    @Override // defpackage.ltb
    public final void c(jjb jjbVar) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).c(jjbVar);
            }
        }
    }

    @Override // defpackage.ltb
    public final void d(boolean z, boolean z2) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).d(z, z2);
            }
        }
    }

    @Override // defpackage.ltb
    public final void e() {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).e();
            }
        }
    }

    @Override // defpackage.ltb
    public final void f(rwc rwcVar) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).f(rwcVar);
            }
        }
    }

    @Override // defpackage.ltb
    public final void g(int i, int i2, Throwable th) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).g(i, i2, th);
            }
        }
    }

    @Override // defpackage.ltb
    public final void h(int i, int i2, Throwable th) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).h(i, i2, th);
            }
        }
    }

    @Override // defpackage.ltb
    public final void i(int i, int i2) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).i(i, i2);
            }
        }
    }

    @Override // defpackage.ltb
    public final void j(int i, int i2) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((ltb) it.next()).j(i, i2);
            }
        }
    }

    public final void k(ltb ltbVar) {
        LinkedList linkedList = this.a;
        synchronized (linkedList) {
            linkedList.add(ltbVar);
        }
    }
}
