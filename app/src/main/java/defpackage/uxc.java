package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class uxc implements uiv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uxc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.uiv
    public final Object a(Object obj, Object obj2, final Object obj3) {
        if (this.b != 0) {
            final uwx uwxVar = (uwx) obj;
            final uqi uqiVar = (uqi) this.a;
            return new uiv() { // from class: upz
                @Override // defpackage.uiv
                public final Object a(Object obj4, Object obj5, Object obj6) {
                    Object obj7 = obj3;
                    if (obj7 != uqk.l) {
                        uwx uwxVar2 = uwxVar;
                        uqi uqiVar2 = uqiVar;
                        ujk.m(uqiVar2.a, obj7, uwxVar2.a);
                    }
                    return ufg.a;
                }
            };
        }
        ((uxf) this.a).f();
        return ufg.a;
    }
}
