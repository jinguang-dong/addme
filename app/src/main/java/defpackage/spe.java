package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum spe implements tpk {
    UNKNOWN(0),
    SUCCESS(1),
    FAILED(2),
    CANCELLED(3),
    COMMAND_FAILED(4),
    FIRST_VF_CAPTURE_FAILED(5),
    SECOND_VF_CAPTURE_FAILED(6),
    HDR_FAILED(7),
    MERGE_FAILED(8),
    CANCELLED_BY_USER(9),
    CANCELLED_BY_DISTANCE(10),
    FIRST_VF_CAPTURE_TOO_MANY_PEOPLE(11),
    SECOND_VF_CAPTURE_TOO_MANY_PEOPLE(12),
    CANCELLED_BY_AVAILABILITY(13),
    MERGE_FAILED_NO_PERSON(14),
    MERGE_FAILED_INVALID_CAPTURE_FOR_MERGE(15),
    MERGE_FAILED_MORE_THAN_ONE_ADDED_PERSON(16),
    MERGE_FAILED_NO_NEW_PEOPLE(17);

    public final int s;

    spe(int i) {
        this.s = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
