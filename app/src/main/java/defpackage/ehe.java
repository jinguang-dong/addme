package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehe extends ehk {
    public ehe(List list) {
        super(list);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        return Integer.valueOf(l(eloVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(elo eloVar, float f) {
        float f2;
        Object obj = eloVar.b;
        if (obj == null || eloVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        elq elqVar = this.d;
        if (elqVar != null) {
            f2 = f;
            Integer num = (Integer) elqVar.b(eloVar.g, eloVar.h.floatValue(), (Integer) obj, (Integer) eloVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return AmbientMode.AmbientCallback.u(eli.a(f2, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) eloVar.c).intValue());
    }
}
