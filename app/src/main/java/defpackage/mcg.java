package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcg {
    public final int a;
    public final int b;
    public final double c;
    public final int d;

    public mcg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcg) {
            mcg mcgVar = (mcg) obj;
            if (this.a == mcgVar.a && this.b == mcgVar.b) {
                if (Double.doubleToLongBits(this.c) == Double.doubleToLongBits(mcgVar.c)) {
                    int i = this.d;
                    int i2 = mcgVar.d;
                    if (i == 0) {
                        throw null;
                    }
                    if (i == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        int i = this.d;
        a.aQ(i);
        return ((((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ i;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "null" : "AUDIO_ONLY" : "AUDIO_VISUAL";
        double d = this.c;
        int i2 = this.b;
        return "CocktailPartyConfig{sampleRate=" + this.a + ", numberOfChannels=" + i2 + ", noiseFraction=" + d + ", inputType=" + str + "}";
    }

    public mcg(int i, int i2, double d, int i3) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = i3;
    }
}
