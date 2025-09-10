package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzv implements sxi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pzv(nzv nzvVar, nzl nzlVar, int i, int i2) {
        this.d = i2;
        this.b = nzvVar;
        this.c = nzlVar;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        syn synVarE;
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            if (!((Boolean) obj).booleanValue()) {
                return ske.M(false);
            }
            Object obj2 = this.c;
            int i3 = this.a;
            pzx pzxVar = (pzx) this.b;
            prh.l(pzxVar.a, pzj.a(i3));
            return pzxVar.b((pzj) obj2, i3 + 1);
        }
        if (i != 1) {
            if (i == 2) {
                final tqr tqrVar = (tqr) obj;
                final ?? r0 = this.b;
                final int i4 = this.a;
                final rea reaVar = (rea) this.c;
                return ske.E(r0).b(rsx.b(new sxh() { // from class: rdz
                    @Override // defpackage.sxh
                    public final syu a() {
                        syu syuVarM = ske.M(tqrVar);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) ske.U((Future) r0.get(i5))).booleanValue()) {
                                syuVarM = swz.j(syuVarM, rsx.c(new red((reh) reaVar.a.get(i5), 1)), sxo.a);
                            }
                        }
                        return syuVarM;
                    }
                }), reaVar.b);
            }
            int i5 = this.a;
            ArrayList arrayList = new ArrayList(i5);
            while (i2 < i5) {
                if (((Boolean) ske.U((Future) this.b.get(i2))).booleanValue()) {
                    reh rehVar = (reh) ((rea) this.c).a.get(i2);
                    arrayList.add(((Boolean) rehVar.d.fr()).booleanValue() ? syq.a : ske.Q(new ozi(rehVar, 14), rehVar.b));
                }
                i2++;
            }
            return ske.G(arrayList).a(new qbl(8), sxo.a);
        }
        int i6 = this.a;
        Exception exc = (Exception) obj;
        Integer numValueOf = Integer.valueOf(i6);
        Object obj3 = this.c;
        ((sgt) ((sgt) nzy.a.c().i(exc)).M(5611)).J("Error reading download result. attempt=%d/%d, uri=%s", new Object[]{numValueOf, 3, ((nzl) obj3).a});
        Object obj4 = this.b;
        nzv nzvVar = (nzv) obj4;
        synchronized (nzvVar.f) {
            nzz nzzVar = null;
            if (exc != null) {
                int i7 = rxa.a;
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(exc);
                Throwable cause = exc;
                Throwable cause2 = cause;
                while (true) {
                    cause = cause.getCause();
                    if (cause != null) {
                        arrayList2.add(cause);
                        if (cause == cause2) {
                            throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                        }
                        if (i2 != 0) {
                            cause2 = cause2.getCause();
                        }
                        i2 ^= 1;
                    } else {
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                        rwf rwfVar = new rwf(nzz.class);
                        Iterator it = listUnmodifiableList.iterator();
                        it.getClass();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (rwfVar.a(next)) {
                                nzzVar = next;
                                break;
                            }
                        }
                        nzzVar = nzzVar;
                    }
                }
            }
            if (nzzVar == null || !nzzVar.a.c || i6 >= 3) {
                if (exc instanceof nzi) {
                    throw ((nzi) exc);
                }
                throw new nzi(exc);
            }
            ((nzv) obj4).g.remove(((nzl) obj3).f);
            synVarE = ((nzv) obj4).e((nzl) obj3, i6 + 1);
        }
        nzvVar.b();
        return synVarE;
    }

    public /* synthetic */ pzv(pzx pzxVar, int i, pzj pzjVar, int i2) {
        this.d = i2;
        this.b = pzxVar;
        this.a = i;
        this.c = pzjVar;
    }

    public /* synthetic */ pzv(rea reaVar, int i, List list, int i2) {
        this.d = i2;
        this.c = reaVar;
        this.a = i;
        this.b = list;
    }

    public /* synthetic */ pzv(rea reaVar, List list, int i, int i2) {
        this.d = i2;
        this.c = reaVar;
        this.b = list;
        this.a = i;
    }
}
