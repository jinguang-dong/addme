package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsi extends bvk {
    final /* synthetic */ bsn a;
    final /* synthetic */ uiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsi(bsn bsnVar, uiu uiuVar, String str) {
        super(str);
        this.a = bsnVar;
        this.b = uiuVar;
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        bsn bsnVar = this.a;
        bsf bsfVar = bsnVar.f;
        bsfVar.a = bstVar.m();
        bsfVar.b = bstVar.a();
        bsfVar.c = bstVar.b();
        if (bstVar.dt() || bsnVar.a.h == null) {
            bsnVar.d = 0;
            bss bssVar = (bss) this.b.a(bsfVar, new cho(j));
            return new bsh(bssVar, bsnVar, bsnVar.d, bssVar);
        }
        bsnVar.e = 0;
        bss bssVar2 = (bss) this.b.a(bsnVar.g, new cho(j));
        return new bsg(bssVar2, bsnVar, bsnVar.e, bssVar2);
    }
}
