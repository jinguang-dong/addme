package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llj {
    public final long b;
    public final owf c;
    private final llp f;
    private final paf g;
    public final ovx a = new ovx(0L);
    private final LinkedList h = new LinkedList();
    public final Object d = new Object();
    public boolean e = false;
    private List i = new ArrayList();

    public llj(jlp jlpVar, qhz qhzVar, llp llpVar) {
        ovx ovxVar;
        this.f = llpVar;
        this.b = Math.min(300000000L, qhzVar.a);
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        synchronized (jlpVar.a) {
            EnumMap enumMap = jlpVar.c;
            jll jllVar = jll.LIGHTCYCLE;
            if (enumMap.containsKey(jllVar)) {
                jllVar.name();
            } else {
                jllVar.name();
                jlpVar.c.put((EnumMap) jllVar, (jll) new jlo(ambientController, new ovx(false), sbp.m(ambientController.d().dK(new htf(jlpVar, 3), jlpVar.b), ambientController.c().dK(new htf(jlpVar, 4), jlpVar.b))));
                jlpVar.a();
            }
        }
        jll jllVar2 = jll.LIGHTCYCLE;
        synchronized (jlpVar.a) {
            if (!jlpVar.c.containsKey(jllVar2)) {
                throw new IllegalStateException(eld.b(jllVar2, "Feature not registered: "));
            }
            ovxVar = ((jlo) jlpVar.c.get(jllVar2)).a;
        }
        this.c = ovxVar;
        ovxVar.dK(new jww(this, 2), new sxp());
        this.g = new llh(this);
    }

    private final void c(llo lloVar) {
        synchronized (this.d) {
            this.e = true;
            ovx ovxVar = this.a;
            ovxVar.a(Long.valueOf(((Long) ovxVar.d).longValue() + this.b));
            lloVar.c(this.g);
            this.f.a(lloVar);
        }
    }

    private final void d() {
        synchronized (this.d) {
            this.h.size();
            List list = this.i;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((lli) it.next()).a();
                }
            }
        }
    }

    public final void a(llo lloVar) {
        synchronized (this.d) {
            if (((Boolean) ((ovx) this.c).d).booleanValue()) {
                c(lloVar);
            } else {
                this.h.add(lloVar);
                d();
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            LinkedList linkedList = this.h;
            if (!linkedList.isEmpty()) {
                c((llo) linkedList.removeFirst());
                d();
            }
        }
    }
}
