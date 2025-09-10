package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.libraries.microvideo.xmp.nativemotionphotos.NativeMotionPhotoProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class joj implements qez {
    public static final sgv a = sgv.g("joj");
    public final syu b;
    public final szh c;
    public final syu d;
    public final syu e;
    public final syu f;
    public final boolean g;
    public final boolean h;
    private final qez i;
    private final MediaFormat j;
    private final List k = new ArrayList();
    private final Executor l;

    public joj(qez qezVar, boolean z, syu syuVar, szh szhVar, syu syuVar2, syu syuVar3, syu syuVar4, boolean z2, Executor executor) {
        this.i = qezVar;
        this.e = syuVar3;
        this.f = syuVar4;
        this.l = executor;
        this.b = syuVar;
        this.c = szhVar;
        this.d = syuVar2;
        this.g = z2;
        this.h = z;
        MediaFormat mediaFormat = new MediaFormat();
        this.j = mediaFormat;
        mediaFormat.setString("mime", true != z ? "application/microvideo-image-meta" : "application/motionphoto-image-meta");
    }

    @Override // defpackage.qez
    public final synchronized qfc a() {
        qfc qfcVarA;
        szh szhVar;
        qfcVarA = this.i.a();
        szhVar = new szh();
        this.k.add(szhVar);
        return new joi(qfcVarA, szhVar);
    }

    @Override // defpackage.qez
    public final syu b() {
        return this.i.b();
    }

    @Override // defpackage.qez
    public final void c() {
        this.i.c();
    }

    @Override // defpackage.qez
    public final void d() {
        final syu syuVarI;
        syu syuVarJ;
        MediaFormat mediaFormat = this.j;
        final qfc qfcVarA = this.i.a();
        qfcVarA.a(ske.M(mediaFormat));
        qfcVarA.b(ByteBuffer.allocateDirect(0), new MediaCodec.BufferInfo());
        synchronized (this) {
            syuVarI = ske.I(this.k);
        }
        synchronized (this) {
            syuVarJ = ske.J(syuVarI, this.d, this.e, this.b, this.f);
        }
        syuVarJ.c(new Runnable() { // from class: joh
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArrH;
                long jLongValue = -1;
                for (Long l : (List) ske.V(syuVarI)) {
                    if (l != null && (jLongValue < 0 || l.longValue() < jLongValue)) {
                        jLongValue = l.longValue();
                    }
                }
                joj jojVar = this.a;
                long jMax = Math.max(jLongValue, 0L);
                long jLongValue2 = ((Long) ske.V(jojVar.b)).longValue();
                jojVar.c.e(Long.valueOf(jMax));
                if (jLongValue2 < jMax) {
                    ((sgt) joj.a.b().M(2933)).A("A shutter timestamp (%d) with value less than the starting timestamp (%d) was selected. Overwriting timestamp with starting timestamp.", jLongValue2, jMax);
                }
                boolean z = jojVar.g;
                syu syuVar = jojVar.d;
                long jMax2 = Math.max(jMax, jLongValue2);
                rwc rwcVar = (rwc) ske.V(syuVar);
                rwc rwcVarJ = (rwc) ske.V(jojVar.e);
                rwc rwcVar2 = (rwc) ske.V(jojVar.f);
                boolean z2 = jojVar.h;
                tpc tpcVarM = tsx.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                tsx tsxVar = (tsx) tphVar;
                tsxVar.b |= 4;
                tsxVar.e = z;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                tsx tsxVar2 = (tsx) tphVar2;
                tsxVar2.b |= 1;
                tsxVar2.c = jMax2;
                long j = jMax2 - jMax;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tsx tsxVar3 = (tsx) tpcVarM.b;
                tsxVar3.b |= 2;
                tsxVar3.d = j;
                if (rwcVar.h()) {
                    ttd ttdVar = (ttd) rwcVar.c();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tsx tsxVar4 = (tsx) tpcVarM.b;
                    tsxVar4.f = ttdVar;
                    tsxVar4.b |= 8;
                }
                if (rwcVarJ.h()) {
                    if (rwcVar2.h()) {
                        rnt.M(!z2, "meta + V2 isn't supported yet!");
                        tta ttaVar = (tta) rwcVarJ.c();
                        tpc tpcVar = (tpc) ttaVar.a(5, null);
                        tpcVar.r(ttaVar);
                        ttb ttbVar = (ttb) rwcVar2.c();
                        if (!tpcVar.b.C()) {
                            tpcVar.o();
                        }
                        tta ttaVar2 = (tta) tpcVar.b;
                        ttaVar2.f = ttbVar;
                        ttaVar2.b |= 4;
                        rwcVarJ = rwc.j((tta) tpcVar.l());
                    }
                    tta ttaVar3 = (tta) rwcVarJ.c();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tsx tsxVar5 = (tsx) tpcVarM.b;
                    tsxVar5.g = ttaVar3;
                    tsxVar5.b |= 16;
                }
                if (z2) {
                    tsx tsxVar6 = (tsx) tpcVarM.l();
                    int i = NativeMotionPhotoProcessor.a;
                    bArrH = NativeMotionPhotoProcessor.encodeVideoMetadata(tsxVar6.h());
                } else {
                    bArrH = ((tsx) tpcVarM.l()).h();
                }
                qfc qfcVar = qfcVarA;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.size = bArrH.length;
                bufferInfo.presentationTimeUs = jMax2;
                qfcVar.b(ByteBuffer.wrap(bArrH), bufferInfo);
                qfcVar.close();
            }
        }, this.l);
        this.i.d();
    }
}
