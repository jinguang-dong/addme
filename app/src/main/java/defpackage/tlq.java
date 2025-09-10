package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlq implements tiw {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ tiv c;
    private final /* synthetic */ int d;

    public tlq(Class cls, Class cls2, tiv tivVar, int i) {
        this.d = i;
        this.a = cls;
        this.b = cls2;
        this.c = tivVar;
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        if (this.d != 0) {
            Class cls = tmkVar.a;
            if (cls == this.b || cls == this.a) {
                return this.c;
            }
            return null;
        }
        Class cls2 = tmkVar.a;
        if (cls2 == this.a || cls2 == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        if (this.d != 0) {
            Class cls = this.a;
            Class cls2 = this.b;
            tiv tivVar = this.c;
            return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + tivVar.toString() + "]";
        }
        Class cls3 = this.a;
        Class cls4 = this.b;
        tiv tivVar2 = this.c;
        return "Factory[type=" + cls3.getName() + "+" + cls4.getName() + ",adapter=" + tivVar2.toString() + "]";
    }

    public tlq(Class cls, Class cls2, tiv tivVar, int i, byte[] bArr) {
        this.d = i;
        this.b = cls;
        this.a = cls2;
        this.c = tivVar;
    }
}
