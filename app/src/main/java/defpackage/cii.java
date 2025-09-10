package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cii implements cig {
    private final float[] a;
    private final float[] b;

    public cii(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.cig
    public final float a(float f) {
        return chp.z(f, this.b, this.a);
    }

    @Override // defpackage.cig
    public final float b(float f) {
        return chp.z(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cii)) {
            return false;
        }
        cii ciiVar = (cii) obj;
        return Arrays.equals(this.a, ciiVar.a) && Arrays.equals(this.b, ciiVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(yoGAhrpjU.arZjCcj);
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
