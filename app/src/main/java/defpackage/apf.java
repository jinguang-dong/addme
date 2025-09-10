package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apf implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public apf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, uiv] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, uif] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (aycVar.H(i2 != 2, iIntValue & 1)) {
                this.a.a(this.b, aycVar, 0);
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        if (i != 1) {
            if (i != 2) {
                ayc aycVar2 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
                    aycVar2.r();
                } else {
                    bay.L(new bag[]{avf.a.b(psm.a), arq.b.b(this.b), avq.b.b(false)}, this.a, aycVar2, 8);
                }
                return ufg.a;
            }
            ayc aycVar3 = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar3.G()) {
                aycVar3.r();
            } else {
                awt.a(((awu) this.b).a, this.a, aycVar3, 0);
            }
            return ufg.a;
        }
        ayc aycVar4 = (ayc) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        if (aycVar4.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            Object obj3 = this.a;
            Object obj4 = this.b;
            got gotVar = (got) obj3;
            Object objA = gotVar.c.a();
            aoh aohVar = (aoh) obj4;
            int iA = aohVar.c;
            amt amtVar = (amt) objA;
            if ((iA >= amtVar.b() || !a.ao(amtVar.d(iA), aohVar.a)) && (iA = amtVar.a(aohVar.a)) != -1) {
                aohVar.c = iA;
            }
            if (iA != -1) {
                aycVar4.u(-1664741302);
                byi.as(amtVar, gotVar.b, iA, aohVar.a, aycVar4, 0);
                aycVar4.n();
            } else {
                aycVar4.u(-1664506818);
                aycVar4.n();
            }
            Object obj5 = aohVar.a;
            boolean zD = aycVar4.D(obj4);
            Object objF = aycVar4.f();
            if (zD || objF == ayb.a) {
                objF = new np(obj4, 14);
                aycVar4.w(objF);
            }
            azb.c(obj5, (uiq) objF, aycVar4);
        } else {
            aycVar4.r();
        }
        return ufg.a;
    }

    public apf(Object obj, uiu uiuVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = uiuVar;
    }
}
