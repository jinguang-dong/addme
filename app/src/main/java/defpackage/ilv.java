package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ilv {
    public static final sgv a = sgv.g("ilv");
    public final Surface b;
    private final MediaCodec.BufferInfo i = new MediaCodec.BufferInfo();
    public MediaFormat d = null;
    public long e = 0;
    private long j = -1;
    private long k = 0;
    private boolean l = false;
    private boolean m = false;
    public boolean f = false;
    public ByteBuffer[] g = null;
    public MediaCodec h = null;
    public final MediaExtractor c = new MediaExtractor();

    public ilv(Surface surface) {
        this.b = surface;
    }

    public static MediaFormat b(MediaExtractor mediaExtractor, String str) throws IOException {
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = -1;
                    break;
                }
                if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                    break;
                }
                i++;
            }
            if (i < 0) {
                ((sgt) a.b().M(2160)).v("No video track found in %s", str);
                return null;
            }
            mediaExtractor.selectTrack(i);
            return mediaExtractor.getTrackFormat(i);
        } catch (IOException unused) {
            ((sgt) a.b().M(2161)).v("Could not open video file %s", str);
            return null;
        }
    }

    public final synchronized float a() {
        long j = this.e;
        if (j == 0) {
            return 1.0f;
        }
        return this.k / j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean c() {
        /*
            r14 = this;
            monitor-enter(r14)
            r0 = 0
            r1 = r0
        L3:
            r2 = 1
            if (r1 != 0) goto L83
            boolean r3 = r14.m     // Catch: java.lang.Throwable -> L92
            if (r3 != 0) goto L81
            boolean r3 = r14.l     // Catch: java.lang.Throwable -> L92
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L11
            goto L42
        L11:
            android.media.MediaCodec r3 = r14.h     // Catch: java.lang.Throwable -> L92
            int r7 = r3.dequeueInputBuffer(r4)     // Catch: java.lang.Throwable -> L92
            if (r7 < 0) goto L42
            java.nio.ByteBuffer[] r3 = r14.g     // Catch: java.lang.Throwable -> L92
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L92
            android.media.MediaExtractor r13 = r14.c     // Catch: java.lang.Throwable -> L92
            int r9 = r13.readSampleData(r3, r0)     // Catch: java.lang.Throwable -> L92
            if (r9 >= 0) goto L32
            android.media.MediaCodec r6 = r14.h     // Catch: java.lang.Throwable -> L92
            r10 = 0
            r12 = 4
            r8 = 0
            r9 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L92
            r14.l = r2     // Catch: java.lang.Throwable -> L92
            goto L42
        L32:
            r14.l = r0     // Catch: java.lang.Throwable -> L92
            long r10 = r13.getSampleTime()     // Catch: java.lang.Throwable -> L92
            android.media.MediaCodec r6 = r14.h     // Catch: java.lang.Throwable -> L92
            r8 = 0
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L92
            r13.advance()     // Catch: java.lang.Throwable -> L92
        L42:
            android.media.MediaCodec r3 = r14.h     // Catch: java.lang.Throwable -> L92
            android.media.MediaCodec$BufferInfo r6 = r14.i     // Catch: java.lang.Throwable -> L92
            int r3 = r3.dequeueOutputBuffer(r6, r4)     // Catch: java.lang.Throwable -> L92
            if (r3 < 0) goto L3
            long r4 = r6.presentationTimeUs     // Catch: java.lang.Throwable -> L92
            r14.k = r4     // Catch: java.lang.Throwable -> L92
            int r4 = r6.flags     // Catch: java.lang.Throwable -> L92
            r4 = r4 & 4
            if (r4 <= 0) goto L72
            int r1 = r6.size     // Catch: java.lang.Throwable -> L92
            if (r1 <= 0) goto L6a
            long r4 = r14.k     // Catch: java.lang.Throwable -> L92
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L6a
            long r6 = r14.e     // Catch: java.lang.Throwable -> L92
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L6a
            r1 = r2
            goto L6b
        L6a:
            r1 = r0
        L6b:
            r14.m = r2     // Catch: java.lang.Throwable -> L92
            long r4 = r14.e     // Catch: java.lang.Throwable -> L92
            r14.k = r4     // Catch: java.lang.Throwable -> L92
            goto L7b
        L72:
            long r4 = r14.k     // Catch: java.lang.Throwable -> L92
            long r6 = r14.j     // Catch: java.lang.Throwable -> L92
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7b
            r1 = r2
        L7b:
            android.media.MediaCodec r2 = r14.h     // Catch: java.lang.Throwable -> L92
            r2.releaseOutputBuffer(r3, r1)     // Catch: java.lang.Throwable -> L92
            goto L3
        L81:
            monitor-exit(r14)
            return r0
        L83:
            long r0 = r14.k     // Catch: java.lang.Throwable -> L92
            r3 = 1
            long r0 = r0 + r3
            long r3 = r14.e     // Catch: java.lang.Throwable -> L92
            long r0 = java.lang.Math.min(r0, r3)     // Catch: java.lang.Throwable -> L92
            r14.j = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r14)
            return r2
        L92:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilv.c():boolean");
    }
}
