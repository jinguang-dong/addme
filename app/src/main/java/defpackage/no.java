package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class no {
    public boolean b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public uif d;

    public no(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(nb nbVar) {
        this.c.add(nbVar);
    }

    public final void f(nb nbVar) {
        this.c.remove(nbVar);
    }

    public final void g(boolean z) {
        this.b = z;
        uif uifVar = this.d;
        if (uifVar != null) {
            uifVar.a();
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(na naVar) {
    }
}
