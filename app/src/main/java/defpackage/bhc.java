package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhc implements Map, bhl, ukg {
    public bhn a;
    public final Set b;
    private final Set c;
    private final Collection d;

    public bhc() {
        bem bemVar = bem.a;
        bgj bgjVarB = bgr.b();
        bhb bhbVar = new bhb(bgjVarB.v(), bemVar);
        if (!(bgjVarB instanceof bge)) {
            bhbVar.h = new bhb(1L, bemVar);
        }
        this.a = bhbVar;
        this.b = new bgs(this);
        this.c = new bgt(this);
        this.d = new bgv(this);
    }

    public static final boolean f(bhb bhbVar, int i, bdy bdyVar) {
        boolean z;
        synchronized (bhd.a) {
            int i2 = bhbVar.b;
            if (i2 == i) {
                bhbVar.a = bdyVar;
                z = true;
                bhbVar.b = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final int a() {
        return e().b;
    }

    public final int b() {
        return e().a.size();
    }

    @Override // defpackage.bhl
    public final bhn c() {
        return this.a;
    }

    @Override // java.util.Map
    public final void clear() {
        bgj bgjVarB;
        bhn bhnVar = this.a;
        bhnVar.getClass();
        bdy bdyVar = ((bhb) bgr.e(bhnVar)).a;
        bem bemVar = bem.a;
        if (bemVar != bdyVar) {
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                bhb bhbVar = (bhb) bgr.l(bhnVar2, this, bgjVarB);
                synchronized (bhd.a) {
                    bhbVar.a = bemVar;
                    bhbVar.b++;
                }
            }
            bgr.t(bgjVarB, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().a.containsValue(obj);
    }

    @Override // defpackage.bhl
    public final void d(bhn bhnVar) {
        bhnVar.getClass();
        this.a = (bhb) bhnVar;
    }

    public final bhb e() {
        bhn bhnVar = this.a;
        bhnVar.getClass();
        return (bhb) bgr.j(bhnVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // defpackage.bhl
    public final /* synthetic */ bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        return null;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        bdy bdyVar;
        int i;
        Object objPut;
        bgj bgjVarB;
        boolean zF;
        do {
            synchronized (bhd.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bhb bhbVar = (bhb) bgr.e(bhnVar);
                bdyVar = bhbVar.a;
                i = bhbVar.b;
            }
            bdyVar.getClass();
            bdx bdxVarA = bdyVar.a();
            objPut = bdxVarA.put(obj, obj2);
            bdy bdyVarA = bdxVarA.a();
            if (a.ao(bdyVarA, bdyVar)) {
                break;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zF = f((bhb) bgr.l(bhnVar2, this, bgjVarB), i, bdyVarA);
            }
            bgr.t(bgjVarB, this);
        } while (!zF);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        bdy bdyVar;
        int i;
        bgj bgjVarB;
        boolean zF;
        do {
            synchronized (bhd.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bhb bhbVar = (bhb) bgr.e(bhnVar);
                bdyVar = bhbVar.a;
                i = bhbVar.b;
            }
            bdyVar.getClass();
            bdx bdxVarA = bdyVar.a();
            bdxVarA.putAll(map);
            bdy bdyVarA = bdxVarA.a();
            if (a.ao(bdyVarA, bdyVar)) {
                return;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zF = f((bhb) bgr.l(bhnVar2, this, bgjVarB), i, bdyVarA);
            }
            bgr.t(bgjVarB, this);
        } while (!zF);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        bdy bdyVar;
        int i;
        Object objRemove;
        bgj bgjVarB;
        boolean zF;
        do {
            synchronized (bhd.a) {
                bhn bhnVar = this.a;
                bhnVar.getClass();
                bhb bhbVar = (bhb) bgr.e(bhnVar);
                bdyVar = bhbVar.a;
                i = bhbVar.b;
            }
            bdyVar.getClass();
            bdx bdxVarA = bdyVar.a();
            objRemove = bdxVarA.remove(obj);
            bdy bdyVarA = bdxVarA.a();
            if (a.ao(bdyVarA, bdyVar)) {
                break;
            }
            bhn bhnVar2 = this.a;
            bhnVar2.getClass();
            synchronized (bgr.b) {
                bgjVarB = bgr.b();
                zF = f((bhb) bgr.l(bhnVar2, this, bgjVarB), i, bdyVarA);
            }
            bgr.t(bgjVarB, this);
        } while (!zF);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    public final String toString() {
        bhn bhnVar = this.a;
        bhnVar.getClass();
        return "SnapshotStateMap(value=" + ((bhb) bgr.e(bhnVar)).a + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
