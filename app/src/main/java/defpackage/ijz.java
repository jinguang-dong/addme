package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijz implements ijq {
    public ime a;
    public final ijr b;
    private final float[] c = new float[16];

    public ijz(ijr ijrVar) {
        this.b = ijrVar;
    }

    @Override // defpackage.ijq
    public final void a() {
        ime imeVar = this.a;
        if (imeVar != null) {
            imeVar.a();
            this.a = null;
        }
    }

    @Override // defpackage.ijq
    public final void b() {
        float fMax;
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        ijr ijrVar = this.b;
        if (ijrVar.n) {
            float[] fArr = this.c;
            Matrix.setIdentityM(fArr, 0);
            ijrVar.getClass();
            float fMax2 = 0.9f;
            if (ijrVar.h) {
                Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, 0.05f, 0.0f, 0.0f);
                if (!ijrVar.m) {
                    Matrix.translateM(fArr, 0, 0.0f, ijrVar.g, 0.0f);
                }
                float f = ijrVar.g;
                float f2 = ijrVar.q;
                fMax = f + (f2 * Math.max(1.0f, 2.0f - (f / f2)));
            } else {
                Matrix.translateM(fArr, 0, 0.0f, 0.05f, 0.0f);
                if (!ijrVar.m) {
                    Matrix.translateM(fArr, 0, -ijrVar.g, 0.0f, 0.0f);
                }
                float f3 = ijrVar.g;
                float f4 = ijrVar.p;
                fMax2 = f3 + (f4 * Math.max(1.0f, 2.0f - (f3 / f4)));
                fMax = 0.9f;
            }
            Matrix.scaleM(fArr, 0, fMax2, fMax, 1.0f);
            if (ijrVar.h) {
                Matrix.translateM(fArr, 0, 0.0f, (-0.75f) - (Math.min(1.0f, ijrVar.g / ijrVar.q) * 0.25f), 0.0f);
            } else {
                Matrix.translateM(fArr, 0, (Math.min(1.0f, ijrVar.g / ijrVar.p) * 0.25f) - 0.25f, 0.0f, 0.0f);
            }
            ime imeVar = this.a;
            imeVar.getClass();
            imeVar.e(fArr);
            if (ijrVar.h) {
                ime imeVar2 = this.a;
                imeVar2.getClass();
                imeVar2.d(ijrVar.d, 2.0f);
            } else {
                ime imeVar3 = this.a;
                imeVar3.getClass();
                float f5 = ijrVar.a;
                imeVar3.d(f5 + f5, ijrVar.e);
            }
            ime imeVar4 = this.a;
            rnt.x(imeVar4);
            imeVar4.b();
            ijrVar.o.unbind();
        }
    }

    @Override // defpackage.ijq
    public final void c(int i, int i2) {
    }
}
