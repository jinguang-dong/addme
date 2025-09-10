package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wp implements Comparator {
    private final /* synthetic */ int a;

    public wp(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Iterator it = ((pv) obj).b.iterator();
                if (it.hasNext()) {
                    qv qvVar = ((wo) it.next()).i;
                    List list = wq.e;
                    Integer numValueOf = Integer.valueOf(ske.bx(list, qvVar));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(ske.bx(list, ((wo) it.next()).i));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((pv) obj2).b.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(ske.bx(list, ((wo) it2.next()).i));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(ske.bx(list, ((wo) it2.next()).i));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return ske.aK(numValueOf, numValueOf3);
                    }
                }
                throw new NoSuchElementException();
            case 1:
                return ske.aK((String) ((uev) obj).a, (String) ((uev) obj2).a);
            case 2:
                Iterator it3 = ((pv) obj).b.iterator();
                if (it3.hasNext()) {
                    int i = ((wo) it3.next()).c;
                    List list2 = wq.f;
                    Integer numValueOf5 = Integer.valueOf(list2.indexOf(new rf(i)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(list2.indexOf(new rf(((wo) it3.next()).c)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((pv) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(list2.indexOf(new rf(((wo) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(list2.indexOf(new rf(((wo) it4.next()).c)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                        return ske.aK(numValueOf5, numValueOf7);
                    }
                }
                throw new NoSuchElementException();
            case 3:
                int i2 = ((qev) obj2).a;
                int i3 = ((qev) obj).a;
                long j = ann.a;
                return ujp.a(i2, i3);
            case 4:
                return ujp.a(((anb) obj).a, ((anb) obj2).a);
            case 5:
                return ujp.a(((azf) obj).b, ((azf) obj2).b);
            case 6:
                bvm bvmVar = (bvm) obj;
                bvm bvmVar2 = (bvm) obj2;
                return bvmVar.d() == bvmVar2.d() ? ujp.a(bvmVar.f(), bvmVar2.f()) : Float.compare(bvmVar.d(), bvmVar2.d());
            case 7:
                return ((hlw) obj).a.b.a() - ((hlw) obj2).a.b.a();
            case 8:
                ito itoVar = (ito) obj;
                ito itoVar2 = (ito) obj2;
                if (itoVar.equals(itoVar2)) {
                    return 0;
                }
                return itoVar.b() + (-2) <= itoVar2.b() + (-2) ? 1 : -1;
            case 9:
                return ((Float) obj).compareTo((Float) obj2);
            case 10:
                return ((String) obj).compareTo((String) obj2);
            case 11:
                return Integer.compare(((pfd) obj).i().c.size(), ((pfd) obj2).i().c.size());
            case 12:
                skk skkVarA = skk.a(obj);
                skk skkVarA2 = skk.a(obj2);
                if (skkVarA != skkVarA2) {
                    return skkVarA.compareTo(skkVarA2);
                }
                int iOrdinal = skkVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
