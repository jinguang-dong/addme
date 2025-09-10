package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jek extends jdr {
    public jdu f;
    private int g;

    public jek() {
        this.g = 0;
        try {
            jdu jduVar = new jdu();
            this.f = jduVar;
            jduVar.j(jdm.d);
            this.a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            short s = 0;
            short s2 = 0;
            float f = -5.1000004f;
            for (int i = 0; i < 35; i++) {
                float f2 = -5.1000004f;
                for (int i2 = 0; i2 < 35; i2++) {
                    d(s2, f - 0.030000001f, f2);
                    short s3 = (short) (s2 + 1);
                    d(s3, f + 0.030000001f, f2);
                    short s4 = (short) (s3 + 1);
                    d(s4, f, (-0.030000001f) + f2);
                    short s5 = (short) (s4 + 1);
                    int i3 = s5 + 1;
                    d(s5, f, 0.030000001f + f2);
                    for (int i4 = 0; i4 < 4; i4++) {
                        this.c.put(s, (short) (s2 + i4));
                        s = (short) (s + 1);
                    }
                    s2 = (short) i3;
                    f2 += 0.3f;
                }
                f += 0.3f;
            }
            this.g = s;
        } catch (jds e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.jdr
    public final void c(float[] fArr) {
        this.f.c();
        this.f.j(jdm.d);
        this.f.g(this.a);
        this.f.e(this.b);
        this.f.f(fArr);
        this.c.position(0);
        GLES20.glDrawElements(1, this.g, 5123, this.c);
    }
}
