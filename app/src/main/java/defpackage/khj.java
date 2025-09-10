package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khj extends oww {
    private final kgw a;

    public khj(kgw kgwVar, kow kowVar, owf owfVar) {
        super(owl.a(kowVar, owfVar));
        this.a = kgwVar;
        ((int[]) kgwVar.m(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)).getClass();
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        kox koxVar = (kox) ((List) obj).get(0);
        if (koxVar == kox.ON) {
            kgw kgwVar = this.a;
            if (kgwVar.J()) {
                return 3;
            }
            int[] iArr = (int[]) kgwVar.n(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, kgw.c);
            int length = iArr.length;
            for (int i = 0; i < length && iArr[i] != 5; i++) {
            }
            return 1;
        }
        if (koxVar == kox.AUTO && this.a.J()) {
            return 2;
        }
        return 1;
    }
}
