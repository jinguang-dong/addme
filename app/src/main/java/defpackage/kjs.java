package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjs implements kiz {
    final /* synthetic */ lmg a;
    final /* synthetic */ kju b;

    public kjs(kju kjuVar, lmg lmgVar) {
        this.a = lmgVar;
        this.b = kjuVar;
    }

    @Override // defpackage.kiz
    public final syu a() {
        szh szhVar = new szh();
        kju kjuVar = this.b;
        kjuVar.a.execute(new kjt(kjuVar, this.a, szhVar));
        return szhVar;
    }

    @Override // defpackage.kiz
    public final syu b() {
        this.a.a.close();
        return ske.L(new pco("Software jpeg saver was closed"));
    }
}
