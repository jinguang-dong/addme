package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwe extends uht implements uiu {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwe(cwd cwdVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = cwdVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((cwe) c(obj, (uhb) obj2)).b(ufg.a);
        }
        return ((cwe) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [cwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.c == 0) {
            rnt.aN(obj);
            und undVar = (und) this.b;
            ?? r4 = this.a;
            cwc cwcVar = ((cwd) r4).a;
            if (cwcVar.a.compareTo(cwb.b) >= 0) {
                cwcVar.a(r4);
            } else {
                ujp.S(undVar.c(), null);
            }
            return ufg.a;
        }
        rnt.aN(obj);
        ut utVar = (ut) this.a;
        Object obj2 = utVar.b;
        ufu ufuVar = (ufu) obj2;
        ufuVar.add(this.b);
        ?? r42 = utVar.e;
        for (Object objI = r42.i(); uqq.c(objI); objI = r42.i()) {
            uqq.d(objI);
            ufuVar.add(objI);
        }
        Objects.toString(obj2);
        utVar.d.a(obj2);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.c != 0) {
            cwe cweVar = new cwe((ut) this.a, uhbVar, 1);
            cweVar.b = obj;
            return cweVar;
        }
        cwe cweVar2 = new cwe((cwd) this.a, uhbVar, 0);
        cweVar2.b = obj;
        return cweVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwe(ut utVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = utVar;
    }
}
