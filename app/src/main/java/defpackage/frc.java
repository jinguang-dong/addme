package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frc implements syf {
    final /* synthetic */ frd a;

    public frc(frd frdVar) {
        this.a = frdVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        pfl pflVar = this.a.d;
        if (pflVar != null) {
            ((out) pflVar.a).execute(new ooc(th, 10, null));
        }
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        frd frdVar = this.a;
        if (frdVar.c != null && bool != null && bool.booleanValue()) {
            frdVar.c.f("Initialization completed.");
        }
        if (frdVar.c == null || bool == null || bool.booleanValue()) {
            return;
        }
        frdVar.c.h("Initialization failed! One of the tasks did not succeed.");
    }
}
