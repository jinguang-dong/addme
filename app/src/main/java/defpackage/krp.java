package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krp extends owx {
    private final sbv a;
    private final sbv b;
    private final Object c;

    public krp(owq owqVar, Object obj, sbc sbcVar) {
        super(owqVar);
        a.I(sbcVar.containsKey(obj));
        this.c = obj;
        this.a = sbcVar;
        this.b = ((sew) sbcVar).c;
    }

    @Override // defpackage.owx
    public final Object b(Object obj) {
        sbv sbvVar = this.a;
        Object orDefault = sbvVar.getOrDefault(obj, sbvVar.get(this.c));
        orDefault.getClass();
        return orDefault;
    }

    @Override // defpackage.owx
    protected final Object c(Object obj) {
        Object orDefault = this.b.getOrDefault(obj, this.c);
        orDefault.getClass();
        return orDefault;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public krp(owq owqVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this(owqVar, obj, new sew(new Object[]{obj2, obj3, obj4, obj5}, 2));
        ujp.bo(obj2, obj3);
        ujp.bo(obj4, obj5);
    }

    public krp(owq owqVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this(owqVar, obj, sbc.b(obj2, obj3, obj4, obj5, obj6, obj7));
    }

    public krp(owq owqVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte[] bArr) {
        this(owqVar, obj, sbc.c("ns", obj2, "auto", obj3, "on", obj4, "off", obj5));
    }
}
