package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlb extends jle {
    final /* synthetic */ szh a;
    final /* synthetic */ jlk b;
    final /* synthetic */ jlc c;

    public jlb(jlc jlcVar, szh szhVar, jlk jlkVar) {
        this.a = szhVar;
        this.b = jlkVar;
        this.c = jlcVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, pvu] */
    @Override // defpackage.jle, defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        int i;
        int iIntValue = ((Integer) obj).intValue();
        hbp hbpVar = this.c.c;
        jld jldVar = new jld(hbpVar, this.a);
        pum pumVar = new pum(null);
        pumVar.a(0);
        byte b = pumVar.k;
        pumVar.l = 2;
        pumVar.j = true;
        pumVar.k = (byte) (b | 14);
        pumVar.a = "uranus-joy-animation";
        pumVar.a(iIntValue);
        pumVar.h = rwc.j(jldVar);
        jlk jlkVar = this.b;
        rwc rwcVar = jlkVar.a;
        rwcVar.getClass();
        pumVar.d = rwcVar;
        rwc rwcVar2 = jlkVar.b;
        rwcVar2.getClass();
        pumVar.e = rwcVar2;
        rwc rwcVar3 = jlkVar.c;
        rwcVar3.getClass();
        pumVar.f = rwcVar3;
        if (pumVar.k != 15 || (str = pumVar.a) == null || (i = pumVar.l) == 0) {
            throw new IllegalStateException();
        }
        hbpVar.r(hbpVar.b.b(new pun(str, pumVar.b, pumVar.c, pumVar.d, pumVar.e, pumVar.f, pumVar.g, pumVar.h, pumVar.i, i, pumVar.j)), null);
    }
}
