package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khg extends oww {
    public khg(owf owfVar, ovx ovxVar) {
        super(owl.a(owfVar, ovxVar));
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        pjz pjzVar = (pjz) list.get(0);
        if (((lnm) list.get(1)) == lnm.AUTO) {
            return 1;
        }
        return (pjzVar == pjz.FULL || pjzVar == pjz.SIMPLE || pjzVar == pjz.EXTENDED) ? 2 : 1;
    }
}
