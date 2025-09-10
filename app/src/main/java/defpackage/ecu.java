package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecu extends dcv {
    public ecu(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
