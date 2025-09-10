package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tif extends tiv {
    final /* synthetic */ tiv a;

    public tif(tiv tivVar) {
        this.a = tivVar;
    }

    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        tmlVar.l();
        while (tmlVar.r()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(tmlVar)).longValue()));
        }
        tmlVar.n();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }
}
