package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class usp implements urk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public usp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uix] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, urk] */
    @Override // defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) throws Throwable {
        if (this.c != 0) {
            Object objGc = this.a.gc(new urx(new ujw(), urlVar, this.b, 0), uhbVar);
            return objGc == uhi.a ? objGc : ufg.a;
        }
        Object objZ = ung.z(urlVar, (urk[]) this.a, usq.a, new uso((uhb) null, (uix) this.b, 0), uhbVar);
        return objZ == uhi.a ? objZ : ufg.a;
    }
}
