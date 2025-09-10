package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwh extends ujq implements uif {
    final /* synthetic */ bwi a;
    final /* synthetic */ bij b;
    final /* synthetic */ bwg c;
    final /* synthetic */ long d;
    final /* synthetic */ buy e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwh(bwi bwiVar, bij bijVar, bwg bwgVar, long j, buy buyVar, int i, boolean z, float f, boolean z2) {
        super(0);
        this.a = bwiVar;
        this.b = bijVar;
        this.c = bwgVar;
        this.d = j;
        this.e = buyVar;
        this.f = i;
        this.g = z;
        this.h = f;
        this.i = z2;
    }

    @Override // defpackage.uif
    public final /* bridge */ /* synthetic */ Object a() {
        bij bijVar = this.b;
        bwg bwgVar = this.c;
        this.a.ak(byi.o(bijVar, bwgVar.a()), bwgVar, this.d, this.e, this.f, this.g, this.h, this.i);
        return ufg.a;
    }
}
