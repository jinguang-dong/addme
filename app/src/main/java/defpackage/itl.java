package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class itl implements jhh, jhf, jhe, jhg {
    public static final sgv a = sgv.g("itl");
    public boolean g;
    public int h;
    public final hbj i;
    public final mdy j;
    private final lvq k;
    private final ryq l;
    private final owq m;
    private final owq n;
    private final owq o;
    private final owq p;
    private final owq q;
    private final owq r;
    private final Executor s;
    private final cyo t;
    public final Set b = new HashSet();
    public final Object c = new Object();
    public final TreeSet d = new TreeSet(new wp(8));
    public final Set e = new HashSet();
    public final Object f = new Object();
    private final BroadcastReceiver u = new itj(this);

    public itl(lvq lvqVar, Context context, ryq ryqVar, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, owq owqVar5, owq owqVar6, hbj hbjVar, mdy mdyVar, Executor executor) {
        this.k = lvqVar;
        this.m = owqVar;
        this.n = owqVar2;
        this.o = owqVar3;
        this.p = owqVar4;
        this.q = owqVar5;
        this.r = owqVar6;
        this.i = hbjVar;
        this.l = ryqVar;
        this.j = mdyVar;
        this.s = executor;
        this.t = cyo.a(context);
    }

    public final paq a() {
        int i = this.h;
        k(3);
        return new iti(this, i, 0);
    }

    public final void b(itk itkVar) {
        this.s.execute(new img(this, itkVar, 4, null));
    }

    @Override // defpackage.jhe
    public final void eb() {
        Integer num = (Integer) this.m.dL();
        ith ithVar = ith.SHUTTER;
        ryq ryqVar = this.l;
        ryqVar.k(num, ithVar);
        ryqVar.k((Integer) this.n.dL(), ith.ZOOM_IN);
        ryqVar.k((Integer) this.o.dL(), ith.ZOOM_OUT);
        ryqVar.k((Integer) this.p.dL(), ith.SWITCH_CAMERA);
        ryqVar.k((Integer) this.q.dL(), ith.NEXT_MODE);
        ryqVar.k((Integer) this.r.dL(), ith.PREV_MODE);
    }

    @Override // defpackage.jhf
    public final void ej() {
        this.t.b(this.u, new IntentFilter("com.google.android.apps.camera.remotecontrol.remotekey"));
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.t.c(this.u);
    }

    public final void f(ito itoVar) {
        this.s.execute(new imf(this, itoVar, 7));
    }

    public final void g(itk itkVar) {
        this.s.execute(new imf(this, itkVar, 5, (char[]) null));
    }

    public final void h(ito itoVar) {
        this.s.execute(new imf(this, itoVar, 6));
    }

    public final boolean i(int i, boolean z) {
        synchronized (this.c) {
            Iterator it = this.d.iterator();
            int iB = 1;
            while (it.hasNext()) {
                ito itoVar = (ito) it.next();
                if (iB != 1 && itoVar.b() != iB) {
                    break;
                }
                if (itoVar.a(z)) {
                    iB = itoVar.b();
                    if (!z) {
                        itoVar.c();
                        itoVar.b();
                    }
                }
            }
            boolean z2 = false;
            if (iB != 1) {
                return false;
            }
            if (!z) {
                this.k.dL();
            }
            int iOrdinal = ((lvp) this.k.dL()).ordinal();
            if (iOrdinal == 0) {
                synchronized (this.f) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        ((itk) it2.next()).f(z);
                        z2 = true;
                    }
                }
                return z2;
            }
            if (iOrdinal != 1) {
                return iOrdinal == 3;
            }
            if (i == 25) {
                synchronized (this.f) {
                    Iterator it3 = this.b.iterator();
                    while (it3.hasNext()) {
                        ((itk) it3.next()).h(z);
                    }
                }
            } else {
                synchronized (this.f) {
                    Iterator it4 = this.b.iterator();
                    while (it4.hasNext()) {
                        ((itk) it4.next()).g(z);
                    }
                }
            }
            return true;
        }
    }

    public final void j(boolean z) {
        synchronized (this.f) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((itk) it.next()).a(z);
            }
        }
    }

    public final void k(int i) {
        this.h = i;
        this.g = (i == 2) | this.g;
    }
}
