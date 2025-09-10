package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dqg implements uiq {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ dqg(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            float f = this.a;
            blm blmVar = (blm) obj;
            blmVar.s(f);
            blmVar.t(f);
            float f2 = blmVar.e;
            blmVar.x(byi.Y(0.0f));
            return ufg.a;
        }
        if (i == 1) {
            blm blmVar2 = (blm) obj;
            blmVar2.r(AmbientMode.AmbientCallback.a(this.a) - 270.0f);
            blmVar2.x(blt.a);
            return ufg.a;
        }
        blm blmVar3 = (blm) obj;
        blmVar3.getClass();
        blmVar3.q(1);
        blmVar3.z(-chp.O(blmVar3, this.a));
        return ufg.a;
    }
}
