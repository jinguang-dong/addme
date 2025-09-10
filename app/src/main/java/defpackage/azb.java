package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azb {
    public static final bay a = new bay();

    public static final und a(uhf uhfVar, ayc aycVar) {
        uhfVar.get(uol.c);
        return new bat(((ayg) aycVar).u, uhfVar);
    }

    public static final void b(Object obj, Object obj2, uiq uiqVar, ayc aycVar) {
        boolean zB = aycVar.B(obj) | aycVar.B(obj2);
        Object objF = aycVar.f();
        if (zB || objF == ayb.a) {
            objF = new ayx(uiqVar);
            aycVar.w(objF);
        }
    }

    public static final void c(Object obj, uiq uiqVar, ayc aycVar) {
        boolean zB = aycVar.B(obj);
        Object objF = aycVar.f();
        if (zB || objF == ayb.a) {
            objF = new ayx(uiqVar);
            aycVar.w(objF);
        }
    }

    public static final void d(Object[] objArr, uiq uiqVar, ayc aycVar) {
        boolean zB = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zB |= aycVar.B(obj);
        }
        Object objF = aycVar.f();
        if (zB || objF == ayb.a) {
            aycVar.w(new ayx(uiqVar));
        }
    }

    public static final void e(Object obj, Object obj2, uiu uiuVar, ayc aycVar) {
        uhf uhfVarG = aycVar.g();
        boolean zB = aycVar.B(obj) | aycVar.B(obj2);
        Object objF = aycVar.f();
        if (zB || objF == ayb.a) {
            objF = new azk(uhfVarG, uiuVar);
            aycVar.w(objF);
        }
    }

    public static final void f(Object obj, uiu uiuVar, ayc aycVar) {
        uhf uhfVarG = aycVar.g();
        boolean zB = aycVar.B(obj);
        Object objF = aycVar.f();
        if (zB || objF == ayb.a) {
            objF = new azk(uhfVarG, uiuVar);
            aycVar.w(objF);
        }
    }

    public static final void g(uif uifVar, ayc aycVar) {
        aycVar.q(uifVar);
    }
}
