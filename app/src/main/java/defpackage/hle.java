package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hle {
    public final float[] a;
    private final hlg b;
    private final long c;

    public hle(hlg hlgVar, long j, float[] fArr) {
        this.b = hlgVar;
        this.c = j;
        this.a = fArr;
    }

    public static hle b(hlg hlgVar, long j) {
        return new hle(hlgVar, j, new float[0]);
    }

    public static hle c(hlg hlgVar, long j, float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, i, fArr2, 0, i2);
        return new hle(hlgVar, j, fArr2);
    }

    public final float a(int i) {
        return this.a[i];
    }

    public final boolean d() {
        return this.a.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hle)) {
            return false;
        }
        hle hleVar = (hle) obj;
        return this.c == hleVar.c && this.b.equals(hleVar.b) && Arrays.equals(this.a, hleVar.a);
    }

    public final int hashCode() {
        return (Objects.hash(this.b, Long.valueOf(this.c)) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "f(" + this.c + SHXc.yiLNtIirk + Arrays.toString(this.a);
    }
}
