package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ece extends dcv {
    public ece(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
