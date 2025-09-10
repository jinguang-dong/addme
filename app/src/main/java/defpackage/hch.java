package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hch implements Comparator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hch(ppj ppjVar, int i) {
        this.b = i;
        this.a = ppjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.b == 0) {
            String strJ = ((fqb) obj).a().j();
            String strJ2 = ((fqb) obj2).a().j();
            String str = ((ppj) this.a).f;
            if (!strJ.contains(str) || !strJ2.contains(str) || !hcj.g(strJ, str).equals(hcj.g(strJ2, str))) {
                return 0;
            }
            int iCompareToIgnoreCase = strJ.compareToIgnoreCase(strJ2);
            if (iCompareToIgnoreCase != Integer.MIN_VALUE) {
                return -iCompareToIgnoreCase;
            }
            throw new ArithmeticException();
        }
        Iterator it = ((wn) obj).m.iterator();
        if (it.hasNext()) {
            pv pvVar = (pv) it.next();
            List list = ((wq) this.a).j;
            Integer numValueOf = Integer.valueOf(list.indexOf(pvVar));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(list.indexOf((pv) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            Iterator it2 = ((wn) obj2).m.iterator();
            if (it2.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(list.indexOf((pv) it2.next()));
                while (it2.hasNext()) {
                    Integer numValueOf4 = Integer.valueOf(list.indexOf((pv) it2.next()));
                    if (numValueOf3.compareTo(numValueOf4) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                }
                return ske.aK(numValueOf, numValueOf3);
            }
        }
        throw new NoSuchElementException();
    }

    public hch(wq wqVar, int i) {
        this.b = i;
        this.a = wqVar;
    }
}
