package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgs implements hhc {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.hhi
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).a();
        }
    }

    @Override // defpackage.pcm
    public final void c(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).c(th);
        }
    }

    @Override // defpackage.pcm
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).d();
        }
    }

    @Override // defpackage.pcm
    public final void e(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).e(th);
        }
    }

    @Override // defpackage.hhi
    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).f();
        }
    }

    @Override // defpackage.hhi
    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).g();
        }
    }

    @Override // defpackage.hhk
    public final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hhc) it.next()).h();
        }
    }
}
