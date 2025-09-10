package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwi {
    public final boolean a;
    public final boolean b;
    public final float c;
    private final boolean d = false;

    public gwi(boolean z, boolean z2, float f) {
        this.a = z;
        this.b = z2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwi)) {
            return false;
        }
        gwi gwiVar = (gwi) obj;
        boolean z = gwiVar.d;
        return this.a == gwiVar.a && this.b == gwiVar.b && Float.compare(this.c, gwiVar.c) == 0;
    }

    public final int hashCode() {
        int iO = a.o(false);
        float f = this.c;
        return (((((iO * 31) + a.o(this.a)) * 31) + a.o(this.b)) * 31) + Float.floatToIntBits(f);
    }

    public final String toString() {
        return "ZoomValueFormatParams(formatWithDecimalPoint=false, isTeleEnabled=" + this.a + ", roundDownUltrawide=" + this.b + ", hideDecimalPointThreshold=" + this.c + JvFFEwFNdCrxf.orrbbQeiJ;
    }
}
