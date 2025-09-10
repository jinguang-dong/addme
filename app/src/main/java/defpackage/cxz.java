package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxz extends cxy {
    public cxz() {
        this((byte[]) null);
    }

    @Override // defpackage.cxy
    public final Object a(cxx cxxVar) {
        return this.b.get(cxxVar);
    }

    public final void b(cxx cxxVar, Object obj) {
        this.b.put(cxxVar, obj);
    }

    public cxz(cxy cxyVar) {
        cxyVar.getClass();
        this.b.putAll(cxyVar.b);
    }

    public /* synthetic */ cxz(byte[] bArr) {
        this(cxw.a);
    }
}
