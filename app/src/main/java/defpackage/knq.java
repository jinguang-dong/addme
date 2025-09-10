package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class knq implements khf {
    private final /* synthetic */ int a;

    public /* synthetic */ knq(int i) {
        this.a = i;
    }

    @Override // defpackage.khf
    public final boolean a(poe poeVar) {
        if (this.a != 0) {
            Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_STATE);
            Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
            return (num == null || num2 == null || Objects.equals(0, num) || Objects.equals(5, num) || Objects.equals(3, num2)) ? false : true;
        }
        if (!poeVar.g().isEmpty()) {
            return true;
        }
        ((sgt) ((sgt) knr.a.c().h(shx.a, "MetadataConditions")).M(3329)).s("Missing expected physical capture results.");
        return false;
    }
}
