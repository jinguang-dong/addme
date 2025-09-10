package defpackage;

import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjm implements pnt {
    public final MultiResolutionStreamConfigurationMap a;

    public pjm(MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap) {
        this.a = multiResolutionStreamConfigurationMap;
    }

    public final sbp a(int i) {
        return sbp.j(this.a.getOutputInfo(i));
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        throw null;
    }
}
