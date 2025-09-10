package defpackage;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface loq extends AutoCloseable {
    loz a();

    void b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, String str, loz lozVar, mdm mdmVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU8);

    void c(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, String str, loz lozVar, mdm mdmVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU82);

    void d(Bitmap bitmap, ShotMetadata shotMetadata);

    void e();

    boolean f(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata);

    boolean g();

    InterleavedImageU8 h(HardwareBuffer hardwareBuffer);
}
