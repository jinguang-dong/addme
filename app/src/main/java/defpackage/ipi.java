package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipi extends gsn {
    final /* synthetic */ ipk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipi(ipk ipkVar) {
        super((int[]) null);
        this.a = ipkVar;
    }

    @Override // defpackage.gsn
    public final void c() {
        ipk ipkVar = this.a;
        if (((Boolean) ipkVar.l.dL()).booleanValue()) {
            ipkVar.B.ifPresent(new gqw(i));
            ipkVar.o();
            return;
        }
        if (((Boolean) ipkVar.m.dL()).booleanValue()) {
            ipkVar.B.ifPresent(new gqw(18));
            ipkVar.f();
            return;
        }
        nbb nbbVar = ipkVar.w;
        if (nbbVar == null) {
            ipkVar.p();
            return;
        }
        nbbVar.j(true != ipkVar.D.equals(mxj.TABLET_LAYOUT) ? 5 : 17);
        ipkVar.w.h(ipkVar.C);
        ipkVar.w.g();
    }
}
