package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ilq extends Thread {
    final /* synthetic */ ilr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilq(ilr ilrVar) {
        super("EncoderDrainerDrainThread");
        this.a = ilrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        ((defpackage.sgt) defpackage.ilr.a.c().M(2129)).s("MediaCodec timed out.");
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
        L0:
            ilr r0 = r12.a
            boolean r1 = r0.g
            if (r1 != 0) goto Lc9
            ilo r1 = r0.b
            android.media.MediaCodec r1 = r1.a()
            java.nio.ByteBuffer[] r2 = r1.getOutputBuffers()
        L10:
            boolean r3 = r0.i
            if (r3 == 0) goto L0
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo
            r3.<init>()
            r4 = 250000(0x3d090, double:1.235164E-318)
            r6 = 1
            int r4 = r1.dequeueOutputBuffer(r3, r4)     // Catch: java.lang.IllegalStateException -> Lb7
            r5 = -1
            if (r4 != r5) goto L40
            boolean r3 = r0.g
            if (r3 == 0) goto L2c
            int r3 = r0.l
            if (r3 != 0) goto L10
        L2c:
            sgv r0 = defpackage.ilr.a
            shi r0 = r0.c()
            r1 = 2129(0x851, float:2.983E-42)
            shi r0 = r0.M(r1)
            sgt r0 = (defpackage.sgt) r0
            java.lang.String r1 = "MediaCodec timed out."
            r0.s(r1)
            goto L0
        L40:
            r5 = -3
            if (r4 != r5) goto L48
            java.nio.ByteBuffer[] r2 = r1.getOutputBuffers()
            goto L10
        L48:
            r5 = -2
            if (r4 != r5) goto L58
            android.media.MediaFormat r3 = r1.getOutputFormat()
            ils r4 = r0.c
            int r3 = r4.a(r3)
            r0.f = r3
            goto L10
        L58:
            if (r4 < 0) goto L10
            r5 = r2[r4]
            if (r5 != 0) goto L72
            sgv r0 = defpackage.ilr.a
            shi r0 = r0.b()
            r1 = 2128(0x850, float:2.982E-42)
            shi r0 = r0.M(r1)
            sgt r0 = (defpackage.sgt) r0
            java.lang.String r1 = "encoderOutputBuffer %s was null"
            r0.t(r1, r4)
            goto L0
        L72:
            int r7 = r3.flags
            r7 = r7 & 2
            r8 = 0
            if (r7 == 0) goto L7b
            r3.size = r8
        L7b:
            int r7 = r3.size
            if (r7 == 0) goto Laa
            r5.rewind()
            int r7 = r5.remaining()
            byte[] r7 = new byte[r7]
            r5.get(r7)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r7)
            int r7 = r0.l
            int r7 = r7 + r6
            r0.l = r7
            java.lang.Object r7 = r0.e
            monitor-enter(r7)
            java.util.Queue r9 = r0.d     // Catch: java.lang.Throwable -> La7
            jod r10 = new jod     // Catch: java.lang.Throwable -> La7
            r11 = 0
            r10.<init>(r5, r3, r11)     // Catch: java.lang.Throwable -> La7
            r9.offer(r10)     // Catch: java.lang.Throwable -> La7
            r7.notifyAll()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La7
            goto Laa
        La7:
            r12 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La7
            throw r12
        Laa:
            r1.releaseOutputBuffer(r4, r8)
            int r3 = r3.flags
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r0.g = r6
            goto L0
        Lb7:
            r1 = move-exception
            sgv r2 = defpackage.ilr.a
            shi r2 = r2.b()
            java.lang.String r3 = "Illegal state when dequeueing output buffer"
            r4 = 2130(0x852, float:2.985E-42)
            defpackage.mn.c(r3, r4, r2, r1)
            r0.g = r6
            goto L0
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilq.run():void");
    }
}
