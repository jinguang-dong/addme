package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nsd extends ujn implements uiu {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsd(Object obj, int i, byte[] bArr) {
        super(2, obj, dnk.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.a == 0) {
            return Integer.valueOf(((dsd) this.e).a(((Number) obj).intValue(), ((dln) obj2).a));
        }
        bka bkaVar = (bka) obj;
        bka bkaVar2 = (bka) obj2;
        dnk dnkVar = (dnk) this.e;
        if (dnkVar.w && bkaVar2.a() != bkaVar.a()) {
            bad.D(dnkVar);
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsd(Object obj, int i) {
        super(2, obj, dsd.class, "getTransformedHeight", "getTransformedHeight-BvjJYIE(IJ)I", 0);
        this.a = i;
    }
}
