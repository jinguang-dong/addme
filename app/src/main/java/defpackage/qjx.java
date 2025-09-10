package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjx extends qkf {
    public final int a;

    public qjx(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final void b() {
        GLES20.glBindBuffer(this.a, this.b);
    }

    @Override // defpackage.qkf
    protected final void c() {
        GLES20.glDeleteBuffers(1, new int[]{this.b}, 0);
    }

    public final String toString() {
        return "GLRawBuffer{handle=" + this.b + ", target=" + this.a + "}";
    }
}
