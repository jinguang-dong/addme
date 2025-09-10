package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evu implements evg {
    public static final eql a = new eql("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, eql.a);
    private final ejt b;

    public evu(ejt ejtVar) {
        this.b = ejtVar;
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) {
        ejt ejtVar = this.b;
        eux euxVar = (eux) obj;
        if (ejtVar != null) {
            evf evfVarB = evf.b(euxVar);
            fat fatVar = (fat) ejtVar.a;
            Object objG = fatVar.g(evfVarB);
            evfVarB.a();
            eux euxVar2 = (eux) objG;
            if (euxVar2 == null) {
                fatVar.h(evf.b(euxVar), euxVar);
            } else {
                euxVar = euxVar2;
            }
        }
        return new tdy(euxVar, new ere(euxVar, ((Integer) eqmVar.b(a)).intValue()));
    }

    public evu() {
        this(null);
    }
}
