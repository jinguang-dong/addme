package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqe implements urk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public iqe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, urk] */
    @Override // defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) {
        int i = this.b;
        if (i == 0) {
            Object objGc = this.a.gc(new iqb(urlVar, 2), uhbVar);
            return objGc == uhi.a ? objGc : ufg.a;
        }
        if (i == 1) {
            Object objGc2 = this.a.gc(new iqb(urlVar, 0), uhbVar);
            return objGc2 == uhi.a ? objGc2 : ufg.a;
        }
        if (i != 2) {
            Object objA = urlVar.a(this.a, uhbVar);
            return objA == uhi.a ? objA : ufg.a;
        }
        Object objGc3 = this.a.gc(new iqb(urlVar, 3), uhbVar);
        return objGc3 == uhi.a ? objGc3 : ufg.a;
    }
}
