package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecb extends dcv {
    public ecb(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
