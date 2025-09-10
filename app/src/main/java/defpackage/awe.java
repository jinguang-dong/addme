package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awe implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ bte b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ awe(int i, bte bteVar, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.b = bteVar;
        this.c = i2;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.d != 0) {
            btd.q((btd) obj, this.b, ukj.x((this.a - r0.a) / 2.0f), ukj.x((this.c - r0.b) / 2.0f));
            return ufg.a;
        }
        btd.q((btd) obj, this.b, ukj.x((this.a - r0.a) / 2.0f), ukj.x((this.c - r0.b) / 2.0f));
        return ufg.a;
    }
}
