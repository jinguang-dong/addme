package defpackage;

import android.content.Context;
import com.google.android.apps.camera.hdrplus.fusion.deblur.jni.NativeFaceToPortraitSegmenter;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.BufferUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ieq implements lgp {
    private static final sgv a = sgv.g("ieq");
    private final Object b = new Object();
    private boolean c;
    private final pbn d;
    private final Context e;
    private final uem f;
    private final uem g;

    public ieq(pbn pbnVar, Context context, uem uemVar, uem uemVar2) {
        this.d = pbnVar;
        this.e = context;
        this.f = uemVar;
        this.g = uemVar2;
    }

    private final void c(int i) {
        tpc tpcVarM = sta.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sta staVar = (sta) tphVar;
        staVar.c = i - 1;
        staVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sta staVar2 = (sta) tphVar2;
        staVar2.b |= 2;
        staVar2.d = "mosaic_f2p_512x512_f16.tflite.uncompressed";
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sta staVar3 = (sta) tphVar3;
        staVar3.b |= 4;
        staVar3.e = false;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        sta staVar4 = (sta) tphVar4;
        staVar4.b |= 8;
        staVar4.f = false;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        sta staVar5 = (sta) tphVar5;
        staVar5.b |= 16;
        staVar5.g = false;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        tph tphVar6 = tpcVarM.b;
        sta staVar6 = (sta) tphVar6;
        staVar6.b |= 32;
        staVar6.h = false;
        if (!tphVar6.C()) {
            tpcVarM.o();
        }
        sta staVar7 = (sta) tpcVarM.b;
        staVar7.b |= 64;
        staVar7.i = false;
        ((mdy) this.g.a()).o((sta) tpcVarM.l());
    }

    @Override // defpackage.lgp
    public final long a() {
        long segmenterHandleNative;
        synchronized (this.b) {
            segmenterHandleNative = NativeFaceToPortraitSegmenter.getSegmenterHandleNative();
        }
        return segmenterHandleNative;
    }

    @Override // defpackage.lgp
    public final void b() {
        synchronized (this.b) {
            if (!this.c) {
                Context context = this.e;
                this.d.f("FaceToPortraitSegmenterManager#loadModelAsset");
                byte[] byteArray = new byte[0];
                try {
                    InputStream inputStreamOpen = context.getAssets().open("mosaic_f2p_512x512_f16.tflite.uncompressed");
                    try {
                        byteArray = ByteStreams.toByteArray(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    ((sgt) ((sgt) a.b().i(e)).M(1961)).v("Unable to load the asset: %s", e);
                    c(2);
                }
                pbn pbnVar = this.d;
                pbnVar.g();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                byteBufferAllocateDirect.put(byteArray);
                long jA = BufferUtils.a(byteBufferAllocateDirect);
                long jCapacity = byteBufferAllocateDirect.capacity();
                pbnVar.f("FaceToPortraitSegmenterManager#nativeInitialization");
                rwc rwcVarB = ((ixr) this.f).b();
                String absolutePath = rwcVarB.h() ? ((File) rwcVarB.c()).getAbsolutePath() : "";
                tpc tpcVarM = iep.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                ((iep) tphVar).b = jA;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                ((iep) tphVar2).c = jCapacity;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                absolutePath.getClass();
                ((iep) tphVar3).d = absolutePath;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                ((iep) tpcVarM.b).e = a.ar(4);
                boolean zInitSegmenterNative = NativeFaceToPortraitSegmenter.initSegmenterNative(((iep) tpcVarM.l()).h());
                pbnVar.g();
                if (!zInitSegmenterNative) {
                    c(4);
                }
                this.c = zInitSegmenterNative;
            }
        }
    }
}
