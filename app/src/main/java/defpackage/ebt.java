package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebt extends dcv {
    public ebt(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
