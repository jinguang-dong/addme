package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qfr {
    public final svx a;

    protected qfr(int[] iArr) {
        a.I(true);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (i2 < 0) {
                throw new IllegalArgumentException(a.bv(i2, "One dimension is < 0: "));
            }
        }
        this.a = new svx(Arrays.copyOf(iArr, 2));
    }

    public final int a() {
        svx svxVar = this.a;
        if (svxVar.a > 1) {
            return svxVar.a(1);
        }
        return 1;
    }

    public final int b() {
        return this.a.a(0);
    }

    public final qfq c() {
        int i = this.a.a;
        if (i == 2) {
            return new qfq(b(), a());
        }
        throw new IllegalArgumentException(a.bE(i, "Attempting to convert ", "D size to 2D!"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfr) {
            return this.a.equals(((qfr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        svx svxVar = this.a;
        Locale locale = Locale.ENGLISH;
        int i = svxVar.a;
        int iA = 0;
        if (i != 0) {
            iA = svxVar.a(0);
            for (int i2 = 1; i2 < i; i2++) {
                iA *= svxVar.a(i2);
            }
        }
        return String.format(locale, "Dimensions = %s, Volume = %d)", svxVar, Integer.valueOf(iA));
    }
}
