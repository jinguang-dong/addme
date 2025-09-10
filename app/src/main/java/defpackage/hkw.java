package defpackage;

import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hkw implements paq {
    public final float a;
    public final long[] b;
    public final long[] c;
    private final long d;

    public hkw() {
        throw null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        FaceMetadataNative.releaseFaceThumbnails(this.b);
        FaceMetadataNative.releaseFaceInfos(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkw) {
            hkw hkwVar = (hkw) obj;
            if (this.d == hkwVar.d) {
                if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hkwVar.a)) {
                    if (Arrays.equals(this.b, hkwVar instanceof hkw ? hkwVar.b : hkwVar.b) && Arrays.equals(this.c, hkwVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        int iFloatToIntBits = ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        long[] jArr = this.c;
        return "{" + this.d + ", " + this.a + ", " + Arrays.toString(this.b) + ", " + Arrays.toString(jArr) + "}";
    }

    public hkw(long j, float f, long[] jArr, long[] jArr2) {
        this.d = j;
        this.a = f;
        jArr.getClass();
        this.b = jArr;
        this.c = jArr2;
    }
}
