package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mab implements may {
    final /* synthetic */ mac a;

    public mab(mac macVar) {
        this.a = macVar;
    }

    @Override // defpackage.may
    public final void a() {
        List list = this.a.f;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((may) it.next()).a();
            }
        }
    }

    @Override // defpackage.may
    public final void b() {
        List list = this.a.f;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((may) it.next()).b();
            }
        }
    }

    @Override // defpackage.may
    public final void c() {
        List list = this.a.f;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((may) it.next()).c();
            }
        }
    }

    @Override // defpackage.may
    public final void d() {
        List list = this.a.f;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((may) it.next()).d();
            }
        }
    }

    @Override // defpackage.may
    public final void e() {
        List list = this.a.f;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((may) it.next()).e();
            }
        }
    }
}
