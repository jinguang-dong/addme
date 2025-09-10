package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kow extends oww {
    public kow(owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, owf owfVar7) {
        super(owl.a(owfVar, owfVar3, owfVar4, owfVar5, owfVar2, owfVar6, owfVar7));
    }

    public final boolean a() {
        return ((kox) dL()).equals(kox.ON);
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        kox koxVar = (kox) list.get(0);
        int iIntValue = ((Integer) list.get(1)).intValue();
        float fFloatValue = ((Float) list.get(2)).floatValue();
        float fFloatValue2 = ((Float) list.get(3)).floatValue();
        boolean zBooleanValue = ((Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) list.get(6)).booleanValue();
        boolean z = (iIntValue == 0 && fFloatValue == -1.0f && fFloatValue2 == -1.0f) ? false : true;
        if (zBooleanValue3) {
            koxVar = kox.AUTO;
        }
        return (z || zBooleanValue || zBooleanValue2) ? kox.OFF : koxVar;
    }
}
