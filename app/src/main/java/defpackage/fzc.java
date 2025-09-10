package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzc {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final int d;
    public final int e;
    public final float f;

    public fzc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzc) {
            fzc fzcVar = (fzc) obj;
            if (this.a == fzcVar.a && this.b == fzcVar.b && this.c == fzcVar.c && this.d == fzcVar.d && this.e == fzcVar.e) {
                if (Float.floatToIntBits(this.f) == Float.floatToIntBits(fzcVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = true == this.b ? 1231 : 1237;
        long j = this.c;
        return Float.floatToIntBits(this.f) ^ ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "CocktailPartyStats{isAudioFallback=" + this.a + ", isMouthCovered=" + this.b + ", getAudioFrameCount=" + this.c + ", getAudioFrameDropCount=" + this.d + ", getAudioMaxFrameDropCount=" + this.e + ", getNoiseFraction=" + this.f + "}";
    }

    public fzc(boolean z, boolean z2, long j, int i, int i2, float f) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = f;
    }
}
