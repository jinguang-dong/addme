package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgs extends bgu {
    public bgs(bhc bhcVar) {
        super(bhcVar);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        bhd.a();
        throw new uer();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        bhd.a();
        throw new uer();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!ukc.c(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a.ao(this.a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bdv, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        bhc bhcVar = this.a;
        return new bhi(bhcVar, bhcVar.e().a.entrySet().iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        return ukc.c(obj) && this.a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        bdy bdyVar;
        int i;
        bgj bgjVarB;
        boolean zF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(ske.bq(collection, 10)), 16));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            uev uevVar = new uev(entry.getKey(), entry.getValue());
            linkedHashMap.put(uevVar.a, uevVar.b);
        }
        bhc bhcVar = this.a;
        boolean z = false;
        do {
            synchronized (bhd.a) {
                bhn bhnVar = bhcVar.a;
                bhnVar.getClass();
                bhb bhbVar = (bhb) bgr.e(bhnVar);
                bdyVar = bhbVar.a;
                i = bhbVar.b;
            }
            bdyVar.getClass();
            Set<Map.Entry> set = bhcVar.b;
            bdx bdxVarA = bdyVar.a();
            for (Map.Entry entry2 : set) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !a.ao(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    bdxVarA.remove(entry2.getKey());
                    z = true;
                }
            }
            bdy bdyVarA = bdxVarA.a();
            if (a.ao(bdyVarA, bdyVar)) {
                break;
            }
            bhn bhnVar2 = bhcVar.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zF = bhc.f((bhb) bgr.l(bhnVar2, bhcVar, bgjVarB), i, bdyVarA);
            }
            bgr.t(bgjVarB, bhcVar);
        } while (!zF);
        return z;
    }
}
