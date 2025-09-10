package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class glv implements BiConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ glv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, owq] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            gsn.o(this.a, (kqy) obj, (Boolean) obj2);
            return;
        }
        char c = 2;
        if (i == 1) {
            spi spiVar = (spi) obj;
            Integer num = (Integer) obj2;
            tpc tpcVarM = spg.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spg spgVar = (spg) tpcVarM.b;
            spgVar.c = spiVar.g;
            spgVar.b |= 1;
            int iIntValue = num.intValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            Object obj3 = this.a;
            spg spgVar2 = (spg) tpcVarM.b;
            spgVar2.b = 2 | spgVar2.b;
            spgVar2.d = iIntValue;
            spg spgVar3 = (spg) tpcVarM.l();
            tpc tpcVar = ((fly) obj3).i;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            spj spjVar = (spj) tpcVar.b;
            spj spjVar2 = spj.a;
            spgVar3.getClass();
            tpw tpwVar = spjVar.d;
            if (!tpwVar.c()) {
                spjVar.d = tph.v(tpwVar);
            }
            spjVar.d.add(spgVar3);
            return;
        }
        if (i == 2) {
            kqy kqyVar = (kqy) obj;
            Boolean bool = (Boolean) obj2;
            ?? r5 = this.a;
            if (((ksa) r5.dL()).equals(ksa.MICROVIDEO_ON)) {
                c = 3;
            } else if (!((ksa) r5.dL()).equals(ksa.MICROVIDEO_AUTO)) {
                c = 1;
            }
            char c2 = true == bool.booleanValue() ? c : (char) 1;
            kse kseVar = kqyVar.d;
            if (kseVar != null) {
                kseVar.j(c2);
                if (c2 == 3) {
                    kqyVar.d.a().setOnClickListener(new kcm(kqyVar, 6));
                    return;
                } else {
                    kqyVar.d.a().setOnClickListener(null);
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            lcz lczVar = (lcz) obj;
            peq peqVar = (peq) obj2;
            if (lcz.E.contains(lczVar)) {
                this.a.put(lczVar, peqVar);
                return;
            }
            return;
        }
        if (i == 4) {
            kqy kqyVar2 = (kqy) obj;
            sgv sgvVar = ktb.a;
            kqyVar2.f(((Boolean) obj2).booleanValue() && ((Boolean) this.a.dL()).booleanValue(), kta.RAW_CAPTURE_ENABLED);
        } else {
            if (i == 5) {
                this.a.put((lcz) obj, (peq) ((uem) obj2).a());
                return;
            }
            mlv mlvVar = (mlv) obj;
            Object obj4 = this.a;
            mlu mluVar = (mlu) obj2;
            if (mlvVar != obj4) {
                mluVar.d((mlv) obj4);
            }
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
