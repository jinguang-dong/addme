package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ims implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public ims(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? b() : b() : b() : b() : b();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, tzx] */
    public final owf b() {
        int i = this.a;
        if (i == 0) {
            return ((iso) this.b).a;
        }
        if (i == 1) {
            return ((gnt) this.b.a()).b;
        }
        if (i == 2) {
            owf owfVarH = owl.h((owf) this.b.a(), new hia(14));
            owfVarH.getClass();
            return owfVarH;
        }
        if (i != 3) {
            Object obj = this.b;
            return i != 4 ? ((ocq) obj).a : ((ngw) obj).o;
        }
        owf owfVarA = owb.a((owq) this.b.a());
        owfVarA.getClass();
        return owfVarA;
    }
}
