package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pij implements paq {
    public final int a;
    public final Surface b;
    public final sbp c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public pij(int i, Surface surface, List list) {
        this.a = i;
        this.b = surface;
        this.c = sbp.j(list);
    }

    public final void a(pif pifVar) {
        this.d.add(pifVar);
    }

    public final void b(peo peoVar, long j) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pif) it.next()).c(peoVar, j);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((pif) it.next()).close();
        }
    }
}
