package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgv extends bgu {
    public bgv(bhc bhcVar) {
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
        return this.a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bdv, java.util.Set] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        bhc bhcVar = this.a;
        return new bhk(bhcVar, bhcVar.e().a.entrySet().iterator(), 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        bhc bhcVar = this.a;
        Iterator it = bhcVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (a.ao(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        bhcVar.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        bdy bdyVar;
        int i;
        bgj bgjVarB;
        boolean zF;
        Set setBQ = ske.bQ(collection);
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
            for (Map.Entry entry : set) {
                if (setBQ.contains(entry.getValue())) {
                    bdxVarA.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        bdy bdyVar;
        int i;
        bgj bgjVarB;
        boolean zF;
        Set setBQ = ske.bQ(collection);
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
            for (Map.Entry entry : set) {
                if (!setBQ.contains(entry.getValue())) {
                    bdxVarA.remove(entry.getKey());
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
