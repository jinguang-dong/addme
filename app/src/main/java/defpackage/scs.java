package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scs extends sbv implements NavigableMap, Map {
    public static final /* synthetic */ int c = 0;
    private static final scs d;
    private static final long serialVersionUID = 0;
    public final transient sfe a;
    public final transient sbp b;
    private transient scs e;

    static {
        sfe sfeVarP = scv.P(sel.a);
        int i = sbp.d;
        d = new scs(sfeVarP, sex.a);
    }

    public scs(sfe sfeVar, sbp sbpVar, scs scsVar) {
        this.a = sfeVar;
        this.b = sbpVar;
        this.e = scsVar;
    }

    static scs a(Comparator comparator) {
        if (sel.a.equals(comparator)) {
            return d;
        }
        sfe sfeVarP = scv.P(comparator);
        int i = sbp.d;
        return new scs(sfeVarP, sex.a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private final scs u(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return a(comparator());
        }
        return new scs(this.a.g(i, i2), this.b.subList(i, i2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ujp.ax(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.a.b;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.a.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        scs scsVar = this.e;
        return scsVar == null ? isEmpty() ? a(sem.b(comparator()).a()) : new scs((sfe) this.a.descendingSet(), this.b.fB(), this) : scsVar;
    }

    @Override // defpackage.sbv, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.sbv
    public final sbe f() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.sbv
    public final scn fC() {
        return isEmpty() ? sfd.a : new scp(this);
    }

    @Override // defpackage.sbv
    public final scn fD() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.sbv
    public final boolean fF() {
        return this.a.fA() || this.b.fA();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.a.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ujp.ax(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final scs headMap(Object obj, boolean z) {
        obj.getClass();
        return u(0, this.a.e(obj, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // defpackage.sbv, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            sfe r0 = r3.a
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            sbp r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.b     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            sbp r3 = r3.b
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scs.get(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.sbv
    /* renamed from: h */
    public final sbe values() {
        return this.b;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ujp.ax(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final scs subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        rnt.I(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final scs tailMap(Object obj, boolean z) {
        obj.getClass();
        return u(this.a.f(obj, z), size());
    }

    @Override // defpackage.sbv, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.a;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.a.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ujp.ax(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.a;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.sbv
    /* renamed from: t */
    public final /* synthetic */ scn keySet() {
        return this.a;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.sbv, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.b;
    }

    @Override // defpackage.sbv
    public Object writeReplace() {
        return new scr(this);
    }

    public scs(sfe sfeVar, sbp sbpVar) {
        this(sfeVar, sbpVar, null);
    }
}
