package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzb implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public hzb(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? b() : b() : b() : b();
    }

    public final Integer b() {
        int i = this.b;
        if (i == 0) {
            return Integer.valueOf(((hyd) this.a.a()).d);
        }
        if (i != 1) {
            return i != 2 ? Integer.valueOf(((qqv) this.a.a()).a) : Integer.valueOf(((hyd) this.a.a()).e);
        }
        return Integer.valueOf(true != ((kiu) this.a).a().F() ? 6 : 4);
    }
}
