package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.YuvImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ias {
    public final YuvImage a;
    public final InterleavedImageU8 b;

    public ias() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ias) {
            ias iasVar = (ias) obj;
            YuvImage yuvImage = this.a;
            if (yuvImage != null ? yuvImage.equals(iasVar.a) : iasVar.a == null) {
                InterleavedImageU8 interleavedImageU8 = this.b;
                if (interleavedImageU8 != null ? interleavedImageU8.equals(iasVar.b) : iasVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        YuvImage yuvImage = this.a;
        int iHashCode = yuvImage == null ? 0 : yuvImage.hashCode();
        InterleavedImageU8 interleavedImageU8 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (interleavedImageU8 != null ? interleavedImageU8.hashCode() : 0);
    }

    public final String toString() {
        InterleavedImageU8 interleavedImageU8 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(interleavedImageU8) + "}";
    }

    public ias(YuvImage yuvImage, InterleavedImageU8 interleavedImageU8) {
        this.a = yuvImage;
        this.b = interleavedImageU8;
    }
}
