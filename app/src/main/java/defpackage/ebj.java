package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebj extends dcv {
    public ebj(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
