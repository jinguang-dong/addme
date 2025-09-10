package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebp extends dcc {
    public ebp(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* bridge */ /* synthetic */ void b(dfq dfqVar, Object obj) {
        ebn ebnVar = (ebn) obj;
        dfqVar.g(1, (String) ebnVar.a);
        dfqVar.g(2, (String) ebnVar.b);
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
