package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoq {
    public final Object a;
    public int c;
    public boolean d;
    public aoq f;
    private final aos g;
    public int b = -1;
    public final azr e = new azz(null, bap.c);

    public aoq(Object obj, aos aosVar) {
        this.a = obj;
        this.g = aosVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            akg.c("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.g.a.remove(this);
            aoq aoqVar = this.f;
            if (aoqVar != null) {
                aoqVar.a();
            }
            this.f = null;
        }
    }

    public final aoq b() {
        return (aoq) this.e.a();
    }

    public final void c() {
        if (this.d) {
            akg.c("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            aoq aoqVarB = b();
            if (aoqVarB != null) {
                aoqVarB.c();
            } else {
                aoqVarB = null;
            }
            this.f = aoqVarB;
        }
        this.c++;
    }
}
