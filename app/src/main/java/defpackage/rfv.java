package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfv {
    public final int a;

    public rfv(int i) {
        this.a = i;
    }

    public static rfv k(boolean z) {
        return new rfv((true != z ? 0 : 4) | 1);
    }

    public static rfv l(cyz cyzVar) {
        int i = cyzVar.b + 2;
        boolean z = false;
        if (i >= 0 && i <= cyzVar.c) {
            z = true;
        }
        a.I(z);
        cyzVar.b = i;
        int iA = cyzVar.a() >> 1;
        cyzVar.a();
        if (iA == 4 || iA == 5 || iA == 7 || iA == 8 || iA == 9 || iA == 10) {
            return new rfv(iA);
        }
        return null;
    }

    public final void a(float f) {
        GLES20.glUniform1f(this.a, f);
    }

    public final void b(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.a, 1, false, fArr, 0);
    }

    public final void c(float[] fArr) {
        GLES20.glUniform4fv(this.a, 1, fArr, 0);
    }

    public final void d(Texture texture) {
        GLES20.glActiveTexture(33984);
        texture.bind();
        GLES20.glUniform1i(this.a, 0);
    }

    public final void e() {
        GLES20.glDisableVertexAttribArray(this.a);
    }

    public final void f() {
        GLES20.glEnableVertexAttribArray(this.a);
    }

    public final void g(FloatBuffer floatBuffer, int i) {
        GLES20.glVertexAttribPointer(this.a, i, 5126, false, 0, (Buffer) floatBuffer);
    }

    public final boolean h() {
        return this.a == 0;
    }

    public final boolean i() {
        return (this.a & 2) != 0;
    }

    public final boolean j() {
        return (this.a & 4) != 0;
    }

    public rfv(byte[] bArr) {
        this.a = 2;
    }

    public rfv() {
        this(0);
    }
}
