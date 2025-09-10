package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikn implements ijq {
    public final ime a;
    private final ijr b;
    private final imc c;
    private final imb d;
    private final float[] e = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};
    private final float[] f = new float[8];

    public ikn(Texture texture, ijr ijrVar) {
        this.b = ijrVar;
        ime imeVar = new ime();
        this.a = imeVar;
        imeVar.b = texture;
        imeVar.c = 33069;
        this.c = new imc();
        this.d = new imb();
    }

    @Override // defpackage.ijq
    public final void a() {
        this.a.a();
        this.c.a();
        this.d.a();
    }

    @Override // defpackage.ijq
    public final void b() {
        ijr ijrVar = this.b;
        GLES20.glViewport(0, 0, ijrVar.j, ijrVar.k);
        GLES20.glClear(16384);
        ime imeVar = this.a;
        imeVar.b();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        imc imcVar = this.c;
        imcVar.e(this.e);
        float f = ijrVar.a;
        imcVar.d(-f, 1.0f, f, -1.0f);
        imcVar.b();
        GLES20.glDisable(3042);
        if (!ijrVar.n) {
            int i = ijrVar.j;
            int i2 = ijrVar.k;
            GLES20.glViewport(i / 4, i2 / 4, i / 2, i2 / 2);
            if (ijrVar.h) {
                int i3 = ijrVar.j;
                ijrVar.getClass();
                int i4 = ijrVar.k;
                ijrVar.getClass();
                GLES20.glScissor((int) ((i3 / 4) * 1.1f), i4 / 4, (int) ((i3 / 2) * 0.9f), i4 / 2);
            } else {
                int i5 = ijrVar.j;
                int i6 = ijrVar.k;
                ijrVar.getClass();
                ijrVar.getClass();
                GLES20.glScissor(i5 / 4, (int) ((i6 / 4) * 1.1f), i5 / 2, (int) ((i6 / 2) * 0.9f));
            }
            GLES20.glEnable(3089);
            imeVar.b();
            GLES20.glDisable(3089);
        }
        GLES20.glViewport(0, 0, ijrVar.j, ijrVar.k);
        if (ijrVar.h) {
            float f2 = ijrVar.d / 2.0f;
            float[] fArr = this.f;
            float f3 = -f2;
            fArr[0] = f3;
            fArr[1] = 1.0f;
            fArr[2] = f3;
            fArr[3] = -1.0f;
            fArr[4] = f2;
            fArr[5] = 1.0f;
            fArr[6] = f2;
            fArr[7] = -1.0f;
        } else {
            float f4 = ijrVar.e / 2.0f;
            float[] fArr2 = this.f;
            float f5 = ijrVar.a;
            float f6 = -f5;
            fArr2[0] = f6;
            fArr2[1] = f4;
            fArr2[2] = f5;
            fArr2[3] = f4;
            fArr2[4] = f6;
            float f7 = -f4;
            fArr2[5] = f7;
            fArr2[6] = f5;
            fArr2[7] = f7;
        }
        imb imbVar = this.d;
        imbVar.c(this.f, 2.0f);
        imbVar.b();
    }

    @Override // defpackage.ijq
    public final void c(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.c.c(f, f2);
        this.d.d(f, f2);
    }
}
