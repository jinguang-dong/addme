package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sxj extends sxc {
    private List b;

    public sxj(sbe sbeVar, boolean z) {
        super(sbeVar, z, true);
        List listAE = sbeVar.isEmpty() ? Collections.EMPTY_LIST : ujp.aE(sbeVar.size());
        for (int i = 0; i < sbeVar.size(); i++) {
            listAE.add(null);
        }
        this.b = listAE;
        v();
    }

    @Override // defpackage.sxc
    public final void h(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new ocq(obj, (byte[]) null));
        }
    }

    @Override // defpackage.sxc
    public final void j() {
        List<ocq> list = this.b;
        if (list != null) {
            ArrayList arrayListAE = ujp.aE(list.size());
            for (ocq ocqVar : list) {
                arrayListAE.add(ocqVar != null ? ocqVar.a : null);
            }
            e(DesugarCollections.unmodifiableList(arrayListAE));
        }
    }

    @Override // defpackage.sxc
    public final void x(int i) {
        super.x(i);
        this.b = null;
    }
}
