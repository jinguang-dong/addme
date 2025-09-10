package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cju extends cjn {
    public ArrayList aI = new ArrayList();

    @Override // defpackage.cjn
    public final void S(pmg pmgVar) {
        super.S(pmgVar);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((cjn) this.aI.get(i)).S(pmgVar);
        }
    }

    public void T() {
        ArrayList arrayList = this.aI;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cjn cjnVar = (cjn) this.aI.get(i);
            if (cjnVar instanceof cju) {
                ((cju) cjnVar).T();
            }
        }
    }

    public final void Y(cjn cjnVar) {
        this.aI.remove(cjnVar);
        cjnVar.s();
    }

    @Override // defpackage.cjn
    public void s() {
        this.aI.clear();
        super.s();
    }
}
