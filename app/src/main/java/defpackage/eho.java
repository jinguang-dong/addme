package defpackage;

import android.graphics.PointF;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eho extends ehk {
    private final elr e;

    public eho(List list) {
        super(list);
        this.e = new elr();
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        Object obj;
        float f2;
        Object obj2 = eloVar.b;
        if (obj2 == null || (obj = eloVar.c) == null) {
            throw new IllegalStateException(clFzVRcygwbq.fiUpykFa);
        }
        elr elrVar = (elr) obj2;
        elr elrVar2 = (elr) obj;
        elq elqVar = this.d;
        if (elqVar != null) {
            f2 = f;
            elr elrVar3 = (elr) elqVar.b(eloVar.g, eloVar.h.floatValue(), elrVar, elrVar2, f2, c(), this.c);
            if (elrVar3 != null) {
                return elrVar3;
            }
        } else {
            f2 = f;
        }
        elr elrVar4 = this.e;
        float f3 = elrVar.a;
        float f4 = elrVar2.a;
        PointF pointF = eli.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = elrVar.b;
        float f7 = f6 + ((elrVar2.b - f6) * f2);
        elrVar4.a = f5;
        elrVar4.b = f7;
        return elrVar4;
    }
}
