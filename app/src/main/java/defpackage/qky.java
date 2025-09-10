package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qky implements qfo {
    public final qim a;
    public final HardwareBuffer b;
    private final EGLImage c;

    public qky(qim qimVar, EGLImage eGLImage, HardwareBuffer hardwareBuffer) {
        this.a = qimVar;
        this.c = eGLImage;
        this.b = hardwareBuffer;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.c.close();
        this.b.close();
    }
}
