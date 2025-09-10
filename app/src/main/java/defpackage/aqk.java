package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqk implements url {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aqk(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v18, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v27, types: [buu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v37, types: [dzs, java.lang.Object] */
    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) {
        avg avgVar;
        int i = this.c;
        if (i == 0) {
            akb akbVar = (akb) obj;
            if ((akbVar instanceof ajz) || (akbVar instanceof ajx) || (akbVar instanceof akd)) {
                ((zo) this.b).o(akbVar);
            } else if (akbVar instanceof aka) {
                ((zo) this.b).n(((aka) akbVar).a);
            } else if (akbVar instanceof ajy) {
                ((zo) this.b).n(((ajy) akbVar).a);
            } else if (akbVar instanceof ake) {
                ((zo) this.b).n(((ake) akbVar).a);
            } else if (akbVar instanceof akc) {
                ((zo) this.b).n(((akc) akbVar).a);
            }
            zo zoVar = (zo) this.b;
            Object[] objArr = zoVar.a;
            int i2 = zoVar.b;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                akb akbVar2 = (akb) objArr[i4];
                if (akbVar2 instanceof ajz) {
                    i3 |= 2;
                } else if (akbVar2 instanceof ajx) {
                    i3 |= 1;
                } else if (akbVar2 instanceof akd) {
                    i3 |= 4;
                }
            }
            ((bbd) ((ebn) this.a).b).h(i3);
            return ufg.a;
        }
        if (i == 1) {
            akb akbVar3 = (akb) obj;
            if (akbVar3 instanceof akd) {
                this.a.add(akbVar3);
            } else if (akbVar3 instanceof ake) {
                this.a.remove(((ake) akbVar3).a);
            } else if (akbVar3 instanceof akc) {
                this.a.remove(((akc) akbVar3).a);
            }
            this.b.b(Boolean.valueOf(!this.a.isEmpty()));
            return ufg.a;
        }
        if (i != 2) {
            this.b.e((ebx) this.a, (cpo) obj);
            return ufg.a;
        }
        akb akbVar4 = (akb) obj;
        if (akbVar4 instanceof akf) {
            ave aveVar = (ave) this.b;
            if (aveVar.f) {
                aveVar.e((akf) akbVar4);
            } else {
                aveVar.g.o(akbVar4);
            }
        } else {
            ?? r14 = this.b;
            ?? r12 = this.a;
            ave aveVar2 = (ave) r14;
            avg avgVar2 = aveVar2.c;
            if (avgVar2 == null) {
                avg avgVar3 = new avg(aveVar2.a, aveVar2.b);
                bko.x(r14);
                aveVar2.c = avgVar3;
                avgVar = avgVar3;
            } else {
                avgVar = avgVar2;
            }
            boolean z = akbVar4 instanceof ajz;
            if (z) {
                avgVar.d.add(akbVar4);
            } else if (akbVar4 instanceof aka) {
                avgVar.d.remove(((aka) akbVar4).a);
            } else if (akbVar4 instanceof ajx) {
                avgVar.d.add(akbVar4);
            } else if (akbVar4 instanceof ajy) {
                avgVar.d.remove(((ajy) akbVar4).a);
            } else if (akbVar4 instanceof aju) {
                avgVar.d.add(akbVar4);
            } else if (akbVar4 instanceof ajv) {
                avgVar.d.remove(((ajv) akbVar4).a);
            } else if (akbVar4 instanceof ajt) {
                avgVar.d.remove(((ajt) akbVar4).a);
            }
            akb akbVar5 = (akb) ske.bG(avgVar.d);
            if (!a.ao(avgVar.e, akbVar5)) {
                if (akbVar5 != null) {
                    ava avaVar = (ava) avgVar.b.a();
                    float f = z ? avaVar.c : akbVar4 instanceof ajx ? avaVar.b : akbVar4 instanceof aju ? avaVar.a : 0.0f;
                    boolean z2 = akbVar5 instanceof ajz;
                    adt adtVar = avd.a;
                    adt adtVar2 = z2 ? avd.a : ((akbVar5 instanceof ajx) || (akbVar5 instanceof aju)) ? new adt(45, acm.b, 2) : avd.a;
                    ukc.C(r12, null, 0, new dns(avgVar, f, adtVar2, (uhb) null, 1), 3);
                } else {
                    akb akbVar6 = avgVar.e;
                    boolean z3 = akbVar6 instanceof ajz;
                    adt adtVar3 = avd.a;
                    adt adtVar4 = (z3 || (akbVar6 instanceof ajx) || !(akbVar6 instanceof aju)) ? avd.a : new adt(150, acm.b, 2);
                    ukc.C(r12, null, 0, new aej(avgVar, adtVar4, (uhb) null, 13), 3);
                }
                avgVar.e = akbVar5;
            }
        }
        return ufg.a;
    }

    public aqk(List list, azr azrVar, int i) {
        this.c = i;
        this.a = list;
        this.b = azrVar;
    }
}
