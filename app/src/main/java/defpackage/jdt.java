package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jdt {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public jdt() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public static int a(String str, String str2) throws jds {
        int iB = b(35633, str);
        int iB2 = b(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            throw new jds("Unable to create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iB);
        jds.a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        jds.a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new jds("Could not link program", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glDeleteShader(iB);
        GLES20.glDeleteShader(iB2);
        return iGlCreateProgram;
    }

    protected static int b(int i, String str) throws jds {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new jds("Unable to create shader");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new jds(a.bv(i, "Unable to compile shader "), strGlGetShaderInfoLog);
    }

    protected static final int h(int i, String str) throws jds {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (iGlGetAttribLocation == -1) {
            throw new jds(a.bw(str, "Unable to find ", " in shader"));
        }
        jds.a("glGetAttribLocation ".concat(str));
        return iGlGetAttribLocation;
    }

    protected static final int i(int i, String str) throws jds {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (iGlGetUniformLocation == -1) {
            throw new jds(a.bw(str, "Unable to find ", " in shader"));
        }
        jds.a("glGetUniformLocation ".concat(str));
        return iGlGetUniformLocation;
    }

    public final void c() {
        GLES20.glUseProgram(this.d);
    }

    public final void d() {
        GLES20.glDeleteProgram(this.d);
    }

    public final void e(FloatBuffer floatBuffer) {
        int i = this.b;
        if (i < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.b);
    }

    public final void f(float[] fArr) {
        int i = this.c;
        if (i < 0) {
            return;
        }
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
    }

    public final void g(FloatBuffer floatBuffer) {
        int i = this.a;
        if (i < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.a);
    }

    public jdt(byte[] bArr) throws jds {
        this();
        int iA = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord );  \n}                                                   \n");
        this.d = iA;
        this.a = h(iA, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
    }

    public jdt(char[] cArr) throws jds {
        this();
        int iA = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = 0.85;                                \n  if (texcolor.r < .0001) texcolor.a = 0.0;         \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.d = iA;
        this.a = h(iA, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
    }
}
