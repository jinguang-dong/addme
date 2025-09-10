package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rnw extends ctm {
    private final int a;

    public rnw(int i) {
        this.a = i;
    }

    @Override // defpackage.ctm
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = rnx.k;
        float[] fArr = ((rnx) obj).i;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.ctm
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        rnx rnxVar = (rnx) obj;
        int i = rnx.k;
        float[] fArr = rnxVar.i;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                AmbientModeSupport.AmbientController ambientController = rnxVar.j;
                if (ambientController != null) {
                    float fA = rnxVar.a() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) ambientController.a;
                    int i3 = (int) fA;
                    if (materialButton.m != i3) {
                        materialButton.m = i3;
                        materialButton.p();
                        materialButton.invalidate();
                    }
                }
                rnxVar.invalidateSelf();
            }
        }
    }
}
