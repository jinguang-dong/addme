package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehq extends ehd {
    protected elq e;
    protected elq f;
    private final PointF g;
    private final PointF h;
    private final ehd i;
    private final ehd j;

    public ehq(ehd ehdVar, ehd ehdVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = ehdVar;
        this.j = ehdVar2;
        j(this.c);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.ehd
    public final /* bridge */ /* synthetic */ Object f(elo eloVar, float f) {
        return k(f);
    }

    @Override // defpackage.ehd
    public final void j(float f) {
        ehd ehdVar = this.i;
        ehdVar.j(f);
        ehd ehdVar2 = this.j;
        ehdVar2.j(f);
        this.g.set(((Float) ehdVar.e()).floatValue(), ((Float) ehdVar2.e()).floatValue());
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((egy) list.get(i)).d();
            i++;
        }
    }

    final PointF k(float f) {
        float f2;
        Float f3;
        ehd ehdVar;
        elo eloVarD;
        ehd ehdVar2;
        elo eloVarD2;
        Float f4 = null;
        if (this.e == null || (eloVarD2 = (ehdVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = ehdVar2.b();
            Float f5 = eloVarD2.h;
            f2 = f;
            f3 = (Float) this.e.b(eloVarD2.g, f5 == null ? eloVarD2.g : f5.floatValue(), (Float) eloVarD2.b, (Float) eloVarD2.c, f, f, fB);
        }
        if (this.f != null && (eloVarD = (ehdVar = this.j).d()) != null) {
            float fB2 = ehdVar.b();
            Float f6 = eloVarD.h;
            f4 = (Float) this.f.b(eloVarD.g, f6 == null ? eloVarD.g : f6.floatValue(), (Float) eloVarD.b, (Float) eloVarD.c, f2, f2, fB2);
        }
        if (f3 == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
