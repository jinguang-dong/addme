package defpackage;

import android.util.Log;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tgp {
    private static final String a = "tgp";

    public final YuvWriteView c(poj pojVar) {
        int iC = pojVar.c();
        int iB = pojVar.b();
        int iC2 = pojVar.c() % 2;
        int iB2 = pojVar.b();
        rnt.B(iC2 == 0, "A YUV image must have even width.");
        rnt.B(iB2 % 2 == 0, "A YUV image must have even height.");
        rnt.B(pojVar.a() == 35, "Format is not YUV_420_888");
        List listG = pojVar.g();
        rnt.D(listG.size() == 3, "A YUV image must have %s planes.", 3);
        poi poiVar = (poi) listG.get(0);
        poi poiVar2 = (poi) listG.get(1);
        poi poiVar3 = (poi) listG.get(2);
        long jA = BufferUtils.a(poiVar.getBuffer());
        long jA2 = BufferUtils.a(poiVar2.getBuffer());
        long jA3 = BufferUtils.a(poiVar3.getBuffer());
        rnt.B(poiVar.getPixelStride() == 1, "Y plane's pixel stride is not 1");
        rnt.B(poiVar.getRowStride() >= pojVar.c(), "Y plane's row stride smaller than image width");
        rnt.B(poiVar2.getRowStride() >= pojVar.c(), "U plane's row stride smaller than image width");
        rnt.B(poiVar2.getRowStride() == poiVar3.getRowStride(), "U and V planes have different row strides");
        rnt.B(jA != 0, "luma plane address cannot be 0 (NULL).");
        rnt.B(jA2 != 0, "chroma U plane address cannot be 0 (NULL).");
        rnt.B(jA3 != 0, "chroma V plane address cannot be 0 (NULL).");
        rnt.B(poiVar2.getPixelStride() == 2 && poiVar3.getPixelStride() == 2 && Math.abs(jA2 - jA3) == 1, "UV planes not tightly interleaved");
        tdd tddVar = jA2 < jA3 ? tdd.b : tdd.c;
        List listG2 = pojVar.g();
        tcx tcxVar = new tcx(BufferUtils.a(((poi) listG2.get(0)).getBuffer()));
        int i = tddVar == tdd.b ? 1 : 2;
        tcx tcxVar2 = new tcx(BufferUtils.a(((poi) listG2.get(i)).getBuffer()));
        return new YuvWriteView(GcamModuleJNI.new_YuvWriteView(iC, iB, ((poi) listG2.get(0)).getRowStride(), tcx.a(tcxVar), iC / 2, iB / 2, ((poi) listG2.get(i)).getRowStride(), tcx.a(tcxVar2), tddVar.d));
    }

    public final boolean d(int i) {
        return i == 37 || i == 38 || i == 32 || i == 4099;
    }

    public final rwc a(poj pojVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int iA = pojVar.a();
        List listG = pojVar.g();
        if (iA != 257 && iA != 4098 && iA != 4099) {
            Log.e(a, a.bv(iA, "Unsupported PD format: "));
            return rvk.a;
        }
        boolean z5 = true;
        if (listG.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        rnt.D(z, "Should have a single PD plane, has: %s", listG.size());
        ByteBuffer buffer = ((poi) listG.get(0)).getBuffer();
        int iRemaining = buffer.remaining();
        if (iA == 257) {
            if (iRemaining % 8064 != 0) {
                Log.e(a, a.bE(iRemaining, "The row stride in bytes (8064) should evenly divide the PD buffer capacity (", ")."));
                return rvk.a;
            }
            i = iRemaining / 8064;
            i2 = 2016;
            if (i != 756 && i != 758) {
                Log.e(a, a.bv(i, "The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is "));
                return rvk.a;
            }
            i3 = 4032;
        } else {
            if (iA == 4099) {
                return rwc.j(b(pojVar));
            }
            if (pojVar.c() % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rnt.B(z2, "Image width should be divisible by the number of channels.");
            int pixelStride = ((poi) listG.get(0)).getPixelStride();
            if (pixelStride == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            rnt.B(z3, "Pixel stride should be two bytes.");
            int iC = pojVar.c() / 2;
            int iB = pojVar.b();
            int rowStride = ((poi) listG.get(0)).getRowStride();
            int i4 = rowStride / 2;
            int i5 = (iC + iC) * pixelStride;
            if (rowStride >= i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            rnt.G(z4, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i5);
            if (iRemaining != rowStride * iB) {
                z5 = false;
            }
            rnt.J(z5, CGlJpiVWrCQOq.hSrkzexbWxC, Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iB));
            i = iB;
            i2 = iC;
            i3 = i4;
        }
        return rwc.j(new RawWriteView(i2 + i2, i, i3, tct.c, new tcx(BufferUtils.a(buffer))));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.googlex.gcam.RawWriteView b(defpackage.poj r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgp.b(poj):com.google.googlex.gcam.RawWriteView");
    }
}
