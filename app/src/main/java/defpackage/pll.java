package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayReadViewU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pll implements poj {
    public final long a;
    public final List b;
    private final YuvReadView c;

    public pll(YuvImage yuvImage, long j) {
        this(rup.r(yuvImage), j);
    }

    @Override // defpackage.poj
    public final int a() {
        return 35;
    }

    @Override // defpackage.poj
    public final int b() {
        return this.c.a();
    }

    @Override // defpackage.poj
    public final int c() {
        return this.c.b();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.poj
    public final long d() {
        return this.a;
    }

    @Override // defpackage.poj
    public final Rect e() {
        return new Rect(0, 0, c(), b());
    }

    @Override // defpackage.poj
    public final HardwareBuffer f() {
        return null;
    }

    @Override // defpackage.poj
    public final List g() {
        return this.b;
    }

    @Override // defpackage.poj
    public final /* synthetic */ void h(pof pofVar) {
    }

    @Override // defpackage.poj
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pns
    public final qaq j() {
        return new qaq((Object) null);
    }

    public pll(YuvReadView yuvReadView, long j) {
        ByteBuffer byteBufferB;
        ByteBuffer byteBufferB2;
        tdd tddVarC = yuvReadView.c();
        tdd tddVar = tdd.b;
        rnt.B(tddVarC == tddVar || yuvReadView.c() == tdd.c, OPuAVreQM.gcJTqUB);
        GrayReadViewU8 grayReadViewU8 = new GrayReadViewU8(GcamModuleJNI.YuvReadView_luma(yuvReadView.a, yuvReadView), true);
        InterleavedReadViewU8 interleavedReadViewU8 = new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_chroma(yuvReadView.a, yuvReadView));
        long jA = grayReadViewU8.a();
        int iGrayReadViewU8_width = GcamModuleJNI.GrayReadViewU8_width(grayReadViewU8.a, grayReadViewU8) - 1;
        long jB = grayReadViewU8.b();
        int iGrayReadViewU8_height = GcamModuleJNI.GrayReadViewU8_height(grayReadViewU8.a, grayReadViewU8) - 1;
        long jE = interleavedReadViewU8.e();
        int iD = interleavedReadViewU8.d() - 1;
        long jF = interleavedReadViewU8.f();
        int iC = interleavedReadViewU8.c() - 1;
        long jA2 = interleavedReadViewU8.a();
        int iB = interleavedReadViewU8.b() - 1;
        long jGrayReadViewU8_data = GcamModuleJNI.GrayReadViewU8_data(grayReadViewU8.a, grayReadViewU8);
        long j2 = iD;
        tcx tcxVar = jGrayReadViewU8_data == 0 ? null : new tcx(jGrayReadViewU8_data);
        long j3 = iC * jF;
        ByteBuffer byteBufferB3 = BufferUtils.b(tcx.a(tcxVar), (int) ((iGrayReadViewU8_width * jA) + 1 + (jB * iGrayReadViewU8_height)));
        int i = (int) ((jE * j2) + 1 + j3 + (iB * jA2));
        if (yuvReadView.c() == tddVar) {
            byteBufferB2 = BufferUtils.b(tcx.a(interleavedReadViewU8.g()), i);
            byteBufferB = BufferUtils.b(tcx.a(interleavedReadViewU8.g()) + interleavedReadViewU8.a(), i);
        } else {
            byteBufferB = BufferUtils.b(tcx.a(interleavedReadViewU8.g()), i);
            byteBufferB2 = BufferUtils.b(tcx.a(interleavedReadViewU8.g()) + interleavedReadViewU8.a(), i);
        }
        this.a = j;
        this.c = yuvReadView;
        this.b = Arrays.asList(new plk(byteBufferB3, grayReadViewU8.b(), grayReadViewU8.a()), new plk(byteBufferB2, interleavedReadViewU8.f(), interleavedReadViewU8.e()), new plk(byteBufferB, interleavedReadViewU8.f(), interleavedReadViewU8.e()));
    }

    public pll(YuvWriteView yuvWriteView, long j) {
        this(rup.s(yuvWriteView), j);
    }
}
