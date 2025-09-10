package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ect extends dcc {
    public ect(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* bridge */ /* synthetic */ void b(dfq dfqVar, Object obj) {
        jod jodVar = (jod) obj;
        dfqVar.g(1, (String) jodVar.a);
        dfqVar.g(2, (String) jodVar.b);
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
