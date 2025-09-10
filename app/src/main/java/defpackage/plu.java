package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plu implements poj {
    private static final sbv b = sbv.q(1, 1, 2, 1, 35, 35, 37, 37);
    public final long a;
    private final HardwareBuffer c;
    private final HardwarePixels d;
    private volatile Rect e;

    public plu(HardwareBuffer hardwareBuffer, long j) {
        HardwarePixels hardwarePixels;
        hardwareBuffer.getClass();
        this.c = hardwareBuffer;
        if (HardwareBuffers.lockingIsSupported()) {
            rnt.M(HardwareBuffers.lockingIsSupported(), "Locking is not supported on this build!");
            hardwarePixels = new HardwarePixels(hardwareBuffer);
        } else {
            hardwarePixels = null;
        }
        this.d = hardwarePixels;
        this.a = j;
        this.e = new Rect(0, 0, hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
    }

    @Override // defpackage.poj
    public final int a() {
        return ((Integer) b.getOrDefault(Integer.valueOf(this.c.getFormat()), 34)).intValue();
    }

    @Override // defpackage.poj
    public final int b() {
        return this.c.getHeight();
    }

    @Override // defpackage.poj
    public final int c() {
        return this.c.getWidth();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        HardwarePixels hardwarePixels = this.d;
        if (hardwarePixels != null) {
            hardwarePixels.close();
        }
        HardwareBuffer hardwareBuffer = this.c;
        synchronized (hardwareBuffer) {
            hardwareBuffer.close();
        }
    }

    @Override // defpackage.poj
    public final long d() {
        return this.a;
    }

    @Override // defpackage.poj
    public final Rect e() {
        return new Rect(this.e);
    }

    @Override // defpackage.poj
    public final HardwareBuffer f() {
        HardwareBuffer hardwareBuffer = this.c;
        synchronized (hardwareBuffer) {
            if (hardwareBuffer.isClosed()) {
                return null;
            }
            return HardwareBuffers.fork(hardwareBuffer);
        }
    }

    @Override // defpackage.poj
    public final List g() {
        HardwarePixels hardwarePixels = this.d;
        if (hardwarePixels == null) {
            int i = sbp.d;
            return sex.a;
        }
        int iNativePlaneCount = HardwarePixels.nativePlaneCount(hardwarePixels.b);
        if (iNativePlaneCount < 0) {
            throw new UnsupportedOperationException("This Android version does not support image plane access!");
        }
        ArrayList arrayList = new ArrayList(iNativePlaneCount);
        for (int i2 = 0; i2 < iNativePlaneCount; i2++) {
            arrayList.add(new plv(hardwarePixels, i2, hardwarePixels.a.getHeight()));
        }
        return arrayList;
    }

    @Override // defpackage.poj
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pns
    public final qaq j() {
        return new qaq((Object) null);
    }

    @Override // defpackage.poj
    public final /* synthetic */ void h(pof pofVar) {
    }
}
