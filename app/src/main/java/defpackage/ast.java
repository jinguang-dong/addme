package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ast implements uiu {
    public final /* synthetic */ uiu a;
    public final /* synthetic */ uif b;
    public final /* synthetic */ bik c;
    public final /* synthetic */ blp d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ ase h;
    private final /* synthetic */ int i;

    public /* synthetic */ ast(uif uifVar, bik bikVar, blp blpVar, long j, long j2, ase aseVar, uiu uiuVar, int i, int i2) {
        this.i = i2;
        this.b = uifVar;
        this.c = bikVar;
        this.d = blpVar;
        this.e = j;
        this.f = j2;
        this.h = aseVar;
        this.a = uiuVar;
        this.g = i;
    }

    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            ayc aycVar = (ayc) obj;
            ((Integer) obj2).intValue();
            int i = this.g;
            uiu uiuVar = this.a;
            ase aseVar = this.h;
            long j = this.f;
            long j2 = this.e;
            blp blpVar = this.d;
            e.o(this.b, this.c, blpVar, j2, j, aseVar, uiuVar, aycVar, bay.j(i | 1));
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        ((Integer) obj2).intValue();
        int i2 = this.g;
        ase aseVar2 = this.h;
        long j3 = this.f;
        long j4 = this.e;
        blp blpVar2 = this.d;
        bik bikVar = this.c;
        e.p(this.a, this.b, bikVar, blpVar2, j4, j3, aseVar2, aycVar2, bay.j(i2 | 1));
        return ufg.a;
    }

    public /* synthetic */ ast(uiu uiuVar, uif uifVar, bik bikVar, blp blpVar, long j, long j2, ase aseVar, int i, int i2) {
        this.i = i2;
        this.a = uiuVar;
        this.b = uifVar;
        this.c = bikVar;
        this.d = blpVar;
        this.e = j;
        this.f = j2;
        this.h = aseVar;
        this.g = i;
    }
}
