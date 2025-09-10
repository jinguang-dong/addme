package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkm implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public qkm(qin qinVar, qhv qhvVar, int i) {
        this.c = i;
        this.b = qinVar;
        this.a = qhvVar;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, qin] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, qin] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        if (this.c != 0) {
            qkj qkjVarI = qkj.i(this.b.f(), (qhv) this.a);
            try {
                qkjVarI.e();
                if (qkjVarI.a.b(qkq.a)) {
                    qkjVarI.d();
                } else {
                    rnt.L(!qkjVarI.f);
                    int i = qkjVarI.c;
                    qjs qjsVar = qkjVarI.e;
                    int i2 = qjsVar.c;
                    qfq qfqVar = qkjVarI.g.a;
                    GLES20.glTexImage2D(i, 0, i2, qfqVar.b(), qfqVar.a(), 0, qjsVar.a(), qjsVar.b(), null);
                    qkjVarI.f = true;
                }
                qkj.h(qkjVarI.e.c(), qkjVarI.d);
                qkjVarI.f = true;
                return qkjVarI;
            } catch (Exception e) {
                qkjVarI.close();
                throw e;
            }
        }
        Object obj = this.b;
        qkj qkjVarI2 = qkj.i(this.a.f(), (qhv) ((qmk) obj).b);
        try {
            qkjVarI2.e();
            ByteBuffer byteBuffer = ((qmf) obj).a;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.order(byteBuffer.order());
            qmq qmqVar = new qmq(byteBufferDuplicate);
            if (qkjVarI2.f) {
                qkjVarI2.g((ByteBuffer) qmqVar.a);
            } else if (qkjVarI2.a.b(qkq.a)) {
                ByteBuffer byteBuffer2 = (ByteBuffer) qmqVar.a;
                qkjVarI2.d();
                qkjVarI2.g(byteBuffer2);
            } else {
                ByteBuffer byteBuffer3 = (ByteBuffer) qmqVar.a;
                rnt.L(!qkjVarI2.f);
                int i3 = qkjVarI2.c;
                qjs qjsVar2 = qkjVarI2.e;
                int i4 = qjsVar2.c;
                qfq qfqVar2 = qkjVarI2.g.a;
                GLES20.glTexImage2D(i3, 0, i4, qfqVar2.b(), qfqVar2.a(), 0, qjsVar2.a(), qjsVar2.b(), byteBuffer3);
                qkjVarI2.f = true;
            }
            qkj.h(qkjVarI2.e.c(), qkjVarI2.d);
            return qkjVarI2;
        } catch (Exception e2) {
            qkjVarI2.close();
            throw e2;
        }
    }

    public final String toString() {
        if (this.c != 0) {
            return "createTexture(RGBA8888)";
        }
        return "createFromData(" + ((qmk) this.b).b.toString() + ")";
    }

    public qkm(qin qinVar, qmj qmjVar, int i) {
        this.c = i;
        this.a = qinVar;
        this.b = qmjVar;
    }
}
