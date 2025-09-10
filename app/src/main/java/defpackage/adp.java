package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adp implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ adp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [bfs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v41, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [bfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [aby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final Object a(Object obj) throws Exception {
        switch (this.c) {
            case 0:
                int i = ads.a;
                Object obj2 = this.a;
                bgz bgzVar = ((ado) obj2).d;
                Object obj3 = this.b;
                bgzVar.add(obj3);
                return new adr(obj2, obj3, 1);
            case 1:
                ukc.C(this.b, null, 4, new adm((ado) this.a, null), 1);
                return new adn();
            case 2:
                int i2 = ads.a;
                return new adr((ado) this.b, (adi) this.a, 0);
            case 3:
                btd btdVar = (btd) obj;
                als alsVar = (als) this.a;
                boolean z = alsVar.c;
                Object obj4 = this.b;
                if (z) {
                    btd.s(btdVar, (bte) obj4, chp.P(btdVar, alsVar.a), chp.P(btdVar, alsVar.b));
                } else {
                    btd.q(btdVar, (bte) obj4, chp.P(btdVar, alsVar.a), chp.P(btdVar, alsVar.b));
                }
                return ufg.a;
            case 4:
                btd btdVar2 = (btd) obj;
                alt altVar = (alt) this.a;
                long j = ((chy) altVar.a.a(btdVar2)).a;
                boolean z2 = altVar.b;
                Object obj5 = this.b;
                if (z2) {
                    btd.t(btdVar2, (bte) obj5, chy.a(j), chy.b(j));
                } else {
                    btd.v(btdVar2, (bte) obj5, chy.a(j), chy.b(j), null, 12);
                }
                return ufg.a;
            case 5:
                btd btdVar3 = (btd) obj;
                alu aluVar = (alu) this.a;
                boolean z3 = aluVar.e;
                Object obj6 = this.b;
                if (z3) {
                    btd.s(btdVar3, (bte) obj6, chp.P(btdVar3, aluVar.a), chp.P(btdVar3, aluVar.b));
                } else {
                    btd.q(btdVar3, (bte) obj6, chp.P(btdVar3, aluVar.a), chp.P(btdVar3, aluVar.b));
                }
                return ufg.a;
            case 6:
                Object obj7 = this.a;
                zw zwVar = ((apd) obj7).a;
                Object obj8 = this.b;
                zwVar.e(obj8);
                return new adr(obj7, obj8, 2);
            case 7:
                ?? r0 = this.a;
                return new apd(this.b, (Map) obj, r0);
            case 8:
                return new aus(obj, this.a, this.b);
            case 9:
                utl utlVar = bao.k;
                ((ayn) this.b).n(obj);
                Object obj9 = this.a;
                if (obj9 != null) {
                    ((zw) obj9).j(obj);
                }
                return ufg.a;
            case 10:
                uiq uiqVar = bgr.a;
                this.a.a(obj);
                this.b.a(obj);
                return ufg.a;
            case 11:
                uiq uiqVar2 = bgr.a;
                this.a.a(obj);
                this.b.a(obj);
                return ufg.a;
            case 12:
                Object obj10 = this.b;
                Object obj11 = ((byz) obj10).a;
                cfy cfyVar = (cfy) obj;
                Object obj12 = this.a;
                synchronized (obj11) {
                    if (cfyVar.b()) {
                    }
                }
                return ufg.a;
            case 13:
                Object obj13 = this.a;
                ((gpe) this.b).c.d((ddo) obj, obj13);
                return null;
            default:
                nkx nkxVar = (nkx) obj;
                nkxVar.getClass();
                if (nkxVar != nfa.b(this.a)) {
                    ((uiu) this.b).a(nkxVar, true);
                }
                return true;
        }
    }

    public /* synthetic */ adp(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
