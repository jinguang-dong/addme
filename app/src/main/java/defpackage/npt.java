package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npt implements npx {
    private sbp a;

    public npt() {
        int i = sbp.d;
        sbp sbpVar = sex.a;
        sbpVar.getClass();
        this.a = sbpVar;
    }

    private final synchronized sbp c() {
        return this.a;
    }

    public final synchronized void a(npx npxVar) {
        int i = sbp.d;
        sbk sbkVar = new sbk();
        sbkVar.j(this.a);
        sbkVar.h(npxVar);
        sbp sbpVarG = sbkVar.g();
        sbpVarG.getClass();
        this.a = sbpVarG;
    }

    public final synchronized void b(npx npxVar) {
        sbp sbpVar = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : sbpVar) {
            if (!a.ao((npx) obj, npxVar)) {
                arrayList.add(obj);
            }
        }
        this.a = ujp.aY(arrayList);
    }

    @Override // defpackage.npx
    public final void h(poj pojVar) throws Exception {
        sbp sbpVarC = c();
        if (sbpVarC.isEmpty()) {
            pojVar.close();
            return;
        }
        pkf pkfVar = new pkf(pojVar);
        try {
            sgk it = sbpVarC.iterator();
            it.getClass();
            while (it.hasNext()) {
                npx npxVar = (npx) it.next();
                poj pojVarK = pkfVar.k();
                if (pojVarK == null) {
                    throw new NullPointerException("Never null: The ref-count of the image is always non-zero.");
                }
                npxVar.h(pojVarK);
            }
            ske.ay(pkfVar, null);
        } finally {
        }
    }

    @Override // defpackage.npx
    public final boolean k() {
        sbp sbpVarC = c();
        if ((sbpVarC instanceof Collection) && sbpVarC.isEmpty()) {
            return false;
        }
        Iterator<E> it = sbpVarC.iterator();
        while (it.hasNext()) {
            if (((npx) it.next()).k()) {
                return true;
            }
        }
        return false;
    }
}
