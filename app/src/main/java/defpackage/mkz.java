package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import androidx.wear.ambient.AmbientMode;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mkz {
    public static final sgv a = sgv.g("mkz");
    public final MediaExtractor b;
    public final ConcurrentLinkedQueue c;
    public final Object d;
    public int e;

    public mkz(FileDescriptor fileDescriptor) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        this.c = new ConcurrentLinkedQueue();
        this.d = new Object();
        try {
            mediaExtractor.setDataSource(fileDescriptor);
            this.e = 1;
        } catch (IOException e) {
            throw new IllegalArgumentException("Unable to open file descriptor", e);
        }
    }

    public final void a(int i, rwc rwcVar, rwc rwcVar2) {
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        Iterator it;
        if (rwcVar2.h() == rwcVar.h()) {
            ((sgt) a.b().M(4911)).s("Must specify exactly one of the two intervals (sample or time).");
            return;
        }
        synchronized (this.d) {
            int i3 = 1;
            if (this.e != 1) {
                ((sgt) a.b().M(4910)).s("MediaExtractor already released.");
                return;
            }
            if (i == -1) {
                ((sgt) a.c().M(4909)).s("Can't find video track from data source.");
                return;
            }
            MediaExtractor mediaExtractor = this.b;
            mediaExtractor.selectTrack(i);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            int integer = mediaExtractor.getTrackFormat(i).getInteger("max-input-size");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(integer);
            int i4 = 0;
            long j = -1;
            int i5 = 0;
            while (true) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, i4);
                if (sampleData < 0) {
                    break;
                }
                i5 += i3;
                long sampleTime = mediaExtractor.getSampleTime();
                if (rwcVar2.h() && sampleTime == j) {
                    break;
                }
                if (sampleData == integer) {
                    ((sgt) a.c().M(4908)).s("The read sample size is equal to the buffer size. The read sample might be incomplete.");
                }
                int sampleFlags = mediaExtractor.getSampleFlags();
                int i6 = sampleFlags & 1;
                if ((sampleFlags & 4) != 0) {
                    i6 |= 8;
                }
                bufferInfo2.flags = i6;
                bufferInfo2.offset = i4;
                bufferInfo2.size = sampleData;
                bufferInfo2.presentationTimeUs = mediaExtractor.getSampleTime();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    miu miuVar = (miu) it2.next();
                    miv mivVar = miuVar.d;
                    synchronized (mivVar.j) {
                        it = it2;
                        bufferInfo2.presentationTimeUs = TimeUnit.SECONDS.toMicros(mivVar.g.getAndIncrement()) / mivVar.l.e;
                        miuVar.a.i(miuVar.b, byteBufferAllocate, bufferInfo2);
                        mlc mlcVar = mivVar.m;
                        mlcVar.getClass();
                        mlcVar.b(mivVar.n);
                        AmbientMode.AmbientController ambientController = mivVar.v;
                        if (ambientController != null) {
                            ((mkr) ambientController.a).c(r8.get() / miuVar.c);
                        }
                    }
                    it2 = it;
                }
                byteBufferAllocate.clear();
                if (rwcVar.h()) {
                    int i7 = 0;
                    while (true) {
                        bufferInfo = bufferInfo2;
                        i2 = integer;
                        if (i7 < ((Long) rwcVar.c()).longValue()) {
                            mediaExtractor.advance();
                            i7++;
                            bufferInfo2 = bufferInfo;
                            integer = i2;
                        }
                    }
                } else {
                    bufferInfo = bufferInfo2;
                    i2 = integer;
                    mediaExtractor.seekTo(svz.a((Duration) rwcVar2.c()) * i5, 2);
                }
                bufferInfo2 = bufferInfo;
                integer = i2;
                j = sampleTime;
                i3 = 1;
                i4 = 0;
            }
            mediaExtractor.unselectTrack(i);
        }
    }

    public final int b() {
        synchronized (this.d) {
            if (this.e != 1) {
                ((sgt) a.b().M(4915)).s("MediaExtractor already released.");
                return -1;
            }
            MediaExtractor mediaExtractor = this.b;
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    return i;
                }
            }
            return -1;
        }
    }
}
