package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jpn implements joz {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.joz
    public final void a(qjn qjnVar, qim qimVar) {
        if (this.b != 0) {
            qkp qkpVar = ((jpk) this.a).b;
            qkpVar.getClass();
            qkpVar.b(qjnVar, qimVar, jpk.a);
            return;
        }
        jpp jppVar = (jpp) this.a;
        jpa jpaVar = jppVar.g;
        qju qjuVar = jppVar.p;
        qkr qkrVar = jppVar.q;
        float[] fArrE = jpaVar.e();
        qji qjiVarA = qji.m(qkrVar, qjuVar).a((qkl) jppVar.u.a);
        qjiVarA.c("aPosition", 0);
        qjiVarA.c("aTexCoord", 1);
        qjiVarA.g("uTransform", fArrE);
        qjiVarA.d("uImgTex", qjnVar);
        qjiVarA.i = true;
        qjiVarA.a(qimVar);
    }
}
