package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ilp extends Thread {
    final /* synthetic */ ilr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilp(ilr ilrVar) {
        super("EncoderDrainerWriteThread");
        this.a = ilrVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        Queue queue;
        jod jodVar;
        while (true) {
            ilr ilrVar = this.a;
            if (ilrVar.j) {
                Object obj = ilrVar.e;
                synchronized (obj) {
                    while (true) {
                        queue = ilrVar.d;
                        if (queue.size() <= 100) {
                            break;
                        }
                        ((sgt) ilr.a.b().M(2141)).s("Dropping frames in drainer!");
                        queue.poll();
                        ilrVar.k++;
                    }
                    jodVar = (jod) queue.poll();
                }
                if (jodVar != null) {
                    ilrVar.c.c(ilrVar.f, (ByteBuffer) jodVar.b, (MediaCodec.BufferInfo) jodVar.a);
                }
                synchronized (obj) {
                    if (queue.isEmpty() && ilrVar.h) {
                        return;
                    }
                    while (queue.isEmpty() && !ilrVar.h) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            ((sgt) ((sgt) ilr.a.b().i(e)).M(2140)).s("Interrupted during wait");
                        }
                    }
                }
            }
            return;
        }
    }
}
