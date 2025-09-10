package defpackage;

import android.location.Location;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omn implements ogm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public omn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ogm
    public final /* synthetic */ void a(Object obj) {
        ogl oglVar;
        int i = this.b;
        if (i == 0) {
            omj omjVar = ((olw) this.a).a;
            synchronized (omjVar) {
                omjVar.b = false;
                oglVar = omjVar.a.b;
            }
            if (oglVar != null) {
                omjVar.c.g(oglVar, 2441);
                return;
            }
            return;
        }
        if (i == 1) {
            ((olz) obj).b((Location) this.a);
            return;
        }
        if (i != 2) {
            ((oqe) obj).a((osy) this.a);
            return;
        }
        qzv qzvVar = (qzv) obj;
        try {
            Object obj2 = this.a;
            tow towVar = tow.a;
            tra traVar = tra.a;
            tph tphVarQ = tph.q(qzr.a, (byte[]) obj2, 0, ((byte[]) obj2).length, tow.a);
            tph.D(tphVarQ);
            qzr qzrVar = (qzr) tphVarQ;
            Iterator it = qzvVar.a.f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                tpw tpwVar = qzrVar.b;
                qzl qzlVar = qzm.a;
                if (tpwVar != null && !tpwVar.isEmpty()) {
                    Iterator<E> it2 = tpwVar.iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        qzm[] qzmVarArrA = qzlVar.a((String) it2.next());
                        if (qzmVarArrA != null) {
                            int i2 = 0;
                            while (i2 < qzmVarArrA.length) {
                                boolean z3 = qzmVarArrA[i2].g;
                                i2++;
                                z2 = true;
                            }
                        }
                    }
                    if (z2 && !z) {
                        qzvVar.b.a();
                        z = true;
                    }
                }
            }
        } catch (tpz unused) {
        }
    }
}
