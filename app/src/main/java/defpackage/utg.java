package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class utg implements utd {
    private final /* synthetic */ int a;

    public utg(int i) {
        this.a = i;
    }

    @Override // defpackage.utd
    public final urk a(utj utjVar) {
        return this.a != 0 ? new iqe(uta.a, 3) : new urd(new cwt(utjVar, (uhb) null, 2));
    }

    public final String toString() {
        return this.a != 0 ? "SharingStarted.Eagerly" : "SharingStarted.Lazily";
    }
}
