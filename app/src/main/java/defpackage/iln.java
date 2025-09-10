package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iln {
    public static final FloatBuffer a = rkf.g(qsz.b(-1.0f, -1.0f));
    public static final FloatBuffer b = rkf.g(qsz.b(0.0f, 0.0f));
    public Texture c = null;
    public final float[] d;
    public final float[] e;
    public rft f;
    public rfv g;
    public rfv h;
    public rfv i;
    public rfv j;
    public rfv k;

    public iln() {
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
    }
}
