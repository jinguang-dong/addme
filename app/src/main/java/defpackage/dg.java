package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dg {
    public final bm a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public dg(int i, int i2, bm bmVar) {
        this.h = i;
        this.i = i2;
        this.a = bmVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (ch.X(2)) {
            toString();
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(de deVar) {
        this.k.add(deVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (de deVar : ske.bN(this.g)) {
            if (!deVar.i) {
                deVar.a(viewGroup);
            }
            deVar.i = true;
        }
    }

    public final void f(de deVar) {
        List list = this.k;
        if (list.remove(deVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (ch.X(2)) {
                    Objects.toString(this.a);
                    Objects.toString(a.aY(this.i));
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.h != 1) {
                if (ch.X(2)) {
                    Objects.toString(this.a);
                    Objects.toString(a.aU(this.h));
                    Objects.toString(a.aU(i));
                }
                this.h = i;
                return;
            }
            return;
        }
        if (ch.X(2)) {
            Objects.toString(this.a);
            Objects.toString(a.aU(this.h));
            Objects.toString(a.aY(this.i));
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) a.aU(this.h)) + " lifecycleImpact = " + ((Object) a.aY(this.i)) + " fragment = " + this.a + '}';
    }
}
