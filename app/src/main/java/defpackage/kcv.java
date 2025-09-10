package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcv extends oww {
    private final gnt a;
    private final hbj b;

    public kcv(owf owfVar, owq owqVar, owf owfVar2, gnt gntVar, hbj hbjVar) {
        super(owl.a(owfVar, owqVar, owfVar2));
        this.a = gntVar;
        this.b = hbjVar;
    }

    @Override // defpackage.oww
    protected final /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        boolean z = false;
        jjq jjqVar = (jjq) list.get(0);
        mkx mkxVar = (mkx) list.get(1);
        float fFloatValue = ((Float) list.get(2)).floatValue();
        int iIntValue = ((Integer) jjqVar.i.orElse(0)).intValue();
        float fFloatValue2 = ((Float) jjqVar.h.orElse(Float.valueOf(0.0f))).floatValue();
        if (iIntValue == 0 && fFloatValue2 == 0.0f && mkxVar.equals(mkx.AUTO) && (this.a.a().equals(pka.FRONT) || fFloatValue >= ((Float) this.b.e(haw.u).get()).floatValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
