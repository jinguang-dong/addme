package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tky extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        tmlVar.l();
        while (tmlVar.r()) {
            try {
                arrayList.add(Integer.valueOf(tmlVar.c()));
            } catch (NumberFormatException e) {
                throw new tis(e);
            }
        }
        tmlVar.n();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
