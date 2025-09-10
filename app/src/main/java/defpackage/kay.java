package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kay implements jzx {
    @Override // defpackage.jzx
    public final poj a(jzw jzwVar, YuvWriteView yuvWriteView, poj pojVar, ShotMetadata shotMetadata) {
        return new pll(yuvWriteView, ((Long) jzwVar.c).longValue());
    }

    @Override // defpackage.jzx
    public final poj b(jzw jzwVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return new plu(hardwareBuffer, ((Long) jzwVar.c).longValue());
    }
}
