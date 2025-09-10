package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzm implements ply, gae {
    private final our a = new our();
    private final fzn b;

    public fzm(fzn fznVar) {
        this.b = fznVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [fzu] */
    @Override // defpackage.ply
    public final plx a(plx plxVar) {
        gab gabVarA;
        fzh fzhVar = new fzh(plxVar);
        fzn fznVar = this.b;
        List<fzy> list = fznVar.a;
        fzw fzuVar = Collection.EL.stream(list).anyMatch(new fla(7)) ? new fzu(plxVar) : new fzw(plxVar);
        this.a.d(fzhVar.a(fzuVar));
        fznVar.b = fzuVar;
        if (!list.isEmpty()) {
            fznVar.c = new ArrayList();
            for (fzy fzyVar : list) {
                fznVar.c.add(fzyVar.i() + (-1) != 0 ? new fzv(fzyVar) : new fze(fzyVar));
            }
            Collections.sort(fznVar.c, Comparator$CC.comparing(new gbm(1)));
            fznVar.b.getClass();
            int i = 0;
            ((fzz) fznVar.c.get(0)).g(fznVar.b);
            while (i < fznVar.c.size()) {
                int i2 = i + 1;
                ((fzz) fznVar.c.get(i)).h(fzhVar);
                if (i < fznVar.c.size() - 1) {
                    ((fzz) fznVar.c.get(i2)).g(((fzz) fznVar.c.get(i)).a());
                }
                i = i2;
            }
        }
        fznVar.b.getClass();
        if (list.isEmpty()) {
            gabVarA = fznVar.b;
        } else {
            List list2 = fznVar.c;
            list2.getClass();
            gabVarA = ((fzz) ujp.aQ(list2)).a();
        }
        return new fzi(plxVar, fzhVar, gabVarA);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.gae
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.gae
    public final /* synthetic */ void c() {
    }
}
