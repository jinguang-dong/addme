package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyd implements paq {
    public final let b;
    public les d;
    public final szh a = new szh();
    public List c = new ArrayList();

    public kyd(let letVar) {
        this.b = letVar;
    }

    public final int a() {
        return this.c.size();
    }

    public final void b() {
        ((sgt) kye.a.c().M(3653)).s("Aborting the ZSL async buffer.");
        close();
        szh szhVar = this.a;
        synchronized (szhVar) {
            if (!szhVar.isDone()) {
                szhVar.cancel(true);
            }
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((pdk) it.next()).close();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        les lesVar = this.d;
        if (lesVar != null) {
            lesVar.a();
        }
    }
}
