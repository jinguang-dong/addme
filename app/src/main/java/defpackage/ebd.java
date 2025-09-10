package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebd extends dcc {
    public ebd(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* bridge */ /* synthetic */ void b(dfq dfqVar, Object obj) {
        ebb ebbVar = (ebb) obj;
        dfqVar.g(1, ebbVar.a);
        dfqVar.e(2, ebbVar.b.longValue());
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
