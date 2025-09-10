package defpackage;

import android.opengl.GLES30;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qii implements Callable {
    final /* synthetic */ qin a;
    final /* synthetic */ EGLImage b;

    public qii(qin qinVar, EGLImage eGLImage) {
        this.a = qinVar;
        this.b = eGLImage;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int iA = qkd.a();
        int[] iArr = new int[1];
        GLES30.glGenRenderbuffers(1, iArr, 0);
        int i = iArr[0];
        GLES30.glBindRenderbuffer(36161, i);
        EGLImage eGLImage = this.b;
        EGLImage.attachToRbo(eGLImage.b);
        GLES30.glBindFramebuffer(36160, iA);
        GLES30.glFramebufferRenderbuffer(36160, 36064, 36161, i);
        qjy qjyVar = (qjy) this.a.d().h();
        return new qkb(qjyVar.h(), qjyVar.f(), qjyVar.g(), qjyVar.e(), qjyVar.d(), iA, new qhx(eGLImage.a()), qjyVar, i, iA);
    }

    public final String toString() {
        return "createCanvasForImage(" + this.b.a().toString() + ")";
    }
}
