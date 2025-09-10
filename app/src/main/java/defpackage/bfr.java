package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr implements baq {
    public bfx a;
    public String b;
    public Object c;
    public Object[] d;
    public bgb e;
    public nki f;
    private final uif g = new apa(this, 7);

    public bfr(bgb bgbVar, bfx bfxVar, String str, Object obj, Object[] objArr) {
        this.e = bgbVar;
        this.a = bfxVar;
        this.b = str;
        this.c = obj;
        this.d = objArr;
    }

    @Override // defpackage.baq
    public final void a() {
        nki nkiVar = this.f;
        if (nkiVar != null) {
            nkiVar.a();
        }
    }

    @Override // defpackage.baq
    public final void b() {
        nki nkiVar = this.f;
        if (nkiVar != null) {
            nkiVar.a();
        }
    }

    @Override // defpackage.baq
    public final void cU() {
        d();
    }

    public final void d() {
        String strN;
        bfx bfxVar = this.a;
        if (this.f != null) {
            throw new IllegalArgumentException("entry(" + this.f + ") is not null");
        }
        if (bfxVar != null) {
            uif uifVar = this.g;
            Object objA = uifVar.a();
            if (objA == null || bfxVar.e(objA)) {
                this.f = bfxVar.f(this.b, uifVar);
                return;
            }
            if (objA instanceof bgw) {
                bgw bgwVar = (bgw) objA;
                if (bgwVar.f() == bap.b || bgwVar.f() == bap.c || bgwVar.f() == bap.a) {
                    strN = "MutableState containing " + bgwVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strN = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strN = bdq.n(objA);
            }
            throw new IllegalArgumentException(strN);
        }
    }
}
