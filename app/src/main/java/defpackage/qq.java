package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qq extends qs {
    public final OutputConfiguration a;

    public qq(Size size, int i, OutputConfiguration outputConfiguration, List list) {
        super(size, i, null, new qu(outputConfiguration.getMirrorMode()), new qz(outputConfiguration.getTimestampBase()), new qt(outputConfiguration.getDynamicRangeProfile()), new qx(outputConfiguration.getStreamUseCase()), null, list);
        this.a = outputConfiguration;
    }
}
