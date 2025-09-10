package defpackage;

import android.opengl.GLES20;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qkk implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    public qkk(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        qml qmlVar = new qml(new qkh(GLES20.glCreateShader(this.a), this.b));
        try {
            qkh qkhVar = (qkh) qmlVar.c();
            GLES20.glCompileShader(qkhVar.b);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(qkhVar.b, 35713, iArr, 0);
            if (iArr[0] == 0) {
                throw new qkv(GLES20.glGetShaderInfoLog(qkhVar.b));
            }
            qkh qkhVar2 = (qkh) qmlVar.fk();
            qmlVar.close();
            return qkhVar2;
        } catch (Throwable th) {
            try {
                qmlVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        return "createShader(" + this.a + ")";
    }
}
