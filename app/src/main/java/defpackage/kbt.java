package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbt implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public kbt(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.c != 0 ? b() : b();
    }

    public final Integer b() {
        if (this.c == 0) {
            return Integer.valueOf(((hbj) this.a.a()).p(haa.ah) ? ((kbu) this.b).a().a : 0);
        }
        hbj hbjVar = (hbj) this.a.a();
        luk lukVar = (luk) this.b.a();
        return Integer.valueOf(lukVar.l("pref_mode_vesper_enabled") ? lukVar.k("pref_mode_vesper_enabled") ? ltr.ON_LIGHT.f : ltr.OFF.f : ((Integer) hbjVar.a(gyw.a).get()).intValue());
    }
}
