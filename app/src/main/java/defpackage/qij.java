package defpackage;

import android.opengl.GLES20;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qij implements Callable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qij(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, qmn] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qmn] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.b;
        if (i == 0) {
            return qkd.b(this.a);
        }
        if (i == 1) {
            return qkd.b(this.a);
        }
        qkg qkgVar = new qkg(GLES20.glCreateProgram());
        try {
            try {
                qfp qfpVar = ((qjv) this.a).a;
                Iterator it = qfpVar.iterator();
                while (it.hasNext()) {
                    GLES20.glAttachShader(qkgVar.b, ((qkh) ((qkl) ((qmn) it.next()).c()).h()).b);
                }
                GLES20.glLinkProgram(qkgVar.b);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(qkgVar.b, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    throw new qku(GLES20.glGetProgramInfoLog(qkgVar.b));
                }
                Iterator it2 = qfpVar.iterator();
                while (it2.hasNext()) {
                    GLES20.glDetachShader(qkgVar.b, ((qkh) ((qkl) ((qmn) it2.next()).c()).h()).b);
                }
                qfpVar.close();
                return qkgVar;
            } catch (Exception e) {
                qkgVar.close();
                throw e;
            }
        } catch (Throwable th) {
            ((qjv) this.a).a.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qmn] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, qmn] */
    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "createCanvasForTexture(" + String.valueOf(((qko) this.a.c()).b()) + ")";
        }
        if (i != 1) {
            return "linkProgram(n=" + ((qjv) this.a).a.size() + ")";
        }
        return "createCanvasForTexture(" + String.valueOf(((qko) this.a.c()).b()) + ")";
    }
}
