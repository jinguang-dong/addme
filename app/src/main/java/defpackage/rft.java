package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rft {
    private static final String b = "rft";
    public int a;
    private int c;
    private int d;

    public rft(String str, String str2) {
        this.c = -1;
        this.d = -1;
        this.a = -1;
        this.c = f(35633, str);
        this.d = f(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, this.c);
        GLES20.glAttachShader(this.a, this.d);
        GLES20.glLinkProgram(this.a);
    }

    private static int f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        Log.e(b, strGlGetShaderInfoLog);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalArgumentException("Shader compilation failed: ".concat(String.valueOf(strGlGetShaderInfoLog)));
    }

    public final void b() {
        GLES20.glUseProgram(this.a);
    }

    public final void c() {
        GLES20.glDeleteShader(this.c);
        GLES20.glDeleteShader(this.d);
        GLES20.glDeleteProgram(this.a);
    }

    public final void d() {
        GLES20.glUseProgram(0);
    }

    public final rfv e(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        if (iGlGetAttribLocation >= 0) {
            return new rfv(iGlGetAttribLocation);
        }
        Log.e(b, "Could not find attribute named ".concat(str));
        return null;
    }

    public final rfv a(String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        if (iGlGetUniformLocation >= 0) {
            return new rfv(iGlGetUniformLocation);
        }
        Log.e(b, oUZhwRhE.bUfcBLTIUlGwAe.concat(str));
        return null;
    }
}
