package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class esx implements erx, equ {
    private final erw a;
    private final ery b;
    private int c;
    private int d = -1;
    private eqi e;
    private List f;
    private int g;
    private File h;
    private esy i;
    private volatile tdy j;

    public esx(ery eryVar, erw erwVar) {
        this.b = eryVar;
        this.a = erwVar;
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.erx
    public final void a() {
        tdy tdyVar = this.j;
        if (tdyVar != null) {
            tdyVar.b.dE();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void b(Object obj) {
        this.a.d(this.e, obj, this.j.b, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [eqv, java.lang.Object] */
    @Override // defpackage.erx
    public final boolean c() {
        List arrayList;
        ery eryVar = this.b;
        List listD = eryVar.d();
        boolean z = false;
        if (listD.isEmpty()) {
            return false;
        }
        irt irtVarB = eryVar.c.b();
        Class<?> cls = eryVar.d.getClass();
        Class cls2 = eryVar.g;
        Class cls3 = eryVar.j;
        Object obj = irtVarB.h;
        fav favVar = (fav) ((AtomicReference) ((jod) obj).b).getAndSet(null);
        if (favVar == null) {
            favVar = new fav(cls, cls2, cls3);
        } else {
            favVar.a(cls, cls2, cls3);
        }
        Object obj2 = ((jod) obj).a;
        synchronized (obj2) {
            arrayList = (List) ((aaa) obj2).get(favVar);
        }
        ((AtomicReference) ((jod) obj).b).set(favVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = ((jod) irtVarB.f).t(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : ((jod) irtVarB.j).l((Class) it.next(), cls2)) {
                    if (!((ejt) irtVarB.c).j(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            Object obj3 = irtVarB.h;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            Object obj4 = ((jod) obj3).a;
            synchronized (obj4) {
                ((aaa) obj4).put(new fav(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            ery eryVar2 = this.b;
            if (File.class.equals(eryVar2.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(eryVar2.d.getClass()) + " to " + String.valueOf(eryVar2.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    evg evgVar = (evg) list.get(i);
                    File file = this.h;
                    ery eryVar3 = this.b;
                    this.j = evgVar.b(file, eryVar3.e, eryVar3.f, eryVar3.h);
                    if (this.j != null && eryVar3.g(this.j.b.a())) {
                        this.j.b.f(eryVar3.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= listD.size()) {
                    return false;
                }
                this.d = 0;
            }
            eqi eqiVar = (eqi) listD.get(this.c);
            Class cls5 = (Class) arrayList.get(this.d);
            ery eryVar4 = this.b;
            this.i = new esy(eryVar4.h(), eqiVar, eryVar4.m, eryVar4.e, eryVar4.f, eryVar4.a(cls5), cls5, eryVar4.h);
            File fileA = eryVar4.c().a(this.i);
            this.h = fileA;
            if (fileA != null) {
                this.e = eqiVar;
                this.f = eryVar4.f(fileA);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqv, java.lang.Object] */
    @Override // defpackage.equ
    public final void e(Exception exc) {
        this.a.b(this.i, exc, this.j.b, 4);
    }
}
