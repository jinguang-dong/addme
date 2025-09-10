package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikb implements ijq {
    private final float[] a = new float[16];
    private final float[] b = {1.0f, 1.0f, 1.0f, 1.0f};
    private imd c = new imd();
    private final ijr d;

    public ikb(ijr ijrVar) {
        this.d = ijrVar;
    }

    @Override // defpackage.ijq
    public final void a() {
        imd imdVar = this.c;
        if (imdVar != null) {
            rft rftVar = imdVar.f;
            if (rftVar != null) {
                rftVar.c();
                imdVar.f = null;
            }
            this.c = null;
        }
    }

    @Override // defpackage.ijq
    public final void b() {
        if (this.c != null) {
            ijr ijrVar = this.d;
            if (ijrVar.n) {
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                float[] fArr = ijrVar.i;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float[] fArr2 = this.b;
                fArr2[0] = f;
                fArr2[1] = f2;
                fArr2[2] = f3;
                float[] fArr3 = this.a;
                Matrix.setIdentityM(fArr3, 0);
                Matrix.translateM(fArr3, 0, ijrVar.b, ijrVar.c, 0.0f);
                Matrix.multiplyMM(fArr3, 0, fArr3, 0, ijrVar.f, 0);
                imd imdVar = this.c;
                imdVar.getClass();
                float f4 = ijrVar.d;
                float f5 = -f4;
                float f6 = ijrVar.e;
                float f7 = f6 / 2.0f;
                float f8 = f4 / 2.0f;
                float[] fArr4 = imd.a;
                float f9 = f5 / 2.0f;
                fArr4[0] = f9;
                fArr4[1] = f7;
                fArr4[2] = f9;
                float f10 = f7 - 0.01f;
                fArr4[3] = f10;
                fArr4[4] = f8;
                fArr4[5] = f10;
                fArr4[6] = f9;
                fArr4[7] = f7;
                fArr4[8] = f8;
                fArr4[9] = f10;
                fArr4[10] = f8;
                fArr4[11] = f7;
                fArr4[12] = f9;
                fArr4[13] = f10;
                fArr4[14] = f9;
                float f11 = (-f6) / 2.0f;
                float f12 = f11 + 0.01f;
                fArr4[15] = f12;
                float f13 = 0.01f + f9;
                fArr4[16] = f13;
                fArr4[17] = f10;
                fArr4[18] = f13;
                fArr4[19] = f10;
                fArr4[20] = f9;
                fArr4[21] = f12;
                fArr4[22] = f13;
                fArr4[23] = f12;
                float f14 = (-0.01f) + f8;
                fArr4[24] = f14;
                fArr4[25] = f10;
                fArr4[26] = f14;
                fArr4[27] = f12;
                fArr4[28] = f8;
                fArr4[29] = f10;
                fArr4[30] = f8;
                fArr4[31] = f10;
                fArr4[32] = f14;
                fArr4[33] = f12;
                fArr4[34] = f8;
                fArr4[35] = f12;
                fArr4[36] = f9;
                fArr4[37] = f12;
                fArr4[38] = f9;
                fArr4[39] = f11;
                fArr4[40] = f8;
                fArr4[41] = f11;
                fArr4[42] = f9;
                fArr4[43] = f12;
                fArr4[44] = f8;
                fArr4[45] = f11;
                fArr4[46] = f8;
                fArr4[47] = f12;
                imdVar.b = rkf.g(fArr4);
                imd imdVar2 = this.c;
                imdVar2.getClass();
                System.arraycopy(fArr3, 0, imdVar2.c, 0, 16);
                imd imdVar3 = this.c;
                imdVar3.getClass();
                System.arraycopy(fArr2, 0, imdVar3.e, 0, 4);
                imd imdVar4 = this.c;
                imdVar4.getClass();
                if (imdVar4.f == null) {
                    imdVar4.f = new rft("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
                    imdVar4.g = imdVar4.f.a("vertexTransform");
                    imdVar4.h = imdVar4.f.a("projectionMatrix");
                    imdVar4.i = imdVar4.f.a("fillColor");
                    imdVar4.j = imdVar4.f.e("vertexAttrib");
                }
                rft rftVar = imdVar4.f;
                rftVar.getClass();
                rftVar.b();
                imdVar4.j.f();
                imdVar4.j.g(imdVar4.b, 2);
                imdVar4.g.b(imdVar4.c);
                imdVar4.h.b(imdVar4.d);
                imdVar4.i.c(imdVar4.e);
                GLES20.glDrawArrays(4, 0, imdVar4.b.capacity() / 2);
                imdVar4.j.e();
                rftVar.d();
            }
        }
    }

    @Override // defpackage.ijq
    public final void c(int i, int i2) {
        imd imdVar = this.c;
        if (imdVar != null) {
            float f = i / i2;
            Matrix.orthoM(imdVar.d, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        }
    }
}
