package defpackage;

import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ery {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public epa c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public eqm h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public eqi m;
    public epb n;
    public esh o;
    public boolean p;
    public boolean q;
    public esj r;

    /* JADX WARN: Type inference failed for: r5v0, types: [cnj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [cnj, java.lang.Object] */
    final esu b(Class cls) {
        esu esuVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        irt irtVarB = this.c.b();
        ezj ezjVar = (ezj) irtVarB.e;
        AtomicReference atomicReference = ezjVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        esu esuVar2 = null;
        fav favVar = (fav) atomicReference.getAndSet(null);
        if (favVar == null) {
            favVar = new fav();
        }
        favVar.a(cls5, cls6, cls7);
        yd ydVar = ezjVar.b;
        synchronized (ydVar) {
            esuVar = (esu) ydVar.get(favVar);
        }
        ezjVar.c.set(favVar);
        Object obj = irtVarB.e;
        esu esuVar3 = ezj.a;
        if (esuVar3.equals(esuVar)) {
            return null;
        }
        if (esuVar != null) {
            return esuVar;
        }
        ArrayList arrayList = new ArrayList();
        jod jodVar = (jod) irtVarB.j;
        for (Class cls8 : jodVar.l(cls5, cls6)) {
            ejt ejtVar = (ejt) irtVarB.c;
            for (Class cls9 : ejtVar.j(cls8, cls7)) {
                arrayList.add(new esb(cls5, cls8, cls9, jodVar.k(cls5, cls8), ejtVar.i(cls8, cls9), irtVarB.b));
                cls5 = cls;
                ejtVar = ejtVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            esuVar2 = new esu(cls2, cls3, cls4, arrayList, irtVarB.b);
        }
        yd ydVar2 = ((ezj) obj).b;
        synchronized (ydVar2) {
            fav favVar2 = new fav(cls2, cls3, cls4);
            if (esuVar2 != null) {
                esuVar3 = esuVar2;
            }
            ydVar2.put(favVar2, esuVar3);
        }
        return esuVar2;
    }

    final ett c() {
        return this.r.a();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List d() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List listE = e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                tdy tdyVar = (tdy) listE.get(i);
                Object obj = tdyVar.c;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = tdyVar.a;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((eqi) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List listC = this.c.b().c(this.d);
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                tdy tdyVarB = ((evg) listC.get(i)).b(this.d, this.e, this.f, this.h);
                if (tdyVarB != null) {
                    list.add(tdyVarB);
                }
            }
        }
        return this.a;
    }

    final List f(File file) {
        return this.c.b().c(file);
    }

    final boolean g(Class cls) {
        return b(cls) != null;
    }

    final etl h() {
        return this.c.e;
    }

    final eqq a(Class cls) {
        eqq eqqVar = (eqq) this.i.get(cls);
        if (eqqVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    eqqVar = (eqq) entry.getValue();
                    break;
                }
            }
        }
        if (eqqVar != null) {
            return eqqVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(mn.i(cls, VnmwoBe.OkoTbTXs, ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return ewb.b;
    }
}
