package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ang extends uht implements uiu {
    int a;
    final /* synthetic */ ank b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ang(ank ankVar, int i, int i2, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ankVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ang) c((aim) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            aim aimVar = (aim) this.e;
            ank ankVar = this.b;
            and andVar = new and(aimVar, ankVar);
            int i2 = this.c;
            int i3 = this.d;
            chq chqVar = ((ana) ankVar.d.a()).g;
            this.a = 1;
            if (akg.f(andVar, i2, i3, 100, chqVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ang angVar = new ang(this.b, this.c, this.d, uhbVar);
        angVar.e = obj;
        return angVar;
    }
}
