package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uut implements url {
    private final uhf a;
    private final Object b;
    private final uiu c;

    public uut(url urlVar, uhf uhfVar) {
        this.a = uhfVar;
        this.b = uwe.a(uhfVar);
        this.c = new cwt(urlVar, (uhb) null, 4);
    }

    @Override // defpackage.url
    public final Object a(Object obj, uhb uhbVar) {
        Object objP = ujk.p(this.a, obj, this.b, this.c, uhbVar);
        return objP == uhi.a ? objP : ufg.a;
    }
}
