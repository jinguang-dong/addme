package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebi extends dcc {
    public ebi(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* bridge */ /* synthetic */ void b(dfq dfqVar, Object obj) {
        dfqVar.g(1, ((ebg) obj).a);
        dfqVar.e(2, r4.b);
        dfqVar.e(3, r4.c);
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
