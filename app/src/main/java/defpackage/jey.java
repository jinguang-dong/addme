package defpackage;

import android.opengl.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jey implements jew {
    private boolean a;
    private final ArrayList b = new ArrayList();
    private final float[] c;

    public jey(boolean z) {
        this.a = true;
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = z;
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // defpackage.jew
    public final void a(float f, jer jerVar, float[] fArr, int i, int i2) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        boolean z = this.a;
        float f2 = true != z ? 0.0f : 1.0f;
        float f3 = true != z ? 1.0f : 0.0f;
        int i3 = 0;
        for (int i4 = -2; i4 <= 2; i4++) {
            if (i4 != 0) {
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.rotateM(fArr2, 0, i4 * 20.0f * f, f3, f2, 0.0f);
                arrayList.add(i3, fArr2);
                i3++;
            }
        }
        float[] fArr3 = this.c;
        jfe jfeVar = jerVar.g;
        if (jfeVar == null || jerVar.e == null) {
            return;
        }
        jfeVar.c();
        jerVar.g.j(1.0f);
        int i5 = 0;
        while (i5 < arrayList.size()) {
            try {
                float[] fArr4 = (float[]) arrayList.get(i5);
                jdv jdvVar = jerVar.e;
                float[] fArr5 = jerVar.k;
                float[] fArr6 = fArr3;
                Matrix.multiplyMM(fArr5, 0, fArr6, 0, fArr4, 0);
                float[] fArr7 = jerVar.j;
                Matrix.multiplyMV(fArr7, 0, fArr5, 0, jerVar.i, 0);
                jer.c(fArr7);
                float f4 = fArr7[0];
                float f5 = jerVar.m;
                float f6 = (f4 * f5) + f5;
                float f7 = fArr7[1];
                float f8 = jerVar.n;
                float f9 = (f7 * f8) + f8;
                if (jdvVar != null) {
                    jdvVar.f(fArr, f6, f9, 0.4f);
                }
                i5++;
                fArr3 = fArr6;
            } catch (jds e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
