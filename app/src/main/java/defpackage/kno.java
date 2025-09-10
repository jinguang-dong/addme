package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kno extends oww {
    public final boolean a;
    public final boolean b;
    public final jho c;
    private final hyd d;
    private final ibb e;
    private final boolean f;
    private final int g;
    private final AtomicInteger h;

    public kno(owf owfVar, owf owfVar2, owf owfVar3, ibb ibbVar, hyd hydVar, hbj hbjVar, idt idtVar, jho jhoVar) {
        super(owl.a(owfVar, owfVar2, owfVar3, ibbVar));
        this.h = new AtomicInteger();
        this.d = hydVar;
        this.a = hydVar.a != hydVar.b;
        this.b = idtVar.a();
        gzi gziVar = gzq.a;
        gzi gziVar2 = hac.a;
        this.e = ibbVar;
        this.g = hydVar.a;
        this.f = hbjVar.p(gzc.s);
        this.c = jhoVar;
        d(Arrays.asList(owfVar.dL(), owfVar2.dL(), ((ovx) owfVar3).d, ibbVar.dL())).intValue();
    }

    public final int a() {
        return this.h.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oww
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Integer d(List list) {
        Float f = (Float) list.get(0);
        int iIntValue = ((Integer) list.get(1)).intValue();
        iba ibaVar = (iba) list.get(3);
        this.e.n();
        boolean z = this.a;
        int iMax = this.g;
        if (z && f.floatValue() > 1.0f) {
            iMax = Math.max(iMax, this.d.b);
        }
        if (this.b && iIntValue != idz.NONE.ordinal()) {
            float f2 = 0.6f;
            if (this.f && iIntValue == idz.DEBLUR.ordinal()) {
                f2 = 0.8f;
            }
            iMax = (int) (iMax * f2);
        }
        this.h.set(iMax);
        Integer numValueOf = Integer.valueOf(iMax);
        ibaVar.toString();
        int i = this.d.b;
        return numValueOf;
    }
}
