package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkg extends qkf {
    public qkg(int i) {
        super(i);
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.b, str);
    }

    @Override // defpackage.qkf
    protected final void c() {
        GLES20.glDeleteProgram(this.b);
    }
}
