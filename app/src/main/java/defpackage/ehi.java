package defpackage;

import android.graphics.PointF;
import androidx.wear.ambient.AmbientMode;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehi extends ehk {
    private final jod e;

    public ehi(List list) {
        super(list);
        jod jodVar = (jod) ((elo) list.get(0)).b;
        int length = jodVar != null ? ((int[]) jodVar.b).length : 0;
        this.e = new jod(new float[length], new int[length]);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        jod jodVar = (jod) eloVar.b;
        jod jodVar2 = (jod) eloVar.c;
        int[] iArr = (int[]) jodVar.b;
        int length = iArr.length;
        int[] iArr2 = (int[]) jodVar2.b;
        int length2 = iArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException(a.bD(length2, length, "Cannot interpolate between gradients. Lengths vary (", " vs ", ")"));
        }
        for (int i = 0; i < iArr.length; i++) {
            jod jodVar3 = this.e;
            float f2 = ((float[]) jodVar.a)[i];
            float f3 = ((float[]) jodVar2.a)[i];
            PointF pointF = eli.a;
            ((float[]) jodVar3.a)[i] = f2 + ((f3 - f2) * f);
            ((int[]) jodVar3.b)[i] = AmbientMode.AmbientCallback.u(f, iArr[i], iArr2[i]);
        }
        return this.e;
    }
}
