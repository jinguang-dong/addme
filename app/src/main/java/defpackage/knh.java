package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knh implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public knh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kmz a() {
        pbb pbbVarA = ((hco) this.a).a();
        our ourVar = (our) this.b.a();
        kmz kmzVar = (kmz) this.c.a();
        ovx ovxVar = (ovx) this.d.a();
        ourVar.d(owl.k(kmzVar.b(), ovxVar));
        ovxVar.a((kit) kmzVar.b().dL());
        ourVar.d(owl.k(kmzVar.a(), new fun(pbbVarA.a("ImgCptrCmdReady"), kmzVar, 10, null)));
        kmzVar.getClass();
        return kmzVar;
    }
}
