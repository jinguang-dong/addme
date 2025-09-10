package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mmi {
    OFF,
    ON;

    private static final sgv c = sgv.g("mmi");

    public static mmi a(int i) {
        if (i == 0) {
            return OFF;
        }
        if (i == 1) {
            return ON;
        }
        ((sgt) c.c().M(4941)).t("Invalid tracking status: %d", i);
        return OFF;
    }
}
