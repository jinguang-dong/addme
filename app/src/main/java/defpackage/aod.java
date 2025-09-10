package defpackage;

import android.util.ArraySet;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aod implements Comparator {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aod(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Object obj3 = ((anb) obj).d;
                qzx qzxVar = (qzx) this.a;
                return ske.aK(Integer.valueOf(qzxVar.c(obj3)), Integer.valueOf(qzxVar.c(((anb) obj2).d)));
            case 1:
                Object obj4 = ((anb) obj).d;
                qzx qzxVar2 = (qzx) this.a;
                return ske.aK(Integer.valueOf(qzxVar2.c(obj4)), Integer.valueOf(qzxVar2.c(((anb) obj2).d)));
            case 2:
                Object obj5 = ((anb) obj2).d;
                qzx qzxVar3 = (qzx) this.a;
                return ske.aK(Integer.valueOf(qzxVar3.c(obj5)), Integer.valueOf(qzxVar3.c(((anb) obj).d)));
            case 3:
                Object obj6 = ((anb) obj2).d;
                qzx qzxVar4 = (qzx) this.a;
                return ske.aK(Integer.valueOf(qzxVar4.c(obj6)), Integer.valueOf(qzxVar4.c(((anb) obj).d)));
            case 4:
                ?? r8 = this.a;
                return ske.aK(r8.a(obj), r8.a(obj2));
            case 5:
                int i = ccc.a;
                return ((Number) this.a.a(obj, obj2)).intValue();
            case 6:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ske.aK(Integer.valueOf(((cbr) obj).e), Integer.valueOf(((cbr) obj2).e));
            case 7:
                Object obj7 = ((dlr) obj).k;
                tym tymVar = (tym) this.a;
                return ske.aK(Integer.valueOf(tymVar.b(obj7)), Integer.valueOf(tymVar.b(((dlr) obj2).k)));
            case 8:
                Object obj8 = ((dlr) obj2).k;
                tym tymVar2 = (tym) this.a;
                return ske.aK(Integer.valueOf(tymVar2.b(obj8)), Integer.valueOf(tymVar2.b(((dlr) obj).k)));
            case 9:
                mbh mbhVar = (mbh) obj;
                mbh mbhVar2 = (mbh) obj2;
                int iCompare2 = ((mah) this.a).a.a().compare(mbhVar.a, mbhVar2.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                boolean z = mbhVar.c;
                if (z != mbhVar2.c) {
                    return true != z ? 1 : -1;
                }
                return 0;
            case 10:
                pou pouVar = (pou) obj;
                pou pouVar2 = (pou) obj2;
                int iCompare3 = Long.compare(pouVar.b, pouVar2.b);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareToIgnoreCase = pouVar.c.compareToIgnoreCase(pouVar2.c);
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                ArraySet arraySet = (ArraySet) this.a;
                if (!arraySet.isEmpty()) {
                    ppw ppwVar = pouVar.e;
                    if (arraySet.contains(rup.d(ppwVar.i().d)) && !arraySet.contains(rup.d(pouVar2.e.i().d))) {
                        return 1;
                    }
                    if (arraySet.contains(rup.d(pouVar2.e.i().d)) && !arraySet.contains(rup.d(ppwVar.i().d))) {
                        return -1;
                    }
                }
                int iCompareToIgnoreCase2 = pouVar.e.i().d.compareToIgnoreCase(pouVar2.e.i().d);
                return iCompareToIgnoreCase2 == 0 ? Long.compare(pouVar.a, pouVar2.a) : iCompareToIgnoreCase2;
            default:
                for (int i2 = 0; i2 < 2; i2++) {
                    uiq uiqVar = ((uiq[]) this.a)[i2];
                    int iAK = ske.aK((Comparable) uiqVar.a(obj), (Comparable) uiqVar.a(obj2));
                    if (iAK != 0) {
                        return iAK;
                    }
                }
                return 0;
        }
    }

    public /* synthetic */ aod(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
