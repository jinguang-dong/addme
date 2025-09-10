package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzw implements urk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dzw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, urk] */
    @Override // defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) throws Throwable {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            Object objZ = ung.z(urlVar, (urk[]) obj, new bsl(obj, 8), new dzv(null), uhbVar);
            return objZ == uhi.a ? objZ : ufg.a;
        }
        if (i != 1) {
            Object objGc = this.a.gc(new edq(urlVar, 0), uhbVar);
            return objGc == uhi.a ? objGc : ufg.a;
        }
        Object objGc2 = this.a.gc(new edq(urlVar, 1), uhbVar);
        return objGc2 == uhi.a ? objGc2 : ufg.a;
    }
}
