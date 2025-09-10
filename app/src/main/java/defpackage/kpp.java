package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpp extends oww {
    private final boolean a;
    private final boolean b;
    private final AtomicReference c;

    public kpp(kgw kgwVar, kow kowVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5) {
        super(owl.a(kowVar, owfVar, owfVar2, owfVar3, owfVar4, owfVar5));
        this.c = new AtomicReference(null);
        this.a = kgwVar.J();
        this.b = kgwVar.l() == pka.FRONT;
    }

    private static kiq a(kpc kpcVar, boolean z) {
        return ((kpcVar.a || kpcVar.b) && z) ? kpcVar.d ? kiq.HDR_PLUS_WITH_TORCH : kiq.NORMAL_WITH_FLASH : kpcVar.d ? kiq.c : kiq.NORMAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r3 != defpackage.kiq.NORMAL) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    @Override // defpackage.oww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpp.d(java.lang.Object):java.lang.Object");
    }
}
