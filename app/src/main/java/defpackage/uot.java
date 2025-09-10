package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class uot extends ujn implements uiv {
    public static final uot a = new uot();

    public uot() {
        super(3, uov.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        uov uovVar = (uov) obj;
        uwx uwxVar = (uwx) obj2;
        while (true) {
            Object objC = uovVar.C();
            if (!(objC instanceof uoh)) {
                if (!(objC instanceof umt)) {
                    objC = uow.b(objC);
                }
                uwxVar.d = objC;
            } else if (uovVar.y(objC) >= 0) {
                uwxVar.c = ujp.Q(uovVar, true, new uos(uovVar, uwxVar));
                break;
            }
        }
        return ufg.a;
    }
}
