package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qiy extends qft {
    final /* synthetic */ qji a;

    public qiy(qji qjiVar) {
        this.a = qjiVar;
    }

    @Override // defpackage.qft
    public final /* synthetic */ void b(Object obj) {
        qjy qjyVar = (qjy) obj;
        qjyVar.i();
        qji qjiVar = this.a;
        int[] iArr = qjiVar.h;
        boolean z = true;
        if (iArr != null) {
            GLES30.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        qkg qkgVar = (qkg) qjiVar.j.h();
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(35725, iArr2, 0);
        int i = iArr2[0];
        int i2 = qkgVar.b;
        if (i != i2) {
            GLES20.glUseProgram(i2);
        }
        Iterator it = qjiVar.e.values().iterator();
        while (it.hasNext()) {
            ((qjh) it.next()).a(qkgVar);
        }
        int i3 = 0;
        for (qjg qjgVar : qjiVar.g) {
            qiu qiuVar = qjgVar.c;
            int i4 = ((qkj) qiuVar.h()).c;
            int[] iArr3 = new int[1];
            GLES20.glGetIntegerv(35661, iArr3, 0);
            int i5 = iArr3[0];
            if (i3 > i5) {
                throw new IllegalStateException("Attempting to bind " + (i3 + 1) + uCzt.VZycpr + i5 + " are supported!");
            }
            int i6 = qji.a;
            if (i6 <= 0) {
                int[] iArr4 = new int[1];
                GLES20.glGetTexParameteriv(((qkj) qiuVar.h()).c, 36200, iArr4, 0);
                i6 = iArr4[0];
                if (i6 < 0 || i6 > 3) {
                    throw new IndexOutOfBoundsException("Unit count returned by OpenGL is outside of valid range!");
                }
            }
            GLES20.glActiveTexture(33984 + i3);
            ((qkj) qiuVar.h()).e();
            GLES20.glUniform1i(((qkg) qjgVar.b.j.h()).b(qjgVar.a), i3);
            i3 = i6 + i3;
        }
        qkr qkrVar = qjiVar.c;
        qif qifVar = qkrVar.a;
        ((qjx) qifVar.h()).b();
        Map map = qjiVar.f;
        qfp qfpVarK = qsp.k(map.size());
        try {
            int i7 = qkgVar.b;
            Iterator it2 = map.entrySet().iterator();
            while (true) {
                int i8 = 5123;
                if (!it2.hasNext()) {
                    qju qjuVar = qjiVar.d;
                    if (qjuVar != null) {
                        qif qifVar2 = qjuVar.a;
                        ((qjx) qifVar2.h()).b();
                        GLES20.glDrawElements(qjiVar.b, qjuVar.b, 5123, 0);
                    } else {
                        GLES20.glDrawArrays(qjiVar.b, 0, qkrVar.c);
                    }
                    qfpVarK.close();
                    if (qjiVar.i) {
                        qjyVar.k();
                        return;
                    }
                    return;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i7, str);
                if (iGlGetAttribLocation != -1) {
                    qfpVarK.add(new qjf(iGlGetAttribLocation));
                    GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                    boolean z2 = qkrVar.d(iIntValue).c() == 4 ? z : false;
                    int iC = qkrVar.c(iIntValue);
                    qhi qhiVarD = qkrVar.d(iIntValue);
                    if (qhiVarD == qhu.a) {
                        i8 = 5120;
                    } else if (qhiVarD == qhu.d) {
                        i8 = 5121;
                    } else if (qhiVarD == qhu.b) {
                        i8 = 5122;
                    } else if (qhiVarD != qhu.e) {
                        if (qhiVarD == qhu.c) {
                            i8 = 5124;
                        } else if (qhiVarD == qhu.f) {
                            i8 = 5125;
                        } else if (qhiVarD == qhu.g) {
                            i8 = 5131;
                        } else {
                            if (qhiVarD != qhu.h) {
                                throw new IllegalStateException("No Gl type for attribute type ".concat(String.valueOf(String.valueOf(qhiVarD))));
                            }
                            i8 = 5126;
                        }
                    }
                    int i9 = i8;
                    int iB = qkrVar.b(iIntValue);
                    int iB2 = 0;
                    for (int i10 = 0; i10 < iIntValue; i10++) {
                        iB2 += qkrVar.b(i10) * qkrVar.c;
                    }
                    GLES20.glVertexAttribPointer(iGlGetAttribLocation, iC, i9, z2, iB, iB2);
                    z = true;
                }
            }
        } finally {
        }
    }
}
