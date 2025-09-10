package com.google.android.libraries.camera.jni.jpeg;

import android.graphics.Rect;
import android.os.SystemClock;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import defpackage.pao;
import defpackage.paw;
import defpackage.poi;
import defpackage.poj;
import defpackage.prh;
import defpackage.rnt;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JpegUtilNative {
    static {
        paw.a(JpegUtilNative.class, "jpeg-jni");
    }

    private static native int compressJpegFromYUV420spNative(int i, int i2, Object obj, int i3, int i4, Object obj2, int i5, int i6, Object obj3, int i7, int i8, Object obj4, int i9, int i10, int i11, int i12, int i13, int i14);

    public static int a(poj pojVar, ByteBuffer byteBuffer, Rect rect, pao paoVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        rnt.M(byteBuffer.isDirect(), "Output buffer must be direct");
        rnt.O(rect.left < rect.right, "Invalid crop rectangle: %s", rect);
        rnt.O(rect.top < rect.bottom, "Invalid crop rectangle: %s", rect);
        rnt.N(pojVar.a() == 35, "Only ImageFormat.YUV_420_888 is supported, found %s", pojVar.a());
        List listG = pojVar.g();
        poi poiVar = (poi) listG.get(0);
        poi poiVar2 = (poi) listG.get(1);
        poi poiVar3 = (poi) listG.get(2);
        rnt.L(poiVar.getBuffer().isDirect());
        rnt.L(poiVar2.getBuffer().isDirect());
        rnt.L(poiVar3.getBuffer().isDirect());
        rnt.M(poiVar.getPixelStride() == 1, "Pixel stride for luma (Y) plane must be 1.");
        rnt.M(poiVar2.getPixelStride() == 2, "Pixel stride for chroma (U) plane must be 2.");
        rnt.M(poiVar3.getPixelStride() == 2, "Pixel stride for chroma (V) plane must be 2.");
        rnt.M(poiVar2.getRowStride() == poiVar3.getRowStride(), OPuAVreQM.hJqQLlUuRTo);
        byteBuffer.clear();
        int iC = pojVar.c();
        int iB = pojVar.b();
        int iCompressJpegFromYUV420spNative = compressJpegFromYUV420spNative(iC, iB, poiVar.getBuffer(), poiVar.getPixelStride(), poiVar.getRowStride(), poiVar2.getBuffer(), poiVar2.getPixelStride(), poiVar2.getRowStride(), poiVar3.getBuffer(), poiVar3.getPixelStride(), poiVar3.getRowStride(), byteBuffer, 95, prh.J(rect.left, iC - 1), prh.J(rect.top, iB - 1), prh.J(rect.right, iC), prh.J(rect.bottom, iB), paoVar.e);
        if (iCompressJpegFromYUV420spNative < byteBuffer.limit()) {
            byteBuffer.limit(iCompressJpegFromYUV420spNative);
        }
        String.format(Locale.ROOT, "Compressed %d bytes in %.2fms", Integer.valueOf(iCompressJpegFromYUV420spNative), Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d));
        return iCompressJpegFromYUV420spNative;
    }
}
