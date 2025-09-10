package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doe extends uht implements uiu {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe(uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((doe) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((doe) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        und undVar;
        Object objA;
        und undVar2;
        if (this.c != 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                undVar2 = (und) this.b;
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                undVar2 = (und) this.b;
            }
            while (ujp.V(undVar2.c())) {
                add addVar = new add(8);
                this.b = undVar2;
                this.a = 1;
                if (bay.o(addVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a == 0) {
            rnt.aN(obj);
            undVar = (und) this.b;
            dof dofVar = dof.a;
            if (!dof.b()) {
                dof.b.h(Long.MAX_VALUE);
            }
            return ufg.a;
        }
        undVar = (und) this.b;
        rnt.aN(obj);
        while (ung.l(undVar)) {
            dof dofVar2 = dof.a;
            if (!dof.b()) {
                break;
            }
            aap aapVar = new aap(18);
            this.b = undVar;
            this.a = 1;
            bzr bzrVar = (bzr) q().get(bzr.a);
            if (bzrVar == null) {
                objA = bay.o(aapVar, this);
            } else {
                new acr(aapVar, (uhb) null, 0);
                objA = bzrVar.a();
            }
            if (objA == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.c != 0) {
            doe doeVar = new doe(uhbVar, 1, null);
            doeVar.b = obj;
            return doeVar;
        }
        doe doeVar2 = new doe(uhbVar, 0);
        doeVar2.b = obj;
        return doeVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe(uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.c = i;
    }
}
