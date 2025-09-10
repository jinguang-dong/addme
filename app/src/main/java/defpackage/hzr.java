package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hzr {
    public final float a;
    public final float b;

    public hzr(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "ShortTeT: %f, LongTeT: %f", Float.valueOf(this.a), Float.valueOf(this.b));
    }
}
