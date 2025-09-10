package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbu implements tzt {
    private final tzx a;

    public kbu(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kbo a() {
        hbj hbjVar = (hbj) this.a.a();
        pok pokVar = new pok();
        pokVar.a = 5;
        pokVar.g = (byte) (pokVar.g | 1);
        pokVar.h(2);
        pokVar.b = 2;
        pokVar.g = (byte) (pokVar.g | 4);
        pokVar.g(0);
        pokVar.f();
        pokVar.e = 2000L;
        byte b = pokVar.g;
        pokVar.f = 2;
        pokVar.g = (byte) (b | 96);
        gzi gziVar = haa.a;
        pokVar.f();
        if (hbjVar.p(haa.D) || hbjVar.p(haa.E)) {
            pokVar.h(1);
        }
        pokVar.g(((Integer) hbjVar.a(haa.a).get()).intValue());
        if (pokVar.g == 127) {
            return new kbo(pokVar.a, pokVar.d, pokVar.b, pokVar.c, pokVar.e, pokVar.f);
        }
        throw new IllegalStateException();
    }
}
