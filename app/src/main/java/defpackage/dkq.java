package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkq extends uht implements uiu {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkq(int i, dme dmeVar, uhb uhbVar, int i2) {
        super(2, uhbVar);
        this.d = i2;
        this.b = i;
        this.c = dmeVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((dkq) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((dkq) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dkq) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ajd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ajd, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i;
        int i2 = this.d;
        if (i2 == 0) {
            Object obj2 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj3 = this.c;
                int i3 = this.b;
                AmbientModeSupport.AmbientController ambientController = ((dkr) obj3).d;
                this.a = 1;
                ?? r6 = ambientController.a;
                Object objB = r6.b(afs.a, new dmd((dme) r6, i3, null), this);
                if (objB != obj2) {
                    objB = ufg.a;
                }
                if (objB != obj2) {
                    objB = ufg.a;
                }
                if (objB == obj2) {
                    return obj2;
                }
            }
            return ufg.a;
        }
        if (i2 != 1) {
            Object obj4 = uhi.a;
            int i4 = this.a;
            rnt.aN(obj);
            if (i4 == 0 && (i = this.b) != -1) {
                ?? r2 = this.c;
                this.a = 2;
                Object objB2 = r2.b(afs.a, new dma((dme) r2, i, null), this);
                if (objB2 != obj4) {
                    objB2 = ufg.a;
                }
                if (objB2 == obj4) {
                    return obj4;
                }
            }
            return ufg.a;
        }
        uhi uhiVar = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            Object obj5 = this.c;
            int i5 = this.b;
            amr amrVar = ((apb) obj5).d;
            this.a = 1;
            ank ankVar = amrVar.a;
            bgb bgbVar = ank.n;
            Object objH = ankVar.h(i5, 0, this);
            if (objH != uhiVar) {
                objH = ufg.a;
            }
            if (objH == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.d;
        if (i == 0) {
            return new dkq((dkr) this.c, this.b, uhbVar, 0);
        }
        if (i != 1) {
            return new dkq(this.b, (dme) this.c, uhbVar, 2);
        }
        return new dkq((apb) this.c, this.b, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkq(apb apbVar, int i, uhb uhbVar, int i2) {
        super(2, uhbVar);
        this.d = i2;
        this.c = apbVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkq(dkr dkrVar, int i, uhb uhbVar, int i2) {
        super(2, uhbVar);
        this.d = i2;
        this.c = dkrVar;
        this.b = i;
    }
}
