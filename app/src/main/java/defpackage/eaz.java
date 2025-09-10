package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eaz extends dcc {
    public eaz(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* bridge */ /* synthetic */ void b(dfq dfqVar, Object obj) {
        ebn ebnVar = (ebn) obj;
        dfqVar.g(1, (String) ebnVar.b);
        dfqVar.g(2, (String) ebnVar.a);
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
