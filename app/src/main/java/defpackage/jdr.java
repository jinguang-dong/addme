package defpackage;

import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jdr {
    private final float[] f;
    public FloatBuffer a = null;
    public FloatBuffer b = null;
    public ShortBuffer c = null;
    public final Vector d = new Vector();
    private final float[] g = new float[16];
    public jdt e = null;

    public jdr() {
        float[] fArr = new float[16];
        this.f = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void a(float[] fArr) {
        float[] fArr2 = this.f;
        float[] fArr3 = this.g;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        c(fArr3);
    }

    public abstract void c(float[] fArr);

    protected final void d(int i, float f, float f2) {
        int i2 = i * 3;
        this.a.put(i2, f);
        this.a.put(i2 + 1, -1.7f);
        this.a.put(i2 + 2, f2);
    }
}
