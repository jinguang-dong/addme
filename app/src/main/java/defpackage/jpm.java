package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpm implements qfc {
    private final qfc c;
    private final int d;
    private final List e = new ArrayList();
    public final szh a = new szh();
    public final szh b = new szh();
    private boolean f = false;
    private int g = 0;

    public jpm(qfc qfcVar, int i) {
        this.c = qfcVar;
        this.d = i;
    }

    @Override // defpackage.qfc
    public final synchronized void a(final syu syuVar) {
        this.a.f(syuVar);
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/motionphoto-highres");
        final szh szhVar = new szh();
        syuVar.c(new Runnable() { // from class: jpl
            @Override // java.lang.Runnable
            public final void run() {
                szh szhVar2 = szhVar;
                if (syuVar.isCancelled()) {
                    szhVar2.cancel(false);
                } else {
                    szhVar2.e(mediaFormat);
                }
            }
        }, sxo.a);
        this.c.a(szhVar);
    }

    @Override // defpackage.qlv
    public final synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.e.add(Integer.valueOf(this.g));
        }
        this.g++;
        this.c.b(byteBuffer, bufferInfo);
    }

    public final synchronized void c() {
        szh szhVar = this.b;
        if (!szhVar.isDone()) {
            szh szhVar2 = this.a;
            if (szhVar2.isCancelled()) {
                szhVar.e(rvk.a);
                return;
            }
            if (this.f) {
                if (this.g == 0) {
                    szhVar.e(rvk.a);
                    return;
                }
                if (szhVar2.isDone()) {
                    try {
                        MediaFormat mediaFormat = (MediaFormat) ske.U(szhVar2);
                        szh szhVar3 = this.b;
                        tpc tpcVarM = ttb.a.m();
                        int integer = mediaFormat.getInteger("width");
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttb ttbVar = (ttb) tpcVarM.b;
                        ttbVar.b |= 1;
                        ttbVar.c = integer;
                        int integer2 = mediaFormat.getInteger("height");
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttb ttbVar2 = (ttb) tpcVarM.b;
                        ttbVar2.b |= 2;
                        ttbVar2.d = integer2;
                        String string = mediaFormat.getString("mime");
                        string.getClass();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar = tpcVarM.b;
                        ttb ttbVar3 = (ttb) tphVar;
                        ttbVar3.b |= 32;
                        ttbVar3.h = string;
                        List list = this.e;
                        if (!tphVar.C()) {
                            tpcVarM.o();
                        }
                        ttb ttbVar4 = (ttb) tpcVarM.b;
                        tpn tpnVar = ttbVar4.i;
                        if (!tpnVar.c()) {
                            ttbVar4.i = tph.t(tpnVar);
                        }
                        tnq.e(list, ttbVar4.i);
                        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                        byteBuffer.getClass();
                        toj tojVarP = toj.p(byteBuffer);
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ttb ttbVar5 = (ttb) tpcVarM.b;
                        ttbVar5.b |= 8;
                        ttbVar5.f = tojVarP;
                        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                        byteBuffer2.getClass();
                        toj tojVarP2 = toj.p(byteBuffer2);
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar2 = tpcVarM.b;
                        ttb ttbVar6 = (ttb) tphVar2;
                        ttbVar6.b |= 16;
                        ttbVar6.g = tojVarP2;
                        int i = this.d;
                        if (!tphVar2.C()) {
                            tpcVarM.o();
                        }
                        ttb ttbVar7 = (ttb) tpcVarM.b;
                        ttbVar7.b |= 4;
                        ttbVar7.e = i;
                        szhVar3.e(rwc.j((ttb) tpcVarM.l()));
                    } catch (ExecutionException e) {
                        throw new IllegalStateException("Format should be done by now", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
        this.f = true;
        c();
    }
}
