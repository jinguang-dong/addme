package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import java.math.RoundingMode;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qkj extends qkf implements qke {
    public final qkq a;
    public final int c;
    public final int d;
    public final qjs e;
    public boolean f;
    public final qhv g;
    private final int h;

    public qkj(qkq qkqVar, int i, int i2, qhv qhvVar) {
        this(qkqVar, i, i2, qhvVar, 33071);
    }

    public static int b() {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    public static void h(boolean z, int i) {
        int i2 = true != z ? 9728 : 9729;
        GLES30.glTexParameteri(3553, 10240, i2);
        GLES30.glTexParameteri(3553, 10241, i2);
        GLES30.glTexParameteri(3553, 10242, i);
        GLES30.glTexParameteri(3553, 10243, i);
    }

    public static qkj i(qkq qkqVar, qhv qhvVar) {
        return j(qkqVar, qhvVar, 33071);
    }

    public static qkj j(qkq qkqVar, qhv qhvVar, int i) {
        return new qkj(qkqVar, b(), 3553, qhvVar, i);
    }

    @Override // defpackage.qkf
    protected void c() {
        GLES30.glDeleteTextures(1, new int[]{this.b}, 0);
    }

    public final void d() {
        rnt.L(!this.f);
        qfq qfqVar = this.g.a;
        GLES30.glTexStorage2D(this.c, this.h, this.e.c, qfqVar.b(), qfqVar.a());
        this.f = true;
    }

    public final void e() {
        GLES30.glBindTexture(this.c, this.b);
    }

    public final void f(Bitmap bitmap) {
        rnt.L(this.f);
        GLUtils.texSubImage2D(this.c, 0, 0, 0, bitmap);
    }

    public final void g(ByteBuffer byteBuffer) {
        rnt.L(this.f);
        qfq qfqVar = this.g.a;
        int iB = qfqVar.b();
        int iA = qfqVar.a();
        int i = this.c;
        qjs qjsVar = this.e;
        GLES20.glTexSubImage2D(i, 0, 0, 0, iB, iA, qjsVar.a(), qjsVar.b(), byteBuffer);
    }

    private qkj(qkq qkqVar, int i, int i2, qhv qhvVar, int i3) {
        super(i);
        this.f = false;
        a.I(true);
        this.a = qkqVar;
        this.g = qhvVar;
        this.c = i2;
        qjs qjsVarD = qjs.d(qhvVar);
        this.e = qjsVarD;
        this.d = i3;
        if (!qjsVarD.c()) {
            this.h = 1;
            return;
        }
        qfq qfqVar = qhvVar.a;
        int iA = qfqVar.a.a(0);
        int i4 = 1;
        while (true) {
            svx svxVar = qfqVar.a;
            if (i4 >= svxVar.a) {
                this.h = ske.ar(iA, RoundingMode.DOWN) + 1;
                return;
            } else {
                if (svxVar.a(i4) > iA) {
                    iA = qfqVar.a.a(i4);
                }
                i4++;
            }
        }
    }
}
