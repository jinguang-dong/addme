package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehr extends elq {
    final /* synthetic */ elp a;
    final /* synthetic */ elq b;
    final /* synthetic */ ehx c;

    public ehr(elp elpVar, elq elqVar, ehx ehxVar) {
        this.a = elpVar;
        this.b = elqVar;
        this.c = ehxVar;
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ Object a(elp elpVar) {
        float f = elpVar.a;
        float f2 = elpVar.b;
        String str = ((ehx) elpVar.c).a;
        String str2 = ((ehx) elpVar.d).a;
        elp elpVar2 = this.a;
        elpVar2.a(f, f2, str, str2, elpVar.e, elpVar.f, elpVar.g);
        String str3 = (String) this.b.a(elpVar2);
        ehx ehxVar = (ehx) (elpVar.f == 1.0f ? elpVar.d : elpVar.c);
        ehx ehxVar2 = this.c;
        ehxVar2.a(str3, ehxVar.b, ehxVar.c, ehxVar.m, ehxVar.d, ehxVar.e, ehxVar.f, ehxVar.g, ehxVar.h, ehxVar.i, ehxVar.j, ehxVar.k, ehxVar.l);
        return ehxVar2;
    }
}
