package defpackage;

import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.android.libraries.oliveoil.natives.BitmapNativeBuffer;
import java.nio.Buffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfk implements qfh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qfk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qfh
    public final Object a(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            throw ((Throwable) this.a);
        }
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            ((qkj) obj).e();
            EGLImage.attachToTexture(((EGLImage) this.a).b);
            return qfg.a;
        }
        qjy qjyVar = (qjy) obj;
        qjyVar.i();
        qmd qmdVar = new qmd((BitmapNativeBuffer) this.a);
        try {
            qjyVar.j((Buffer) qmdVar.c());
            qmdVar.close();
            return qfg.a;
        } catch (Throwable th) {
            try {
                qmdVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ qfk(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
