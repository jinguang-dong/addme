package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qmv implements uem {
    private final /* synthetic */ int a;

    public /* synthetic */ qmv(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        switch (this.a) {
            case 0:
                return new qsi(null);
            case 1:
                return new qra(null);
            case 2:
                return new qsb(null);
            case 3:
                return new qsx(null);
            case 4:
                return qur.d().a();
            case 5:
                qty qtyVar = new qty(rvk.a);
                rnt.B(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
                return qtyVar;
            case 6:
                quv quvVarD = quw.d();
                quvVarD.b(false);
                return quvVarD.a();
            case 7:
                qpr qprVarD = qps.d();
                qprVarD.b(false);
                return qprVarD.a();
            case 8:
                qvc qvcVarD = qvd.d();
                qvcVarD.b(false);
                return qvcVarD.a();
            case 9:
                qre qreVarD = qrf.d();
                qreVarD.b(false);
                return qreVarD.a();
            default:
                return Integer.MAX_VALUE;
        }
    }
}
