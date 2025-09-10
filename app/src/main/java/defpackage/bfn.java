package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfn {
    public bdp a;
    public final bdp b;
    public final bdp c;
    public zw d;
    private Set e;
    private final bdp f;
    private final List g;
    private final List h;
    private bhv i;
    private final zw j;
    private zw k;
    private final yo l;
    private final yo m;
    private final yo n;
    private final yo o;

    public bfn() {
        bdp bdpVar = new bdp(new bar[16]);
        this.f = bdpVar;
        int i = zx.a;
        zw zwVar = new zw((byte[]) null);
        this.j = zwVar;
        this.a = bdpVar;
        this.k = zwVar;
        this.b = new bdp(new Object[16]);
        this.c = new bdp(new uif[16]);
        this.g = new ArrayList();
        this.l = new yo((byte[]) null);
        this.m = new yo((byte[]) null);
        this.h = new ArrayList();
        this.n = new yo((byte[]) null);
        this.o = new yo((byte[]) null);
    }

    private final void h(int i) {
        List list = this.g;
        if (list.isEmpty()) {
            return;
        }
        List list2 = this.h;
        yo yoVar = this.n;
        yo yoVar2 = this.o;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            try {
                yo yoVar3 = this.m;
                if (i3 >= yoVar3.b) {
                    break;
                }
                if (i <= yoVar3.a(i3)) {
                    Object objRemove = list.remove(i3);
                    int iC = yoVar3.c(i3);
                    int iC2 = this.l.c(i3);
                    list2.add(objRemove);
                    yoVar.f(iC);
                    yoVar2.f(iC2);
                } else {
                    i3++;
                }
            } finally {
                list2.clear();
                yoVar.d();
                yoVar2.d();
            }
        }
        if (!list2.isEmpty()) {
            int size = list2.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = list2.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int iA = yoVar.a(i2);
                    int iA2 = yoVar.a(i5);
                    if (iA < iA2 || (iA2 == iA && yoVar2.a(i2) < yoVar2.a(i5))) {
                        Object obj = list2.get(i2);
                        list2.set(i2, list2.get(i5));
                        list2.set(i5, obj);
                        bad.d(yoVar2, i2, i5);
                        bad.d(yoVar, i2, i5);
                    }
                }
                i2 = i4;
            }
            bdp bdpVar = this.b;
            bdpVar.p(bdpVar.b, list2);
        }
    }

    public final void a() {
        this.e = null;
        this.i = null;
        bdp bdpVar = this.f;
        bdpVar.g();
        zw zwVar = this.j;
        zwVar.d();
        this.a = bdpVar;
        this.k = zwVar;
        this.b.g();
        this.c.g();
        this.d = null;
        this.g.clear();
        this.l.d();
        this.m.d();
    }

    public final void b() {
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            zk zkVar = new zk((zl) set, 0);
            while (zkVar.hasNext()) {
                baq baqVar = (baq) zkVar.next();
                zkVar.remove();
                baqVar.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.e;
        if (set == null) {
            return;
        }
        h(Integer.MIN_VALUE);
        bdp bdpVar = this.b;
        if (bdpVar.b != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                zw zwVar = this.d;
                int i = bdpVar.b;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Object obj = bdpVar.a[i];
                    try {
                        if (obj instanceof bar) {
                            baq baqVar = ((bar) obj).a;
                            set.remove(baqVar);
                            baqVar.b();
                        }
                        if (obj instanceof axy) {
                            if (zwVar == null || !zwVar.a(obj)) {
                                ((axy) obj).b();
                            } else {
                                ((axy) obj).c();
                            }
                        }
                    } catch (Throwable th) {
                        bhv bhvVar = this.i;
                        if (bhvVar != null) {
                            bhvVar.b(th, obj);
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        bdp bdpVar2 = this.f;
        if (bdpVar2.b != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.e;
                if (set2 != null) {
                    Object[] objArr = bdpVar2.a;
                    int i2 = bdpVar2.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        bar barVar = (bar) objArr[i3];
                        baq baqVar2 = barVar.a;
                        set2.remove(baqVar2);
                        try {
                            baqVar2.cU();
                        } catch (Throwable th2) {
                            bhv bhvVar2 = this.i;
                            if (bhvVar2 != null) {
                                bhvVar2.b(th2, barVar);
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d(bar barVar, int i, int i2, int i3) {
        if (this.k.a(barVar)) {
            this.k.l(barVar);
            this.a.m(barVar);
            Set set = this.e;
            if (set == null) {
                return;
            } else {
                set.add(barVar.a);
            }
        }
        e(barVar, i, i2, i3);
    }

    public final void e(Object obj, int i, int i2, int i3) {
        h(i);
        if (i3 < 0 || i3 >= i) {
            this.b.n(obj);
            return;
        }
        this.g.add(obj);
        this.l.f(i2);
        this.m.f(i3);
    }

    public final void f(bar barVar) {
        this.a.n(barVar);
        this.k.j(barVar);
    }

    public final void g(Set set, bhv bhvVar) {
        a();
        this.e = set;
        this.i = bhvVar;
    }
}
