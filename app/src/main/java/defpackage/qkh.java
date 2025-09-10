package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkh extends qkf {
    public qkh(int i, String str) {
        super(i);
        GLES20.glShaderSource(this.b, str);
    }

    @Override // defpackage.qkf
    protected final void c() {
        GLES20.glDeleteShader(this.b);
    }
}
