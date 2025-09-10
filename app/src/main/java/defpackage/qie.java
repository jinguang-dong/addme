package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qie implements Callable {
    final /* synthetic */ qin a;
    final /* synthetic */ int b;
    final /* synthetic */ ByteBuffer c;

    public qie(qin qinVar, int i, ByteBuffer byteBuffer) {
        this.a = qinVar;
        this.b = i;
        this.c = byteBuffer;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.a.f();
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        qjx qjxVar = new qjx(iArr[0], this.b);
        qjxVar.b();
        int i = qjxVar.a;
        ByteBuffer byteBuffer = this.c;
        GLES20.glBufferData(i, byteBuffer.limit(), byteBuffer, 35044);
        return qjxVar;
    }

    public final String toString() {
        return "createBufferWithStaticData(" + this.b + "," + this.c.remaining() + ")";
    }
}
