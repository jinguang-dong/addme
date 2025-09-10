package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frf implements fre {
    final /* synthetic */ Runnable a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    public frf(Runnable runnable, String str, int i) {
        this.a = runnable;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.fre
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fre
    public final syu b() {
        this.a.run();
        return ske.M(true);
    }

    @Override // defpackage.fre
    public final String c() {
        return this.b;
    }
}
