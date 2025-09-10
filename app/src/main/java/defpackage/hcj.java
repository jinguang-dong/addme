package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import j$.util.Comparator$EL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcj implements Iterable {
    private static final sgv a = sgv.g("hcj");
    private final TreeSet b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public hcj(ppj ppjVar) {
        int i = 0;
        this.b = new TreeSet(Comparator$EL.reversed(Comparator$EL.thenComparing(Comparator$EL.thenComparing(new hch(ppjVar, i), new hci(i)), new hci(2))));
    }

    public static String g(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    private final synchronized rwc m(fqc fqcVar) {
        ltd ltdVarD = fqcVar.d();
        Uri uriC = fqcVar.c();
        rnt.O((ltdVarD == null && uriC.equals(Uri.EMPTY)) ? false : true, "At least one of shotId or Uri should be set: %s", fqcVar);
        fqb fqbVar = ltdVarD != null ? (fqb) this.c.get(ltdVarD) : null;
        fqb fqbVar2 = (fqb) this.d.get(uriC);
        if (fqbVar != null && fqbVar2 != null) {
            rnt.P(fqbVar == fqbVar2, "Maps out of sync, byUri:%s, byShotId: %s", fqbVar2, fqbVar);
            return rwc.j(fqbVar);
        }
        if (fqbVar != null) {
            return rwc.j(fqbVar);
        }
        if (fqbVar2 != null) {
            return rwc.j(fqbVar2);
        }
        return rvk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [fqb, java.lang.Object] */
    private final synchronized boolean n(fqb fqbVar) {
        rwc rwcVarM = m(fqbVar.a());
        if (!rwcVarM.h()) {
            return false;
        }
        ?? C = rwcVarM.c();
        ltd ltdVarD = C.a().d();
        Uri uriC = C.a().c();
        if (ltdVarD != null) {
            ((fqb) this.c.remove(ltdVarD)).getClass();
        }
        if (!uriC.equals(Uri.EMPTY)) {
            ((fqb) this.d.remove(uriC)).getClass();
        }
        TreeSet treeSet = this.b;
        rnt.P(treeSet.remove(C), "Couldn't remove %s from filmstripItems=%s", C, treeSet);
        return true;
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final synchronized fqb b() {
        TreeSet treeSet = this.b;
        if (treeSet.isEmpty()) {
            return null;
        }
        return (fqb) treeSet.first();
    }

    final synchronized fqb c(Uri uri) {
        return (fqb) this.d.get(uri);
    }

    final synchronized fqb d(ltd ltdVar) {
        return (fqb) this.c.get(ltdVar);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [fqb, java.lang.Object] */
    public final synchronized fqb e(fqb fqbVar) {
        rwc rwcVarM = m(fqbVar.a());
        if (rwcVarM.h()) {
            return rwcVarM.c();
        }
        l(fqbVar);
        return fqbVar;
    }

    final synchronized fqb f() {
        TreeSet treeSet = this.b;
        if (treeSet.isEmpty()) {
            return null;
        }
        return (fqb) treeSet.last();
    }

    public final synchronized void h(Collection collection) {
        int i = ((sex) collection).c;
        TreeSet treeSet = this.b;
        rnt.N(treeSet.isEmpty(), "addAll must be called on an empty list. filmstripItems contains: %s", treeSet.size());
        Map map = this.d;
        rnt.N(map.isEmpty(), "addAll must be called on an empty list. uriFilmstripItemMap contains: %s", map.size());
        Map map2 = this.c;
        rnt.N(map2.isEmpty(), mNLbzhCxd.Nbrucy, map2.size());
        treeSet.addAll(collection);
        sgk it = ((sbp) collection).iterator();
        while (it.hasNext()) {
            fqb fqbVar = (fqb) it.next();
            ltd ltdVarD = fqbVar.a().d();
            Uri uriC = fqbVar.a().c();
            if (!uriC.equals(Uri.EMPTY)) {
                rnt.M(!map.containsKey(uriC), String.format(Locale.ROOT, "Multiple entries for uri: %s. %s & %s", uriC, map.get(uriC), fqbVar));
                map.put(uriC, fqbVar);
            }
            if (ltdVarD != null) {
                rnt.M(!map2.containsKey(ltdVarD), String.format(Locale.ROOT, "Multiple entries for shotId: %s. %s & %s", ltdVarD, map2.get(ltdVarD), fqbVar));
                map2.put(ltdVarD, fqbVar);
            }
        }
    }

    public final synchronized void i() {
        this.c.clear();
        this.d.clear();
        this.b.clear();
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new TreeSet((SortedSet) this.b).iterator();
    }

    public final synchronized boolean j(Uri uri) {
        fqb fqbVarC = c(uri);
        if (fqbVarC == null) {
            ((sgt) a.c().M(1161)).v("Uri %s not found in filmstrip", uri);
            return false;
        }
        return n(fqbVarC);
    }

    final synchronized void k(fqb fqbVar) {
        n(fqbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [fqb, java.lang.Object] */
    public final synchronized void l(fqb fqbVar) {
        fqc fqcVarA = fqbVar.a();
        ltd ltdVarD = fqcVarA.d();
        Uri uriC = fqcVarA.c();
        boolean z = true;
        if (ltdVarD == null && uriC.equals(Uri.EMPTY)) {
            z = false;
        }
        rnt.O(z, "At least one of shotId or Uri should be set: %s", fqbVar);
        rwc rwcVarM = m(fqcVarA);
        fqb fqbVar2 = fqbVar;
        if (rwcVarM.h()) {
            ?? C = rwcVarM.c();
            this.b.remove(C);
            C.e(fqcVarA);
            fqbVar2 = C;
        }
        if (ltdVarD != null) {
            this.c.put(ltdVarD, fqbVar2);
        }
        if (!uriC.equals(Uri.EMPTY)) {
            this.d.put(uriC, fqbVar2);
        }
        this.b.add(fqbVar2);
        rwcVarM.h();
    }
}
