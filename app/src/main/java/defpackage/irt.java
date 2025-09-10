package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public irt() {
        this.h = new jod((byte[]) null);
        this.e = new ezj();
        fbb fbbVar = new fbb(new cnl(20), new etz(2), new faz());
        this.b = fbbVar;
        this.f = new jod(fbbVar);
        this.g = new ejt((char[]) null, (byte[]) null);
        this.j = new jod();
        this.d = new ejt((short[]) null);
        this.a = new era();
        this.c = new ejt((char[]) null, (byte[]) null, (byte[]) null);
        this.i = new ejt((byte[]) null, (char[]) null);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ((jod) this.j).n(arrayList);
    }

    public final eqx a(Object obj) {
        return ((era) this.a).a(obj);
    }

    public final List b() {
        List listE = ((ejt) this.i).e();
        if (listE.isEmpty()) {
            throw new epd();
        }
        return listE;
    }

    public final List c(Object obj) {
        List listU = ((jod) this.f).u(obj.getClass());
        if (listU.isEmpty()) {
            throw new epe(obj);
        }
        int size = listU.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            evg evgVar = (evg) listU.get(i);
            if (evgVar.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(evgVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new epe(obj, listU);
        }
        return arrayList;
    }

    public final void d(Class cls, eqa eqaVar) {
        ((ejt) this.g).h(cls, eqaVar);
    }

    public final void e(Class cls, eqp eqpVar) {
        ((ejt) this.d).d(cls, eqpVar);
    }

    public final void f(Class cls, Class cls2, eqo eqoVar) {
        h("legacy_append", cls, cls2, eqoVar);
    }

    public final void g(Class cls, Class cls2, evh evhVar) {
        ((jod) this.f).v(cls, cls2, evhVar);
    }

    public final void h(String str, Class cls, Class cls2, eqo eqoVar) {
        ((jod) this.j).m(str, eqoVar, cls, cls2);
    }

    public final void i(eqc eqcVar) {
        ((ejt) this.i).f(eqcVar);
    }

    public final void j(eqw eqwVar) {
        ((era) this.a).b(eqwVar);
    }

    public final void k(Class cls, Class cls2, eyn eynVar) {
        ((ejt) this.c).k(cls, cls2, eynVar);
    }

    public irt(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, uem uemVar9, uem uemVar10) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        this.d = uemVar4;
        uemVar5.getClass();
        this.e = uemVar5;
        uemVar6.getClass();
        this.f = uemVar6;
        uemVar7.getClass();
        this.g = uemVar7;
        uemVar8.getClass();
        this.h = uemVar8;
        uemVar9.getClass();
        this.i = uemVar9;
        uemVar10.getClass();
        this.j = uemVar10;
    }
}
