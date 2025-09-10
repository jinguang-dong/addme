package defpackage;

import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class plv implements poi {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ HardwarePixels c;

    public plv(HardwarePixels hardwarePixels, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = hardwarePixels;
    }

    @Override // defpackage.poi
    public final ByteBuffer getBuffer() {
        HardwarePixels hardwarePixels = this.c;
        rnt.M(!hardwarePixels.c.get(), "Accessing data after close!");
        int i = this.a;
        int format = hardwarePixels.a.getFormat();
        boolean z = i == 0 || format == 35 || format == 54;
        int i2 = this.b;
        long j = hardwarePixels.b;
        rnt.B(z, " Expect planes 1 and 2 to only appear in YCBCR_420_888 or YCBCR_P010 formats");
        return HardwarePixels.nativeGetData(j, i, i2, i != 0 ? 2 : 1);
    }

    @Override // defpackage.poi
    public final int getPixelStride() {
        return HardwarePixels.nativePixelStride(this.c.b, this.a);
    }

    @Override // defpackage.poi
    public final int getRowStride() {
        return HardwarePixels.nativeRowStride(this.c.b, this.a);
    }
}
