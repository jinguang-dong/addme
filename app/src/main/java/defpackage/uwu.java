package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwu {
    public final Object a;
    public final uiv b;
    public final uiv c;
    public Object d;
    public int e = -1;
    final /* synthetic */ uwx f;
    private final uiv g;
    private final Object h;

    public uwu(uwx uwxVar, Object obj, uiv uivVar, uiv uivVar2, Object obj2, uiv uivVar3) {
        this.f = uwxVar;
        this.a = obj;
        this.b = uivVar;
        this.g = uivVar2;
        this.h = obj2;
        this.c = uivVar3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiu] */
    public final Object a(Object obj, uhb uhbVar) {
        return this.h.a(obj, uhbVar);
    }

    public final Object b(Object obj) {
        return this.g.a(this.a, null, obj);
    }

    public final void c() {
        Object obj = this.d;
        if (obj instanceof uvb) {
            ((uvb) obj).l(this.e, this.f.a);
            return;
        }
        unt untVar = obj instanceof unt ? (unt) obj : null;
        if (untVar != null) {
            untVar.fL();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uiv] */
    public final uiv d(uwx uwxVar, Object obj) {
        uiv uivVar = this.c;
        if (uivVar != null) {
            return uivVar.a(uwxVar, null, obj);
        }
        return null;
    }
}
