package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayWriteViewU16;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldu extends ldh {
    private final pas e;
    private final lge f;

    public ldu(lge lgeVar, iso isoVar, DynamicDepthUtils dynamicDepthUtils, lat latVar, hxv hxvVar, Executor executor, kqp kqpVar, pmv pmvVar, pbn pbnVar, iso isoVar2) {
        super(isoVar, dynamicDepthUtils, latVar, hxvVar, kqpVar, pmvVar, executor, pbnVar, isoVar2);
        this.e = kqpVar.b;
        this.f = lgeVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, lss] */
    @Override // defpackage.ldh
    protected final DynamicDepthResult g(lau lauVar, ldi ldiVar) throws Throwable {
        poj pojVar;
        ShotMetadata shotMetadata;
        pbn pbnVar;
        DynamicDepthResult dynamicDepthResult;
        YuvWriteView yuvWriteViewC;
        long j;
        poj pojVarR = lauVar.r();
        poj pojVarE = lauVar.e(lauVar.b);
        ldiVar.g();
        if (pojVarE == null || pojVarR == null) {
            if (pojVarE != null) {
                pojVarE.close();
            }
            if (pojVarR == null) {
                return null;
            }
            pojVarR.close();
            return null;
        }
        boolean zP = this.d.p();
        long jA = 0;
        if (zP) {
            lge lgeVar = this.f;
            if (lgeVar == null) {
                return null;
            }
            if (lgeVar.a() == 0) {
                lgeVar.b();
            }
            jA = lgeVar.a();
        }
        long j2 = jA;
        ?? r5 = ldiVar.t.b;
        r5.l();
        pmv.r();
        try {
            shotMetadata = (ShotMetadata) ldiVar.m.s();
            pbnVar = this.c;
            pbnVar.f(clFzVRcygwbq.KKci);
            dynamicDepthResult = new DynamicDepthResult(this.e, pao.b(r5.e()).ordinal(), r5.ah(), ldiVar.s.j, lauVar.a.d());
            tgp tgpVar = new tgp();
            int iA = pojVarE.a();
            List listG = pojVarE.g();
            rnt.D(listG.size() == 1, "Should have a single depth plane, has: %s", listG.size());
            rnt.D(iA == 1144402265, "Unsupported format: %s", iA);
            ByteBuffer buffer = ((poi) listG.get(0)).getBuffer();
            int iRemaining = buffer.remaining();
            int pixelStride = ((poi) listG.get(0)).getPixelStride();
            rnt.B(pixelStride == 2, "Pixel stride should be two bytes.");
            int iC = pojVarE.c();
            int iB = pojVarE.b();
            int rowStride = ((poi) listG.get(0)).getRowStride();
            int i = rowStride / 2;
            int i2 = pixelStride * iC;
            rnt.G(rowStride >= i2, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i2);
            rnt.J(iRemaining == rowStride * iB, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iB));
            Object obj = ((rwg) rwc.j(new GrayWriteViewU16(GcamModuleJNI.new_GrayWriteViewU16__SWIG_1(iC, iB, 1, BufferUtils.a(buffer), i)))).a;
            yuvWriteViewC = tgpVar.c(pojVarR);
            j = ((GrayWriteViewU16) obj).a;
            pojVar = pojVarR;
        } catch (Exception unused) {
            pojVar = pojVarR;
        } catch (Throwable th) {
            th = th;
            pojVar = pojVarR;
        }
        try {
        } catch (Exception unused2) {
            this.c.g();
            pojVarE.close();
            pojVar.close();
            return null;
        } catch (Throwable th2) {
            th = th2;
            this.c.g();
            pojVarE.close();
            pojVar.close();
            throw th;
        }
        if (DynamicDepthUtils.createDynamicDepthFromUltradepthImpl(j2, j, YuvWriteView.c(yuvWriteViewC), ShotMetadata.a(shotMetadata), zP, dynamicDepthResult.a)) {
            pbnVar.g();
            pojVarE.close();
            pojVar.close();
            return dynamicDepthResult;
        }
        dynamicDepthResult.close();
        pojVar.close();
        pbnVar.g();
        pojVarE.close();
        pojVar.close();
        return null;
    }
}
