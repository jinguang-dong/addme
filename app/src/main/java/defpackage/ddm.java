package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddm implements urk {
    final /* synthetic */ urk a;
    final /* synthetic */ dco b;
    final /* synthetic */ uiq c;

    public ddm(urk urkVar, dco dcoVar, uiq uiqVar) {
        this.a = urkVar;
        this.b = dcoVar;
        this.c = uiqVar;
    }

    @Override // defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) {
        Object objGc = this.a.gc(new ddl(urlVar, this.b, this.c), uhbVar);
        return objGc == uhi.a ? objGc : ufg.a;
    }
}
