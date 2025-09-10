package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class set extends saz {
    final /* synthetic */ sev a;

    public set(sev sevVar) {
        this.a = sevVar;
    }

    @Override // defpackage.saz
    public final /* synthetic */ sbe a() {
        return this.a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        rnt.S(i, size());
        sev sevVar = this.a;
        return sevVar.a.e(sevVar.first(), i);
    }

    @Override // defpackage.saz, defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
