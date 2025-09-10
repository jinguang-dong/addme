package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tlr extends tiv {
    final /* synthetic */ tiv a;
    final /* synthetic */ Class b;

    public tlr(tiv tivVar, Class cls) {
        this.a = tivVar;
        this.b = cls;
    }

    @Override // defpackage.tiv
    public final Object a(tml tmlVar) {
        Object objA = this.a.a(tmlVar);
        if (objA != null) {
            Class cls = this.b;
            if (!cls.isInstance(objA)) {
                Class<?> cls2 = objA.getClass();
                throw new tis("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + tmlVar.f());
            }
        }
        return objA;
    }
}
