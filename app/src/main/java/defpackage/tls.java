package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tls implements tiw {
    final /* synthetic */ Class a;
    final /* synthetic */ tiv b;
    private final /* synthetic */ int c;

    public tls(Class cls, tiv tivVar, int i) {
        this.c = i;
        this.a = cls;
        this.b = tivVar;
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        if (this.c != 0) {
            if (tmkVar.a == this.a) {
                return this.b;
            }
            return null;
        }
        Class<?> cls = tmkVar.a;
        if (this.a.isAssignableFrom(cls)) {
            return new tlr(this.b, cls);
        }
        return null;
    }

    public final String toString() {
        if (this.c != 0) {
            Class cls = this.a;
            tiv tivVar = this.b;
            return "Factory[type=" + cls.getName() + ",adapter=" + tivVar.toString() + "]";
        }
        Class cls2 = this.a;
        tiv tivVar2 = this.b;
        return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + tivVar2.toString() + "]";
    }
}
