package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fua extends oww {
    private final fuf a;
    private final boolean b;
    private final ixm c;

    public fua(owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, ibb ibbVar, owf owfVar5, fuf fufVar, nkw nkwVar, ixm ixmVar) {
        super(owl.a(ibbVar.a(), owfVar, owfVar2, owfVar3, owfVar4, owfVar5));
        this.a = fufVar;
        this.b = fufVar.a(nkwVar);
        this.c = ixmVar;
    }

    @Override // defpackage.oww
    protected final /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
        float fFloatValue = ((Float) list.get(2)).floatValue();
        boolean zBooleanValue3 = ((Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((Boolean) list.get(4)).booleanValue();
        hwz hwzVar = (hwz) list.get(5);
        if ((!this.b || !zBooleanValue2) && !this.c.b()) {
            return Float.valueOf(-2.0f);
        }
        if (!zBooleanValue && !zBooleanValue4) {
            return Float.valueOf(-1.0f);
        }
        float fMax = hwzVar.b;
        float f = hwzVar.c;
        if (zBooleanValue3) {
            fMax = Math.max(fMax, this.a.d);
        }
        return Float.valueOf(f < fMax ? clc.C((fMax - fFloatValue) / Math.abs(f - fMax), 0.0f, 1.0f) : 1.0f);
    }
}
