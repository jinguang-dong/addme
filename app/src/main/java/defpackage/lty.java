package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lty {
    RES_1080P,
    RES_2160P,
    RES_4320P;

    public static rwc b(oxj oxjVar) {
        oxj oxjVar2 = oxj.RES_UNKNOWN;
        switch (oxjVar.ordinal()) {
            case 8:
            case 9:
                return rwc.j(RES_1080P);
            case 10:
            case 11:
                return rwc.j(RES_2160P);
            default:
                return rvk.a;
        }
    }
}
