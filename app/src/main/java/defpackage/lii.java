package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lii implements nkm {
    public final sbv a;
    public final ArrayList b = new ArrayList();
    public final ocq c;
    private final out d;
    private final owf e;
    private final fdq f;

    public lii(out outVar, fdq fdqVar, ocq ocqVar, owf owfVar, jkd jkdVar, lkn lknVar, ljj ljjVar, jkj jkjVar, jkl jklVar) {
        this.d = outVar;
        this.f = fdqVar;
        this.c = ocqVar;
        this.e = owfVar;
        this.a = sbv.p(lih.EXPOSURE, sbp.n(jkdVar, jklVar, jkjVar), lih.ISO, sbp.l(ljjVar), lih.SHUTTER_SPEED, sbp.l(lknVar));
    }

    @Override // defpackage.nkm
    public final void a() {
        this.f.j().d(this.e.dK(new ksq(this, 14), this.d));
    }

    public final void b(boolean z, lih lihVar) {
        if (z) {
            ArrayList arrayList = this.b;
            if (arrayList.contains(lihVar)) {
                arrayList.remove(lihVar);
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.contains(lihVar)) {
            return;
        }
        arrayList2.add(lihVar);
    }

    public final void c(boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lih lihVar = (lih) arrayList.get(i);
            sbv sbvVar = this.a;
            if (sbvVar.containsKey(lihVar)) {
                sbp sbpVar = (sbp) sbvVar.get(lihVar);
                sbpVar.getClass();
                int size2 = sbpVar.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((lij) ((jjv) sbpVar.get(i2))).j(z);
                }
            }
        }
    }
}
