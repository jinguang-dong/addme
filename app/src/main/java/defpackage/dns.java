package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dns extends uht implements uiu {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dns(avg avgVar, float f, aby abyVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.d = avgVar;
        this.b = f;
        this.c = abyVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((dns) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dns) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.e != 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            rnt.aN(obj);
            if (i == 0) {
                Object obj2 = this.d;
                Float f = new Float(this.b);
                ?? r5 = this.c;
                this.a = 1;
                if (abr.k(((avg) obj2).c, f, r5, null, this, 12) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            Object obj3 = this.c;
            float f2 = this.b;
            Object obj4 = this.d;
            this.a = 1;
            dnt dntVar = (dnt) obj3;
            Object objB = dntVar.a.b(afs.a, new dnr(dntVar, f2, (AmbientDelegate) obj4, (uhb) null, 0), this);
            if (objB != uhiVar2) {
                objB = ufg.a;
            }
            if (objB == uhiVar2) {
                return uhiVar2;
            }
        }
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.e != 0) {
            return new dns((avg) this.d, this.b, (aby) this.c, uhbVar, 1);
        }
        return new dns((dnt) this.c, this.b, (AmbientDelegate) this.d, uhbVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dns(dnt dntVar, float f, AmbientDelegate ambientDelegate, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = dntVar;
        this.b = f;
        this.d = ambientDelegate;
    }
}
