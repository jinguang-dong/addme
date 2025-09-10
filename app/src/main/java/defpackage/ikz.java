package defpackage;

import android.media.AudioRecord;
import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ikz extends Thread {
    public static final sgv a = sgv.g("ikz");
    private final AudioRecord d;
    private final ikw e;
    private final byte[] f = new byte[2048];
    public boolean b = false;
    public long c = 0;

    public ikz(ikw ikwVar, AudioRecord audioRecord) {
        this.e = ikwVar;
        this.d = audioRecord;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v5, types: [sgt, shi] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IllegalStateException, MediaCodec.CryptoException {
        AudioRecord audioRecord = this.d;
        if (audioRecord == null) {
            this.b = false;
            return;
        }
        this.b = true;
        try {
            audioRecord.startRecording();
        } catch (IllegalStateException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2114)).v("%s", e.getMessage());
        }
        while (this.b) {
            AudioRecord audioRecord2 = this.d;
            byte[] bArr = this.f;
            int i = audioRecord2.read(bArr, 0, 2048);
            if (i == -3 || i == -2) {
                ((sgt) a.b().M(2115)).s("Error reading audio");
                break;
            }
            if (this.c != 0) {
                long jNanoTime = (System.nanoTime() / 1000) + this.c;
                ikw ikwVar = this.e;
                if (ikwVar.d) {
                    try {
                        ByteBuffer[] inputBuffers = ikwVar.b.getInputBuffers();
                        int iDequeueInputBuffer = ikwVar.b.dequeueInputBuffer(-1L);
                        if (iDequeueInputBuffer < 0) {
                            ((sgt) ikw.a.b().M(2103)).s("Could not find a valid buffer, will drop frame!");
                        } else {
                            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                            byteBuffer.clear();
                            byteBuffer.put(bArr);
                            int i2 = true != ikwVar.c ? 0 : 4;
                            MediaCodec mediaCodec = ikwVar.b;
                            int length = bArr.length;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 2048, jNanoTime, i2);
                            if (ikwVar.c) {
                                ikwVar.d = false;
                                ikwVar.c = false;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        ((sgt) ((sgt) ikw.a.b().i(e2)).M((char) 2104)).s("MediaCodec got into an illegal state");
                    }
                }
            }
        }
        try {
            this.d.stop();
        } catch (IllegalStateException e3) {
            ((sgt) ((sgt) a.b().i(e3)).M((char) 2113)).v("%s", e3.getMessage());
        }
        this.d.release();
        this.b = false;
    }
}
