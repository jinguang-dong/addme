package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qkn implements Callable {
    final /* synthetic */ qin a;
    final /* synthetic */ qhx b;
    final /* synthetic */ int c;
    final /* synthetic */ Bitmap d;

    public qkn(qin qinVar, qhx qhxVar, int i, Bitmap bitmap) {
        this.a = qinVar;
        this.b = qhxVar;
        this.c = i;
        this.d = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        qkj qkjVarJ = qkj.j(this.a.f(), this.b, this.c);
        try {
            Bitmap bitmap = this.d;
            qfq qfqVar = qkjVarJ.g.a;
            if (bitmap.getWidth() == qfqVar.b() && bitmap.getHeight() == qfqVar.a()) {
                qkjVarJ.e();
                if (qkjVarJ.f) {
                    qkjVarJ.f(bitmap);
                } else if (qkjVarJ.a.b(qkq.a)) {
                    qkjVarJ.d();
                    qkjVarJ.f(bitmap);
                } else {
                    rnt.L(!qkjVarJ.f);
                    GLUtils.texImage2D(qkjVarJ.c, 0, bitmap, 0);
                }
                qkj.h(qkjVarJ.e.c(), qkjVarJ.d);
                return qkjVarJ;
            }
            throw new IllegalArgumentException("Bitmap of size " + bitmap.getWidth() + "x" + bitmap.getHeight() + " cannot be assigned to texture of size " + qfqVar.toString() + "!");
        } catch (Exception e) {
            qkjVarJ.close();
            throw e;
        }
    }

    public final String toString() {
        Bitmap bitmap = this.d;
        return "createFromBitmap(" + bitmap.getWidth() + "x" + bitmap.getHeight() + ")";
    }
}
