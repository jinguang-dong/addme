package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eca extends dcv {
    public eca(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
