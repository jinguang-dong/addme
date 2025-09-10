package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eks implements eky {
    public static final eks a = new eks();
    private static final iso b = iso.y("c", "v", "i", "o");

    private eks() {
    }

    @Override // defpackage.eky
    public final /* bridge */ /* synthetic */ Object a(elb elbVar, float f) {
        if (elbVar.p() == 1) {
            elbVar.g();
        }
        elbVar.h();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zO = false;
        while (elbVar.n()) {
            int iQ = elbVar.q(b);
            if (iQ == 0) {
                zO = elbVar.o();
            } else if (iQ == 1) {
                listD = eki.d(elbVar, f);
            } else if (iQ == 2) {
                listD2 = eki.d(elbVar, f);
            } else if (iQ != 3) {
                elbVar.l();
                elbVar.m();
            } else {
                listD3 = eki.d(elbVar, f);
            }
        }
        elbVar.j();
        if (elbVar.p() == 2) {
            elbVar.i();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new eja(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new ehw(eli.c((PointF) listD.get(i2), (PointF) listD3.get(i2)), eli.c(pointF2, (PointF) listD2.get(i)), pointF2));
        }
        if (zO) {
            PointF pointF3 = (PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new ehw(eli.c((PointF) listD.get(i3), (PointF) listD3.get(i3)), eli.c(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new eja(pointF, zO, arrayList);
    }
}
