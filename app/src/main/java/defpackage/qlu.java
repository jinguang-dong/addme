package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlu implements qlt {
    public final syu a;
    public final syu b;
    public final syu c;
    public final syu d;
    public boolean i;
    private final qlz j;
    private final boolean k;
    private boolean l;
    public final List h = new ArrayList();
    public final szh e = new szh();
    public final szh f = new szh();
    public final szh g = new szh();

    public qlu(syu syuVar, syu syuVar2, syu syuVar3, syu syuVar4, boolean z, Executor executor) {
        this.a = syuVar;
        this.b = syuVar2;
        this.c = syuVar3;
        this.d = syuVar4;
        this.k = z;
        this.j = new qlz(executor);
    }

    @Override // defpackage.qlt
    public final syu a() {
        return this.g;
    }

    @Override // defpackage.qlt
    public final synchronized void b() {
        if (this.l) {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        this.l = true;
        szh szhVar = this.g;
        oze ozeVar = new oze(this, 17);
        qlz qlzVar = this.j;
        szhVar.c(ozeVar, qlzVar);
        szh szhVar2 = this.e;
        szhVar2.f(swz.j(ske.J(this.a, this.b, this.c, this.d), new qaz(this, 14), qlzVar));
        ArrayList arrayList = new ArrayList();
        arrayList.add(szhVar2);
        List list = this.h;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qlw) it.next()).b);
        }
        ske.I(arrayList).c(new oze(this, 18), qlzVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((qlw) it2.next()).e);
        }
        ske.I(arrayList2).c(new oze(this, 19), qlzVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, syu] */
    @Override // defpackage.qlt
    public final synchronized qlv c(qaq qaqVar) {
        if (this.l) {
            throw new IllegalStateException("Muxer already started. No tracks can be added now.");
        }
        qlw qlwVar = new qlw(qaqVar.a, new qlz(this.j));
        this.h.add(qlwVar);
        if (!this.k) {
            return qlwVar;
        }
        return new qls(qlwVar);
    }
}
