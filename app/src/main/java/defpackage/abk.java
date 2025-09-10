package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abk extends ujq implements uiq {
    final /* synthetic */ abl a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ bst e;
    final /* synthetic */ bte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abk(abl ablVar, long j, int i, int i2, bst bstVar, bte bteVar) {
        super(1);
        this.a = ablVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = bstVar;
        this.f = bteVar;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        long j = this.d & 4294967295L;
        ((btd) obj).r(this.f, this.a.b.a(this.b, (this.c << 32) | j, this.e.m()));
        return ufg.a;
    }
}
