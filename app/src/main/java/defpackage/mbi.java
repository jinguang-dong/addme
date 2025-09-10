package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbi implements jhh, jhf, jhg {
    final /* synthetic */ mbj a;

    public mbi(mbj mbjVar) {
        this.a = mbjVar;
    }

    @Override // defpackage.jhf
    public final void ej() {
        mbj mbjVar = this.a;
        mbjVar.a = true;
        mbjVar.e();
    }

    @Override // defpackage.jhg
    public final void eu() {
        mbj mbjVar = this.a;
        mbjVar.a = false;
        mbjVar.b();
        ((mbq) mbjVar.c).h();
        ((mbq) mbjVar.e).h();
        ((mbq) mbjVar.f).h();
        mbjVar.a();
    }
}
