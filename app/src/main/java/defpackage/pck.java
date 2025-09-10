package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pck implements pcm {
    public final List a = new CopyOnWriteArrayList();

    public final synchronized paq a(pcm pcmVar) {
        pcmVar.getClass();
        this.a.add(pcmVar);
        return new ktu(this, pcmVar, 20);
    }

    @Override // defpackage.pcm
    public final synchronized void c(Throwable th) {
        throw null;
    }

    @Override // defpackage.pcm
    public final synchronized void e(Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((pcm) it.next()).e(th);
        }
    }

    @Override // defpackage.pcm
    public final /* synthetic */ void d() {
    }
}
