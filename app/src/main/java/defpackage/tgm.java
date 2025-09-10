package defpackage;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.CroppedGrayMap;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayReadViewU8;
import com.google.googlex.gcam.NormalizedRect;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgm {
    public static final sgv a = sgv.g("tgm");

    public static CroppedGrayMap a(ByteBuffer byteBuffer, NormalizedRect normalizedRect, int i, int i2) {
        long jMakeGrayReadViewU8__SWIG_1 = GcamModuleJNI.MakeGrayReadViewU8__SWIG_1(i, i2, 1, tcx.a(new tcx(BufferUtils.a(byteBuffer) + byteBuffer.position())), i);
        GrayReadViewU8 grayReadViewU8 = jMakeGrayReadViewU8__SWIG_1 == 0 ? null : new GrayReadViewU8(jMakeGrayReadViewU8__SWIG_1, false);
        return new CroppedGrayMap(GcamModuleJNI.ConvertImageToCroppedGrayMap(grayReadViewU8 != null ? grayReadViewU8.a : 0L, grayReadViewU8, NormalizedRect.a(normalizedRect), normalizedRect), true);
    }
}
