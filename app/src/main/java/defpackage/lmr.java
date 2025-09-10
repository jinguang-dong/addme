package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmr extends lmn {
    private final lmp i;
    private final pbn j;

    public lmr(lmg lmgVar, Executor executor, lly llyVar, lss lssVar, pas pasVar, rwc rwcVar, pbn pbnVar) {
        super(lmgVar, executor, llyVar, 4, lssVar, pasVar, 5, pbnVar);
        this.j = pbnVar;
        if (!rwcVar.h()) {
            this.i = null;
            return;
        }
        lmp lmpVar = (lmp) rwcVar.c();
        this.i = lmpVar;
        a.I(lmpVar.e == this.e);
        a.I(lmpVar.h == this.h);
    }

    @Override // defpackage.lmn, java.lang.Runnable
    public final void run() {
        int i;
        obu obuVar;
        this.j.f("PreviewChained");
        lmg lmgVar = this.e;
        poj pojVar = lmgVar.a;
        Rect rectI = i(pojVar, lmgVar.e);
        d(lmgVar);
        int iE = lpa.e(new pas(rectI.width(), rectI.height()), this.a);
        nw nwVarF = f(lmgVar, iE);
        try {
            j(this.d, nwVarF, 2);
            pojVar.c();
            pojVar.b();
            g(nwVarF, b(pojVar, rectI, iE), 2);
            lmp lmpVar = this.i;
            if (lmpVar != null) {
                lly llyVar = this.h;
                HashSet hashSet = new HashSet(1);
                hashSet.add(lmpVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    i = 0;
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((lmp) it.next()).e == this.e) {
                        z = true;
                    }
                    rnt.L(z);
                }
                lmg lmgVar2 = this.e;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (((lmp) it2.next()).e != lmgVar2) {
                        throw new RuntimeException("ERROR:  Spawned tasks cannot reference new images!");
                    }
                    i++;
                }
                if (i != 0) {
                    Map map = llyVar.e;
                    synchronized (map) {
                        poj pojVar2 = lmgVar2.a;
                        llw llwVar = (llw) map.get(pojVar2);
                        llwVar.getClass();
                        if (map.get(pojVar2) == null) {
                            throw new RuntimeException("Image Reference has already been released or has never been held.");
                        }
                        llwVar.a(i);
                        map.put(pojVar2, llwVar);
                        llyVar.h += i;
                    }
                }
                Map map2 = llyVar.f;
                synchronized (map2) {
                    obuVar = (obu) map2.get(this);
                    obuVar.getClass();
                    rnt.M(true, "Task NOT previously registered. ImageShadowTask booking-keeping is incorrect.");
                    ((lme) obuVar.b).b.a(hashSet.size());
                }
                llyVar.e(hashSet, obuVar);
            }
            this.h.b(lmgVar.a, this.c);
            this.j.g();
        } catch (Throwable th) {
            this.h.b(lmgVar.a, this.c);
            throw th;
        }
    }
}
