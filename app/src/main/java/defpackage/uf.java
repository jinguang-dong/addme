package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class uf extends ujn implements uiq {
    public uf(Object obj) {
        super(1, obj, uh.class, "prune", "prune$camera_camera2_pipe_release(Ljava/util/List;)V", 0);
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        List listBO;
        int iNextIndex;
        Integer numValueOf;
        List<byi> list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((byi) obj2) instanceof ui) {
                arrayList.add(obj2);
            }
        }
        list.removeAll(arrayList);
        boolean z = true;
        if (arrayList.size() <= 1) {
            listBO = ske.bN(arrayList);
        } else {
            listBO = ske.bO(arrayList);
            Collections.reverse(listBO);
        }
        Iterator it = listBO.iterator();
        while (it.hasNext()) {
            list.add(0, (byi) it.next());
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((byi) listIterator.previous()) instanceof uj) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex > 0) {
            Object obj3 = list.get(iNextIndex);
            obj3.getClass();
            uj ujVar = (uj) obj3;
            for (int i = 0; i < iNextIndex; i++) {
                byi byiVar = (byi) list.remove(0);
                umr umrVar = byiVar instanceof uk ? ((uk) byiVar).b : byiVar instanceof uj ? ((uj) byiVar).a : null;
                if (umrVar != null) {
                    ujVar.a.o(new sh(umrVar, 2));
                }
                uh.n(byiVar);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        for (byi byiVar2 : list) {
            int i3 = i2 + 1;
            if (byiVar2 instanceof ul) {
                ul ulVar = (ul) byiVar2;
                String str = ulVar.a.a;
                Set setBQ = ske.bQ(ske.bK(ulVar.b, new pp(str)));
                int size = list.size();
                int i4 = i3;
                while (i4 < size) {
                    byi byiVar3 = (byi) list.get(i4);
                    if (!(byiVar3 instanceof uk)) {
                        if (byiVar3 instanceof ul) {
                            boolean z2 = (ulVar.c || !((ul) byiVar3).c) ? z : false;
                            ul ulVar2 = (ul) byiVar3;
                            String str2 = ulVar2.a.a;
                            Set setBQ2 = ske.bQ(ske.bK(ulVar2.b, new pp(str2)));
                            if (z2 && (a.ao(str, str2) || !a.ao(setBQ, setBQ2))) {
                                numValueOf = Integer.valueOf(i4);
                                break;
                            }
                        } else {
                            continue;
                        }
                        i4++;
                        z = true;
                    } else {
                        if (setBQ.contains(new pp(((uk) byiVar3).a))) {
                            numValueOf = Integer.valueOf(i4);
                            break;
                        }
                        i4++;
                        z = true;
                    }
                }
                numValueOf = null;
            } else if (byiVar2 instanceof uk) {
                int size2 = list.size();
                for (int i5 = i3; i5 < size2; i5++) {
                    byi byiVar4 = (byi) list.get(i5);
                    if ((byiVar4 instanceof uk) && a.ao(((uk) byiVar4).a, ((uk) byiVar2).a)) {
                        numValueOf = Integer.valueOf(i5);
                        break;
                    }
                }
                numValueOf = null;
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                byi byiVar5 = (byi) list.get(numValueOf.intValue());
                Objects.toString(byiVar2);
                Objects.toString(byiVar5);
                linkedHashSet.add(Integer.valueOf(i2));
                if ((byiVar2 instanceof uk) && (byiVar5 instanceof uk)) {
                    ((uk) byiVar5).b.o(new sh(byiVar2, 3));
                }
            }
            i2 = i3;
            z = true;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ske.bL(linkedHashSet).iterator();
        while (it2.hasNext()) {
            arrayList2.add(list.remove(((Number) it2.next()).intValue() - arrayList2.size()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            uh.n((byi) it3.next());
        }
        return ufg.a;
    }
}
