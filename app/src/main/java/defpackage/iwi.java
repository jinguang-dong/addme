package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iwi implements pla {
    private double a = 0.0d;
    private double b = 0.0d;
    private double c = 0.0d;
    private int d = 0;

    private final synchronized void c(pld pldVar) {
        this.a += pldVar.f;
        this.b += pldVar.g;
        this.c += pldVar.h;
        this.d++;
    }

    @Override // defpackage.pla
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((pld) it.next());
        }
    }

    final synchronized rwc b() {
        int i = this.d;
        if (i == 0) {
            return rvk.a;
        }
        double d = i;
        double d2 = this.a / d;
        double d3 = this.b / d;
        double d4 = this.c / d;
        return rwc.j(Float.valueOf((float) Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4))));
    }
}
