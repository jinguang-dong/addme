package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abr {
    public final abz a;
    public final byz b;
    private final Object c;
    private final azr d;
    private final azr e;
    private final acy f;
    private final ace g;
    private final ace h;
    private ace i;
    private ace j;
    private final byz k;

    public abr(Object obj, byz byzVar, Object obj2) {
        this.b = byzVar;
        this.c = obj2;
        this.a = new abz(byzVar, obj, null, 60);
        bap bapVar = bap.c;
        this.d = new azz(false, bapVar);
        this.e = new azz(obj, bapVar);
        this.k = new byz((byte[]) null, (char[]) null);
        this.f = new acy(obj2, 3);
        ace aceVarA = a();
        ace aceVar = aceVarA instanceof aca ? abs.e : aceVarA instanceof acb ? abs.f : aceVarA instanceof acc ? abs.g : abs.h;
        this.g = aceVar;
        ace aceVarA2 = a();
        ace aceVar2 = aceVarA2 instanceof aca ? abs.a : aceVarA2 instanceof acb ? abs.b : aceVarA2 instanceof acc ? abs.c : abs.d;
        this.h = aceVar2;
        this.i = aceVar;
        this.j = aceVar2;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, uiq] */
    public static /* synthetic */ Object k(abr abrVar, Object obj, aby abyVar, uiq uiqVar, uhb uhbVar, int i) {
        if ((i & 2) != 0) {
            abyVar = abrVar.f;
        }
        aby abyVar2 = abyVar;
        Object objA = (i & 4) != 0 ? abrVar.b.b.a(abrVar.a()) : null;
        uiq uiqVar2 = (i & 8) != 0 ? null : uiqVar;
        Object objD = abrVar.d();
        byz byzVar = abrVar.b;
        return ung.i(new acu(acs.a, abrVar.k, new abp(abrVar, objA, new adf(abyVar2, byzVar, objD, obj, (ace) byzVar.a.a(objA)), abrVar.a.b, uiqVar2, null), null), uhbVar);
    }

    public final ace a() {
        return this.a.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, uiq] */
    public final Object b(Object obj) {
        if (!a.ao(this.i, this.g) || !a.ao(this.j, this.h)) {
            byz byzVar = this.b;
            ace aceVar = (ace) byzVar.a.a(obj);
            int iB = aceVar.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (aceVar.a(i) < this.i.a(i) || aceVar.a(i) > this.j.a(i)) {
                    aceVar.e(i, ukc.m(aceVar.a(i), this.i.a(i), this.j.a(i)));
                    z = true;
                }
            }
            if (z) {
                return byzVar.b.a(aceVar);
            }
        }
        return obj;
    }

    public final Object c() {
        return this.e.a();
    }

    public final Object d() {
        return this.a.a();
    }

    public final Object e(Object obj, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new acu(acs.a, this.k, new tl(this, obj, (uhb) null, 2), null), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    public final Object f(uhb uhbVar) throws Throwable {
        Object objI = ung.i(new acu(acs.a, this.k, new abq(this, null), null), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    public final void g() {
        abz abzVar = this.a;
        abzVar.a.d();
        abzVar.b = Long.MIN_VALUE;
        h(false);
    }

    public final void h(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final void i(Object obj) {
        this.e.b(obj);
    }

    public final boolean j() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    public /* synthetic */ abr(Object obj, byz byzVar, Object obj2, int i) {
        this(obj, byzVar, (i & 4) != 0 ? null : obj2);
    }
}
