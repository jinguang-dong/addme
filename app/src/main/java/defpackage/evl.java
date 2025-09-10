package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evl {
    private static final evg a = new evk(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final cnj d;

    public evl(cnj cnjVar) {
        this.d = cnjVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [evh, java.lang.Object] */
    private final evg e(tdy tdyVar) {
        evg evgVarB = tdyVar.c.b(this);
        eoz.k(evgVarB);
        return evgVarB;
    }

    public final synchronized evg a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (tdy tdyVar : this.b) {
                Set set = this.c;
                if (set.contains(tdyVar)) {
                    z = true;
                } else if (tdyVar.d(cls) && ((Class) tdyVar.b).isAssignableFrom(cls2)) {
                    set.add(tdyVar);
                    arrayList.add(e(tdyVar));
                    set.remove(tdyVar);
                }
            }
            if (arrayList.size() > 1) {
                return new evj(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (evg) arrayList.get(0);
            }
            if (!z) {
                throw new epe(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (tdy tdyVar : this.b) {
                Set set = this.c;
                if (!set.contains(tdyVar) && tdyVar.d(cls)) {
                    set.add(tdyVar);
                    arrayList.add(e(tdyVar));
                    set.remove(tdyVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (tdy tdyVar : this.b) {
            Object obj = tdyVar.b;
            if (!arrayList.contains(obj) && tdyVar.d(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, evh evhVar) {
        tdy tdyVar = new tdy(cls, cls2, evhVar);
        List list = this.b;
        list.add(list.size(), tdyVar);
    }
}
