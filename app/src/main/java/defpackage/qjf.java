package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjf implements qfo {
    private final int a;

    public qjf(int i) {
        this.a = i;
        GLES20.glEnableVertexAttribArray(i);
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        GLES20.glDisableVertexAttribArray(this.a);
    }
}
