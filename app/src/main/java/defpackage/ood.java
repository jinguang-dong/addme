package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ood {
    public int a;

    public ood() {
    }

    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    public final void c() {
        GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
        this.a = -1;
    }

    public final void d() throws jds {
        int i = this.a;
        if (i < 0) {
            throw new jds("Trying to bind without a loaded texture");
        }
        GLES20.glBindTexture(3553, i);
        jds.a("glBindTexture");
    }

    public ood(byte[] bArr) {
        this.a = -1;
    }

    public ood(byte[] bArr, byte[] bArr2) {
        this.a = -1;
        this.a = b();
    }
}
