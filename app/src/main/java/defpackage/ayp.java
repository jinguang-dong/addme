package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ayp {
    private final bbs a;

    public ayp(uif uifVar) {
        this.a = new azl(uifVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bbs d(bag bagVar, bbs bbsVar) {
        aza azaVar = null;
        if (bbsVar instanceof aza) {
            if (bagVar.d) {
                azaVar = (aza) bbsVar;
                azaVar.a.b(bagVar.a());
            }
        } else if (bbsVar instanceof bbq) {
            if ((bagVar.b || bagVar.e != null) && !bagVar.d) {
                bbq bbqVar = (bbq) bbsVar;
                if (a.ao(bagVar.a(), bbqVar.a)) {
                    azaVar = bbqVar;
                }
            }
        } else if (bbsVar instanceof ays) {
            uiq uiqVar = ((ays) bbsVar).a;
        }
        if (azaVar != null) {
            return azaVar;
        }
        if (!bagVar.d) {
            return new bbq(bagVar.a());
        }
        Object obj = bagVar.e;
        bbi bbiVar = bagVar.c;
        if (bbiVar == null) {
            bbiVar = bap.c;
        }
        return new aza(new azz(obj, bbiVar));
    }

    public bbs a() {
        return this.a;
    }

    public abstract bag b(Object obj);

    public final bag c(Object obj) {
        bag bagVarB = b(obj);
        bagVarB.f = false;
        return bagVarB;
    }
}
