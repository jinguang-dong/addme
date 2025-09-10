package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajw implements url {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ajw(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) throws Exception {
        List listBN;
        if (this.c == 0) {
            akb akbVar = (akb) obj;
            if (akbVar instanceof aju) {
                this.a.add(akbVar);
            } else if (akbVar instanceof ajv) {
                this.a.remove(((ajv) akbVar).a);
            } else if (akbVar instanceof ajt) {
                this.a.remove(((ajt) akbVar).a);
            }
            this.b.b(Boolean.valueOf(!this.a.isEmpty()));
            return ufg.a;
        }
        byi byiVar = (byi) obj;
        if (byiVar instanceof te) {
            tm tmVar = (tm) ((uka) this.a).a;
            ta taVar = ((te) byiVar).a;
            synchronized (tmVar.b) {
                int i = tmVar.d;
                if (i != 4 && i != 5) {
                    tmVar.c = taVar;
                    ukc.C(tmVar.a, null, 0, new tk(tmVar, null, 1, null), 3);
                }
            }
        } else if (byiVar instanceof td) {
            ((tm) ((uka) this.a).a).h();
        } else if (byiVar instanceof tc) {
            ((tm) ((uka) this.a).a).h();
            Object obj2 = this.b;
            tc tcVar = (tc) byiVar;
            synchronized (((sl) obj2).a) {
                if (!((sl) obj2).f()) {
                    pk pkVar = tcVar.a;
                    if (pkVar != null) {
                        ((sl) obj2).b = pkVar;
                        int i2 = pkVar.a;
                        if (a.p(i2, 6) || a.p(i2, 1) || a.p(i2, 2)) {
                            ((sl) obj2).j = pf.a;
                            Objects.toString(obj2);
                        } else {
                            ((sl) obj2).j = pg.a;
                            Objects.toString(obj2);
                            Objects.toString(pkVar);
                        }
                    } else {
                        ((sl) obj2).j = pi.a;
                    }
                    wr wrVar = ((sl) obj2).e;
                    synchronized (wrVar.e) {
                        wrVar.h = false;
                        Map map = wrVar.g;
                        listBN = ske.bN(map.values());
                        map.clear();
                    }
                    Iterator it = listBN.iterator();
                    while (it.hasNext()) {
                        a.ae((AutoCloseable) it.next());
                    }
                    ((sl) obj2).e();
                }
            }
        }
        return ufg.a;
    }
}
