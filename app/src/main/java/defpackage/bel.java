package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bel extends bek implements Map.Entry, ukf {
    private Object b;
    private final boi c;

    public bel(boi boiVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.c = boiVar;
        this.b = obj2;
    }

    @Override // defpackage.bek, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.bek, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        Iterator it = this.c.a;
        bep bepVar = (bep) it;
        beo beoVar = bepVar.d;
        Object obj3 = this.a;
        if (!beoVar.containsKey(obj3)) {
            return obj2;
        }
        ben benVar = (ben) it;
        if (benVar.c) {
            Object objA = benVar.a();
            beoVar.put(obj3, obj);
            bepVar.b(objA != null ? objA.hashCode() : 0, beoVar.a, objA, 0);
        } else {
            beoVar.put(obj3, obj);
        }
        bepVar.e = beoVar.c;
        return obj2;
    }
}
