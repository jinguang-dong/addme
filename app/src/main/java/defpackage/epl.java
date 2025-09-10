package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epl implements ComponentCallbacks2, eyu {
    private static final ezs e;
    protected final eox a;
    protected final Context b;
    public final eyt c;
    public final CopyOnWriteArrayList d;
    private final eza f;
    private final eyz g;
    private final ezf h;
    private final Runnable i;
    private final eyr j;
    private ezs k;

    static {
        ezs ezsVarA = ezs.a(Bitmap.class);
        ezsVarA.K();
        e = ezsVarA;
        ezs.a(eyd.class).K();
    }

    public epl(eox eoxVar, eyt eytVar, eyz eyzVar, Context context) {
        eza ezaVar = new eza();
        eoy eoyVar = eoxVar.e;
        this.h = new ezf();
        dzd dzdVar = new dzd(this, 11, null);
        this.i = dzdVar;
        this.a = eoxVar;
        this.c = eytVar;
        this.g = eyzVar;
        this.f = ezaVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        eyr eysVar = clu.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new eys(applicationContext, new epk(this, ezaVar)) : new eyx();
        this.j = eysVar;
        synchronized (eoxVar.c) {
            if (eoxVar.c.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            eoxVar.c.add(this);
        }
        if (fax.i()) {
            fax.h(dzdVar);
        } else {
            eytVar.a(this);
        }
        eytVar.a(eysVar);
        this.d = new CopyOnWriteArrayList(eoxVar.b.b);
        k(eoxVar.b.a());
    }

    private final synchronized void n() {
        Set set = this.h.a;
        Iterator it = fax.f(set).iterator();
        while (it.hasNext()) {
            e((faa) it.next());
        }
        set.clear();
    }

    public final epj a(Class cls) {
        return new epj(this.a, this, cls, this.b);
    }

    public final epj b() {
        return a(Bitmap.class).f(e);
    }

    public final epj c(String str) {
        return a(Drawable.class).e(str);
    }

    final synchronized ezs d() {
        return this.k;
    }

    public final void e(faa faaVar) {
        if (faaVar == null) {
            return;
        }
        boolean zM = m(faaVar);
        ezn eznVarA = faaVar.a();
        if (zM) {
            return;
        }
        List list = this.a.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((epl) it.next()).m(faaVar)) {
                    return;
                }
            }
            if (eznVarA != null) {
                faaVar.e(null);
                eznVarA.c();
            }
        }
    }

    @Override // defpackage.eyu
    public final synchronized void f() {
        this.h.f();
        n();
        eza ezaVar = this.f;
        Iterator it = fax.f(ezaVar.a).iterator();
        while (it.hasNext()) {
            ezaVar.a((ezn) it.next());
        }
        ezaVar.b.clear();
        eyt eytVar = this.c;
        eytVar.b(this);
        eytVar.b(this.j);
        fax.e().removeCallbacks(this.i);
        List list = this.a.c;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.eyu
    public final synchronized void g() {
        j();
        this.h.g();
    }

    @Override // defpackage.eyu
    public final synchronized void h() {
        this.h.h();
        i();
    }

    public final synchronized void i() {
        eza ezaVar = this.f;
        ezaVar.c = true;
        for (ezn eznVar : fax.f(ezaVar.a)) {
            if (eznVar.n()) {
                eznVar.f();
                ezaVar.b.add(eznVar);
            }
        }
    }

    public final synchronized void j() {
        eza ezaVar = this.f;
        ezaVar.c = false;
        for (ezn eznVar : fax.f(ezaVar.a)) {
            if (!eznVar.l() && !eznVar.n()) {
                eznVar.b();
            }
        }
        ezaVar.b.clear();
    }

    protected final synchronized void k(ezs ezsVar) {
        ezs ezsVar2 = (ezs) ezsVar.clone();
        if (ezsVar2.p && !ezsVar2.r) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        ezsVar2.r = true;
        ezsVar2.K();
        this.k = ezsVar2;
    }

    final synchronized void l(faa faaVar, ezn eznVar) {
        this.h.a.add(faaVar);
        eza ezaVar = this.f;
        ezaVar.a.add(eznVar);
        if (!ezaVar.c) {
            eznVar.b();
        } else {
            eznVar.c();
            ezaVar.b.add(eznVar);
        }
    }

    final synchronized boolean m(faa faaVar) {
        ezn eznVarA = faaVar.a();
        if (eznVarA == null) {
            return true;
        }
        if (!this.f.a(eznVarA)) {
            return false;
        }
        this.h.a.remove(faaVar);
        faaVar.e(null);
        return true;
    }

    public final synchronized String toString() {
        eyz eyzVar;
        eza ezaVar;
        eyzVar = this.g;
        ezaVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(ezaVar) + ", treeNode=" + String.valueOf(eyzVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
