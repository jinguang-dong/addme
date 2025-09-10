package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayh implements baj {
    final /* synthetic */ azq a;
    final /* synthetic */ ayn b;

    public ayh(ayn aynVar, azq azqVar) {
        this.b = aynVar;
        this.a = azqVar;
    }

    @Override // defpackage.baj
    public final int c(bai baiVar, Object obj) {
        ayn aynVar = this.b;
        if (true != (aynVar instanceof baj)) {
            aynVar = null;
        }
        int iC = aynVar != null ? aynVar.c(baiVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        azq azqVar = this.a;
        azqVar.e = ske.bK(azqVar.e, new uev(baiVar, obj));
        return 2;
    }

    @Override // defpackage.baj
    public final void b() {
    }

    @Override // defpackage.baj
    public final void a(Object obj) {
    }
}
