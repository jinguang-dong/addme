package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njx implements ksf {
    final /* synthetic */ njz a;

    public njx(njz njzVar) {
        this.a = njzVar;
    }

    @Override // defpackage.ksf
    public final void c() {
        njz njzVar = this.a;
        njzVar.f.b(true);
        luk lukVar = njzVar.g;
        if (lukVar.k("perf_has_shown_options_bar")) {
            return;
        }
        lukVar.j("perf_has_shown_options_bar", true);
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ksf
    public final /* synthetic */ void b() {
    }
}
