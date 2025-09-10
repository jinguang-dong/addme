package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfq extends qfr {
    public qfq(int i, int i2) {
        super(new int[]{i, i2});
    }

    @Override // defpackage.qfr
    public final String toString() {
        return String.format(Locale.ENGLISH, "Size(%d, %d)", Integer.valueOf(b()), Integer.valueOf(a()));
    }
}
