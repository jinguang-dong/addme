package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnv extends uht implements uiu {
    Object a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ ujz d;
    final /* synthetic */ aim e;
    final /* synthetic */ AmbientDelegate f;
    final /* synthetic */ apg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnv(ujz ujzVar, AmbientDelegate ambientDelegate, aim aimVar, apg apgVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = ujzVar;
        this.f = ambientDelegate;
        this.e = aimVar;
        this.g = apgVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnv) c(new cif(((cif) obj).a), (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        dnv dnvVar;
        Object obj2;
        uhi uhiVar = uhi.a;
        if (this.b != 0) {
            obj2 = this.a;
            rnt.aN(obj);
            dnvVar = this;
        } else {
            rnt.aN(obj);
            long j = this.c;
            ujz ujzVar = this.d;
            AmbientDelegate ambientDelegate = this.f;
            aim aimVar = this.e;
            apg apgVar = this.g;
            this.a = ujzVar;
            this.b = 1;
            dnvVar = this;
            Object objP = ambientDelegate.p(aimVar, j, (bpb) ambientDelegate.c, apgVar, dnvVar);
            if (objP == uhiVar) {
                return uhiVar;
            }
            obj2 = ujzVar;
            obj = objP;
        }
        ((ujz) obj2).a = ((cif) obj).a;
        return new cif(dnvVar.d.a);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dnv dnvVar = new dnv(this.d, this.f, this.e, this.g, uhbVar);
        dnvVar.c = ((cif) obj).a;
        return dnvVar;
    }
}
