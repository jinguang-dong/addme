package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfc extends EGLImage {
    final /* synthetic */ HardwareBuffer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfc(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2) {
        super(hardwareBuffer);
        this.a = hardwareBuffer2;
    }

    @Override // com.google.android.libraries.oliveoil.gl.EGLImage, defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.close();
    }
}
