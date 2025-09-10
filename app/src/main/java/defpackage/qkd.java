package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkd {
    public static final int[] a = new int[2];

    public static int a() {
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static qjy b(qmn qmnVar) {
        int iA = a();
        qko qkoVar = (qko) qmnVar.c();
        GLES30.glBindFramebuffer(36160, iA);
        GLES30.glFramebufferTexture2D(36160, 36064, ((qkj) qkoVar.h()).c, ((qkj) qkoVar.h()).b, 0);
        qjy qjyVar = (qjy) qkoVar.b.d().h();
        return new qkc(qjyVar.h(), qjyVar.f(), qjyVar.g(), qjyVar.e(), qjyVar.d(), iA, qkoVar.b(), qjyVar, iA, qmnVar);
    }

    public static String c() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    public static void d(int i) {
        GLES30.glDeleteFramebuffers(1, new int[]{i}, 0);
    }

    public static void e(int i) {
        GLES30.glDeleteRenderbuffers(1, new int[]{i}, 0);
    }
}
