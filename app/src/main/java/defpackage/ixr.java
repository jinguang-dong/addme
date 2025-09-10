package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixr implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public ixr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
        }
        return b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, tzx] */
    public final rwc b() {
        switch (this.a) {
            case 0:
                gzi gziVar = gzo.a;
                return rvk.a;
            case 1:
                return ((hnw) this.b).a();
            case 2:
                return (rwc) ((rwg) ((jaf) this.b).b()).a;
            case 3:
                rwc rwcVar = (rwc) ((rwg) ((jaf) this.b).b()).a;
                return rwcVar.h() ? rwcVar : rvk.a;
            case 4:
                gzi gziVar2 = gzo.a;
                return rvk.a;
            case 5:
                return (rwc) ((ngw) this.b).m;
            case 6:
                return (rwc) ((ngw) this.b).i;
            case 7:
                return ((hbj) this.b.a()).p(gzs.ao) ? rwc.j(259L) : rvk.a;
            case 8:
                return rwc.i(((imm) this.b).b().getExternalCacheDir());
            case 9:
                return rwc.i(((imm) this.b).b().getExternalFilesDir(null));
            case 10:
                return rwc.i((Integer) ((hbj) this.b.a()).a(has.a).orElse(null));
            case 11:
                return rwc.i((Integer) ((hbj) this.b.a()).a(has.b).orElse(null));
            default:
                rwc rwcVar2 = (rwc) ((tzu) this.b).a;
                return rwcVar2.h() ? rwc.j(new nxi(rwcVar2, 14)) : rvk.a;
        }
    }
}
